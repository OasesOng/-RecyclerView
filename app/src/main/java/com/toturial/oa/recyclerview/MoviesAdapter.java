package com.toturial.oa.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by B0501111 on 2016/3/11.
 */
public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MyViewHolder> {
    private List<Movie> mMovieList;

    public class MyViewHolder extends  RecyclerView.ViewHolder{

        public TextView title, year, genre;

        public MyViewHolder(View view){
            super(view);
            title = (TextView) view.findViewById(R.id.title);
            genre = (TextView) view.findViewById(R.id.genre);
            year = (TextView) view.findViewById(R.id.year);
        }
    }

    public MoviesAdapter(List<Movie> movieList){
        this.mMovieList = movieList;
    }

    @Override
    public  MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View itemView = LayoutInflater.from((parent.getContext()))
                .inflate(R.layout.movie_list_row, parent, false);

        return new MyViewHolder((itemView));
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Movie movie = mMovieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.genre.setText(movie.getGenre());
        holder.year.setText(movie.getYear());
    }

    @Override
    public int getItemCount() {
        return mMovieList.size();
    }
}

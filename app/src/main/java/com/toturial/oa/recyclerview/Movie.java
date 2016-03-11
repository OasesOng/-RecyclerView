package com.toturial.oa.recyclerview;

/**
 * Created by B0501111 on 2016/3/11.
 */
public class Movie {
    private  String title, genre, year;

    public  Movie(){

    }
    public  Movie(String title, String genre, String year){
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    public  String getTitle(){
        return  title;
    }

    public  void setTitle(String name){
        this.title = name;
    }

    public  String getGenre(){
        return  genre;
    }

    public  void setGenre(String genre){
        this.genre = genre;
    }

    public String getYear(){
        return  genre;
    }

    public  void  setYear(String year){
        this.year = year;
    }
}

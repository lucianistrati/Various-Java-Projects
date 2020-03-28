package com.company;
import java.util.*;
public class Album {

    int year;
    String name, rating;

    public Album(Integer year, String name, String rating) {
        this.year = year;
        this.name = name;
        this.rating = rating;
    }

    public int getYear(){
        return this.year;
    }
    public String getName(){
        return this.name;
    }
    public String getRating(){
        return this.rating;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setName(String name) {
        this.name=name;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    // Used to print album details in main()
    public String toString() {
        return this.year + " " + this.name + " " + this.rating;
    }

    public static void main(String [] args) {

        ArrayList<Album> albums = new ArrayList<Album>();

        albums.add(new Album(1986, "Metallica", "good"));
        albums.add(new Album(1998, "Pink", "decent"));
        albums.add(new Album(1988, "Metallica", "mediocre"));

        System.out.println(albums.get(0).getYear());
        albums.get(0).setYear(1980);
        System.out.println(albums.get(0).getYear());
        for (int i = 0; i < albums.size(); i++) {
            System.out.println(albums.get(i));
        }
        Collections.sort(albums, new SortByNameAndRating());
        for (int i = 0; i < albums.size(); i++) {
            System.out.println(albums.get(i));
        }
    }
}

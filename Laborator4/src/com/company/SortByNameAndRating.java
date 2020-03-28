package com.company;
import java.util.*;

public class SortByNameAndRating implements Comparator<Album> {

    @Override
    public int compare(Album a, Album b) {
        if(a.name==b.name){
            return a.rating.compareTo(b.rating);
        }
        else {
            return a.name.compareTo(b.name);
        }
    }
}

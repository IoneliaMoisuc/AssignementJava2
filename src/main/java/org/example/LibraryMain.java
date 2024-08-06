package org.example;

public class LibraryMain {
    public static void main (String[] args){
        Book myBook = new Book ("Minciuni pe canapea" , " Yrvin D. Yalom", "978-3-16-148410-0");
        Magazine myMagazine = new Magazine("Muntii nostri", "Various Authors", 30);

        System.out.println(myBook.getDescription());
        System.out.println(myMagazine.getDescription());
    }
}


package com.company;

public class Main {

    public static void main(String[] args) {
        double sum1 = 0;
        double sum2 = 0;
        int count = 0;

        // write your code here
        ProgrammingBook[] programmingBooks = new ProgrammingBook[5];
        programmingBooks[0] = new ProgrammingBook("1", "Java", 30.0, "Lee Dong Ji", "Korea", "ChuaXD");
        programmingBooks[1] = new ProgrammingBook("2", "Ruby", 28.0, "Tanaka", "Japanese", "ChuaXD");
        programmingBooks[2] = new ProgrammingBook("2", "C++", 30.0, "Wang Seo", "Chinese", "ChuaXD");
        programmingBooks[3] = new ProgrammingBook("3", "Js", 38.0, "Quoc Anh", "VietNamese", "ChuaXD");
        programmingBooks[4] = new ProgrammingBook("1", "Java", 25.0, "David", "English", "ChuaXD");

        FictionBook[] fictionBooks = new FictionBook[5];
        fictionBooks[0] = new FictionBook("4", "Titanic", 50.0, "Oscar", "Romantic");
        fictionBooks[1] = new FictionBook("4", "Romeo and Juliet", 38.0, "France", "Romantic");
        fictionBooks[2] = new FictionBook("5", "Red Dragon", 50.0, "Ocar", "Horror");
        fictionBooks[3] = new FictionBook("5", "The World Z", 36.0, "American", "Horror");
        fictionBooks[4] = new FictionBook("6", "Ki mi no na ha ", 32.0, "Japan", "Wibu");

        for (int i = 0; i < programmingBooks.length; i++) {
            sum1 += programmingBooks[i].getPrice();
            if (programmingBooks[i].getName().equals("Java")) {
                count++;
            }
        }
        for (int i = 0; i < fictionBooks.length; i++) {
            sum2 += fictionBooks[i].getPrice();
        }
        System.out.println("Tong 10 cuon sach la " + (sum1 + sum2));
        System.out.println("Co " + count + " quyen sach Java");

    }
}

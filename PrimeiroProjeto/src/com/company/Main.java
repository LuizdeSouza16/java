package com.company;

import com.bira.Grade;

public class Main {

    public static void main(String[] args) {
	    Grade[] grades = {
	            new Grade("Carine", 5.9),
                new Grade("Diogo", 9),
                new Grade("Guilherme", 4),
                new Grade("Analise", 3.2),
                new Grade("Rooney", 7.8),
                new Grade("Alessandro", 4.9)
        };

	    Grade.showGrades(grades);
	    System.out.println("---------\n\n");
        Grade.insertionSort(grades, grades.length);
        Grade.showGrades(grades);
    }
}

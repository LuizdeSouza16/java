package com.company;

import com.bira.DataStructure;
import com.bira.Grade;

import java.util.Arrays;

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

        int[] vector = { 24, 66, 87, 43, 11, 27, 4, 2, 7, 8, 4, 5,
                12, 53, 42, 22, 1, 5, 9, 13, 16, 23, 13, 7, 55, 67,
                92, 22, 33, 27, 19 };
        DataStructure.quickSort(vector,0 , vector.length -1);

        Arrays.stream(vector)
                .mapToObj(v -> v + " ")
                .forEach(System.out::print);
    }
}

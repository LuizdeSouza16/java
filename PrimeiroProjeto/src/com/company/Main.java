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

        int[] vector = new int[]{4, 6, 7, 3, 5, 1, 2, 8};
        DataStructure.selectionSort(vector);

        Arrays.stream(vector)
                .mapToObj(v -> v + " ")
                .forEach(System.out::print);
    }
}

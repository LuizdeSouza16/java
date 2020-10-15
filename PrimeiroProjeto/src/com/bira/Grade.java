package com.bira;

public class Grade {

    private final String name;
    private final double value;

    public Grade(String name, double value) {
        this.name = name;
        this.value = value;
    }
    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }

    public static void showGrades(Grade[] grades){
        for (Grade grade: grades){
            System.out.println("Nome: " + grade.getName() + " Grade:" + grade.getValue());
        }
    }

    public static int searchMinor(Grade[] grades, int begin, int end)
    {
        int minor = begin;
        for (int actual = begin; actual <= end; actual++ )
            if (grades[actual].getValue() < grades[minor].getValue())
                minor = actual;

        return minor;
    }

    public static void selectionSort(Grade[] grades, int numberOfElements) {
        int arrayLength =  numberOfElements - 1;
        for (int actual = 0; actual < arrayLength; actual++){
            int minor = searchMinor(grades, actual, arrayLength);
            swap(grades,actual, minor );
        }
    }

    private static void swap(Grade[] grades, int first, int second) {
        Grade firstGrade = grades[first];
        Grade secondGrade = grades[second];
        grades[first] = secondGrade;
        grades[second] = firstGrade;
    }

}

package com.bira;

public class DataStructure {

    /**
     * Method that orders an array of integers using a BubbleSort
     * @param vector - array to be ordered
     */
    public static void bubbleSort(int [] vector)
    {
        for (int i = 0; i <vector.length; i++)
        {
            for (int j = 0; j < vector.length - 1; j++)
            {
                /*If the value of the current position of the vector is greater
                  than the next value, then it changes the place values in the vector. */
                if (vector[j] > vector[j+1])
                {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
    }

    public static void bubbleSortImproved(int [] vector)
    {
        /* for to control the number of times the vector is ordered*/
        for (int i = 0; i <vector.length -1 ; i++)
        {
            boolean isOrdered = true;
            /*for used to order the vector*/
            for (int j = 0; j <vector.length - 1 - i ; j++)
            {
                if (vector[j] > vector[j+1])
                {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                    isOrdered = false;
                }
            }
            if (isOrdered)
                break;
        }
    }


    public static void selectionSort(int vector[])
    {
        /*Array size*/
        int arrayLength = vector.length - 1;
        int minor, indexMinor;
        for (int i = 0; i <arrayLength ; i++)
        {
            minor = vector[i];
            indexMinor = i;

            for (int j = i + 1; j <vector.length ; j++)
            {
                if (vector[j] < minor)
                {
                    minor = vector[j];
                    indexMinor= j;
                }
            }
            vector[indexMinor] = vector[i];
            vector[i] = minor;
        }
    }


}

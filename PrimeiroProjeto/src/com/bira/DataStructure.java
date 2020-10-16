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

    public static void quickSort(int[] vector, int begin, int end)
    {
        if (end > begin){
            int indexPivot = split(vector, begin, end);

            quickSort(vector, begin, indexPivot -1);

            quickSort(vector, indexPivot +1, end);
        }

    }

    public static int split(int[] vector, int begin, int end)
    {
        int pivot = vector[begin];
        int pointerLeft = begin + 1;
        int pointerRight = end;

        while (pointerLeft <= pointerRight) {

            while (pointerLeft <= pointerRight && vector[pointerLeft] <= pivot){
                pointerLeft++;
            }

            while (pointerRight >= pointerLeft && vector[pointerRight] > pivot){
                pointerRight--;
            }

            if (pointerLeft < pointerRight){
                swap(vector, pointerRight, pointerLeft);
                pointerLeft++;
                pointerRight--;

            }
        }

        swap(vector, begin, pointerRight);
        return  pointerRight;
    }

    public static void swap(int[] vector, int i, int j){
        int temp = vector[i];
        vector[i] = vector[j];
        vector[j] = temp;
    }
}

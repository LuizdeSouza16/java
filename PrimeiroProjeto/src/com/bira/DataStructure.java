package com.bira;

public class DataStructure {

    public static void bubbleSort(int [] vector)
    {
        for (int i = 0; i <vector.length; i++)
        {
            for (int j = 0; j < vector.length - 1; j++)
            {
                if (vector[j] > vector[j+1])
                {
                    int aux = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = aux;
                }
            }
        }
    }

}

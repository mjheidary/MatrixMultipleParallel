package com.mapsahr;

import com.mapsahr.services.ParallelThreadsCreator;
import com.mapsahr.util.MatrixGenerator;

import java.util.Date;

public class MatrixMultiplicationParallel {

    public static void main(String[] args) {

        Date start = new Date();

        int[][] m1 = MatrixGenerator.generateMatrix(5, 3);
        int[][] m2 = MatrixGenerator.generateMatrix(3, 3);
        int[][] result = new int[m1.length][m2[0].length];
        ParallelThreadsCreator.multiply(m1, m2, result);
        System.out.println("Matrix 1 : ");
        MatrixGenerator.print(m1);

        System.out.println("\nMatrix 2 : ");
        MatrixGenerator.print(m2);

        System.out.println("\nOutput Matrix : ");
        MatrixGenerator.print(result);


        Date end = new Date();
        System.out.println("\nTime taken in milli seconds: " + (end.getTime() - start.getTime()));

    }

}

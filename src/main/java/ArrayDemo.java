import java.io.InputStream;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] array;
        array = new int[10];
        array[0] = 100;
        array[1] = 200;
        array[2] = 300;
        array[3] = 400;
        array[4] = 500;
        array[5] = 600;
        array[6] = 700;
        array[7] = 800;
        array[8] = 900;
        array[9] = 1000;

        int indexvalue = 0;

        for(int value: array)
        {
            System.out.println("Element at index " + indexvalue + " : " + value);
        }

    }
}


import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

    public class ArrayListDemo {
        public static void main(String[] args) {

            ArrayList<Integer> myList = new ArrayList<>();

            myList.add(100);
            myList.add(200);
            myList.add(300);
            myList.add(400);
            myList.add(500);
            myList.add(600);
            myList.add(700);
            myList.add(800);
            myList.add(900);
            myList.add(1000);
            myList.add(1100);
            loop(myList);
            int indexvalue = 0;

            for (int value : myList) {
                System.out.println("Element at index " + indexvalue + " : " + value);
            }

            Scanner myScan = new Scanner(System.in);

            try {
                System.out.println("Enter a number: ");
                myList.add(myScan.nextInt());
                loop(myList);
            } catch (ArrayIndexOutOfBoundsException aiob) {
                System.out.println("Outside memory block " + aiob);
            }

        }

        private static void loop(ArrayList<Integer> myList) {
            int indexValue = 0;
            for (int value: myList)
            {
                System.out.println("Element at index " + indexValue + " : " + value);
                indexValue++;
            }

        }

    }




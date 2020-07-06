import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class HW02_PartC_Campbell_Bryan{

    public static void printArray(double[] arr) throws FileNotFoundException {
        PrintWriter test = new PrintWriter(new File("TEST"));
        for(int i = 0; i < arr.length; i++){
            test.println(arr[i]);
        }
        test.close();
    }

    public static double[] readFile(String fileName, int size) throws FileNotFoundException {
        double[] number = new double[size];
        File file = new File(fileName);
        Scanner scan = new Scanner(file);
        int counter = 0;
        while(scan.hasNext()){

            double temp = Double.parseDouble((scan.nextLine()))*100;
            number[counter] = temp;
            counter++;
        }
        return number;

    }

    public static void main(String[] args) throws IOException {

        generateRandomNumberFiles();


        double[] numberArray = readFile("1000000", 1000000);
        long start = System.currentTimeMillis();
        MergeSortA(numberArray, 0, numberArray.length-1);
        long finish = System.currentTimeMillis();
        long timeElapsed = finish - start;
        System.out.println("1M-MergeSortA: " + timeElapsed);

        numberArray = readFile("1000000", 1000000);
        start = System.currentTimeMillis();
        MergeSortB(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1M-MergeSortB " + timeElapsed);

        numberArray = readFile("1000000", 1000000);
        start = System.currentTimeMillis();
        MergeSortC(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1M-MergeSortC " + timeElapsed);

        numberArray = readFile("1000000", 1000000);
        start = System.currentTimeMillis();
        MergeSortD(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1M-MergeSortD " + timeElapsed);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        numberArray = readFile("1500000", 1500000);
        start = System.currentTimeMillis();
        MergeSortA(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1.5M-MergeSortA: " + timeElapsed);

        numberArray = readFile("1500000", 1500000);
        start = System.currentTimeMillis();
        MergeSortB(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1.5M-MergeSortB " + timeElapsed);

        numberArray = readFile("1500000", 1500000);
        start = System.currentTimeMillis();
        MergeSortC(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1.5M-MergeSortC " + timeElapsed);

        numberArray = readFile("1500000", 1500000);
        start = System.currentTimeMillis();
        MergeSortD(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("1.5M-MergeSortD " + timeElapsed);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        numberArray = readFile("2000000", 2000000);
        start = System.currentTimeMillis();
        MergeSortA(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2M-MergeSortA: " + timeElapsed);

        numberArray = readFile("1000000", 1000000);
        start = System.currentTimeMillis();
        MergeSortB(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2M-MergeSortB " + timeElapsed);

        numberArray = readFile("2000000", 2000000);
        start = System.currentTimeMillis();
        MergeSortC(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2M-MergeSortC " + timeElapsed);

        numberArray = readFile("2000000", 2000000);
        start = System.currentTimeMillis();
        MergeSortD(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2M-MergeSortD " + timeElapsed);

        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        numberArray = readFile("2500000", 2500000);
        start = System.currentTimeMillis();
        MergeSortA(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2.5M-MergeSortA: " + timeElapsed);

        numberArray = readFile("2500000", 2500000);
        start = System.currentTimeMillis();
        MergeSortB(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2.5M-MergeSortB " + timeElapsed);

        numberArray = readFile("2500000", 2500000);
        start = System.currentTimeMillis();
        MergeSortC(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2.5M-MergeSortC " + timeElapsed);

        numberArray = readFile("2500000", 2500000);
        start = System.currentTimeMillis();
        MergeSortD(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("2.5M-MergeSortD " + timeElapsed);


        ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        numberArray = readFile("3000000", 3000000);
        start = System.currentTimeMillis();
        MergeSortA(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("3M-MergeSortA: " + timeElapsed);

        numberArray = readFile("3000000", 3000000);
        start = System.currentTimeMillis();
        MergeSortB(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("3M-MergeSortB " + timeElapsed);

        numberArray = readFile("3000000", 3000000);
        start = System.currentTimeMillis();
        MergeSortC(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("3M-MergeSortC " + timeElapsed);

        numberArray = readFile("3000000", 3000000);
        start = System.currentTimeMillis();
        MergeSortD(numberArray, 0, numberArray.length-1);
        finish = System.currentTimeMillis();
        timeElapsed = finish - start;
        System.out.println("3M-MergeSortD " + timeElapsed);

        System.out.println("ALL TIMES ARE IN MILLISECONDS");









    }

    public static void MergeSortA(double[] arr, int left, int right){

        if(left < right) {

            int middle = (left + right) / 2;
            MergeSortA(arr, left, middle);
            MergeSortA(arr, middle + 1, right);
            Merge(arr, left, middle, right);
        }
    }

    public static void MergeSortB(double[] arr, int left, int right){

        int n = arr.length;
        for (right = 1; right <= n-1; right = 2*right)
        {
            for (left = 0; left < n-1; left += 2*right)
            {
                int mid = Math.min(left + right - 1, n-1);
                int right_end = Math.min(left + 2*right - 1, n-1);
                Merge(arr, left, mid, right_end);
            }
        }
    }

    public static void MergeSortC(double[] arr, int left, int right){

        if((left + right) > 25) {

            int middle = (left + right) / 2;
            MergeSortA(arr, left, middle);
            MergeSortA(arr, middle + 1, right);
            //Merge(arr, left, middle, right);
        }else{
            InsertionSort(arr, left+right+1);
        }
    }

    public static void MergeSortD(double[] arr, int left, int right){

        int n = arr.length;
        for (right = 1; right <= n-1; right = 2*right)
        {
            for (left = 0; left < n-1; left += 2*right)
            {
                if((left + right) > 25) {
                    int mid = Math.min(left + right - 1, n - 1);
                    int right_end = Math.min(left + 2 * right - 1, n - 1);
                    Merge(arr, left, mid, right_end);
                }else{
                    InsertionSort(arr, (left+right));
                }


            }
        }
    }

    public static void Merge(double[] arr, int left, int middle, int right){
        int leftSize = middle - left + 1;
        int rightSize = right - middle;

        double leftArray[] = new double[leftSize];
        double rightArray[] = new double[rightSize];

        for (int i = 0; i < leftSize; ++i)
            leftArray[i] = arr[left + i];
        for (int j = 0; j < rightSize; ++j)
            rightArray[j] = arr[middle + 1 + j];

        int i = 0;
        int j = 0;


        int index = left;
        while (i < leftSize && j < rightSize) {
            if (leftArray[i] <= rightArray[j]) {
                arr[index] = leftArray[i];
                i++;
            }
            else {
                arr[index] = rightArray[j];
                j++;
            }
            index++;
        }

        while (i < leftSize) {
            arr[index] = leftArray[i];
            i++;
            index++;
        }

        while (j < rightSize) {
            arr[index] = rightArray[j];
            j++;
            index++;
        }

    }

    public static void InsertionSort(double[] arr, int n){

        for(int i = 2; i < n; i++){
            double key = arr[i];
            int j = i -1;
            while(j >= 0 && arr[j] > key){
                arr[j+1] = arr[j];
                j = j - 1;
            }
            arr[j+1] = key;
        }
    }

    public static void generateRandomNumberFiles() throws IOException {

        int m1 = 1000000;
        int m2 = 1500000;
        int m3 = 2000000;
        int m4 = 2500000;
        int m5 = 3000000;



        File file1 = new File(""+m1);
        File file2 = new File(""+m2);
        File file3 = new File(""+m3);
        File file4 = new File(""+m4);
        File file5 = new File(""+m5);

        if(file1.exists()){
            file1.delete();
        }
        file1.createNewFile();
        PrintWriter pw = new PrintWriter(file1);
        for(int i = 0; i < m1; i++){
            double temp = Math.random();
            pw.println(temp);
        }
        pw.close();
////////////////////////////////////////////////////////
        if(file2.exists()){
            file2.delete();
        }
        file2.createNewFile();
        pw = new PrintWriter(file2);
        for(int i = 0; i < m2; i++){
            double temp = Math.random();
            pw.println(temp);
        }
        pw.close();
        ////////////////////////////////////////////////////////
        if(file3.exists()){
            file3.delete();
        }
        file3.createNewFile();
        pw = new PrintWriter(file3);
        for(int i = 0; i < m3; i++){
            double temp = Math.random();
            pw.println(temp);
        }
        pw.close();

        ////////////////////////////////////////////////////////
        if(file4.exists()){
            file4.delete();
        }
        file4.createNewFile();
        pw = new PrintWriter(file4);
        for(int i = 0; i < m4; i++){
            double temp = Math.random();
            pw.println(temp);
        }
        pw.close();

        ////////////////////////////////////////////////////////
        if(file5.exists()){
            file5.delete();
        }
        file5.createNewFile();
        pw = new PrintWriter(file5);
        for(int i = 0; i < m5; i++){
            double temp = Math.random();
            pw.println(temp);
        }
        pw.close();


    }
}

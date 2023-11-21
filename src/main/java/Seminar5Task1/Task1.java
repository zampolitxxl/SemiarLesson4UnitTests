package Seminar5Task1;

import java.util.Random;

public class Task1 {

    public int[] generateRundonNumber (int lenght){
        Random random = new Random();
        int[] result = new int[lenght];
        for (int i = 0; i <lenght ; i++) {
            result[i]=random.nextInt(0,100);
        }
        return result;
    }
    public int searchMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>max){
                max = arr[i];
        }
        }
        return max;
    }

}

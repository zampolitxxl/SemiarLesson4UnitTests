import Seminar5Task1.Task1;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertFalse;
public class Seminar5TestTask1 {
    @Test
    public void genaratingRandomArr(){
        Task1 task1 = new Task1();
        assertThat(task1.generateRundonNumber(5).length).isEqualTo(5);

    }

    @Test
    public void maxInArr(){
        Task1 task1 = new Task1();
        assertThat(task1.searchMax(new int[] {1, 2, 3, 4, 5})).isEqualTo(5);

    }
    @Test
    public void maxInArrAndGenRandom(){
        Task1 task1 = new Task1();
         int arr[] = task1.generateRundonNumber(7);
         int resMAx = task1.searchMax(arr);
        Arrays.sort(arr);
        assertThat(resMAx).isEqualTo(arr[arr.length-1]);

    }


}

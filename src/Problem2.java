import java.util.ArrayList;

/**
 * Created by raju.yadav on 6/25/2015.
 */
public class Problem2 {

    public static void main(String[] args) {

        int maxNum=4000000;
        int[] array=new int[maxNum+1];

        array[0]=1;
        array[1]=2;
        long sum=2;
        for(int i=2;i<=maxNum;i++)
        {
            array[i]=array[i-1]+array[i-2];
            if(array[i]<4000000) {
                if (array[i] % 2 == 0) {
                    sum += array[i];
                }
            }
            else
                break;
        }
        System.out.println(sum);

    }
}

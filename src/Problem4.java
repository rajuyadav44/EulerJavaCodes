import java.util.ArrayList;

/**
 * Created by raju.yadav on 6/25/2015.
 */
public class Problem4 {

    public static void main(String[] args) {

        ArrayList<Integer> alist=new ArrayList<Integer>();

        boolean flag=false;
        for(int i=999;i>=100;i--)
        {
            for(int j=999;j>=100;j--)
            {
                int plain=i*j;
                if(isPalindrome(plain))
                {
                    alist.add(plain);

                }
            }
        }
        int max= Integer.MIN_VALUE;
        for(int i=0;i<alist.size();i++)
        {
            int val=alist.get(i);
            if(val>max)
                max=val;
        }
        System.out.println(max);

    }

    public static boolean  isPalindrome(int number)
    {
        String num=String.valueOf(number);
        StringBuilder sb=new StringBuilder(num);
        String rev=sb.reverse().toString();
        if(num.equals(rev))
        {
            return true;
        }
        return false;
    }
}

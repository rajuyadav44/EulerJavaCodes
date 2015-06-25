import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by raju.yadav on 6/25/2015.
 */
public class Problem3 {

    public static void main(String[] args) {

        Set<Long> aset=new HashSet<Long>();
       long number=600851475143L;


        for(long i=2;i<=number;i++)
        {

                if(number%i==0)
                {
                    aset.add(i);
                    number=number/i;
                }
        }
        Iterator<Long> iter=aset.iterator();
        long max= Integer.MIN_VALUE;
        while(iter.hasNext())
        {
            long comp=iter.next();
            if(comp>max)
                max=comp;
        }
    System.out.println(max);
    }


}

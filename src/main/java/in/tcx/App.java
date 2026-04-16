package in.tcx;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {   int i=1230;
        int x=0;
        int d=0;
        int c=0;
        while(i>0)
        {
            d=i%10;
            x=x+d*(c^10);
            i=i/10;
            c++;
        }
        System.out.println(""+x);

    }
}

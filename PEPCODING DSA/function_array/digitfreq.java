import java.util.Scanner;
public class digitfreq {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int k=scn.nextInt();
        int count=0;
        while (num > 0)
        {
            int rem = num % 10;
            num = num / 10;
            
            if (rem == k){
                count=count+1;

            }
            //System.out.println(count);
            
        }
       System.out.println(count);
        
    }
}
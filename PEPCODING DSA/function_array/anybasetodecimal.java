import java.util.Scanner;
public class anybasetodecimal {
    public static int getvalueinbase(int n,int b){
        // binary to decimal number
        int rv=0;
        int p=1;
        while (n > 0){
            int remainder = n % b;
            n = n / b;

            rv = rv + remainder *p;
            p=p*2;
        }


        return rv;
    }






    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = getvalueinbase(n,b);
        System.out.println(dn);
    }
    
    
}

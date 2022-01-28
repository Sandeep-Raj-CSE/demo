import java.util.Scanner;
public class decimaltoanybase {
    public static int getvalueinbase(int n,int b1,int b2){
        int rv=0;
        int p=1;
        while (n > 0){
            int remainder = n % b2;
            n = n / b2;

            rv = rv + remainder *p;
            p=p*b1;
        }


        return rv;
    }






    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        int n = scn.nextInt();
        int b1 = scn.nextInt();
        int b2 = scn.nextInt();
        int dn = getvalueinbase(n,b1,b2);
        System.out.println(dn);
    }
    
}

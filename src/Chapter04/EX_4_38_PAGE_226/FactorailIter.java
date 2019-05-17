package Chapter04.EX_4_38_PAGE_226;




import java.util.Scanner;
       public class FactorailIter {
    public static void main(String[] args) {
        int n;
        Scanner klaw=new Scanner(System.in);
        System.out.print("n = ");
        n=klaw.nextInt();
        int i = 1;
        int f = 1;

        while(n>=i){
            f=f*i;
            i++;

        }
        System.out.print(n);
        System.out.print("! = ");
        System.out.println(f);
    }
}
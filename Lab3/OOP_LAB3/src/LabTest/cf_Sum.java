package LabTest;
import java.util.*;
public class cf_Sum{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=1; i<=t; i++){
            int a= scan.nextInt(), b= scan.nextInt(), c= scan.nextInt();

            if(a+b==c || a+c==b || b+c==a){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }

        }
    }
}



package BTU;
import java.util.Random;
import java.util.Arrays;

public class A {
    int a;
    int b;
    int m[]=new int[12];
    Random random=new Random();
    public void apply(){
        a=random.nextInt(25-10)+10;
        b=random.nextInt(25-10)+10;
    }
    public void applyM(){
        for (int i=0; i<12; i++){
            m[i]=random.nextInt(60-(-10))+(-10);
        }
    }
    public void printOdd(){
        for (int i=0; i<12; i++){
            if (m[i]%2==0) {
                System.out.println(m[i]);
            }
        }
    }
    int k=0;
    public void printPlus(){
        for (int i=0; i<12; i++){
            if (m[i]>0){
                k=k+m[i];
            }
        }
        System.out.println(k);
    }
    int t[]=new int[12];
    public void printMin(){
        for (int i=0; i<12;i++){
            if (m[i]>0) {
                t[i]=m[i];
            }
        }
        Arrays.sort(t);
        System.out.println(t[0]);
    }
}

package ALGORITMS;

import java.util.*;

public class week_15 {
    static int[] x = new int[10];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int c = sc.nextInt();
            if(c==1){
                int data =sc.nextInt();
                insert(data);
            }
            else{
                print();
                break;
            }
        }
    }
    public static void insert(int data){
        int val = data%10;
        while(x[val]!=0){
            val++;
        }
        x[val] = data;
    }
    public static void print(){
        for(int i=0;i<10;i++){
            System.out.println(i + " " + x[i]);
        }
    }
}
package taskexamples;

import java.util.Scanner;



public class Task {
    public static void main(String[] args) {




        System.out.println("C LETTER");
int height=5;
int weight=7;
for(int i=1;i<=height;i++){
    for(int j=1;j<=weight;j++){
        if(i==1 && j!=1 || i==5 && j!=1|| j==1 && i!=1 && i!=5 )
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}
        System.out.println("O LETTER");
int height2=5;
int weight2=5;
for(int i=1;i<=height2;i++){
    for(int j=1;j<=weight2;j++){
        if(i==1 && j!=1 && j!=5 || i==5 & j!=1 && j!=5 || j==1 && i!=1 && i!=5 || j==5 && i!=1 && i!=5)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}


        System.out.println("D LETTER");
int height3=5;
int weight3=4;
for (int i=1;i<=height3;i++){
    for(int j=1;j<=weight3;j++){
        if(i==1 && j!=4 || i==5 && j!=4 || j==1|| j ==4 && i!=5 && i!=1)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}


        System.out.println("E LETTER");
int height4=5;
int weight4=5;
for(int i=1;i<=height;i++){
    for(int j=1;j<=weight;j++){
        if((i == 1) || (i == 5) || i==Math.ceil((double) height4 / 2)|| j==1)
            System.out.print("*");
        else
            System.out.print(" ");
    }
    System.out.println();
}
    }
}


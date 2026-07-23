package com.example;
import java.util.Scanner;

//This is a simulation of an object-oriented calculator.//

class Calc{
    int x;
    int y;
    Calc(int x, int y){
    this.x = x;
    this.y = y;    
    }
    void sum(){
        int s = x + y;
        System.out.println("result:" + s);
    }
    void sub(){
        int s = x - y;
        System.out.println("result:" + s);
    }
    void div(){
        if(y == 0){
            System.out.println("erro");
            return;
        }
        int d = x / y;
        System.out.println("result:" + d);
    }
    void mut(){
        int m = x * y;
        System.out.println("result:" + m);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("x");
        int x = input.nextInt();
        
        System.out.println("y");
        
        while (!input.hasNextInt()) {
            System.out.println("Digite um número válido!");
            input.next();
        }
        
        int y = input.nextInt();
        
        Calc mycalc = new Calc(x, y);
        mycalc.div();
    }
}

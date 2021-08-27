package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Please enter the number of task :");
        com.company.Tasks example = new com.company.Tasks();
        Scanner TNClass = new Scanner(System.in);
        int TN= TNClass.nextInt();
        example.SetTask(TN);
        example.ChoseTask();
    }
}

package com.company;
import java.lang.*;
import java.io.*;
import java.sql.Array;
import java.util.Arrays;
import java.io.FileReader;

public class Tasks {
    private int numberOfTask;

    public void SetTask(int Num){
        numberOfTask=Num;
    }

    public void ChoseTask(){
        switch (numberOfTask){
            case 1:
                TaskOne();
                break;
            case 2:
                TaskTwo();
                break;
            case 3:
                TaskThree();
                break;
            case 4:
                TaskFour();
                break;
            case 5:
                TaskFive();
                break;
            case 6:
                TaskSix();
                break;
            case 7:
                TaskSeven();
                break;
            case 8:
                TaskEight();
                break;
            default:
                System.out.println("The task number out of band!!!");
                break;
        };
        System.out.println("Out of switch-case body");
    }
    public void TaskOne(){
        System.out.println("First task:");
        int sum=0;
        for(int n=0; n<1000; n++){
            if(n%3==0)
                sum=sum+n;
            if(n%5==0)
                sum=sum+n;
        }
        System.out.printf("The sum of all the multiples of 3 or 5 below 1000 = %d \n",sum);
    }
    public void TaskTwo(){
        System.out.println("Second task:");
        long sum=0;
        int n=1,m=2,termval=0;
        do {
            if(m%2==0)
                sum=sum+m;
            termval=n+m;
            n=m;
            m=termval;
        } while (m<=4e+6);
        System.out.printf("The sum of the even-valued terms less than 4 million = %d \n",sum);
    }
    public void TaskThree(){
        //алгоритм следующий:
        // идем с конца и пытаемся найти самый большой делитель
        // и проверяем его на простое число
        System.out.println("Three task:");
        long number = 600_851_475_143L;
        long PrimeNumber=number;
        for(long n=number-1; n>1; n--){
            if(number%n==0){
                for(long i=n-1;i>1;i--){
                    if(n%i==0){
                        break;
                    }
                    else /*if(i==2 && n%i!=0)*/{
                        PrimeNumber=n;
                        System.out.printf("The largest prime factor = %d\n",PrimeNumber);
                        return;
                    }
                }
            }
        }
        System.out.printf("The largest prime factor = %d\n",PrimeNumber);
    }
    public void TaskFour(){
        //найти палиндром 2-х 3 циферных чисел
        System.out.println("Four task:");
        Integer Palindrome = 0;
        int n=999;
        int m=999;
        String StrPal;
        while(n>99){
            while(m>99){
                Palindrome=m*n;
                StrPal=String.valueOf(Palindrome);
                if(StrPal.length()==6){
                    System.out.printf("palindr = %d  %d  %d",n,m,Palindrome);
                    System.out.printf(" %s  %s     %s  %s       %s  %s\n", StrPal.substring(0,1),StrPal.substring(5,6),StrPal.substring(1,2),StrPal.substring(4,5), StrPal.substring(2,3),StrPal.substring(3,4));
                    if(StrPal.substring(0,1)==StrPal.substring(5,6) & StrPal.substring(1,2)==StrPal.substring(4,5) & StrPal.substring(2,3)==StrPal.substring(3,4)){
                        System.out.printf("m = %d; n = %d\n",m,n);
                        System.out.printf("The largest palindrome= %d\n",Palindrome);
                        return;
                    }
                }
                m--;
            }
            n--;
            m=999;
        }

    }

    public void TaskFive(){
        //найти наименьшее число делящееся без остатка на числа 1...20
        System.out.println("Five task:");
        long Number = 1L;
        int n=20;
        while(Number<100000000000L){
            while(n>1 && Number%n==0){
                n--;
                if(n==2){
                    System.out.printf("The smallest number that can be divided by each of the numbers from 1 to 20 without any remainder = %d\n",Number);
                    return;
                }
            }
            if(Number%1000==0)
                System.out.printf("Number = %d\n",Number);
            n=20;
            Number++;
        }

    }

    public void TaskSix(){
        //найти разность суммы квадратов первых N чисел и квадрата суммы
        // the squares of the first ten natural numbers is
        System.out.println("Six task:");
        long sumOfSquare = 0L;
        long squareOfSum = 0L;
        int n=100;
        for(int i=1; i<=n; i++){
            sumOfSquare=sumOfSquare+i*i;
            squareOfSum=squareOfSum+i;
        }
        squareOfSum=squareOfSum*squareOfSum;
        System.out.printf("The square of the sum of the first one hundred natural numbers is = %d\n",squareOfSum);
        System.out.printf("The sum of squares the first one hundred natural numbers is = %d\n",sumOfSquare);
        System.out.printf("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is = %d\n",squareOfSum-sumOfSquare);

    }
    public void TaskSeven(){
        // the squares of the first ten natural numbers is
        System.out.println("Seven task:");
        long PrimeNumber = 0L;
        long Number = 1L;
        int i=0;
        while(i<10001){
            for(int j=1; j<=(int)Math.round(Number/2); j++){
                if(Number%j==0 && j!=1){
                    break;
                }
                if(j==(int)Math.round(Number/2)){
                    PrimeNumber=Number;
                    i++;
                    System.out.printf("Prime number № %d = %d\n",i,Number);
                }
            }
            Number=Number+1;
        }
    }

    public void TaskEight(){
        System.out.println("Eight task:");
        int[] x = new int[1000];
        long maxVal = 0L,Znach = 1L;
        try {
            FileReader reader = new FileReader("text_files\\One_thousand_mark_digit.txt");
//            C:\Users\Maxim\IdeaProjects\Tasks_from_site\src\com\company\
            int c,z=0;

            while((c=reader.read())!=-1){


                if((int)c-48>=0 && (int)c-48<10) {
                    x[z] = (int) c - 48;
                    z++;
                }
            }
//        }finally {
//            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        for(int n=0; n<988; n++){
            for(int m=0;m<13;m++){
                Znach=x[n+m]*Znach;
            }
            if(Znach>maxVal)
                maxVal=Znach;
            Znach=1;
        }
        System.out.println("maxVal=" + maxVal);
    }
}
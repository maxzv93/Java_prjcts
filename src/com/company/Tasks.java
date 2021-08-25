package com.company;

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
        long number = 13195; //600851475143;
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
}

import java.util.Scanner;
public class NumberGame {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        guessNumber();
        System.out.println("Do you want to continue");
        System.out.println("1. Yes");
        System.out.println("2.No");
        int choice=sc.nextInt();
        while(choice!=2){
            guessNumber();
            System.out.println("Do you want to continue");
            System.out.println("1. Yes");
            System.out.println("2.No");
            choice=sc.nextInt();
        }
        
    }

    public static void guessNumber(){
        Scanner sc=new Scanner(System.in);
        int number=(int)(Math.random()*100);
        int count=0;
        int n;
        do{
            System.out.println("Enter the number");
            n=sc.nextInt();
            count++;
            if(number>n){
                System.out.println("you enter small number");
            }
            else if(number<n){
                System.out.println("you enter greater number");
            }
            if(count==5){
                System.out.println("you exceed the limit ");
                break;
            }
        }while(number!=n);

        if(number==n){
            System.out.println("you guess the number successfully in "+count + " attempt");
        }
    }
}
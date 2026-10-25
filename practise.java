// import java.util.*;
// public class practise {
//     public static void main (String args[]){

// Scanner sc =new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int sum=a+b;
// System.out.println(sum);
// }
// }

// import java.util.*;
// public class practise {
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//     //     int radius=sc.nextInt();
//     //    double area=3.14*radius*radius;
//     //     System.out.println(area);
//     int n=sc.nextInt();
//     System.out.println(n+ " X 1 = " + 1*n);
//     System.out.println(n+ " X 2 = " + 2*n);
//     System.out.println(n+ " X 3 = " + 3*n);
//     System.out.println(n+ " X 4 = " + 4*n);
//     System.out.println(n+ " X 5 = " + 5*n);
//     System.out.println(n+ " X 6 = " + 6*n);
//     System.out.println(n+ " X 7 = " + 7*n);
//     System.out.println(n+ " X 8 = " + 8*n);
//     System.out.println(n+ " X 9 = " + 9*n);
//     System.out.println(n+ " X 10 = " + 10*n);
    // }
    // }

//     import java.util.*;
//     public class practise{
//         public static void main(String Args[]){
//             Scanner sc=new Scanner(System.in) ;

// int a=sc.nextInt();
// int b=sc.nextInt();
// System.out.println("sum of a and b ="+ (a+b));
// System.out.println("difference of a and b ="+ (a-b));
// System.out.println("product of a and b ="+ (a*b));
// System.out.println("division of a and b ="+ (a/b));
// System.out.println("remainder of a and b ="+ (a%b));
//                }
//     }


// import java.util.*;
// public class practise{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int month=sc.nextInt();
//         switch(month){
//             case 1:System.out.println("January");
//             break;
//             case 2:System.out.println("February");
//             break;
//             case 3:System.out.println("March");
//             break;
//             case 4:System.out.println("April"); 
//             break;
//             case 5:System.out.println("May");
//             break;
//             case 6:System.out.println("June"); 
//             break;
//             case 7:System.out.println("July");
//             break;
//             case 8:System.out.println("August");
//             break;
//             case 9:System.out.println("September");
//             break;
//             case 10:System.out.println("October");
//             break;
//             case 11:System.out.println("November");
//             break;
//             case 12:System.out.println("December");
//             break;
//             default:System.out.println("invalid input");     
//         }


//     }
// }



// import java.util.*;
// public class practise{
//     public static void main(String args[])
//     {
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// for(int i=0;i<=n;i++)
// {

// if(i%2==0)
// {
//     System.out.println(i);
// }

// System.out.println("Apna college");

// }

//     }
// }

// import java.util.*;
// public class practise{
//     public static void main(String args[])
//     {
// Scanner sc=new Scanner(System.in);
// int n=sc.nextInt();
// if(n==1)
// {
//     int marks=sc.nextInt();
// if(marks>=90)
// {
//     System.out.println("This is Good");
// }
// else if(marks<=89 && marks>=60)
// {
//     System.out.println("This is also Good");
// }
// else if(marks<=59 && marks>=0)
// {
//         System.out.println("This is  Good as well");
// }

// }
// else if (n==0)
// {
//         System.out.println("efforts matter not marks");
// }

//     }
// }




// import java.util.*;
// public class practise {
//   public static void main(String args[]){
//   Scanner sc=new Scanner(System.in);
// for(int i=1;i<=5;i++)
// {
// for(int j=1;j<=9;j++)
// {
//   int sum=i+j;
// if(sum == 6 || sum == 7 || sum == 8 || sum == 9 || sum == 10 )
// {                                                                                                       //     * * * * * 
//   System.out.print("*" + " ");                                                                         //    * * * * *  
// }                                                                                                     //   * * * * *
// else{                                                                                                //  * * * * *
//   System.out.print(" ");                                                                            // * * * * * 
// }
// }
// System.out.println();
// }
// }
// }


// import java.util.*;
// public class practise{
//     public static void checkEven(int n)
//     {
//         if(n%2==0){                                           // even new function
//             System.out.println("even number");
//         }
//         else {                                                 
//             System.out.println("odd number");
//         }
// return;
//     }
// public static void main(String args[])
// {
// Scanner sc=new Scanner(System.in);

// int n=sc.nextInt();
// checkEven(n);                                                          //call function under main function
// }
// }



// import java.util.*;
// public class practise{

//     public static void printTable(int n)
//     {
//         for(int i=1;i<=10;i++)                                    //new function for printing table
//         {
//             System.out.println(n + " X " + i + " = " + n*i);
//         }
//         return;
//     }

// public static void main(String args[])
// {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     printTable(n);                                                    //call function under main function
// }

// }



// import java.util.*;
// public class practise{
// public static void findAverage(int a,int b,int c)
// {                                                                    //new function for finding average
// double average = (double)(a+b+c)/3;
// System.out.println("average of 3 number are : " + average);
// return;
// }
//     public static void main(String args[])
//     {
// Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// int c=sc.nextInt();
//  findAverage(a,b,c);                                              // caLL function under main function                          
//     }
// }




// import java.util.*;
// public class practise{
// public static int findSum(int n)
// {
//     int sum=0;
// for(int i=1;i<=n;i++)
// {                                                                          //new function for finding sum of n odd number
//     if(i%2!=0)
//     {
//       sum= sum+i;  
//     }
// }
// return sum;
// }

//     public static void main(String args[])
//     {
// Scanner sc=new Scanner(System.in);
//    int n=sc.nextInt();
//    System.out.println("sum of odd number are : " + findSum(n));                 // caLL function under main function

//     }
// }


// import java.util.*;
// public class practise{
// public static int findGreat(int a,int b)
// {
//     int max;
// if(a>b)
// {
//     max=a;                                                                 //new function for finding max of two number
// }
// else{
// max=b;
// }
// return max;
// }


//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
// int a=sc.nextInt();
// int b=sc.nextInt();
// System.out.println(findGreat(a, b));                                      // caLL function under main function
//     }
// }



// import java.util.*;
// public class practise{
//     public static double findCircumference(int r)
//     {
//         double circum = 2*3.14*r;                                         //new function for finding circumference of circle

//          return circum;
//     }

//     public static void main(String args[])
//     {
//         Scanner sc=new Scanner(System.in);
//         int r=sc.nextInt();
//         System.out.println("circumference of circle = " + findCircumference(r));               //call function under main function
//     }
// }




// import java.util.*;
// public class practise{
// public static int checkVote(int age)
// {
//     //return 1 for eligible and 0 for not eligible                                  //new function for checking eligible to vote
//     if(age>18)
//     {
//         return 1;
//     }
//     else{
//      return 0;
//     }
   
// }

// public static void main(String args[])
// {
//     Scanner sc=new Scanner(System.in);
// int age=sc.nextInt();
// if(checkVote(age)==1)                                                                         //call function under main function
// {                                                                                      
//     System.out.println("eligible to vote");
// }
// else{
//     System.out.println("not eligible to vote");
// }
// }
// }


// import java.util.*;
// public class practise{
//     public static void main(String args[])                                           //program for infinitity loop using do while
//     {
        
//         int i=1;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(true);
//     }
// }



// import java.util.*;

// public class practise {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
        
//         int positiveCount = 0;
//         int negativeCount = 0;
//         int zeroCount = 0;
//         char choice;
        
//         do {
//             System.out.print("Enter a number: ");                                good ques to count +,-,0 numbers enter by user
//             int num = sc.nextInt();
            
//             // Check if the number is positive, negative, or zero
//             if (num > 0) {
//                 positiveCount++;
//             } else if (num < 0) {
//                 negativeCount++;
//             } else {
//                 zeroCount++;
//             }
            
//             // Ask if the user wants to continue entering numbers
//             System.out.print("Do you want to continue? (y/n): ");
//             choice = sc.next().charAt(0);
            
//         } while (choice == 'y' || choice == 'Y');
        
//         // Display the final counts
//         System.out.println("\n--- Results ---");
//         System.out.println("Positive numbers: " + positiveCount);
//         System.out.println("Negative numbers: " + negativeCount);
//         System.out.println("Zeros: " + zeroCount);
        
//         sc.close();
//     }
// }


// import java.util.*;
// public class practise{
//     public static void findPower(int x,int n)
//     {
//         System.out.println("power : " + Math.pow(x, n));                //new function for finding power
//     }
//     public static void main(String args[])
//     {
// Scanner sc=new Scanner(System.in);
// int x=sc.nextInt();
// int n=sc.nextInt();
// findPower(x,n);                                                            //call function under main function
//     }
// }


// import java.util.*;
// public class practise{

//     public static void main(String args[])                              
//     {                                                     
//        Scanner sc=new Scanner(System.in);                   
//        int a=sc.nextInt();                                  finfing gcd it iis like great number divinding two number
//        int b=sc.nextInt();                                     like 3 is gcd of 6 and 9
//         int gcd=1;
//     for(int i=1;i<=a && i<=b;i++)
//     {
//         if(a%i==0 && b%i==0)
//         {
//             gcd=i;
//         }
//     }

// System.out .println("gcd : "+ gcd);
//     }
// }



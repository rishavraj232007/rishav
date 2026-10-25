 import java.util.*;

 public class hello {
  // public static void printMyName(String name)
  //   {                                                 ///new function
  //     System.out.print(name);
  //     return;
  //   }

//   public static int calculateSum( int a,int b)
//   {                                                                         //sum new function
// int sum=a+b;                                   
// return sum;
//   }

// public static int calculateProduct(int a, int b){
// return a*b;                                               //product new function
// }

// public static void findFactorial( int n)
// {
//   if(n<0){
//     System.out.println("invalid number");
//     return; 
//   }
//   int fact=1;                                               //facotial new function
//   for(int i =1;i<=n;i++)
// {
//  fact= fact*i;
// }
//   System.out.println(fact);
//   return;
// }
   public static void main(String[] args) { 
    Scanner sc =new Scanner(System.in);
      //  String name = sc.nextLine();
      //    System.out.println(name);
// int n=sc.nextInt();
// if(n%2==0){
//   System.out.println("even");
// }
// else{ 
//   System.out.println("odd");
// }
         
// int a=sc.nextInt();
// int b=sc.nextInt();
// if(a==b){
//   System.out.println("a is equal to b");
// }
// else if(a>b){
//   System.out.println("a is greter than b");
// }
// else {
//     System.out.println("b is greater than a");
// }

// int button=sc.nextInt();

//     if(button==1){
// System.out.println("Hello");
//     }
//     else if(button==2){
//     System.out.println("Namaste");    
//     }
//     else if (button==3){
//         System.out.println("Bonjour");
//     }
//     else{
//         System.out.println("invalid input");
//     }
                                                                               //question based on switch and if-else 
// switch(button){
//     case 1:System.out.println("Hello");
//     break;
//     case 2:System.out.println("Namaste");
//     break;
//     case 3:System.out.println("Bonjour");
//     break;
//     default :System.out.println("invalid input");
//   } 

// for(int i=1;i<=10;i++)   //for loop
// {
//     System.out.print(i);
// }

//while loop
// int i=1;
// while(i<=10){
//     System.out.println(i);
//     i++;
// }


//do while loop
// int i=1;
// do{
//     System.out.println(i);
//     i++;
// }
// while(i<=10);

// int sum=0;
// int n=sc.nextInt();
// for(int i=1;i<=n;i++){
//     sum=sum+i;
// }

// System.out.println("sum="+sum);

// int n=sc.nextInt();
// for(int i=1;i<=10;i++){
//     System.out.println(n + "X" + i +"=" + n*i);
// }


//patterns
// for(int i=1;i<=4;i++)
// {
//   for(int j=1;j<=5;j++)         //***** 
//   {                            //***** 
//     System.out.print("*");    //*****
//   }                          //*****
//   System.out.println();
// }


// for(int i=1;i<=4;i++)
// {
// for(int j=1;j<=5;j++)   

// {                                      //***** 
//                                       //*    *
// if(i==1||j==1||i==4||j==5)           //*    *
// {                                   //***** 
//    System.out.print("*");
// }
//   else{
//      System.out.print(" ");
//   }
// }
// System.out.println();
// }

// for(int i=1;i<=4;i++)
// {                                      //* 
                                         //** 
// for(int j=1;j<=i;j++)                //*** 
// {                                   //**** 
//    System.out.print("*");       
// }
// System.out.println();
// }


// for(int i=4;i>=1;i--)
// {                                 //****
//    for(int j=1;j<=i;j++)         //*** 
//    {                            //** 
// System.out.print("*");         //* 
//    }
//    System.out.println();
// }


//for(int i=1;i<=4;i++)                                                      
//{                                                                          
   //for(int j=3;j>=0;j--)                                                   
   //{                                                                       
     // if(i>j)                                                             
      //{                                                                 
      //System.out.print("*");                         
     //}                                                                      
     //else{                                                                  
      //System.out.print(" ");                                                    
     //}                                                                          
   //                                                                            
  // System.out.println();
//}
                                                       //or  second method
 
// for(int i=1;i<=4;i++)
// {
//    for(int j=1;j<=4-i;j++) 
//    {     
//    System.out.print(" ");       
//   }       
//   for(int j=1;j<=i;j++)         
//    {   
//    System.out.print("*");
//    }   
//    System.out.println();     
                                                    
//    }




// for(int i=1;i<=5;i++)                                            //1
// {                                                                //1 2
//    for(int j=1;j<=i;j++)                                         //1 2 3
//    {                                                             //1 2 3 4
//       System.out.print(j+" ");                                   //1 2 3 4 5 
//    }
//    System.out.println();
// }

// for(int i=5;i>=1;i--)                                            //1 2 3 4 5 
// {                                                                //1 2 3 4
// for(int j=1;j<=i;j++)                                            //1 2 3
// {                                                                //1 2
//     System.out.print(j+" ");                                     //1
// }
// System.out.println();
// }


// int number=1;
// for(int i=1;i<=5;i++)                                            //1
// {                                                                //2 3
//    for(int j=1;j<=i;j++)                                         //4 5  6
//    {                                                             //7 8  9  10
//       System.out.print(number + " ");                           //11 12 13 14 15
//       number++;                                        
//    }
//     System.out.println();
// }


// for(int i=1;i<=5;i++)
// {
//    for(int j=1;j<=i;j++)
//    {
//       int sum=i+j;
//       if(sum%2==0)                                    //1
//       {                                               //0 1
//          System.out.print("1");                       //1 0 1
//       }                                               //0 1 0 1
//       else{                                           //1 0 1 0 1
//          System.out.print("0");
//       }
//    }
//    System.out.println();
// }


// for(int i=1;i<=4;i++)
// {
//   //first upper half
//   for(int j=1;j<=i;j++)
//   {
//     System.out.print("*");
//   }
// // spaces
// int space=2*(4-i);
// for(int j=1;j<=space;j++)
// {
// System.out.print(" ");
// }
// //other upper half
// for(int j=1;j<=i;j++)                
//  {                                                                                 //*      *
//  System.out.print("*");                                                            //**    ** 
//  }                                                                                 //***  ***
//   System.out.println();                                                            //********                    //butterly pattern
// }                                                                                  //******** 
// //lowerpart                                                                        //***  *** 
// for(int i=4;i>=1;i--)                                                              //**    **
// {                                                                                  //*      * 
//   //first upper half
//   for(int j=1;j<=i;j++)
//   {
//     System.out.print("*");
//   }
// // spaces
// int space=2*(4-i);
// for(int j=1;j<=space;j++)
// {
// System.out.print(" ");
// }
// //other upper half
// for(int j=1;j<=i;j++)               
//  {                                 
//  System.out.print("*");       
//  }
//   System.out.println();
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




// for(int i=1;i<=5;i++)
// {
//   //space
//   for(int j=1;j<=5-i;j++)                                                           //    1
//   {                                                                                //   2  2   
//  System.out.print(" ");                                                           //   3  3  3  
//   }                                                                              //   4  4  4  4
//   //number                                                                      //  5  5  5  5  5
// for(int j=1;j<=i;j++)
// {
//     System.out.print(i + " ");
//   }
// System.out.println();
// }



   
// String name=sc.next();
// printMyName(name);      //call function under main functionS


//


// int sum = calculateSum( a,b);                                 //call function for sum 
// System.out.println("sum of two numbers are : " + sum);


// System.out.println("product of two numbers are : " + calculateProduct(a, b));     //call function for product

// int n=sc.nextInt(); 
// findFactorial(n);                          // call function for factorial



int marks[]=new int[3];
marks[0]=97;
marks[1]=98;
marks[2]=99;
for(int i=0;i<3;i++)
{
  System.out.println(marks[i]);
}





  }
  }


//import java.util.*;
//import java.lang.*;
//
//public class primeNumber {
//    public static void  main(String args[]) {
//        int num = 9;
//        int count =0;
//        // we should start from 2 1 is nor prime non-composite
//        // checking the num is less than the input num
//        for (int i =2 ; i<num;i++){
//            if(num%i==0) { // it should check with 2,3,4,5,6,7,8 => if any is divisible with 9 then it is not prime
//                System.out.println("non Prime");
//                // incrementing the count value if it is not a prime
//                count = count + 1;
//                break;
//            }
//        }
//        //count ==0
//        if( count==0){
//            System.out.println("Prime");
//            System.out.println(count);
//        }
//
//
//
//
//    }
//}


//Pseudocode
//start
//input num
//c= 2
//while num <c
    //if num % c ==0
       //output  "not prime "
    //c = c+1
//end while
//output  "prime number"
//exit


//EXAMPLE
// Is 36 is prime
//1 X 36 = 36
//2 X 18 = 36
//3 X 12 = 36
//4 X 9 = 36
//
//6 X 6 =36
//
//9 x 4 = 36 /// repeating
//12 x 3 = 36
//18 x 2 = 36
//36 x 1 = 32
// number of steps reduced to square root of n
//2345678890433 => if we think it is an prime number
//it will compare 2345678890433 -2 (1X num and num X 1)
//if we use sqre 15,31,560


import java.lang.*;

public class primeNumber {
    public static void  main(String args[]) {
        int num = 9;
        int count =0;
        // we should start from 2 1 is nor prime non-composite
        // checking the num is less than the input num
        for (int i =2 ; i<Math.sqrt(num);i++){ // i<3
            if(num%i==0) { // it should check with 2,3 => if any is divisible with 9 then it is not prime
                System.out.println("non Prime");
                // incrementing the count value if it is not a prime
                count = count + 1;
                break;
            }
        }
        //count ==0
        if( count==0){
            System.out.println("Prime");
            System.out.println(count);
        }




    }
}


//How Java code executes ?
//.java file (human readable )  === compiler (entire file)  ===>  .class file (byte code)  ===  interpreter (line by line)  ===> machine code(0,1)
// This code will not directly run on system
// we need JVM to run this
// Reason why Java is platform independent


// python is an interpreted  language
// In C++ it don't convert to .class it is skipped
// javac 0r python3 => these are the executable file which located in system
// where javac  => show where the executable file located
// ls /usr/bin | grep javac
//open /usr/bin
// when we type javac in terminal it mean it clicking on the file
// when we type javac it mean => /user/bin/javac
// so it should know the path so we give path for the environment variable
// Environment variable is list of folder address where which computer will check command you typed
//$PATH => to get list address in the envirnmental variable

public class primeNumber {
    public static void  main(String args[]) {
        int num = 9;
        int count =0;
        // we should start from 2 1 is nor prime non-composite
        // checking the num is less than the input num
        for (int i =2 ; i<num;i++){
            if(num%i==0) { // it should check with 2,3,4,5,6,7,8 => if any is divisible with 9 then it is not prime
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


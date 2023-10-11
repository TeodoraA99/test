package controllingExecution;

public class IfElse2 {

   static int test(int testValue, int begin, int end){
       if(testValue < begin){
           return -1;
       } else if(testValue > end){
           return 1;
       }else {
           return 0;
       }
   }
    public static void main(String[] args) {
        System.out.println((test(10, 5 , 15)));
        System.out.println((test(5, 10 , 20)));
        System.out.println((test(5, 5 , 10)));
    }
}


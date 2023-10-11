package controllingExecution;

public class Numbers1To100 {
    public static void main(String[] args) {

        for (int i = 1; i <= 100 ; i++) {
            if (i == 99){
              return;
            }
            System.out.println(i);
        }
    }
}

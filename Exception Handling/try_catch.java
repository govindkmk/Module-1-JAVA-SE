package Exception_Handling;

import java.io.IOException;

class try_catch{
    public static void main(String[] args) throws Exception, IOException {
        int num = 93;
        int determinant = 0;
        try{
            System.out.println(num/determinant);
            if(determinant == 0){
                throw new Exception("Divide by zero");
            }
        }catch (ArithmeticException exception){
            System.out.println("Which kind of exception occurs "+exception.getMessage());
        }finally {
            System.out.println("Hello this is finally block.");
        }

    }
}
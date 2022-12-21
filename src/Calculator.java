 public class Calculator {
    public static void main(String[] args){
        catchIt(40);
        use(2,4);
        passIt(1);
    }
     public static void throwANumber(int throwMe) throws Exception {
         throw new Exception("I don't like the number" + throwMe + "you can have it back!");
     }

     public static void catchIt(int catchMe) {
         try {
             throwANumber(catchMe);
         } catch (RuntimeException ex) {
             System.out.println("you'll never see this!");
         } catch (Exception e) {
             System.out.println(e.getMessage());
         } finally {
             System.out.println("I'm in the finally block");
         }
     }

     public static void passANumber(int number) throws Exception {
         throw new Exception("I don't like" + number + "you can have it back!");
     }

     public static void passIt(int passMe) {
         try {
             passANumber(passMe);
         } catch (RuntimeException ex) {
             System.out.println("Never");
         } catch (Exception e) {
             System.out.println(e.getMessage());
         } finally {
             System.out.println("make it to final");
         }

     }

     //your code will go here.
     public static void calculate(int x, int y) throws ArithmeticException {
         throw new ArithmeticException("the result is " + (x / y));
     }

     public static void use(int x, int y) {
         try {
             calculate(x, y);

         } catch (ArithmeticException ex) {
             System.out.println("do not divide by 0!");
         } catch (Exception e) {
             System.out.println("some other exception");
         } finally {
             System.out.println("this will always print out");
         }


     }
 }

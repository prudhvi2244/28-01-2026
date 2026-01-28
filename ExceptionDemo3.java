class ExceptionDemo3 {    

     static int div(int a, int b) {
        int n = 0;
        try {
            n = a / b;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
        }
        finally{
            System.out.println("Finally Block Executed");
        }
        return n;
    }


    public static void main(String[] args){

        ExceptionDemo3.div(10,10);

    }
}
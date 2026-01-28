class ExceptionDemo1 {

    static int div(int a, int b) {
        int n = 0;
        try {
            n = a / b;
        } catch (ArithmeticException ae) {
            // System.out.println(ae); // ExceptionName : Description
            // System.out.println(ae.getMessage()); // Description
            // ae.printStackTrace();
            System.out.println(ae);
        }

        return n;
    }

    public static void main(String[] args) {
        System.out.println("Statement-1");

        int n = ExceptionDemo1.div(10, 0);

        System.out.println("Statement-2");
        System.out.println("Division :" + n);
    }
}

/*
 * Normal Flow :
 * ==========================
 * Statement-1
 * Statement-2
 * Division : 2
 * 
 * Abnormal Flow:
 * ==========================
 * Statement-1
 * Line : 4 java.lang.ArithmeticException
 */
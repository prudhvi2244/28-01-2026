class StringDemo1 {
    public static void main(String[] args) {

        String s1 = new String();
        String s2 = new String("Prudhvi");

        char ch[] = { 'L', 'P', 'U' };
        byte b[] = { 97, 98, 99, 100 };

        String s3 = new String(ch);
        String s4 = new String(b);

        StringBuffer sb1 = new StringBuffer("Hello");
        String s5 = new String(sb1);

        StringBuilder sb2 = new StringBuilder("Hello");
        String s6 = new String(sb2);

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

    }
}
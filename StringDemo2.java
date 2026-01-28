class StringDemo2 {
    public static void main(String[] args) {
        String s1 = "Lovely Professional University";
        String s2 = "abc";
        String s4 = "XYZ";
        System.out.println("Length of the String :" + s1.length());
        if (!s1.isEmpty()) {
            System.out.println("s1 is not Empty");
        } else {
            System.out.println("s1 is empty");
        }

        System.out.println("Character at index 4:" + s1.charAt(4));
        String s3 = s2.toUpperCase();
        String s5 = s4.toLowerCase();
        System.out.println(s3);
        System.out.println(s5);

    }
}
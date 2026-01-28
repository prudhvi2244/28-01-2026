class StringDemo5 {
    public static void main(String[] args) {
        String s = "punjab";
        String s1 = "www.redbus.in";
        char[] ch = s.toCharArray();
        for (char c : ch) {
            System.out.println(Character.toUpperCase(c));
        }


        String []s2=s1.split("\\.");

        for(String s3:s2){
            System.out.println(s3);
        }

    }
}
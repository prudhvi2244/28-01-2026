class RevereseString {

    public static void main(String[] args) {

        String s = "punjab";
        int left = 0, right = s.length() - 1;

        char[] ch = s.toCharArray();

        while (left <= right) {
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

        System.out.println(new String(ch));

    }

}
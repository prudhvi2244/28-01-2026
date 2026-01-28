/*
  Input  : Welcome To LPU University Punjab
  Output : emoclew oT UPL ytisrevinU bajnuP 
*/

class Demo2 {

    public static void main(String[] args) {

        // split the String // use for loop to iterate over the String Aray

        String s = "Welcome To LPU";
        String s1[] = s.split(" ");
        for(String s2:s1){
           for(int i=s2.length()-1;i>=0;i--){
            System.out.print(s2.charAt(i));
           }
           System.out.print(" ");
        }

    }

}
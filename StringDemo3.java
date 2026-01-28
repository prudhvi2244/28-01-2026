class StringDemo3 {
    public static void main(String[] args) {

        String username = "username";
        String password = "password";

        String emobile = "+91 9754312345";
        String email = "rajeev@lpu.in";

        if (username.equals("username")) {
            System.out.println("Username matching");
        }

        if (password.equalsIgnoreCase("PASSWORD")) {
            System.out.println("Password Matching");
        }

        if (emobile.startsWith("+91")) {
            System.out.println("Mobile Number Valid");
        }

        if (email.endsWith("@lpu.in")) {
            System.out.println("Valid Email");
        }

    }
}
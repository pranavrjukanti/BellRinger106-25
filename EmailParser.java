public class EmailParser{
    public static void main(String[] args){
        String email = "firstlast@gmail.com";
        email = email.substring(0,5)+"."+email.subtring(5);
        //0,5 first part, 5 second part
        System.out.println(email.subtring(0,10));
        //Print full name
        System.out.println(email.subtring(0,5));
        //Prints first name
        System.out.println(email.substring(6,10));
        //Prints Last name
        if (!email.contains("@") || !email.contains(".")) {
            email = email + "@gmail.com";
        //Checks if the email doesnt have @ or ., if it does not then it adds it
        System.out.println(email);
        //Prints final answer
    }
}
}

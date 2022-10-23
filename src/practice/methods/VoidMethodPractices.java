package practice.methods;

public class VoidMethodPractices {
    public static void main(String[] args) {
        VoidMethodPractices.flavorPicker("chocolate");
        VoidMethodPractices.flavorPicker("Chocolate");
        VoidMethodPractices.flavorPicker("vanilla");

        VoidMethodPractices.checkAge(21);
        VoidMethodPractices.checkAge(15);
        VoidMethodPractices.checkAge(23);
        VoidMethodPractices.checkAge(-16);
        VoidMethodPractices.checkCreditScore(999.99);
    }
    public static void flavorPicker(String flavor){
        /*
        Create a public static method which will take an ice cream flavor and prints the message about your ice cream

         examples:
         chocolate -> You have a great taste
         vanilla -> Not bad
         strawberry -> Enjoy it!
         */


//        if(flavor.equals("chocolate")){
//            System.out.println("You have a great taste");
//        }
//        else if(flavor.equals("vanilla")){
//            System.out.println("Not bad");
//        }
//        else if(flavor.equals("strawberry")){
//            System.out.println("Enjoy it!");
//        }
//        else{
//            System.out.println("Give me a valid flavor!");
//        }

        switch(flavor){
            case "chocolate":
                System.out.println("You have a great taste");
                break;
            case "vanilla":
                System.out.println("Not bad");
                break;
            case "strawberry":
                System.out.println("Enjoy it!");
                break;
            default:
                System.out.println("Give me a valid flavor!");
        }
    }
        /*
           Create a public static method named as "checkAge", it is going to take an age as parameter
           then prints according to following:
           -> 0 - 19 -> You are a teenager
           -> 20 - 21 -> You can drive
           -> 21+ -> You can drink coke
         */
    public static void checkAge(int age){
        if(age >= 0 && age <= 19){
            System.out.println("You are a teenager");
        }
        else if(age == 20 || age == 21){
            System.out.println("You can drive");
        }
        else if(age > 21){
            System.out.println("You can drink coke");
        }
        else{
            System.out.println("Give me a valid age!");
        }

    }

    public static void checkCreditScore(double balance){
        if(balance >= 0 && balance <= 999.99){
            System.out.println("Low credit score");
        }
        else if(balance > 999.99 && balance <= 1999.99){
            System.out.println("Low credit score");
        }
        else if(balance > 1999.99 && balance <= 2999.99){
            System.out.println("Good credit score");
        }else{
            System.out.println("No valid credit score!");
        }
    }

}



package string_methods;

public class _13_replace_Method {
    public static void main(String[] args) {
        /*
        1. return
        2. return String
        3. non-static
        4. there are overloaded method, one takes 2 chars to be replaced and another takes 2 Strings to be replaced

         */
        String s = "Can i can a can";
        String s1 = s.replace('c', 'x');// can i xan a xan
        System.out.println(s1);
        System.out.println(s.replace("can", "xxx")); // can i xxx a xxx
        System.out.println(s.toLowerCase().replace("can", "xxx")); // xxx i xxx a xxx

        //IMPORTANT
        String str1 = "John";
        str1 = str1.replace("o", "oooo");
        System.out.println(str1);
        String str2 = "apple";
        str2 = str2.replace("abs", "xyz"); //won't replace anything
        System.out.println(str2);
        String str3 = "Orange";
        str3 = str3.replace("Orange","");// replace with empty space
        System.out.println(str3);

    }
}

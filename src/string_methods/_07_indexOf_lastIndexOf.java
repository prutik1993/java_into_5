package string_methods;

public class _07_indexOf_lastIndexOf {
    public static void main(String[] args) {
        String company = "TechGlobal School";
        int firstIndexOfO = company.indexOf('o'); //6
        int lastIndexOfO = company.lastIndexOf('o');
        System.out.println(lastIndexOfO);
        System.out.println(firstIndexOfO);

        System.out.println(company.indexOf('l'));
        System.out.println(company.lastIndexOf('l'));

        System.out.println(company.indexOf("School"));
    }
}

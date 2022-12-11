package singlrton;

public class DriverTest {
    public static void main(String[] args) {

        Driver d1 = Driver.getDriver();
        Driver d2 = Driver.getDriver();
        Driver d3 = Driver.getDriver();
        Driver d4 = Driver.getDriver();
        Driver d5 = Driver.getDriver();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
    }
}

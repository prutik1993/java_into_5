package casting;

public class exercise06_CalculateSalary {
    public static void main(String[] args) {
        String salary1 = "5000";
        String salary2 = "6000.25";
        String salary3 = "4000.50";
        double salary4 = Double.parseDouble(salary1);
        double salary5 = Double.parseDouble(salary2);
        double salary6 = Double.parseDouble(salary3);
        double minSalary = Math.min(Math.min(salary4, salary5), salary6);
        System.out.println("Min salary = $" + minSalary);
        System.out.println("Max salary = $" + Math.max(Math.max(salary4, salary5), salary6));

        System.out.println(minSalary * 0.1);


    }
}

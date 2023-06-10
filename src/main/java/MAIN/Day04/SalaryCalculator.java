package MAIN.Day04;

public class SalaryCalculator {
    public static void main(String[] args) {

        String name = "Michael Scott";
        int hourlyRate = 40;
        int weeklyHours = 45;

        int salary = hourlyRate*weeklyHours*52;

        System.out.println("Hello "+name+", your salary is $ "+salary);

    }
}

package MAIN.Day04;

public class EmployeeInfo {
    public static void main(String[] args) {
        String name = "Michael Scott";
        int age = 27;
        String gender = "Male";
        String companyName = "Blizzard";
        String jobTittle = "Lead Software Developer";
        int salary = 180000;

        System.out.println(name+" is "+age+" years old, gender is "
                +gender+".\n"+name+" works at "+companyName+" as a "
        +jobTittle+".\n"+name+" makes $ "+salary+" per year.");
    }
}

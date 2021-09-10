package Open_Closed;

public class Joined extends Employee_ID {
    String date = "19th July 2021";


    void onboarding(String name, String n) {
        String company = "Knoldus";
        int emp = 1618;
        System.out.println("I am from Open Closed Principle and here to let you that");
        System.out.println("Hi All Knolder "+name+ " has joined " + company + " on " + date);
        System.out.println("And his Employee ID is " + emp+ " and salary "+salary);
    }

    public static void main(String[] args) {
        Open_Closed.Intern I = new Open_Closed.Intern();
        Open_Closed.Employee_ID E = new Open_Closed.Employee_ID();
        Open_Closed.Joined J = new Open_Closed.Joined();
        J.onboarding(J.name, E.name);
    }
}

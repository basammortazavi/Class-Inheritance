//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){

        Person doctor = new Doctor("john", 2004, 5000,1);
        Person nurse = new Nurse("Sarah", 2006, 4000, 5);
        System.out.println("here is the specialties for the doctor:" + doctor + "here is the specialties for the Nurse: " + nurse );


}

}
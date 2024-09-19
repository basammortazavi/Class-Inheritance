public class MedicalStaff extends Person {
   private int specialty;


    public MedicalStaff(String name, int Dob, double salary, int specialty_num) {

        super(name, Dob, salary);
        this.specialty = specialty_num;

    }

    public int get_dept(){
        return 138;
    }
    public int get_specialty(){
        return this.specialty;
    }

    public double calculate_fee(){
        return 120.85;
    }


    public boolean equals(Object object) {
        if(this == object){
            return true;
        }

        if(object == null) {
            return false;

        }
        if(this.getClass() == object.getClass()){
            MedicalStaff person = (MedicalStaff) object;
            return this.get_DoB() == person.get_DoB() && this.getName().equals(person.getName())
                    && this.get_salary() == person.get_salary() && this.get_specialty() == person.get_specialty();
        }
        return false;

    }
    @Override
    public String toString (){
        return " this is a person \nthe name is " + this.getName() + "\n"+
                "DoB is : " + this.get_DoB() + "\n"+

                "the salary is : " + this.get_salary() + "\n" +
                "specialty is : " + this.get_specialty();

    }

}
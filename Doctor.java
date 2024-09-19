public class Doctor extends MedicalStaff {
     private double fee = 0;

    public Doctor(String name, int Dob, double salary, int specialty_num) {
        super(name, Dob, salary, specialty_num);

        if (this.get_specialty() == 1) {
            this.fee = 20;

        } else if (this.get_specialty() == 2) {
            this.fee = 30;

        } else if (this.get_specialty() == 3) {
            this.fee = 40;

        } else if (this.get_specialty() == 4) {
            this.fee = 50;

        }
    }




    public double get_fee() {
        return this.fee;
    }

    public boolean equals(Object object) {
        if(this == object){
            return true;
        }

        if(object == null) {
            return false;

        }
        if(this.getClass() == object.getClass()){
            Doctor doctor = (Doctor) object;
            return this.get_DoB() == doctor.get_DoB() && this.getName().equals(doctor.getName())
                    && this.get_salary() == doctor.get_salary() && this.get_specialty() == doctor.get_specialty() && this.get_fee() == doctor.get_fee();
        }
        return false;

    }
    @Override
    public String toString (){
        return " this is a person \nthe name is " + this.getName() + "\n"+
                "DoB is : " + this.get_DoB() + "\n"+

                "the salary is : " + this.get_salary() + "\n" +
                "specialty is : " + this.get_specialty() + "\n" + " the fee is : " + this.get_fee();

    }
}
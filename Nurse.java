public class Nurse extends MedicalStaff {
      private int dept;
      private double fee;
         public Nurse (String name, int Dob, double salary,int specialty_num ){
            super(name, Dob, salary, specialty_num);
            this.dept = 200;
            this.fee = 20;
            if(this.get_specialty() == 5 ) {
                this.dept = 250;


            } else if (this.get_specialty() == 6) {
                this.dept = 350;

            } else if (this.get_specialty() == 7) {
                this.dept = 450;

            } else if (this.get_specialty() == 8) {
                this.dept = 550;

            }

         }

        public int get_dept(){
            return this.dept;
        }

        public double get_fee(){
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
            Nurse nurse = (Nurse) object;
            return this.get_DoB() == nurse.get_DoB() && this.getName().equals(nurse.getName())
                    && this.get_salary() == nurse.get_salary() && this.get_specialty() == nurse.get_specialty();
        }
        return false;

    }
    @Override
    public String toString (){
        return " this is a person \nthe name is " + this.getName() + "\n"+
                "DoB is : " + this.get_DoB() + "\n"+

                "the salary is : " + this.get_salary() + "\n" +
                "specialty is : " + this.get_specialty() + "\n" + "the dept is : " + this.get_dept();

    }
}

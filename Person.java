public abstract class Person implements Earner{
     private String name;
     private int DoB;
     private double salary;


    public Person(){

    };


    public Person(String name, int Dob, double salary){
        this.name = name;
        this.DoB = Dob;
        this.salary = salary;

    }
    public String getName(){
        return this.name;
    }

    public int get_DoB(){
        return this.DoB;
    }

    public double get_salary(){
        return this.salary;
    }
    @Override
    public String toString (){
        return  " this is a person \nthe name is " + this.name + "\n"+
                "DoB is : " + this.DoB + "\n"+
                "the salary is : " + this.salary;
    }
    @Override
    public boolean equals(Object object) {
        if(this == object){
            return true;
        }

        if(object == null) {
            return false;

        }
        if(this.getClass() == object.getClass()){
            Person person = (Person) object;
            return this.DoB == person.DoB && this.name.equals(person.name) && this.salary == person.salary;
        }
        return false;

    }
}


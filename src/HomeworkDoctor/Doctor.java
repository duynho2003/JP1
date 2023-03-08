package HomeworkDoctor;

public class Doctor {
    String ID, name;
    int salary;
    
    public String getCode(){
    return ID;
    }
    
    //setValues method (Loai 4)
    public void setValues(String ID, String name, int salary){
        this.ID = ID;
        this.name = name;
        this.salary = salary;
    }    
    public String output(){    
    String s = String.format("ID: %s - Name: %s - Salary: %d", ID, name, salary);
        return s;
    }
}

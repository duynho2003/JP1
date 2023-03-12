package review03_Student1408049;

public class Worker {

    //a.
    public int ID;
    public String name, address;
    public int year_of_birth;

    //b.
    public Worker() {
        ID = 0;
        name = null;
        address = null;
        year_of_birth = 0;
    }

    //c.
    public Worker(int ID, String name, String address, int yob) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.year_of_birth = yob;
    }
    
    @Override
    public String toString(){
        String s = String.format("+ID: %d\n+Name: %s\n+Address: %s\n+Year_of_birth: %d\n", ID, name, address, year_of_birth);
        return s;
    }    
}

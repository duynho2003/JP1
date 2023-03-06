package template07_review02;
public class Bycicles {
    private String model, type;
    int size;
    
    public Bycicles(String model, String type, int size){
        this.model = model;
        this.type = type;
        this.size = size;
    }
    @Override
    public String toString(){
        String s = String.format("+ Model: %s\n + Size: %d\n + Type: %s", model, size, type);
        return s;
    }
}

package template07_review02;
public class Bycicles {
    private String model, type;
    int size;
    
    public Bycicles(String model, int size, String type){
        this.model = model;
        this.size = size;
        this.type = type;
    }
    @Override
    public String toString(){
        String s = String.format("+ Model: %s\nSize: %d\nType: %s", model, size, type);
        return s;
    }
}

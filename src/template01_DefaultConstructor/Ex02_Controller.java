package template01_DefaultConstructor;

public class Ex02_Controller {
    
    Ex01_Model model;
    public void addNew(){
//        System.out.println("This is addNew()");
        model = new Ex01_Model();
    }
    
    public void search(){
        System.out.println("This is Search()");
    }
    
    public void display(){
//        System.out.println("This is display()");
        System.out.println(model.toString());
    }
}

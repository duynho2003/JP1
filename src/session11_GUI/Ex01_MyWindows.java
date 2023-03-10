package session11_GUI;
import javax.swing.JFrame;

public class Ex01_MyWindows extends JFrame{
    public Ex01_MyWindows(){
        init();
    }
    
    private void init(){
        this.setVisible(true); //JFrame is invisible (default)
        this.setSize(400,300);
        this.setTitle("International (very local) English Center");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    
    public static void main(String[] args) {
        new Ex01_MyWindows();
    }
}

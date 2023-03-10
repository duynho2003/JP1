package session12_TheEnd;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
/**
 * JEP 372: Remove the Nashorn JavaScript Engine
 * https://openjdk.java.net/jeps/372
 */
public class Chp18_NashornEngine {
    public static void main(String[] args) throws Exception { 
        ScriptEngineManager test = new ScriptEngineManager();
        ScriptEngine javascript = test.getEngineByName("Nashorn");

        String name = "Nashorn Testing";
        Integer result = null;

        try {
           //javascript.eval("print('" + name + "')");
           result = (Integer) javascript.eval("20 + 10 - 5");

        } catch(ScriptException e) {
           System.err.println("Error: "+ e.getMessage());
        }
        System.out.println("Expression from eval method: " + result);   
    }
}

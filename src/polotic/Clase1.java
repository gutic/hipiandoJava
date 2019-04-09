package polotic;

/**
 *
 * @author agustin
 */
public class Clase1 {
    private int _a;
    private int _b;
    
    public int getA(){
        return _a;
    }
    
    public void setA(int a){
        this._a = a;
    }
    
    public int getB(){
        return _b;
    }
    
    public void setB(int b){
        this._b = b;
    }
    
    public int sumar(){
        return _a+_b;
    }
    public String edad(){
        if (_a > _b){
            return "A mayor";
        }else{
            if(_b > _a){
                return "B mayor";    
            }else{
                return "Son iguales";
            }
        }
        
    }
 
}
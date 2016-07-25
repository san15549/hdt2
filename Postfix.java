/**
 * @author Carlo David Sanchinelli, Diego Alberto Hurtarte
 * @version 24.07.16
 */
public class Postfix {
    private Pila s;

    public Postfix() {
        s = new Pila();
    }
//------------------------------------------------------------------------------

    public void Push(String object){
        s.Push(object);
    }    
    
    public void Pop(String operacion) {
        int resultado = 0;
        String resultado_final;
        int valor1;
        int valor2;
        if(operacion.equals("+")){
            valor2 = Integer.parseInt(s.Pop());
            valor1 = Integer.parseInt(s.Pop());
            resultado = valor1 + valor2; 
        }
        if(operacion.equals("-")){
            valor2 = Integer.parseInt(s.Pop());
            valor1 = Integer.parseInt(s.Pop());
            resultado = valor1 - valor2;
        }
        if(operacion.equals("*")){
            valor2 = Integer.parseInt(s.Pop());
            valor1 = Integer.parseInt(s.Pop());
            resultado = valor1 * valor2;
        }
        if(operacion.equals("/")){
            valor2 = Integer.parseInt(s.Pop());
            valor1 = Integer.parseInt(s.Pop());
            resultado = valor1 / valor2;
        }
        resultado_final = Integer.toString(resultado);
        s.Push(resultado_final);
    }
    
    public String getResultado(){
        String res = s.Pop();
        return res;
    }
}

/**
 * @author Carlo David Sanchinelli, Diego Alberto Hurtarte
 * @version 24.07.16
 */
public class Pila implements iPila {
    private String[] stack;
    
    public Pila(){
        stack = new String[] {"null","null","null"};
    }
//------------------------------------------------------------------------------

    @Override
    public void Push(String object) {
        int i=0;
        while(!stack[i].equals("null")){
            i=i+1;
        }
        stack[i] = object;
    }

    @Override
    public String Pop() {
        int i=2;
        while(stack[i].equals("null")){
            i=i-1;
        }
        String object = stack[i];
        stack[i] = "null";
        return object;
    }

    @Override
    public String toString() {
        return "Pila{" + "stack=" + stack + '}';
    }
}

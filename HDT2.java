/**
 * @author Carlo David Sanchinelli, Diego Alberto Hurtarte
 * @version 24.07.16
 */
public class HDT2 {
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        Lector lector = new Lector();
        String[] respuestas = lector.getText();
        int operaciones = respuestas.length;
        int k = 0;
        while(k<operaciones){
            String[] ary = respuestas[k].split("");
            int cantidad = ary.length;
            Postfix postfix = new Postfix();
            int i = 4;
            postfix.Push(ary[0]);
            postfix.Push(ary[2]);
            while(i<cantidad){
                if(i<cantidad){
                    postfix.Pop(ary[i]);
                    i = i+2;
                }
                if(i<cantidad){
                    postfix.Push(ary[i]);
                    i = i+2;
                }
            }
            String resultado = postfix.getResultado();
            int h= k+1;
            System.out.println("Resultado No."+h+" : "+resultado);
            k = k + 1;
        }
    }
}

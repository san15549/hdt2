/**
 * @author Carlo David Sanchinelli, Diego Alberto Hurtarte
 * @version 24.07.16
 */
public interface iPila {
    public void Push(String object);
    
    public String Pop();
    
    @Override
    public String toString();
}

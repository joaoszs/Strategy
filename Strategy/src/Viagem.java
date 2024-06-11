package Strategy.src;
public class Viagem 
{
    private Transporte transporte;

    public Viagem(Transporte transporte) 
    {
        this.transporte = transporte;
    }

    public void irAoTrabalho() 
    {
        transporte.irAoTrabalho();
    }    
}

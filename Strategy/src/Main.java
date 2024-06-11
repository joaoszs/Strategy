package Strategy.src;
public class Main {
    public static void main(String[] args) 
    {
        Viagem viagemDeCarro = new Viagem(new Carro());
        viagemDeCarro.irAoTrabalho();

        Viagem viagemDeBicicleta = new Viagem(new Bicicleta());
        viagemDeBicicleta.irAoTrabalho();

        Viagem viagemDeTransportePublico = new Viagem(new TransportePublico());
        viagemDeTransportePublico.irAoTrabalho();
    }
}

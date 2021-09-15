import modelo.Carro;
import modelo.Motorista;

public class App {
    public static void main(String[] args) throws Exception {
        Motorista mot1 = new Motorista("Maria da Silva", 123456);
        Carro carro = new Carro("aaa9999", 123456, mot1);

        System.out.println("Passageiro: Motorista pode acelerar o carro até 100km/h ?");
        System.out.println("Motorista: vamos lá!");
        
        System.out.println("------------------------------------------------------------------");
        
        carro.getMotorista().acelerar(100);
        
        
        System.out.printf("Velocidade atual do carro é : %s km/h", carro.getVelocidadeAtual());
    }
}

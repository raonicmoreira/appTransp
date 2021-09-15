package modelo;

public class Carro {
    
    private String placa;
    private int numChassi;
    private int velocidadeAtual;
    private Motorista motorista;

    public Carro(String placa, int numChassi, Motorista motorista) {
        this.placa = placa;
        this.numChassi = numChassi;
        this.motorista = motorista;
        motorista.setVeiculoAtual(this);
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getNumChassi() {
        return numChassi;
    }

    public void setNumChassi(int numChassi) {
        this.numChassi = numChassi;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }

    public Motorista getMotorista() {
        return motorista;
    }

    public void setMotorista(Motorista motorista) {
        this.motorista = motorista;
    }

    void acelerar(){
        velocidadeAtual++;
    }

    void acelerar(int limite){
        for(int i = velocidadeAtual; i < limite; i++){
            acelerar();
        }
    }
    
}

package sistema_radar;

public class Radar {
    public String localizacao;
    public Integer limiteVelocidade;

    public void emitirnotificacao (String placa, Integer velocidadeObservada) {
        System.out.println("Placa"+placa);
        System.out.println("Velocidade Observada: "+velocidadeObservada);
        System.out.println("Localização: "+ this.localizacao);
        System.out.println("Velocidade da via: "+ this.limiteVelocidade);
    }
    
    public void avaliarVelocidade (Carro carro){
        if (carro.velocidade > this.limiteVelocidade) {
            emitirnotificacao(carro.placa, carro.velocidade);
        }
    }
}



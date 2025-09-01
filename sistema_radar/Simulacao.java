package sistema_radar;

public class Simulacao {
    public static void main(String[] args) {
        Carro mazda = new Carro();
        mazda.ano = 98;
        mazda.modelo = "RX7";
        mazda.placa = "SHRY222";
        mazda.velocidade = 0;

        Radar radar = new Radar();
        radar.localizacao = "Pistão Sul";
        radar.limiteVelocidade = 60;

        radar.avaliarVelocidade(mazda);

        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();
        mazda.acelerar();

        radar.avaliarVelocidade(mazda);
    }
}
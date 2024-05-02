public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new SmartTv();

        System.out.println(smartTv.ligada);
        System.out.println(smartTv.canal);
        System.out.println(smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo status -> A TV está ligada!");
        //smartTv.desligar();
        //System.out.println("Novo status -> A TV está desligada!");

        smartTv.aumentarVolume(8);
        smartTv.mudarCanal(67);

        if (smartTv.ligada == true) {
            System.out.println("A SmartTV está ligada, no canal "+smartTv.canal+", no volume "+smartTv.volume+".");
        } else {
            System.out.println("A SmartTV está desligada!");
        }
    }
}

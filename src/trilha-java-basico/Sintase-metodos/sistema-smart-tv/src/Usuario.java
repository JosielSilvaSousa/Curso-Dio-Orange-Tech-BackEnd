public class Usuario {
    public static void main(String[] args) throws Exception {
        SmartTV smartTv = new SmartTV();
        
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.dimunuirVolume();
        smartTv.aumetarVolume();

        System.out.println("TV Liga ?" + smartTv.ligada);
        System.out.println("Canal antes: " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo Status -> TV Liga ?" + smartTv.ligada);
    
        smartTv.desligar();
        System.out.println("Novo Status -> TV Liga ?" + smartTv.ligada);
    }
}

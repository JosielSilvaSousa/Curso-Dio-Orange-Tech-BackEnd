package OrientacaoObjeto;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();

        carro1.setCor("Azul");
        carro1.setModelo("Bmw Serie 3");
        carro1.setCapacidadeTanque(59);

        System.out.println(carro1.getcor());
        System.out.println(carro1.getModelo());
        System.out.println(carro1.getCapacidadeTanque());
        System.out.println(carro1.totalvalorTanque(6.39));


        Carro carro2 = new Carro("Cinza","Merceder", 66);

        System.out.println(carro2.getcor());
        System.out.println(carro2.getModelo());
        System.out.println(carro2.getCapacidadeTanque());
        System.out.println(carro2.totalvalorTanque(6.39));
    }
    
}

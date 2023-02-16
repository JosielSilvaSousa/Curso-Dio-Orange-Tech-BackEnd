package OrientacaoObjeto.Heranca;

public class RadarAplicacao {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
       //Upcast
        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //DownCast
        Vendedor vendedor_ =  (Vendedor) new Funcionario();
    }
    
}

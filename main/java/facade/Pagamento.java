package facade;

public class Pagamento extends Sistema {
    private static Pagamento pagamento = new Pagamento();
    private Pagamento(){};
    public static Pagamento getInstancia(){
        return pagamento;
    }
}

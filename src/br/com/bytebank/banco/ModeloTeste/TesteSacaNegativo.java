package bytebankComposto.src.br.com.bytebank.banco.ModeloTeste;

public class TesteSacaNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta();
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());

        
        /* System.out.println(conta.saldo); */

        /* Proibido mexer com atributos, apenas mexer com métodos Ex: conta.saca
        conta.saldo = conta.saldo - 101;
        System.out.println(conta.saldo); */ 
    }
    
}

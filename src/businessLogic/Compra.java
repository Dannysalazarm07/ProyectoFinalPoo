package businessLogic;

import data.Cajera;
import data.Cliente;

public class Compra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("cliente 1", new int[]{2, 2, 1, 5, 2, 3});
        Cliente cliente2 = new Cliente("cliente 2", new int[]{1, 3, 5, 1, 1});

        long tiempoInicial = System.currentTimeMillis();

        Cajera cajera1 = new Cajera("Cajera 1", cliente1, tiempoInicial);
        Cajera cajera2 = new Cajera("Cajera 2", cliente2, tiempoInicial);

        cajera1.start();
        cajera2.start();

    }

}

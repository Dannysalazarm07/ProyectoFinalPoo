package data;

public class Cajera extends Thread {

    private String nombres;
    private Cliente cliente;
    private long tiempoInicial;

    @Override
    public void run() {

        System.out.println("La cajera " + this.nombres
                + " COMIENZA A PROCESAR LA COMPRA DEL CLIENTE " + cliente.getNombre()
                + " EN EL TIEMPO " + (System.currentTimeMillis() - tiempoInicial) / 1000
                + "seg");

        for (int i = 0; i < cliente.getCarritoCompras().length; i++) {
            this.esperarXsegundos(cliente.getCarritoCompras()[i]);
            System.out.println(" Procesando el producto " + (i + 1)
                    + " ->Tiempo: " + (System.currentTimeMillis() - tiempoInicial) / 1000);
        }
    }

    private void esperarXsegundos(int segundos) {
        try {
            Thread.sleep(segundos * 1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public Cajera(String nombres, Cliente cliente, long tiempoInicial) {
        this.nombres = nombres;
        this.cliente = cliente;
        this.tiempoInicial = tiempoInicial;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public long getTiempoInicial() {
        return tiempoInicial;
    }

    public void setTiempoInicial(long tiempoInicial) {
        this.tiempoInicial = tiempoInicial;
    }

}

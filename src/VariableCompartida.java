public class VariableCompartida {
    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public VariableCompartida(int contador) {
        this.contador = contador;
    }

    private volatile int contador;

    public synchronized void aumentar(int i) {

        System.out.println("Soy: " + i);
        System.out.println("La variable compartida inicialmente vale: " + this.getContador());
        ++this.contador;
        System.out.println("La variable compartida finalmente vale: " + this.getContador());
        System.out.println();
        System.out.println();
    }
}

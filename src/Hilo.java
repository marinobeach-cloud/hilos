public class Hilo implements Runnable {

    private VariableCompartida variableCompartida;

    private int id;

    public Hilo(VariableCompartida variableCompartida, int id) {
        this.id = id;
        this.variableCompartida = variableCompartida;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; ++i) {

            this.variableCompartida.aumentar(this.id);

        }

    }
}

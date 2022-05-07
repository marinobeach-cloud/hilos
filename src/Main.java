public class Main {


    public static void main(String[] args) {
        VariableCompartida variableCompartida = new VariableCompartida(10);

        Thread t1 = new Thread(new Hilo(variableCompartida, 1));
        Thread t2 = new Thread(new Hilo(variableCompartida, 2));
        Thread t3 = new Thread(new Hilo(variableCompartida, 3));
        t1.start();
        t2.start();
        t3.start();
    }


}

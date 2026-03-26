public class App {
    public static void main(String[] args) throws Exception {
        Mascota m1= new Mascota("Pedro", "Perico", 9);
        Mascota m2= new Mascota("Diego", "Gato", 5);

        m1.mostrarInfo();
        m2.mostrarInfo();
    }
}

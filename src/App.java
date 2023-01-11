public class App {
    public static void main(String[] args) throws Exception {
        Curso matematica = new Curso();
        matematica.setName("Matematica");
        matematica.setDescription("Curso de matemática básica");
        matematica.setDuration(2);
        matematica.setText("Quanto é 2 + 2?");
        matematica.setAnswer("2");

        matematica.getCursoInfo();
    }
}

public class Curso {
    private String name;
    private int duration;
    private String description;
    private Exercicio exercise = new Exercicio();

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getDuration() {
        return duration;
    }
    public void setDuration(int duration) {
        this.duration = duration;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public void setText(String text) {
        this.exercise.setText(text);
    }
    public void setAnswer(String answer) {
        this.exercise.setAnswer(answer);
    }

    public void getCursoInfo() {
        System.out.println("Curso: " + this.getName());
        System.out.println("Duração: " + this.getDuration() + "h");
        System.out.println("Descrição: " + this.getDescription());
        System.out.println("Exercicio: ");
        System.out.println("enunciado: " + this.exercise.getText());
        System.out.println("Resposta: " + this.exercise.getAnswer());
    }
}

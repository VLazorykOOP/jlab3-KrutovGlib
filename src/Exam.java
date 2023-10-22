

public class Exam extends ExaminationEntity {
    private String difficulty;

    public Exam(String title, String date, int duration, String difficulty){
        super(title,date,duration);
        this.difficulty = difficulty;
    }



    @Override
    public void show() {
        System.out.println("Екзамен:");
        super.show();
        System.out.println("Складність: " + difficulty + "з десяти.");

    }
    @Override
    public String toString() {
        return "Екзамен:\n"+super.toString()+ "\nСкладність: " + difficulty+"\n";
    }

}

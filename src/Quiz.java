public class Quiz extends ExaminationEntity{
    private int maxScore;

    public Quiz(String title, String date, int duration, int maxScore){
        super(title,date,duration);
        this.maxScore = maxScore;
    }
    @Override
    public void show(){
        System.out.println("Випробування:");
        super.show();
        System.out.println("Максимальний бал: "+maxScore);

    }

    @Override
    public String toString() {
        return "Випробування:\n"+super.toString()+"\nМаксимальний бал: "+maxScore+"\n";
    }
}

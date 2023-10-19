public class GraduationExam extends ExaminationEntity {
    private int numSubjects;

    public GraduationExam(String title, String date, int duration, int numSubjects){
        super(title,date,duration);
        this.numSubjects = numSubjects;
    }
    @Override
    public void show(){
        System.out.println("Випускний екзамен:");
        super.show();
        System.out.println("Кількість предметів: "+numSubjects);
    }
}

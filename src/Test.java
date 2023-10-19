public class Test extends ExaminationEntity{
    private int numQuestions;

    public Test(String title,String date,int duration, int numQuestions ){
        super(title,date,duration);
        this.numQuestions = numQuestions;
    }
    @Override
    public void show(){
        System.out.println("Тест:");
    super.show();
        System.out.println("Кількість питань: "+ numQuestions);

    }
}

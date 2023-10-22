public class ExaminationEntity {
    private String title;
    private String date;
    private int duration;

    public ExaminationEntity( String title,String date,int duration){
        this.title = title;
        this.date = date;
        this.duration = duration;
    }

    public void show(){//replace with toString
        System.out.println("Назва: "+ title);
        System.out.println("Дата: "+ date);
        System.out.println("Тривалість: "+ duration + " годин.");

    }

    @Override
    public String toString() {
        return "Назва: " + title + "\nДата: " + date + "\nТривалість: " + duration + " годин(-и).";
    }
}


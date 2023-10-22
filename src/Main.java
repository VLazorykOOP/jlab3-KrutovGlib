import java.util.Scanner;
import java.util.Arrays;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                1. Перше завдання.
                2. Друге завдання.
                3. Третє завдання.
                """);
        System.out.print("Ваш вибір: ");
        int input = scanner.nextInt();


        switch (input) {
            case 1 -> firstask();
            case 2 -> secondtask();
            case 3 -> thirdtask();
            case 0 -> {
                break;
            }
            default -> System.out.println("Немає такого завдання(");
        }
    }

    public static void firstask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введення даних для теста: ");
        // Ввід даних для класу Test
        System.out.print("Введіть назву тесту: ");
        String testTitle = scanner.nextLine();
        System.out.print("Введіть дату тесту: ");
        String testDate = scanner.nextLine();
        System.out.print("Введіть тривалість тесту: ");
        int testDuration = scanner.nextInt();
        scanner.nextLine(); // Зчитуємо символ нового рядка після числа
        System.out.print("Введіть кількість питань у тесті: ");
        int testNumQuestions = scanner.nextInt();
        scanner.nextLine(); // Зчитуємо символ нового рядка після числа
        System.out.println();
        Test test1 = new Test(testTitle, testDate, testDuration, testNumQuestions);

        // Ввід даних для класу Exam
        System.out.println("Введення даних для екзамена:");
        System.out.print("Введіть назву іспиту: ");
        String examTitle = scanner.nextLine();
        System.out.print("Введіть дату іспиту: ");
        String examDate = scanner.nextLine();
        System.out.print("Введіть тривалість іспиту: ");
        int examDuration = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Введіть складність іспиту: ");
        String examDifficulty = scanner.nextLine();
        System.out.println();
        Exam exam1 = new Exam(examTitle, examDate, examDuration, examDifficulty);

        //Ввід даних для класу GraduationExam
        System.out.println("Введення даних для випускного екзамена:");
        System.out.print("Введіть назву випускного екзамена: ");
        String GEtitle = scanner.nextLine();
        System.out.print("Введіть дату випускного екзамена: ");
        String GDdate = scanner.nextLine();
        System.out.print("Введіть тривалість випускного екзамена: ");
        int GDduration = scanner.nextInt();
        scanner.nextLine(); // Зчитуємо символ нового рядка після числа
        System.out.print("Введіть кількість предметів випускного екзамена: ");
        int numSubjects = scanner.nextInt();
        scanner.nextLine(); // Зчитуємо символ нового рядка після числа
        System.out.println();
        GraduationExam graduationExam1 = new GraduationExam(GEtitle, GDdate, GDduration, numSubjects);

        System.out.println("Введення даних випробування:");
        System.out.print("Введіть назву впробування: ");
        String Qtitle = scanner.nextLine();
        System.out.print("Введіть дату випробування: ");
        String Qdate = scanner.nextLine();
        System.out.print("Введіть тривалість випробування: ");
        int Qduration = scanner.nextInt();
        scanner.nextLine(); // Зчитуємо символ нового рядка після числа
        System.out.print("Максимальний бал випробування: ");
        int maxScore = scanner.nextInt();
        System.out.println();

        Quiz quiz1 = new Quiz(Qtitle, Qdate, Qduration, maxScore);

        ExaminationEntity[] examinationEntities = {test1, exam1, graduationExam1, quiz1};

        for (ExaminationEntity entity : examinationEntities) {
//            entity.toString();
            System.out.println(entity);
        }
    }

    public static void secondtask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] elements = new int[size];
        System.out.print("Введіть масив: ");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        Container buble = new Bubble(elements);
        buble.sort();
        System.out.println("Сортування бульбашкою: "+ Arrays.toString(buble.getElements()));
        System.out.println("Корінь з суми елементів: " + buble.norma());


        Container choise = new Choise(elements);
        choise.sort();
        System.out.println("Сортування вибіркою: "+ Arrays.toString(choise.getElements()));

        System.out.println("Середнє арифметичне елементів: " +choise.norma());


    }

    public static void thirdtask(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введіть розмір масиву: ");
        int size = scanner.nextInt();
        int[] elements = new int[size];
        System.out.print("Введіть масив: ");
        for (int i = 0; i < elements.length; i++) {
            elements[i] = scanner.nextInt();
        }
        IContainer buble = (IContainer) new IBubble(elements);
        IContainer choise = (IContainer) new IChoise(elements);

        buble.sort();
        choise.sort();

        System.out.println("Сортування бульбашкою: "+ Arrays.toString(elements));
        System.out.println("Корінь з суми елементів: " + buble.norma());


        System.out.println("Сортування вибіркою: "+ Arrays.toString(elements));
        System.out.println("Середнє арифметичне елементів: " +choise.norma());

    }


}

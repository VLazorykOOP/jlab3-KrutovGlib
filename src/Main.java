import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        firstask();
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
            entity.show();
            System.out.println();
        }
    }
}

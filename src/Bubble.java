public class Bubble extends Container{

    public Bubble(int[] elements){
        super(elements);
    }

    @Override
    public void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = 0; j < elements.length - i - 1; j++) {
                if (elements[j] > elements[j + 1]) {
                    int temp = elements[j];
                    elements[j] = elements[j + 1];
                    elements[j + 1] = temp;
                }
            }
        }
    }

    @Override
    public double norma() {
        int sum = 0;
        for(int i:elements){
            sum+=i;
        }
        return Math.sqrt(sum);
    }
}

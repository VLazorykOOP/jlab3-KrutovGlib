public class Choise extends Container {

    public Choise(int[] elements){
        super(elements);
    }

    @Override
    public void sort() {
        for (int i = 0; i < elements.length - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < elements.length; j++) {
                if (elements[j] < elements[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = elements[i];
            elements[i] = elements[maxIndex];
            elements[maxIndex] = temp;
        }
    }

    @Override
    public double norma() {
        int sum = 0;
        for (int element : elements) {
            sum += element;
        }
        return (double) sum / elements.length;
    }
}

public abstract class Container {
    protected int[] elements;

    public Container(int[] elements){
        this.elements = elements;
    }

    public abstract void sort();

    public abstract double norma();

    public int[] getElements(){
        return elements;
    }
}

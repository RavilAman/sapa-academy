package tursynbayev;

public class ValueBox<T>{
    private T value;

    public ValueBox(T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value){
        this.value = value;
    }
    public boolean isEqual(ValueBox<T> seconds){
        return this.value.equals(seconds.getValue());
    }
    public static <T extends Comparable<T>> T max(ValueBox<T> first, ValueBox<T> second) {
        if (first.getValue().compareTo(second.getValue()) >= 0) {
            return first.getValue();
        } else {
            return second.getValue();
        }
    }
}

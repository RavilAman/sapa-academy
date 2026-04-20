package timur.hw6;

class ValueBox<T> {
    private T value;

    public ValueBox (T value){
        this.value = value;
    }
    public T getValue(){
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

    public boolean equals(ValueBox<T> other) {
        if (other == null) {
            return false;
        }
        if (this.value == null && other.value == null) {
            return true;
        }
        if (this.value == null || other.value == null) {
            return false;
        }
        return this.value.equals(other.value);
    }
        public static <T extends Comparable> T max(ValueBox first, ValueBox second){
            T firstValue = (T) first.getValue();
            T secondValue = (T) second.getValue();

            return firstValue.compareTo(secondValue) >= 0? firstValue : secondValue;
            }
        }



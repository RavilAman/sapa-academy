package timur.hw6;

public class Main{
    public static void main(String[] args){

        ValueBox<Integer> box1 = new ValueBox<>(42);
        ValueBox<Integer> box2 = new ValueBox<>(100);

        System.out.println("box1 значение: " + box1.getValue());
        System.out.println("box2 значение: " + box2.getValue());

        box1.setValue(150);
        System.out.println("box1 измененный: " + box1.getValue());

        ValueBox<Integer> box3 = new ValueBox<>(100);
        System.out.println("box2 == box3: " + box2.equals(box3));
        System.out.println("box1 == box2: " + box1.equals(box2));

        Integer maxValue = ValueBox.max(box1, box2);
        System.out.println("Max value: " + maxValue);


    }
}

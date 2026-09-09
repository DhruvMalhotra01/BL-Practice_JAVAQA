class Box<T> {

    private T value;


    Box(T value) {

        this.value = value;
    }


    void setValue(T value) {

        this.value = value;
    }


    T getValue() {

        return value;
    }
}


public class Problem13_GenericClass {

    public static void main(String[] args) {

        Box<Integer> intBox =
                new Box<>(10);


        Box<String> stringBox =
                new Box<>("Hello");


        System.out.println(
                intBox.getValue()
        );


        System.out.println(
                stringBox.getValue()
        );
    }
}
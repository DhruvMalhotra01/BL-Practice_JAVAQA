class OuterClass {

    static class NestedClass {

        void display() {

            System.out.println("Inside static nested class");
        }
    }
}


public class Problem12_StaticNestedClass {

    public static void main(String[] args) {

        OuterClass.NestedClass nested = new OuterClass.NestedClass();

        nested.display();
    }
}
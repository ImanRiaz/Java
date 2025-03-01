class OuterClass {  
    private class InnerClass {  // Private class
        void display() {
            System.out.println("Hello from the private inner class!");
        }
    }

    void show() {
        InnerClass obj = new InnerClass(); // Accessing private class inside OuterClass
        obj.display();
    }
}

public class Private {
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.show(); // Accessing method that uses the private inner class
    }
}

class StaticBinding {
    // Overloaded methods with different signatures
    void display(int num) {
        System.out.println("Integer: " + num);
    }

    void display(String text) {
        System.out.println("String: " + text);
    }
}


    public static void main(String[] args) {
        StaticBinding ex = new StaticBinding();
        ex.display(5);          // Calls the method with int parameter
        ex.display("Hello");    // Calls the method with String parameter
    }


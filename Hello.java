public class Hello {
    public void hello() {
        System.out.println("Hello, World!");
    }

    public void bye() {
        System.out.println("Bye bye...");
    }

    public static void main(String[] args) {
        new Hello().hello();
        new Hello().bye();
    }
}

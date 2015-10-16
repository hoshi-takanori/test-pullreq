public class Hello {
    public void hello() {
        System.out.println("こんにちわ、せかい！");
    }

    public void bye() {
        System.out.println("再见");
    }

    public static void main(String[] args) {
        new Hello().hello();
        new Hello().bye();
    }
}

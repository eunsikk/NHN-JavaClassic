package Lambda;

@FunctionalInterface
public interface RunSomething {
    public void doIt();
}


class TestRun {
    public static void main(String[] args) {
        RunSomething run = () -> {
            System.out.println("Hello, World");
            System.out.println("Hello, Celine");
        };
        run.doIt();
    }
}

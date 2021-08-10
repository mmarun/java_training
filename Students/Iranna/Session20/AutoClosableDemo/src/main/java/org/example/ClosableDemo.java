package  org.example;


class Resource {
    public static void main(String s[])
    {
        // note the order of opening the resources
        try (MyClass a = new MyClass(); MyClass1 b = new MyClass1()) {
            int x = 10 / 0;
            a.show();
            b.show1();
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}

// custom resource 1
class MyClass implements AutoCloseable {
    void show() { System.out.println(" show MyClass"); }
    public void close()
    {
        System.out.println("close from MyClass");
    }
}

// custom resource 2
class MyClass1 implements AutoCloseable {
    void show1() { System.out.println(" show1 MyClass1"); }
    public void close()
    {
        System.out.println("close from MyClass1");
    }
}

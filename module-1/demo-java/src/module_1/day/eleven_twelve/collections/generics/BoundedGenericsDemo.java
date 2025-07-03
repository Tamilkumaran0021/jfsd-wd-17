package module_1.day.eleven_twelve.collections.generics;

public class BoundedGenericsDemo<T extends Number> {
    public T obj;

    public BoundedGenericsDemo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
        BoundedGenericsDemo<Integer> demo = new BoundedGenericsDemo<>(100);
        System.out.println(demo.getObj());
//        BoundedGenericsDemo<String> demo1 = new BoundedGenericsDemo<>("hello world");
//        System.out.println(demo1.getObj());

    }
}

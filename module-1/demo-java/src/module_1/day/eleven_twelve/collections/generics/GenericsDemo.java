package module_1.day.eleven_twelve.collections.generics;

public class GenericsDemo<T> {
//    public int obj;
//    public String obj1;
//
//    public GenericsDemo(int obj) {
//        this.obj = obj;
//    }
//
//    public GenericsDemo(String obj1) {
//        this.obj1 = obj1;
//    }
//
//    public int getObj() {
//        return obj;
//    }
//
//    public String getObj1() {
//        return obj1;
//    }

    public T obj;

    public GenericsDemo(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public static void main(String[] args) {
//        GenericsDemo demo = new GenericsDemo(100);
//        System.out.println(demo.getObj());

        GenericsDemo<Integer> demo = new GenericsDemo<>(100);
        System.out.println(demo.getObj());
        GenericsDemo<String> demo1 = new GenericsDemo<>("hello world");
        System.out.println(demo1.getObj());
    }
}

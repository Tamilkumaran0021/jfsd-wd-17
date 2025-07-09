package module_1.day.fifteen.sealed;

public sealed class Test permits Child {
    public static void main(String[] args) {

    }
}

/////////////////////////////////////////////
//final class Child extends Test {
//
//}
/////////////////////////////////////////////
//sealed class Child extends Test permits Child1 {
//
//}
//
//final class Child1 extends Child {
//
//}
/////////////////////////////////////////////
non-sealed class Child extends Test {

}

class Child1 extends Child {

}
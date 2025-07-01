package module_1.day.eleven.array;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = {2, 10, 20, 44, 50};

        System.out.println(arr[0]);

        int[] temp = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        arr = new int[6];

        for (int i = 0; i < temp.length; i++) {
            arr[i] = temp[i];
        }

        System.out.println(arr[0]);
    }
}

// collections -> List, Set , Map
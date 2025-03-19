package ArraySort;

public class ArraySort {
    public static void main(String[] args) {
        int arr[] = {223, 455, 3345, 55444};
        System.out.println("Original array : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");

            int temp = 0;
            for (i = 0; i < arr.length; i++) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] < arr[i]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;

                    }

                }

            }
            System.out.print("\nSorted  array : ");
            for (i = 0; i < arr.length; i++) {
                System.out.print(arr[i] + "  ");
            }
        }
    }
}

import java.util.Scanner;

class BinarySearch {
    int binarySearch(int[] array, int item, int low, int high) {

        // Repeat until the pointers low and high meet each other
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (array[mid] == item)
                return mid;
            else if (array[mid] < item)
                low = mid + 1;
            else
                high = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        BinarySearch ob = new BinarySearch();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int[] array = new int[n];
        for(int i=0; i<n; i++){
            array[i]= sc.nextInt();
        }
        System.out.println("Enter the item: ");
        int item = sc.nextInt();

        int low =0;
        int high = array.length -1;
        int result = ob.binarySearch(array, item, low, high);

        if (result == -1)
            System.out.println("Not found");
        else
            System.out.println("Element found at index " + result);
    }
}
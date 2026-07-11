package sortingalgos;

public class Bubblesort {
    public static void main(String[] args) {

        int arr[] = {5, 1, 4, 2, 8};
        int n = arr.length;

        // OUTER LOOP
        // Kitne passes (rounds) chalenge.
        // Har pass ke baad sabse bada element end me apni correct position par pahunch jata hai.
        // Isliye total (n-1) passes chalte hain.
        for (int i = 0; i < n - 1; i++) {

            // INNER LOOP
            // Side-by-side elements compare karta hai.
            // Jo element end me already fix ho chuke hain,
            // unhe dobara compare nahi karte.
            // Isliye j < n-i-1 likhte hain.
            for (int j = 0; j < n - i - 1; j++) {

                // Agar left wala bada hai to swap karo
                if (arr[j] > arr[j + 1]) {

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

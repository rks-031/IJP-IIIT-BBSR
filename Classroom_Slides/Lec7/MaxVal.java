package Classroom_Slides.Lec7;
class maxValFunc {
        public static void maxNum(int arr[], int n) {
                int maxi = arr[0];
                for (int i = 0; i < n; i++) {
                        if (maxi < arr[i]) {
                                maxi = arr[i];
                        }
                }
                System.out.println("Max element = " + maxi);
        }

        public static void minNum(int arr[], int n) {
                int mini = arr[0];
                for (int i = 0; i < n; i++) {
                        if (mini > arr[i]) {
                                mini = arr[i];
                        }
                }
                System.out.println("Max element = " + mini);
        }
}

public class MaxVal {
        public static void main(String[] args) {
                int n = 10;
                int arr[] = { 1, 2, 10, 3, 4, 5, 6, 7, 8, 9 };
                maxValFunc.maxNum(arr, n);
                maxValFunc.minNum(arr, n);
        }
}
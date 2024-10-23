// //1. Program to count total number of negative numbers in an array:
// import java.util.Scanner;

// public class CountNegativeNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = scanner.nextInt();
        
//         int[] arr = new int[n];
//         System.out.println("Enter the elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         int negativeCount = 0;
//         for (int i = 0; i < n; i++) {
//             if (arr[i] < 0) {
//                 negativeCount++;
//             }
//         }

//         System.out.println("Total number of negative numbers in the array: " + negativeCount);
//     }
// }



// //2. Program to find the max of 5 integers:
// import java.util.Scanner;

// public class MaxOfFive {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] numbers = new int[5];
//         System.out.println("Enter 5 integers:");

//         for (int i = 0; i < 5; i++) {
//             numbers[i] = scanner.nextInt();
//         }

//         int maxNumber = numbers[0];
//         for (int i = 1; i < 5; i++) {
//             if (numbers[i] > maxNumber) {
//                 maxNumber = numbers[i];
//             }
//         }

//         System.out.println("The maximum number is: " + maxNumber);
//     }
// }


// //3.Program to merge two sorted arrays:


// import java.util.Scanner;

// public class MergeSortedArrays {
//     public static void mergeArrays(int[] arr1, int n1, int[] arr2, int n2, int[] mergedArr) {
//         int i = 0, j = 0, k = 0;

//         while (i < n1 && j < n2) {
//             if (arr1[i] <= arr2[j]) {
//                 mergedArr[k++] = arr1[i++];
//             } else {
//                 mergedArr[k++] = arr2[j++];
//             }
//         }

//         while (i < n1) {
//             mergedArr[k++] = arr1[i++];
//         }

//         while (j < n2) {
//             mergedArr[k++] = arr2[j++];
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the first array: ");
//         int n1 = scanner.nextInt();
//         int[] arr1 = new int[n1];
//         System.out.println("Enter " + n1 + " sorted elements for the first array:");
//         for (int i = 0; i < n1; i++) {
//             arr1[i] = scanner.nextInt();
//         }

//         System.out.print("Enter the size of the second array: ");
//         int n2 = scanner.nextInt();
//         int[] arr2 = new int[n2];
//         System.out.println("Enter " + n2 + " sorted elements for the second array:");
//         for (int i = 0; i < n2; i++) {
//             arr2[i] = scanner.nextInt();
//         }

//         int[] mergedArr = new int[n1 + n2];
//         mergeArrays(arr1, n1, arr2, n2, mergedArr);

//         System.out.println("Merged array:");
//         for (int i = 0; i < n1 + n2; i++) {
//             System.out.print(mergedArr[i] + " ");
//         }
//         System.out.println();
//     }
// }


// //4.Program to reverse the order of 7 integers:

// import java.util.Scanner;

// public class ReverseArray {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] arr = new int[7];
//         System.out.println("Enter 7 integers:");

//         for (int i = 0; i < 7; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         for (int i = 0; i < 7 / 2; i++) {
//             int temp = arr[i];
//             arr[i] = arr[7 - i - 1];
//             arr[7 - i - 1] = temp;
//         }

//         System.out.println("Reversed array:");
//         for (int i = 0; i < 7; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         System.out.println();
//     }
// }




// //5. Program to check if the array is a palindrome
// import java.util.Scanner;

// public class PalindromeArray {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int[] arr = new int[5];
//         System.out.println("Enter 5 integers:");

//         for (int i = 0; i < 5; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         boolean isPalindrome = true;
//         for (int i = 0; i < 5 / 2; i++) {
//             if (arr[i] != arr[5 - i - 1]) {
//                 isPalindrome = false;
//                 break;
//             }
//         }

//         if (isPalindrome) {
//             System.out.println("The array is in palindrome order.");
//         } else {
//             System.out.println("The array is not in palindrome order.");
//         }
//     }
// }

// //6.Program to search a number in an array and return the first occurrence:
// import java.util.Scanner;

// public class SearchNumber {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int n, searchNumber, index = -1;

//         System.out.print("Enter the size of the array: ");
//         n = scanner.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         System.out.print("Enter the number to search for: ");
//         searchNumber = scanner.nextInt();

//         for (int i = 0; i < n; i++) {
//             if (arr[i] == searchNumber) {
//                 index = i;
//                 break;
//             }
//         }

//         System.out.println("Index of first occurrence: " + index);
//     }
// }

// //7.Program to print all unique numbers in an array:
// import java.util.Scanner;

// public class UniqueNumbers {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         System.out.println("Unique numbers in the array:");
//         boolean foundUnique = false;

//         for (int i = 0; i < n; i++) {
//             boolean isUnique = true;

//             for (int j = 0; j < n; j++) {
//                 if (i != j && arr[i] == arr[j]) {
//                     isUnique = false;
//                     break;
//                 }
//             }

//             if (isUnique) {
//                 System.out.print(arr[i] + " ");
//                 foundUnique = true;
//             }
//         }

//         if (!foundUnique) {
//             System.out.println("No unique numbers found.");
//         }
//     }
// }


// //8.Program to count the frequency of each number in an array:


// import java.util.Scanner;

// public class FrequencyCount {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements of the array (values between 0 to 100):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         int[] frequency = new int[101];

//         for (int i = 0; i < n; i++) {
//             frequency[arr[i]]++;
//         }

//         System.out.println("Frequency of each number in the array:");
//         for (int i = 0; i <= 100; i++) {
//             if (frequency[i] > 0) {
//                 System.out.println(i + ": " + frequency[i]);
//             }
//         }
//     }
// }

// //9.Program to count total number of duplicate numbers in an array:

// import java.util.HashMap;
// import java.util.Scanner;

// public class DuplicateCount {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the size of the array: ");
//         int n = scanner.nextInt();

//         int[] arr = new int[n];
//         System.out.println("Enter " + n + " elements of the array:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = scanner.nextInt();
//         }

//         HashMap<Integer, Integer> frequency = new HashMap<>();

//         for (int i = 0; i < n; i++) {
//             frequency.put(arr[i], frequency.getOrDefault(arr[i], 0) + 1);
//         }

//         int duplicateCount = 0;
//         for (int count : frequency.values()) {
//             if (count > 1) {
//                 duplicateCount++;
//             }
//         }

//         System.out.println("Total number of duplicate numbers: " + duplicateCount);
//     }
// }


// //10.Function to print a parallelogram pattern:

// import java.util.Scanner;

// public class ParallelogramPattern {
//     public static void printParallelogram(int rows, int cols) {
//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < rows - i - 1; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 0; k < cols; k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int cols = scanner.nextInt();

//         printParallelogram(rows, cols);
//     }
// }

// //11.Function to print a right triangle pattern:
// import java.util.Scanner;

// public class RightTrianglePattern {
//     public static void printRightTriangle(int rows) {
//         for (int i = 1; i <= rows; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();

//         printRightTriangle(rows);
//     }
// }

// //12.Function to print a half-diamond pattern:
// import java.util.Scanner;

// public class HalfDiamondPattern {
//     public static void printHalfDiamond(int cols) {
//         for (int i = 1; i <= cols; i++) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = cols - 1; i >= 1; i--) {
//             for (int j = 1; j <= i; j++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of columns: ");
//         int cols = scanner.nextInt();

//         printHalfDiamond(cols);
//     }
// }

// //13.Function to print a diamond pattern (only odd number of rows allowed):
// import java.util.Scanner;

// public class DiamondPattern {
//     public static boolean printDiamond(int rows) {
//         if (rows % 2 == 0) {
//             System.out.println("Error: The number of rows must be an odd number.");
//             return false;
//         }

//         int n = (rows + 1) / 2;

//         for (int i = 1; i <= n; i++) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         for (int i = n - 1; i >= 1; i--) {
//             for (int j = 1; j <= n - i; j++) {
//                 System.out.print(" ");
//             }
//             for (int k = 1; k <= (2 * i - 1); k++) {
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//         return true;
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();

//         if (printDiamond(rows)) {
//             System.out.println("Diamond pattern printed successfully.");
//         }
//     }
// }

// //14. Function to print alternating pattern of ascending and descending numbers:
// import java.util.Scanner;

// public class AlternatingPattern {
//     public static void printPattern(int rows, int cols) {
//         for (int i = 0; i < rows; i++) {
//             if (i % 2 == 0) {
//                 for (int j = 1; j <= cols; j++) {
//                     System.out.print(j);
//                 }
//             } else {
//                 for (int j = cols; j >= 1; j--) {
//                     System.out.print(j);
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int cols = scanner.nextInt();

//         printPattern(rows, cols);
//     }
// }

// //15.Function to print a bordered pattern with 1’s and 0’s inside:
// import java.util.Scanner;

// public class BorderedPattern {
//     public static void printPattern(int rows, int cols) {
//         if (rows < 1 || cols < 1) {
//             System.out.println("Error: The number of rows and columns must be at least 1.");
//             return;
//         }

//         for (int i = 0; i < rows; i++) {
//             for (int j = 0; j < cols; j++) {
//                 if (i == 0 || i == rows - 1 || j == 0 || j == cols - 1) {
//                     System.out.print("1");
//                 } else {
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();
//         System.out.print("Enter the number of columns: ");
//         int cols = scanner.nextInt();

//         printPattern(rows, cols);
//     }
// }


// //16.Function to print a pattern with increasing and fixed numbers:
// import java.util.Scanner;

// public class IncreasingFixedPattern {
//     public static void printPattern(int rows) {
//         for (int i = 0; i < rows; i++) {
//             for (int j = i + 1; j <= rows; j++) {
//                 System.out.print(j);
//             }
//             for (int k = rows; k > i + 1; k--) {
//                 System.out.print(rows);
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         System.out.print("Enter the number of rows: ");
//         int rows = scanner.nextInt();

//         printPattern(rows);
//     }
// }




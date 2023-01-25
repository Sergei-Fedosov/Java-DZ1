// Task1
// Заполните массив случайным числами и выведите максимальное, минимальное и среднее значение.
// Для генерации случайного числа используйте метод Math.random(), который возвращает значение в промежутке [0, 300].

// public class Main {

//     public static void main(String args[]){
//         int a = 0;
//         int b = 300;

//         int Random_Num1 = a + (int) (Math.random() * b);
//         System.out.println("1 число: " + Random_Num1);

//         int Random_Num2 = a + (int) (Math.random() * b);
//         System.out.println("2 число: " + Random_Num2);

//         int Random_Num3 = a + (int) (Math.random() * b);
//         System.out.println("3 число: " + Random_Num3);

//         int max = Math.max(Math.max(Random_Num1,Random_Num2), Random_Num3);
//         System.out.println("max: " + max);

//         int min = Math.min(Math.min(Random_Num1,Random_Num2), Random_Num3);
//         System.out.println("min: " + min);

//         int mid = Random_Num1 ^ Random_Num2 ^ Random_Num3 ^ min ^ max;
//         System.out.println("mid: " + mid);
//     }
// }

// Task2
// Реализуйте алгоритм сортировки пузырьком для сортировки массива

// import java.util.Arrays;
 
// public class Main {
//     public static void main(String[] args) {
//         int [] mas = {11, 3, 14, 16, 7};
 
//         boolean isSorted = false;
//         int buf;
//         while(!isSorted) {
//             isSorted = true;
//             for (int i = 0; i < mas.length-1; i++) {
//                 if(mas[i] > mas[i+1]){
//                     isSorted = false;
 
//                     buf = mas[i];
//                     mas[i] = mas[i+1];
//                     mas[i+1] = buf;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(mas));
//     }
// }

// Task3
// Напишите программу, которая выводит на консоль простые числа в промежутке от [2, 100].
// Используйте для решения этой задачи оператор "%" (остаток от деления) и циклы.

// public class Main {
//     public static void main(String[] args){

// for (int n = 2; n <= 100; n++) {
//     boolean isPrime = true;
//     double squareRoot = Math.sqrt(n) + 2;
//     int r = 2;
//     while (r <= squareRoot && isPrime) {
//         if (n % r == 0) isPrime = false;
//         r++;
//     }
//     System.out.print(isPrime ? (n + " ") : "");
//         }
//     }
// }
import java.util.Arrays;

public class Main {
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
    public static void main(String[] args) {
    task1();
    task2();
    task3();
    task4();
    task5();
    task6();
    task7();
    task8();
    task9();
    }
    public static void task1 () {
        System.out.println("Задача №1");
        int[ ] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Сумма трат за месяц составила: " + sum +  " рублей" );
    }
    public static void task2 () {
        System.out.println();
        System.out.println("Задача №2");
        int[ ] arr = generateRandomArray();
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) max = arr[i] ;
            if (arr[i] < min) min = arr[i] ;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Минимальная сумма трат за день составила: " + min + " рублей. " +
                "Максимальная сумма трат за день составила: " + max +" рублей" );
    }
    public static void task3 () {
        System.out.println();
        System.out.println("Задача №3");
        int[ ] arr = generateRandomArray();
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Средняя сумма трат за месяц составила: " + sum / arr.length +  " рублей" );
    }
    public static void task4 () {
        System.out.println();
        System.out.println("Задача №4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
    public static void task5 () {
        System.out.println();
        System.out.println("Задача №5");
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            System.out.println();
            for (int j = 0; j < arr[i].length; j++) {
                if ((i + j) % 2 == 0) {
                    arr[i][j] = 1;
                    System.out.print(arr[i][j] + " ");
                } else System.out.print(arr[i][j] + " ");
            }
        }
    }
    public static void task6() {
        System.out.println();
        System.out.println("Задача №6");
        int[] arrStart = {5,4,3,2,1};
        int[] arrNew = new int[5];
        int temp;
        for (int i = 0; i < arrStart.length; i++) {
            temp = arrStart[i];
            arrNew[arrNew.length - 1 - i]=temp;
        }
        System.out.println(Arrays.toString(arrStart));
        System.out.println(Arrays.toString(arrNew));
    }
    public static void task7() {
        System.out.println();
        System.out.println("Задача №7");
        int[] arr = {5,4,3,2,1};
        int temp;
        for (int i = 0; i != arr.length-1-i; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i]=temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void task8() {
        System.out.println();
        System.out.println("Задача №8");
        int[] arr =  {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        Arrays.sort(arr);
        int sumFind = -2;
        int sum;
        int left = 0;
        int right = arr.length-1;
        while (left != right){
            if (arr[left] + arr[right] > sumFind) right--;
            else if (arr[left] + arr[right] < sumFind) left++;
            else {
                System.out.println(arr[left] + " " + arr[right]);
            break;
            }
        }
    }
    public static void task9() {
        System.out.println();
        System.out.println("Задача №9");
        int[] arr =  {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int temp;
        for (int i = 0; i < arr.length-1; i++) {
            temp = arr[i];
            for (int j = i+1; j < arr.length-1; j++) {
                if (temp + arr[j] == -2) {
                    System.out.println(temp + " и " +arr[j]);
                }
            }
        }
    }

}
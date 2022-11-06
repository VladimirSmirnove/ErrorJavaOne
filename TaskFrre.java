
/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, 
 * каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке. 
 * Если длины массивов не равны, необходимо как-то оповестить пользователя. 
 * Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

public class TaskFrre {

public static void main(String[] args) {
    ArithmeticArray();
}
    public static void ArithmeticArray() {
    int[] OneArr = {4, 2};
    int[] TwoArr = {2, 1, 2};
    int[] SumArr = new int[OneArr.length];
    if (OneArr.length != TwoArr.length) {
        throw new RuntimeException("Длина массивов не равны");
    }
    for (int i = 0; i < OneArr.length; ++i) {
        SumArr[i] = OneArr[i] / TwoArr[i];
        System.out.println(SumArr[i]);
    
    }
    }
}


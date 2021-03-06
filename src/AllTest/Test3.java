package AllTest;
//Test № 3
public class Test3 {
    public static void main(String[] args) {
        int [] fiveArray = {10, 15, 7, 9, 22};
        int x = fiveArray[fiveArray.length - 1];// x = 22
        int a = fiveArray[fiveArray.length - 1] = fiveArray[0];//[4] = 10 (a)
        System.out.println(fiveArray[fiveArray.length-5] = x);//[0] = 22
        System.out.println(fiveArray[0] + " " + fiveArray[4]);//22 10

        int total = 0;
        int total2 = 0;
        for (int i = 4; i < fiveArray.length;i++){//total + fiveArrayList[] each iteration
            total += fiveArray[0];//first element fiveArray[]
            total2 += fiveArray[2];//third element fiveArray[]
        }
        total = total + total2;
        System.out.println("Сумма первого и третьего (среднего) элемента массива fiveArray = " + total);
    }

}

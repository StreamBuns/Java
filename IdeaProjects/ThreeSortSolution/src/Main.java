import java.time.Period;

public class Main {

    public static void main(String[] args) {

//        System.out.println("Hello World!");
    int IntArry[] = {3,2,5,4,6};
//    IntArry = new int[5];
//    for(int i = 0 ; i < IntArry.length -1 ; i++)
//    {
//        for(int j = 0 ; j < IntArry.length -1; j++)
//        {
//            if(IntArry[j] > IntArry[j+1]) {
//                IntArry[j] = IntArry[j] ^ IntArry[j + 1];
//                IntArry[j+1] = IntArry[j] ^ IntArry[j+1];
//                IntArry[j] = IntArry[j] ^ IntArry[j+1];
//            }
//        }
//    }
//最初版本的冒泡排序


//        for(int i = 0 ; i < IntArry.length -1 ; i++)
//        {
//            for(int j = i ; j < IntArry.length -1; j++)
//            {
//                if(IntArry[j] > IntArry[j+1]) {
//                    IntArry[j] = IntArry[j] ^ IntArry[j + 1];
//                    IntArry[j+1] = IntArry[j] ^ IntArry[j+1];
//                    IntArry[j] = IntArry[j] ^ IntArry[j+1];
//                }
//            }
//        }
//增强版本的冒泡排序


//        for(int i = 0 ; i < IntArry.length  ; i++)
//        {
//            for(int j = i+1 ; j < IntArry.length ; j++)
//            {
//                if(IntArry[i] > IntArry[j]) {
//                    IntArry[i] = IntArry[i] ^ IntArry[j];
//                    IntArry[j] = IntArry[i] ^ IntArry[j];
//                    IntArry[i] = IntArry[i] ^ IntArry[j];
//                }
//            }
//        }
//选择排序
        int temp;
        int PreNumber;

        for(int i = 1; i < IntArry.length ; i++)
        {
            temp = i-1;
            PreNumber = IntArry[i];
            while (temp >= 0  &&  IntArry[temp] > PreNumber)
            {
                IntArry[temp+1] = IntArry[temp];
                temp--;
            }
            IntArry[temp+1] = PreNumber;
        }
//插入排序
    for(int i = 0 ; i < IntArry.length ; i++)
    {
        System.out.println(IntArry[i]);
    }
//输出数组正确答案是2 3 4 5 6
    }
}

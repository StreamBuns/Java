import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
//        System.out.println("hazlou");
//        char chinaWord = '好',japanWord = 12353;
//        char you = '\u4F60';
//        int position = 20320;
//        System.out.println("汉字："+ chinaWord + "的位置：" + (int)chinaWord);
//        System.out.println("日文："+ japanWord + "的位置：" + (int)japanWord);
//        System.out.println(position + "的位置是" + (char)position);
//        position  = 21319;
//        System.out.println(position + "的位置是" + (char)position);
//        System.out.println("you:" + you );
//例子1 用来测试U码




//        Scanner reader  = new Scanner(System.in);
//        float sum = 0 ;
//        float x = reader.nextFloat();
//        while ( x != 0)
//        {
//            sum += x;
//            x = reader.nextFloat();
//        }
//        System.out.printf("sum = %f",sum);
//        int IntArr[] = {2,1,4,3,6,5,7,9,8,0,11};
//        int start=0,middle,end;
//        int ArrLength = IntArr.length;
//        for (int i = 0 ; i < ArrLength ; i++ )
//        {
//            for (int j = i+1 ; j < ArrLength ; j++ ) {
//                if (IntArr[j] < IntArr[i]) {
//                IntArr[i] = IntArr[i] ^ IntArr[j];
//                IntArr[j] = IntArr[i] ^ IntArr[j];
//                IntArr[i] = IntArr[i] ^ IntArr[j];
//                //这是利用异或进行两个数的交换
//                }
//            }
//        }
//        for (int i = 0 ; i < ArrLength ; i++ )
//        {
//            System.out.println(IntArr[i]);
//        }
//        Scanner reader = new Scanner(System.in);
//        int number = reader.nextInt();
//        int count = 0;
//        end = ArrLength;
//        middle = (start+end)/2;
//        while (number !=IntArr[middle])
//        {
//            if(number > IntArr[middle])
//            start = middle;
//            if(number < IntArr[middle])
//            end = middle;
//            count ++;
//            middle = (end + start)/2;
//            if(count > ArrLength/2)
//                break;;
//        }
//        if(count < ArrLength/2)
//        System.out.println("YES");
//        else System.out.println("NO");
//例子2 用来练习一下中值寻找法，此方法只能适用于已经排列好的数组


//        Battery nanfu = new Battery(100);
//        System.out.println("南孚电池的储电量是："+nanfu.electricityAmount);
//        Radio radio = new Radio();
//        System.out.println("收音机开始使用南孚电池");
//        radio.openRadio(nanfu);
//        System.out.println("南孚电池的储电量是："+nanfu.electricityAmount);
//例子3 用来测试方法中传入数据，什么情况下会改变数据本身，这个例子说明，如果直接把一个类
//        传入一个方法中，并且改变了类中所存储的值，那么，方法外这个值就会变化，但是如果，只是把
//        这个类中的值传入进方法中，并且改变这一个值，那么方法外，这个值本身不会变化

//    int intNumber = 1;
//    intNumber number = new intNumber(intNumber);
//    Translate translate = new Translate();
//    translate.testTranslate(intNumber);
//    //用来测试直接向方法中传入一个数，并在方法中改变它，在方法外会不会变化；不会变化
//    System.out.println(intNumber);
//    translate.testTranslate(number.intNumer);
//    //用来测试向方法中传入一个类中传入的数，并在方法中改变它，在方法外这个类中存储的数据会不会变化；不会变化
//    System.out.println(intNumber);
//    System.out.println(number.intNumer);
//    translate.testTranslate(number);
//    //用于测试向方法中传入一个存储数据的类，并在方法中改变它，在方法外这个类中存储的数据会不会变化；会变化
//    System.out.println(number.intNumer);
//    例子4
//上面两个例子（3。4）告诉我们：
//如果一个类里面存的数据A，如果仅仅是数据A传入方法B中，并在方法B中更改了"传入的A的值"原本的A不会变
//但是如果这个类整体传入方法B中，并在方法B中修改了这个类中A的值，那么A的值就会变化
//


    }
}

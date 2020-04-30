import java.util.Scanner;

public class Nwu {
    public static void main (String[]args)
    {System.out.println(2+3);
        int number=5;
        int number1=2;
        System.out.println(number*number1);

        double m = 0.00; m=(201/7);
        System.out.println(m);

        Scanner scan = new Scanner(System.in);
        System.out.print("введите чсло 1:");
        int число1 = scan.nextInt();
        System.out.print("введите чсло 2:");
        int число2 = scan.nextInt();
        if (число1>число2) System.out.println("число 1 больше");
        else if (число1<число2)System.out.println("число 2 больше");
        else if (число1>=число2)System.out.println("число 1 и 2 равны");

        System.out.print("введите сумму вклада:");
        double x = scan.nextInt();
        double вклад = x*100;

        System.out.print("введите начисляемый прцент:");
        int процент = scan.nextInt();
        double вклад1 = вклад+(вклад*процент/100);double n1 = вклад1/100;
        System.out.println(n1);double вклад2 = вклад1+(вклад1*процент/100);
        double n2 = (вклад2/100);System.out.println(n2);
        double вклад3 = вклад2+(вклад2*процент/100);
        double вклад4 = вклад3+(вклад3*процент/100);
        double вклад5 = вклад4+(вклад4*процент/100);
        double n3 = (вклад3-(вклад3%=1))/100;System.out.println(n3);
        double n4 = (вклад4-(вклад4%=1))/100;System.out.println(n4);
        double n5 = (вклад5-(вклад5%=1))/100;System.out.println(n5);
        System.out.println(вклад);
        System.out.println(вклад3);
        System.out.println(вклад4);
        System.out.println(вклад5);
} }

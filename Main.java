import java.util.Scanner;

import static jdk.internal.org.jline.utils.
        Colors.s;

public class Main {


   public static void main(String[] args) {
        System.out.println(getVowelsCount("DarTech123"));
       System.out.println(getMinNumber());

       System.out.println(getSmallEst());
       System.out.println(getWordsdCount("  Java is good to learn Object Oriented programming."));


      System.out.println(test("AIEEE"));
      double s;
       Scanner input = new Scanner(System.in);
       System.out.print("количества сторон ");
       int n = input.nextInt();
       System.out.print("длина стороны: ");
       double side2 = input.nextDouble();

       System.out.println("Площадь пятиугольника равна " + pentagon_area(n, side2));

       Scanner in = new Scanner(System.in);
       System.out.print("Дано: ");
       int digits = in.nextInt();
       System.out.println("Сумма " + sumDigits(digits));

      Scanner in1 = new Scanner(System.in);
       System.out.print("дано: ");
       int n1 = in.nextInt();
       if (n>0)

           System.out.println(test(n));



    }


    public static int getVowelsCount(String input) {
        int count = 0;
        String vowels = "aeiou";

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static int getWordsdCount(String input) {

        int count = 0;
        if (input.length() != 0) {
            for (int i = 0; i < input.length(); i++) {
                if (input.charAt(i) != ' ') {
                    continue;
                }
                count++;
            }
        }

        return count;
    }

    public static int getMinNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("первое число: ");
        double x = in.nextDouble();
        System.out.print("второе число: ");
        double y = in.nextDouble();
        System.out.print("третя число: ");
        double z = in.nextDouble();
        System.out.print("Среднее значения " + average(x, y, z) + "\n");
        return 0;
    }

    public static double average(double x, double y, double z) {
        return (x + y + z) / 3;
    }


    public static int getSmallEst() {
        Scanner in = new Scanner(System.in);
        System.out.print("первое число: ");
        double x = in.nextDouble();
        System.out.print("второе число: ");
        double y = in.nextDouble();
        System.out.print("третя число: ");
        double z = in.nextDouble();
        System.out.print("найменшая значение " + smallest(x, y, z) + "\n");
        return 0;
    }

    public static double smallest(double x, double y, double z) {
        return Math.min(Math.min(x, y), z);
    }


    public static boolean test(String input) {
        String str_vowels = "AIEEE";
        String phrase = input.toLowerCase();
        for (int i = 0; i < phrase.length(); i++) {
            if (str_vowels.indexOf(phrase.charAt(i)) == -1)
                return false;
        }
        return true;

    }
    public static double pentagon_area(int n, double s) {
        return (n * s * s) / (4 * Math.tan(Math.PI / n));
    }
    public static int sumDigits(long n) {
        int result = 0;

        while(n > 0) {
            result += n % 10;
            n /= 10;
        }

        return result;
    }
       public static int test(int num)
       {
           int ctr = 0;
           int n = num;
           do{
               if (n % 10 == 2){
                   ctr ++;
               }
               n /= 10;
           }while(n > 0);
           return ctr;
       }
    }








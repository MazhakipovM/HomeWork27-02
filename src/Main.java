public class Main {
    public static void main(String[] args) {

        //zadacha 1
        int number1 = 0;
        while ( number1 < 10){
            number1++;

            System.out.print(number1+ " ");
        }
        System.out.println(" ");


        //zadacha 2
        for (int x = 10; x >= 1; x-- ){
            System.out.println(x);
        }

        //zadacha 3
        for (int y = 0; y <=17; y = y + 2){
            System.out.println(y);
        }

        //zadacha 4
        for (int q = 10; q >= -10; q = q -1){
            System.out.println(q);
        }

        //zadacha 5
        for (int a = 1904; a <= 2096; a = a + 4 ){
            System.out.println(a + " год является високосным.");
        }

        //zadacha 6
        for (int t = 7; t <= 98; t = t + 7){
            System.out.println(t+" ");
        }

        //zadacha 7

        for (int o = 1; o <= 512; o = o *2){
            System.out.println(o + " ");
        }

        //zadacha 8
        int total = 0;
        int deposit = 29000;
        for (int u=1; u <=12; u++){
            total = total + deposit;

            System.out.println("Месяц " +u+" сумма накоплений равна " + total+ "рублей");
        }


        //zadacha 9

        int deposit2 = 29000;
        double mesyac = 0;
        for (int n = 1; n <= 12; n++ ){
            mesyac = mesyac + mesyac/100;
            mesyac = mesyac + deposit2;


            System.out.println("Месяц " +n+ " сумма накоплений равна " + mesyac+ "рублей");
        }


        //zadacha 10

        int number = 2;
        for (int z = 1; z <= 10; z++ ){
            System.out.println("2 * "+z+ " = " +(number*z));
        }

    }
}
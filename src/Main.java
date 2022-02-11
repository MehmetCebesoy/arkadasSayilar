public class Main {

    public static void main(String[] args) {
        // arkadaş sayilar:bölenlerinin toplamı diğer sayıya eşit olan sayiyalara denir
        int number1 = 220;
        int number2 = 284;
        int toplam1 = 0;
        int toplam2 = 0;
        for (int i = 1; i < number1; i++) {
            if (number1 % i == 0) {
                toplam1 = toplam1 + i;
            }
        }
        System.out.println(toplam1);
        for (int j = 1; j < number2; j++) {
            if (number2 % j == 0) {
                toplam2 = toplam2 + j;
            }
        }
        System.out.println(toplam2);

        //if(toplam1==number2){
        // if(toplam2==number1){
//ikisini tek bir yerde
        // && : ve demek ||:or/veya demek
        if (toplam1 == number2 && toplam2 == number1) {
            System.out.println(number1 + " ve " + number2 + " arkadaş sayılardır");
        } else {
            System.out.println(number1 + " ve " + number2 + " arkadaş sayı değildir. ");

        }
    }
}

import java.util.Random;
import java.util.Scanner;

public class asosiy {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int qiymat = random.nextInt(50);
        //System.out.println("#\tQiymat = " + qiymat); //javobni ekranga chiqarishda ishlatildi, xatoliklarni topish uchun
        yana:
        while (true) {
            int sanoq = 1;
            System.out.print("(0 - 50) oraliqqacha bo'lgan random raqamni toping: ");
            int kiritilganSon = sc.nextInt();
            while (kiritilganSon != qiymat) {
                sanoq++;

                if (kiritilganSon < qiymat) {
                    if (kiritilganSon + 5 >= qiymat && kiritilganSon - 5 <= qiymat) {
                        System.out.println("\tSiz kiritgan raqam noma`lum raqamdan biroz kichkina!");
                    } else {
                        System.out.println("\tSiz kiritgan raqam noma`lum raqamdan kichkina!");
                    }
                } else if (kiritilganSon - 5 <= qiymat && kiritilganSon + 5 >= qiymat) {
                    System.out.println("\tSiz kiritgan raqam noma`lum raqamdan biroz katta!");
                } else {
                    System.out.println("\tSiz kiritgan raqam noma`lum raqamdan katta!");
                }

                System.out.print("Qayta kiriting ");
                kiritilganSon = sc.nextInt();


            }
            switch (sanoq) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    System.out.print("Qoyil ");
                    break;
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    System.out.print("Zo`r ");
                    break;
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    System.out.print("Yaxshi ");
                    break;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                    System.out.print("Bo'ladi ");
                    break;
            }
            System.out.println(sanoq + " ta urinishda topdingiz !\n");

            while (true) {
                System.out.print("Yana o'ynaysizmi? (H / Y): ");
                char ch = sc.next().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    break yana;
                } else if (ch == 'H' || ch == 'h') {
                    qiymat = random.nextInt(50);
                    //System.out.println("#\tQiymat = " + qiymat);// javobni ekranga chiqarishda ishlatildi, xatoliklarni topish uchun
                    continue yana;
                } else System.out.println("H - ha yoki Y - yo`q");
            }
        }

    }
}

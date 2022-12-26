import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        int mat,fizik,muzik,kimya,turkce;

        System.out.print("matematik notu: ");
        mat = input.nextInt();
        System.out.print("fizik notu: ");
        fizik = input.nextInt();
        System.out.print("muzik notu: ");
        muzik = input.nextInt();
        System.out.print("kimya notu: ");
        kimya = input.nextInt();
        System.out.print("turkce notu: ");
        turkce = input.nextInt();

        float ort = (muzik+turkce+mat+kimya+fizik)/5;
        if(ort <= 100 && ort >= 0){
            if (ort <= 55){
                System.out.println("Ortalamanız: "+ ort + " Sınıfta Kaldınız ");
            }else{
                System.out.println("Ortalamanız: "+ ort + " Tebrikler Geçtiniz");
            }
        }else{
            System.out.println("Ders notlarınız 0 veya 100 arasında olmadığı için ortalamaya katılmadınız.");
        }
    }
}
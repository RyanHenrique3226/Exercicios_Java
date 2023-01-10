import java.util.Scanner;

public class Exercicio11 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a hora de inicio: ");
        int horaI = sc.nextInt();

        System.out.println("Digite a hora de termino: ");
        int horaF = sc.nextInt();

        if(horaI < horaF){
            System.out.println("O jogo durou "+ (horaF - horaI)+"hora(s)");
            sc.close();
        }
        else if(horaI >= horaF){
            System.out.println("O jogo durou "+((24 - horaI) + horaF)+"hora(s)");
        }
        



    }
}

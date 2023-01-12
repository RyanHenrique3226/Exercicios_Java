import java.util.Scanner;

public class Exercicio21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] anoCarro = new int[3];
        double [] velocidadeMedia = new double [3];
        int guardar = 0;
        for(int i = 0;i < anoCarro.length;i++){
            
            System.out.println("Digite o ano do carro");
            anoCarro[i] = sc.nextInt();
            System.out.println("Digite a velocidade do carro: ");
            velocidadeMedia[i] = sc.nextDouble();

        }
        for(int i = 0 ;i < anoCarro.length;i++){
            for(int x = 1;x < anoCarro.length;i++){
                if(anoCarro[x] > anoCarro[i]){
                    guardar = anoCarro[i];
                    anoCarro[i] = anoCarro[x];
                    anoCarro[x] = guardar;
                }

            }

        }
        
        System.out.print(anoCarro[0]);


    }
}

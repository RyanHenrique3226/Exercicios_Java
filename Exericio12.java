import java.util.Scanner;

public class Exericio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("É vertebrado ou invertebrado?");
        String animal = sc.nextLine();
        
        System.out.println("Qual a classe do animal?");
        String classe = sc.nextLine();

        System.out.println("o animal é do tipo(carnivoro, onivoro...): ");
        String alimentacao = sc.nextLine();

        switch(animal){
            case("vertebrado"):
                switch(classe){
                    case("ave"):
                        switch(alimentacao){
                            case("carnivoro"):
                            System.out.println("Águia");

                            case("onivoro"):
                            System.out.println("pomba");

                        }
                    case("mamifero"):
                        switch(alimentacao){
                            case("onivoro"):
                            System.out.println("homem");

                            case("herbivoro"):
                            System.out.println("vaca");
                        }
                }
            
            case("invertebrado"):
                switch(classe){
                    case("inseto"):
                    switch(alimentacao){
                        case("hematofago"):
                        System.out.println("pulga");
                        case("lagarta"):

                    }

                }

        }
    }
}

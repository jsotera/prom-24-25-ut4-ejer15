import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numeroSecreto = (int) (Math.random() * 10) + 1;
        System.out.print("Dame un numero: ");
        int entrada = scanner.nextInt();
        int intentos = 0;
        while( entrada != numeroSecreto ){
            if(entrada > numeroSecreto){
                System.out.println("El numero secreto es MENOR");
            } else {
                System.out.println("El numero secreto es MAYOR");
            }
            System.out.print("Dame un numero: ");
            entrada = scanner.nextInt();
            if(intentos>2){
                break;
            }
            intentos++;
        }

        if(intentos==3){
            System.out.println("ERES UN PAQUETE");
        } else {
            System.out.println("Enhorabuena, el numero secreto era ["+numeroSecreto+"]");
        }

    }
}
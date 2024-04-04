import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numeroGenerado = new Random().nextInt(100) + 1;
        int intentos = 10;
        System.out.println("numero generado: " + numeroGenerado);
        System.out.println("Ingresa un numero del 1 al 100");
        for (int i = 1; i <= intentos; i++) {
            int numeroUsuario = teclado.nextInt();
            if (numeroUsuario == numeroGenerado) {
                System.out.println("Felicidades, adivinaste el numero y lo hiciste en " + i + (i == 1 ? " intento" : " intentos"));
                break;
            }
            else if (numeroUsuario > numeroGenerado) {
                System.out.println("El numero secreto es menor");
            }
            else if (numeroUsuario < numeroGenerado) {
                System.out.println("El numero secreto es mayor");
            }
            if (i == intentos) {
                System.out.println("Perdiste, el numero era: " + numeroGenerado + " y lo hiciste en "+i+" intentos");
            }
        }
    }
}

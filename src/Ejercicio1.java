import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {

        int notas[] = new int[10];
        Scanner sc = new Scanner(System.in);

        mostrarPromedioNotas(notas,sc);
        mostrarAlumnosAprobados(notas);
        //encontrarMaximaNota(notas);

    }




    public static void mostrarPromedioNotas(int notas[],Scanner sc){
        int promedio =0;
        int promedioTotal=0;
        System.out.println("Ingrese las notas de los estudiantes: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println("Alumno: " + i);
            if(notas[i] >1 || notas[i] >10){
                notas[i] = sc.nextInt();
                promedio= promedio + notas[i];
                promedioTotal = promedio / 10;
            }
        }
        System.out.println("El promedio total de notas es de: " + promedioTotal);
    }

    public static void mostrarAlumnosAprobados(int notas[]){
        int alumnosAprobados =0;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] >= 6){
                alumnosAprobados = alumnosAprobados + 1;
            }
        }
        System.out.println("El total de alumnos aprobados son: " + alumnosAprobados);
    }

   /* public static void encontrarMaximaNota(int notas[]){
        int notaMax = 10;
        for(int i = 0; i < notas.length; i++){
            if(notas[i] == notaMax){
                System.out.println("La nota más alta es: " + notaMax);

            }
        }
    }*/
}

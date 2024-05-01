import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int añoDeLanzamiento = 1999;

        double mediaEvaluacionIngresada = 0;
        double evaluacion = 4;
        double mediaEvaluacion = (4.5 + 2.3 + 5) / 3;

        boolean incluidoEnElPlanBásico = true;

        String nombre = "Matrix";
        String descripcion = """
                BLALALASONBDFAOKLNBSFKJABSKJBFAJSBFJBAKJSBFKJABSKFJB
                ASDASFASFASFASFJKBNJABSKFJBAKJSBFA
                ASFJBNAKJSBFKJABSKJFBKAJSBDKFJBKDBFKJABDSKJABSF
                """;
        System.out.println("Nombre de la película: " + nombre);
        System.out.println("Descripción: " + descripcion);
        System.out.println("Año de lanzamiento: " + añoDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println(incluidoEnElPlanBásico);
        System.out.println("Media de la evaluación: " + mediaEvaluacion);

        if (añoDeLanzamiento >= 2023) {
            System.out.println("Película reciente");
        } else {
            System.out.println("Película retro");
        }
        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Evalue la pelicula: ");
            double notaPelicula = teclado.nextDouble();
            mediaEvaluacionIngresada += notaPelicula;
        }
        System.out.println("Evaluacion hecha por el usuario: " + mediaEvaluacionIngresada / 3);
    }
}
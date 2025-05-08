import java.util.Scanner;

public class GimnasioFitLife {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("GIMNASIO FITLIFE ");
        System.out.println("1. Inscripción mensual");
        System.out.println("2. Inscripción anual");
        System.out.println("3. Servicios adicionales");
        System.out.print("Elige una opción: ");
        int opcion = sc.nextInt();
        sc.nextLine();

        if (opcion == 1) {
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            sc.nextLine();
            System.out.print("¿Tiene discapacidad? (si/no): ");
            String discapacidad = sc.nextLine();

            double precio = 100000;
            if (edad < 25) precio *= 0.8;
            if (discapacidad.equalsIgnoreCase("si")) precio *= 0.7;
            
            System.out.println("Resultado: Inscripción mensual");
            System.out.println("Edad: " + edad);
            System.out.println("Discapacidad: " + discapacidad);
            System.out.println("Total a pagar: $" + precio);

        } else if (opcion == 2) {
            System.out.print("Edad: ");
            int edad = sc.nextInt();

            if (edad < 18) {
                System.out.println("No puede inscribirse (menor de edad).");
            } else {
                double precio = $100,00;
                if (edad > 60) precio *= 0.8;

                System.out.println("Resultado: Inscripción anual");
                System.out.println("Edad: " + edad);
                System.out.println("Total a pagar: $" + precio);
            }

            } else if (opcion == 3) {
            System.out.print("Tipo de servicio (piscina, sauna, entrenamiento): ");
            String servicio = sc.nextLine();

            if (servicio.equals("piscina") || servicio.equals("sauna")) {
                System.out.println("Servicio: " + servicio);
                System.out.println("Costo: $0");
            } else if (servicio.equals("entrenamiento")) {
                System.out.println("Servicio: Entrenamiento personalizado");
                System.out.println("Costo: $100.00");
            } else {
                System.out.println("Servicio no válido.");
            }

        } else {
            System.out.println("Opción no válida.");
        }



        }
    }

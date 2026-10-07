import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int opc;
        Scanner scan = new Scanner(System.in);
        Calendario calendario = new Calendario();
        calendario.llenarMeses();

        do {
            System.out.println("1. Crear evento");
            System.out.println("2. Ver eventos");
            System.out.println("3. Cancelar evento");
            System.out.println("4. Ver días con evento");
            System.out.println("0. Salir");
            opc = scan.nextInt();

            switch (opc) {
                case 1:
                    scan.nextLine(); 
                    Evento eventoTemp;
                    System.out.println("Dime el tipo de evento");
                    System.out.println("1. Examen 2. Reunión 3. Día festivo");
                    int tipo = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Dame el mes del evento:");
                    String mes = scan.nextLine();
                    System.out.println("Dame el día del evento:");
                    int dia = scan.nextInt();
                    scan.nextLine();

                    System.out.println("Dame la hora del evento (horas):");
                    int horas = scan.nextInt();
                    System.out.println("Dame los minutos del evento:");
                    int minutos = scan.nextInt();
                    scan.nextLine(); 

                    if (tipo == 1) {
                        System.out.println("Dame la materia del examen:");
                        String materia = scan.nextLine();
                        eventoTemp = new Examen(materia, horas, minutos);
                    } else if (tipo == 2) {
                        System.out.println("Dame los participantes de la reunión:");
                        String participantes = scan.nextLine();
                        eventoTemp = new Reunion(participantes, horas, minutos);
                    } else if (tipo == 3) {
                        System.out.println("Dame el motivo del día festivo:");
                        String motivo = scan.nextLine();
                        eventoTemp = new DiaFestivo(horas, minutos, motivo);
                    } else {
                        System.out.println("Tipo inválido");
                        break;
                    }

                    calendario.agregarEvento(eventoTemp, mes, dia);
                    System.out.println("Evento agregado exitosamente");
                    break;

                case 2:
                    scan.nextLine(); 
                    System.out.println("Tipo: 1. Examen 2. Reunión 3. Día festivo 4. Todos");
                    int optipo = scan.nextInt();
                    scan.nextLine(); 
                    String opTipoString = "todos";
                    if (optipo == 1)
                        opTipoString = "Examen";
                    else if (optipo == 2)
                        opTipoString = "Reunion";
                    else if (optipo == 3)
                        opTipoString = "DiaFestivo";

                    System.out.println("1. Todos los meses 2. Solo un mes");
                    int op = scan.nextInt();
                    scan.nextLine(); 

                    if (op == 1) {
                        calendario.verEventos(opTipoString, 1, "");
                    } else if (op == 2) {
                        System.out.println("Dime el mes que quieres ver:");
                        String mesConsulta = scan.nextLine();
                        calendario.verEventos(opTipoString, 2, mesConsulta);
                    }
                    break;

                case 3:
                    scan.nextLine(); 
                    System.out.println("Dame el mes del evento a cancelar:");
                    String mesCancelar = scan.nextLine();
                    System.out.println("Dame el día del evento a cancelar:");
                    int diaCancelar = scan.nextInt();
                    scan.nextLine();
                    calendario.cancelarEvento(mesCancelar, diaCancelar);
                    break;

                case 4:
                    calendario.verDiasConEventos();
                    break;

                case 0:
                    System.out.println("Adiós");
                    break;

                default:
                    System.out.println("Opción inválida");
                    break;
            }
        } while (opc != 0);

        scan.close();
    }
}

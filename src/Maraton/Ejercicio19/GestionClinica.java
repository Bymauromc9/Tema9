package Maraton.Ejercicio19;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class GestionClinica {
    private static Scanner entrada = new Scanner(System.in);
    private static ArrayList<Paciente> listaPacientes=new ArrayList<>();
    private static int totalFacturado=0;
        public static void main(String[] args) {
            int opcion=0;
            do {
                System.out.println("MENU");
                System.out.println("1. Registrar llegada paciente");
                System.out.println("2. Llamar a consulta");
                System.out.println("3. Consultar total facturado");
                System.out.println("4. Salir");
                opcion=entrada.nextInt();
                entrada.nextLine();
                switch (opcion) {
                    case 1:
                        registrarPaciente();
                        break;
                    case 2:
                        llamarConsulta();
                        break;
                    case 3:
                        consultarTotalFacturado();
                        break;
                    case 4:
                        System.out.println("Hasta pronto");
                        break;
                    default:
                        System.out.println("Opcion no existente, por favor vuelve a introducir la opcion");
                        break;
                }
            } while (opcion!=4);
        }
            
        public static void registrarPaciente(){
            int totalFacturado=0;
            System.out.println("DATOS");
            System.out.println("Introduce tu nombre: ");
            String nombre = entrada.nextLine();
    
            System.out.println("Introduce tu edad: ");
            int edad = entrada.nextInt();
    
            entrada.nextLine();
            System.out.println("Porque viene al medico (consulta/recetas/revision)");
            String motivo=entrada.nextLine();
    
            if(motivo.toLowerCase().equals("consulta")){
                Paciente paciente = new Consulta(nombre, edad, motivo);
                listaPacientes.add(paciente);
                System.out.println("Paciente añadido con exito");
            }else if(motivo.equalsIgnoreCase("recetas")){
                System.out.println("Introduce los medicamentos necesarios");
                String listaMeds = entrada.nextLine();
                Paciente paciente = new Recetas(nombre, edad, listaMeds);
                listaPacientes.add(paciente);
    
            }else if(motivo.equalsIgnoreCase("revision")){
                System.out.println("Introduce fecha de la cita anterior. (Formato dd/mm/aaaa)");
                String fecha = entrada.nextLine();
                Paciente paciente = new Revision(nombre, edad, fecha);
                listaPacientes.add(paciente);
    
            }else
                System.err.println("Debes introducir un motivo correcto");
            }
    
        public static void llamarConsulta(){
                if(listaPacientes.isEmpty()){
                    System.out.println("Lista vacia.");
                    return;
                }
                for (Paciente paciente : listaPacientes) {
                    System.out.println("Al paciente "+paciente.getNombre()+" se le ha cobrado una tarifa de: "+paciente.facturar());
                    totalFacturado+=paciente.facturar();
            }
        }
        public static void consultarTotalFacturado(){
            System.out.println("TOTAL FACTURADO: "+totalFacturado);
        }
    }


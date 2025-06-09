
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Por favor ingrese su nombre:");
        String nombre = sc.nextLine();
        int opcion = 0;
        int retroceder = 0;

        while (opcion != 6 && opcion != 5) {

            System.out.println("Estimado/a " + nombre
                    + ". Indique la opción que desea realizar:\n1 - Ver programas disponibles.\n2 - Ver malla curricular.\n3 - Costos.\n4 - Requisitos.\n5 - Inscribirse\n6 - Salir");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    while (opcion > 0) {
                        System.out.println(
                                "- Desarrollo de Software.\n- Arte Culinario\n- Comercio Internacional\n- Seguridad Laboral\n- Sistemas informáticos\n- Producción de Eventos\n\n- Presione 0 para retroceder. ");
                        retroceder = sc.nextInt();
                        if (retroceder == 0) {
                            break;
                        }
                        System.out.println("Ha escodigo una opción incorrecta, vuelva a intentarlo");
                    }
                    break;
                case 2:
                    int opcionPensum = 0;
                    while (opcionPensum != 6) {
                        System.out.println(
                                "Indique el programa que desea ver el pensum:\n1 - Desarollo de Software\n2 - Arte Culinario\n3 - Comercio Internacional\n4 - Seguridad Laboral\n5 - Sistemas informáticos\n6 - Producción de eventos\n\nPresione 0 para retroceder");
                        opcionPensum = sc.nextInt();

                        if (opcionPensum == 0) {
                            break;

                        } else {
                            switch (opcionPensum) {

                                case 1:
                                    while (opcionPensum > 0) {
                                        System.out.println(
                                                "Técnica en Desarrollo de Software:\n\nNivel 1:\n- Lógica de Programación.\n- Metodologías Ágiles de la programación.\n- Introducción a la programación.\n- Cátedra ser emprendedor.\n\nNivel 2:\n- Gestión de bases de datos.\n- Backend 1(Lenguaje).\n- Frontend 1(Lenguaje).\n\nNivel 3:\n\n- Nuevas tecnologías de programación.\n- Backend 2 (Framework).\n- Frontend 2 (Framework).\n\nPresione 0 para retroceder");
                                        retroceder = sc.nextInt();
                                        if (retroceder == 0) {
                                            break;
                                        }
                                        System.out.println("Ha escogido una opción incorrecta, vuelva a intentarlo");
                                    }
                                    break;
                                case 2:
                                    while (opcionPensum > 0) {
                                        System.out.println(
                                                "Técnica en arte culinario\n\nNivel 1:\n\n- Fundamentos Culinarios.\n- Técnicas de panificación.\n- Procesos de alimentos.\n- Gestión del servicio.\n- Cátedra Ser Emprendedor.\n\nNivel 2:\n\n- Cocina Fría.\n- Cocina Caliente.\n- Técnicas en pastelería.\n- Costos.\n- Seminario de Comportamiento Profesional.\n\nNivel 3:\n\n- Cocina Colombiana.\n- Tendencias en Cocina.\n- Cocina del mundo.\n- Organización y Planeación de Eventos Gastronómicos.\n- Seminario de Georreferenciación.\n\nPresione 0 para retroceder");
                                        retroceder = sc.nextInt();
                                        if (retroceder == 0) {
                                            break;
                                        }
                                        System.out.println("Ha escogido una opción incorrecta, vuelva a intentarlo.");
                                    }
                                    break;
                                case 3:
                                    while (opcionPensum > 0) {
                                        System.out.println(
                                                "Técnica en Comercio Internacional.\n\nNivel 1:\n\n- Fundamentos de Comercio Internacional.\n- Mercadeo Internacional.\n- Administración.\n- Inglés 1.\n- Cátedra Ser Emprendedor.\n\nNivel 2:\n\n- Régimen de Importaciones Y exportaciones.\n- Régimen Aduanero.\n- Régimen Arancelario.\n- Informática Básica.\n- Ingles 2.\n\nNivel 3:\n\n- Distribución Física Internacional\n- Régimen Cambiario.\n- Gestión de Procesos del Comercio Internacional.\n- Inglés 3.\n\n- Presione 0 para retroceder.");
                                        retroceder = sc.nextInt();
                                        if (retroceder == 0) {
                                            break;
                                        }
                                        System.out.println("Ha escogido una opción incorrecta, vuelva a intentarlo.");
                                    }
                                    break;
                                case 4:
                                    while (opcionPensum > 0) {
                                        System.out.println(
                                                "Técnica en Seguridad laboral\n\nNivel 1:\n\n- Introducción a los riesgos laborales.\n- Básico.\n- Gestión Organizacional y Riesgo Psicosocial.\n- Primer Respondiente.\n- Cátedra Ser Emprendedor.Nivel 2:\n\n- Técnicas de Seguridad.\n- Tareas de Alto Riesgo.\n- Gestión de Riesgos y Desastres.\n\nNivel 3:\n\nPráctica Formativa.");
                                        retroceder = sc.nextInt();
                                        if (retroceder == 0) {
                                            break;
                                        }
                                        System.out.println("Ha escogido una opción incorrecta, vuelva a intentarlo.");
                                    }
                                    break;
                                case 5:
                                    while (opcionPensum > 0) {
                                        System.out.println(
                                                "Técnica en Sistemas informáticos\n\nNivel 1:\n\n- Herramientas Ofimáticas.\n- Gestión de Base de Datos.\n- Aplicaciones Web.\n- Cátedra Ser Emprendedor.\n\nNivel 2:\n\n- Administración y Seguridad de Redes.\n- Soluciones para Redes Corporativas.\n\nNivel 3:\n\n- Mantenimiento a Portátiles y Móviles.\n- Periféricos y Accesorios.\n\n- Presione 0 para retroceder.");
                                        retroceder = sc.nextInt();
                                        if (retroceder == 0) {
                                            break;
                                        }
                                    }
                                    System.out.println("Ha escogido una opción incorrecta, vuelva a intentarlo.");
                                    break;
                                case 6:
                                    System.out.println(
                                            "Técnica en Producción de Eventos\n\nNivel 1:\n\n- Planeación de Eventos.\n- Gestión de Proveedores.\n- Herramientas Ofimáticas.\n- Lengua Extranjera I.\n- Cátedra Ser Emprendedor.\n\nNivel 2:\n\n- Ejecución de Eventos.\n- Gestión de Clientes y Artistas.\n- Costos y Presupuestos.\n- Lengua Extranjera II.\n\nNivel 3:\n\n- Pos Evento.\n- Legislación de Eventos.\n- Mercadeo y Comercialización de Eventos.\n- Lengua Extranjera III.\n\n- Presione 0 para retroceder. ");
                                    retroceder = sc.nextInt();
                                    if (retroceder == 0) {
                                        break;
                                    }
                                    break;

                                default:
                                    System.out.println("Ha escogido una opción incorrecta, vuelta a intentarlo.");
                                    break;
                            }
                        }
                    }
                    break;
                case 3:
                    while (opcion > 0) {
                        System.out.println(
                                "Costos\n\nEstrato 1: $711.800.\nEstrato 2: $1.423.500.\nEstrato 3 y 4: $2.135.300.\nEstrato 5 y 6: $2.847.000.\n\n- Presione 0 para retroceder.");
                        retroceder = sc.nextInt();
                        if (retroceder == 0) {
                            break;
                        }
                    }
                    System.out.println("Ha escogido una opción incorrecta, vuelta a intentarlo.");

                    break;
                case 4:

                    while (opcion > 0) {
                        System.out.println(
                                "Requisitos\n\n- Fotocopia del documento de identidad.\n- Fotocopia del título de bachiller o del acta de grado.\n- Estudiantes de 10° y 11°, presentar certificado de estudio.\n\nNota:Si usted estudió hasta grado noveno, para estudiar un programa técnico en Nexus, debe presentar el certificado de estudio del grado noveno aprobado.\n\nPresione 0 para retroceder.");
                        retroceder = sc.nextInt();
                        if (retroceder == 0) {
                            break;
                        }
                        System.out.println("Ha escogido una opción invalida, vuelva a intentarlo.");
                    }
                    break;
                case 5:
                    String[] nombreCarrera = { "Desarrollo de Software", "Arte Culinario", "Comercio Internacional",
                            "Seguridad Laboral", "Sistemas Informáticos", "Producción de Eventos" };

                    System.out.println("Estimado/a " + nombre
                            + " indique el programa al cual desea inscribirse:\n1 - Desarollo de Software.\n2 - Arte Culinario.\n3 - Comercio Internacional.\n4 - Seguridad Laboral.\5 - Sistemas informáticos.\n6 - Producción de Eventos. ");
                    int opcionCarrera = sc.nextInt();

                    System.out.print("Por favor, ingrese su nombre completo:");
                    String nombreCompleto = sc.next();

                    System.out.print("Ingrese su número de identificación:");
                    String numeroIdentificacion = sc.next();

                    System.out.print("Ingrese su número de teléfono:");
                    String numeroTelefono = sc.next();

                    System.out.print("Ingrese su correo electrónico:");
                    String correo = sc.next();

                    System.out.print("Ingrese su edad:");
                    String edad = sc.next();

                    System.out.println("\nEstimado/a " + nombre
                            + " le confirmamos la siguiente información:\nNombre del aspirante: " + nombreCompleto
                            + ".\nPrograma al que aspira: " + nombreCarrera[(opcionCarrera - 1)]
                            + ".\nNumero de identificación: " + numeroIdentificacion + ".\nTeléfono de contacto: "
                            + numeroTelefono + ".\nCorreo electrónico: " + correo + ".\nEdad:" + edad
                            + ".\n\nEstaremos validando la información y pronto nos contactaremos con usted.");

                    break;
                case 6:
                    System.out.println("Cerrando programa...");
                    break;
                default:
                    System.out.println("Ha escogido una opción incorrecta, por favor intentelo de nuevo");
                    break;
            }

        }
        System.out.println(" Gracias por haberse contactado con Nexus.");

    }
}

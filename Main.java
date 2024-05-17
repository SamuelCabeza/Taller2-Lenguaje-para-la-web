import java.util.ArrayList;
//Se saco en chatgpt como pedir datos de entrada en java
import java.util.Scanner;
//la biblioteca Iterator fue encontrada en chatgpt, con ella se mueve hacer uso de remove() para elminar elementos
//de un array
import java.util.Iterator;

//Preguntas a chatgpt fueron= como hacer un input en java, como funciona el atomic en java y como se hacen los if statement en java

public class Main {

    public static void main(String[] args) {

        //Atributos
        //Se importo la utilidad Scanner que es la que permite leer la entrada de los usuarios (info sacada de chatgpt).
        Scanner scanner = new Scanner(System.in);
        int opcion;
        int buscar;
        int confirmacion;
        int opcionEditar;
        int contador;

        //Creo un array para su uso posterior
        ArrayList <Jugador> jugadores= new ArrayList<Jugador>();


       
        //usamos un ciclo while para poder salir cuando el usuario asi lo quiera
        while (true) {

        //Creamos esto para saber cuantos elementos hay en la lista
        int cantidadElementos = jugadores.size();

        //Hacemos un sout para mostrar las opciones al usuario que en este caso son las del taller
        System.out.println("-----------------------------------------------------------------");
        System.out.println("-----1. Agregar un jugador.                                     -");
        System.out.println("-----2. Eliminar un jugador.                                    -");
        System.out.println("-----3. Buscar un jugador.                                      -");
        System.out.println("-----4. Editar o modificar los datos de un jugador.             -");
        System.out.println("-----5. Listar todos los jugadores que se tengan en existencia. -");
        System.out.println("-----6. Salir del programa.                                     -");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Por favor ingrese la opcion que desea ejecutrar: ");

        opcion = scanner.nextInt();
        
            
        //Hacemos unos condicionales para revisar que opcion eligio el usuario

        //Agregar jugadores
        if (opcion == 1) {

            //Pedimos el nombre del usuario
            System.out.println("Nombre: ");
            String name = scanner.next();

            System.out.println("Elo: ");
            String elo = scanner.next();

            System.out.println("Personaje favorito: ");
            String personajeFavorito = scanner.next();

            System.out.println("Nivel: ");
            int level = scanner.nextInt();

            Jugador jugador = new Jugador(name, elo, personajeFavorito, level);
            jugadores.add(jugador);

            //Se muestra el array cada vez que se agregue un jugador
            for (Jugador player:jugadores) {
                System.out.println(player);
            }

        //Eliminar jugadores
        } else if (opcion == 2) {
            System.out.println("Que jugador por su id desea eliminar?");
            buscar = scanner.nextInt();

            //Confirmacion de eliminar
            System.out.println("Seguro que quiere eliminar este jugador?");
            System.out.println("Escriba 1 para confirmar");
            confirmacion = scanner.nextInt();

            //Buscamos el jugador para borrarlo
            if (confirmacion == 1) {
                contador = 1;
                for (Jugador jugador:jugadores) {
                    contador ++;
                    if (jugador.getId() == buscar){
                        //la ayuda fue en la siguiente linea ya que no conocia el iterador remove()
                        jugadores.remove(jugador);
                        System.out.println("Jugador eliminado.");
                        break;

                    } else {

                        if (contador > cantidadElementos) {
                            System.out.println("El jugador no se ha encontrado");
                        }
                    }
                }

            } else {
                System.out.println("La eliminacion ha sido cancelada");
            } 


        //Buscar jugador
        } else if (opcion == 3) {

            System.out.println("Que jugador desea buscar? Escriba el id");
            buscar = scanner.nextInt();
            contador = 1;

            for (Jugador jugador:jugadores) {
                contador ++;
                if (jugador.getId() == buscar) {
                    System.out.println(jugador);
                } else {
                    if (contador > cantidadElementos) {
                        System.out.println("El jugador no se ha encontrado");
                    }
                }
            }


        //Editar jugador
        } else if (opcion == 4) {

            System.out.println("Que jugador desea editar? Escriba el id");
            buscar = scanner.nextInt();
            contador = 1;

            for (Jugador jugador:jugadores) {
                contador ++;
                if (jugador.getId() == buscar){


                    while(true) {
                        System.out.println("Por favor eliga que atributo desea editar.");
                        System.out.println("1. Para el nombre.");
                        System.out.println("2. Para el elo.");
                        System.out.println("3. Para el personaje favorito.");
                        System.out.println("4. Para el nivel.");
                        System.out.println("5. Si desea cambiar todos los atributos.");
                        System.out.println("6. Si ya no desea editar nada.");
                        opcionEditar = scanner.nextInt();

                        if (opcionEditar == 1){
                            System.out.println("Ingrese el nuevo nombre: ");
                            String newName = scanner.next();
                            jugador.setName(newName);
                            System.out.println("El nombre del jugador " + jugador.getId() + " se ha modificado");
                            System.out.println(jugador);

                        } else if (opcionEditar == 2) {
                            System.out.println("Ingrese el nuevo elo: ");
                            String newElo = scanner.next();
                            jugador.setElo(newElo);
                            System.out.println("El elo del jugador " + jugador.getId() + " se ha modificado");
                            System.out.println(jugador);

                        } else if (opcionEditar == 3) {
                            System.out.println("Ingrese el nuevo personaje favorito: ");
                            String newPersonajeFavorito = scanner.next();
                            jugador.setPersonajeFavorito(newPersonajeFavorito);
                            System.out.println("El personaje favorito del jugador " + jugador.getId() + " se ha modificado");
                            System.out.println(jugador);

                        } else if (opcionEditar == 4) {
                            System.out.println("Ingrese el nuevo nivel: ");
                            int newLevel = scanner.nextInt();
                            jugador.setLevel(newLevel);
                            System.out.println("El nivel del jugador " + jugador.getId() + " se ha modificado");
                            System.out.println(jugador);

                        } else if (opcionEditar == 5) {
                            System.out.println("Ingrese el nuevo nombre: ");
                            String newName = scanner.next();
                            jugador.setName(newName);
                            System.out.println("Ingrese el nuevo elo: ");
                            String newElo = scanner.next();
                            jugador.setElo(newElo);
                            System.out.println("Ingrese el nuevo personaje favorito: ");
                            String newPersonajeFavorito = scanner.next();
                            jugador.setPersonajeFavorito(newPersonajeFavorito);
                            System.out.println("Ingrese el nuevo nivel: ");
                            int newLevel = scanner.nextInt();
                            jugador.setLevel(newLevel);
                            System.out.println("Todos los datos del jugador " + jugador.getId() + " han sido modificados.");
                            System.out.println(jugador);
                            
                        } else if (opcionEditar == 6) {
                            break;

                        } else {
                            System.out.println("Esta opcion no existe, intentelo de nuevo.");
                        }
                        
                        
                    }
                    
                } else {
                    if (contador > cantidadElementos) {
                        System.out.println("El jugador no se ha encontrado");
                    }
                }

            }

            for (Jugador jugador:jugadores){
                System.out.println(jugador);
            }
        
        
        //Mostrar jugadores
        } else if (opcion == 5) {
        for (Jugador jugador:jugadores) {
            System.out.println(jugador);
        }


        //Se sale del ciclo while
        } else if (opcion == 6) {
            break;
            

        //Se hace para prevenir respuestas no disponibles
        } else {
            System.out.println("La opcion es incorrecta, por favor escribala de nuevo.");
        }
        
    
        }
        //Se cierra el import scanner
        scanner.close();
        }

    }


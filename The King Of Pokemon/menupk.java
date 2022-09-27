import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class menupk {
        public static void main(String[] args) {
                personaje jugador1=null;
                personaje jugador2=null;
                Scanner leer = new Scanner(System.in);
                int resp, opc;
                limpiarp();
                do {
                        System.out.println("Bienvenido a The King Of Pokemon");
                        System.out.println("Bienvenido Player 1");
                        System.out.println("1. Ver estadisticas de los pokemones");
                        System.out.println("2. Seleccionar Pokemon");
                        resp = leer.nextInt();
                        switch (resp) {
                                case 1:
                                        marowak.detalles();
                                        System.out.println();
                                        gengar.detalles();
                                        System.out.println();
                                        umbreon.detalles();
                                        System.out.println();
                                        totodile.detalles();
                                        System.out.println();
                                        zorua.detalles();
                                        System.out.println();
                                        break;
                                case 2:
                                        do {
                                                System.out.println("Escoja un pokemon");
                                                System.out.println("1. Marowak");
                                                System.out.println("2. Gengar");
                                                System.out.println("3. Umbreon");
                                                System.out.println("4. Totodile");
                                                System.out.println("5. Zorua");
                                                opc = leer.nextInt();
                                                if (opc == 1) {

                                                        System.out.println("Elegiste a Marowak");
                                                        jugador1 = new marowak();
                                                } else if (opc == 2) {

                                                        System.out.println("Elegiste a Gengar");
                                                        jugador1 = new gengar();
                                                } else if (opc == 3) {

                                                        System.out.println("Elegiste a Umbreon");
                                                        jugador1 = new umbreon();
                                                } else if (opc == 4) {

                                                        System.out.println("Elegiste a Totodile");
                                                        jugador1 = new totodile();
                                                } else if (opc == 5) {

                                                        System.out.println("Elegiste a Zorua");
                                                        jugador1 = new zorua();
                                                } else {
                                                        System.out.println("Elige tu pokemon del 1 al 5");

                                                }
                                        } while (opc < 1 || opc > 5);
                                       
                                        break;
                                default:
                                        System.out.println("opcion incorrecta");
                                        break;
                        }
                } while (resp != 2);
                limpiarp();
                do {
                        System.out.println("Bienvenido a The King Of Pokemon");
                        System.out.println("Bienvenido Player 2");
                        System.out.println("1. Ver estadisticas de los pokemones");
                        System.out.println("2. Seleccionar Pokemon");
                        resp = leer.nextInt();
                        switch (resp) {
                                case 1:
                                        marowak.detalles();
                                        System.out.println();
                                        gengar.detalles();
                                        System.out.println();
                                        umbreon.detalles();
                                        System.out.println();
                                        totodile.detalles();
                                        System.out.println();
                                        zorua.detalles();
                                        System.out.println();
                                        break;
                                case 2:
                                        do {
                                                System.out.println("Escoja un pokemon");
                                                System.out.println("1. Marowak");
                                                System.out.println("2. Gengar");
                                                System.out.println("3. Umbreon");
                                                System.out.println("4. Totodile");
                                                System.out.println("5. Zorua");
                                                opc = leer.nextInt();
                                                if (opc == 1) {

                                                        System.out.println("Elegiste a Marowak");
                                                        jugador2 = new marowak();
                                                } else if (opc == 2) {

                                                        System.out.println("Elegiste a Gengar");
                                                        jugador2 = new gengar();
                                                } else if (opc == 3) {

                                                        System.out.println("Elegiste a Umbreon");
                                                        jugador2 = new umbreon();
                                                } else if (opc == 4) {

                                                        System.out.println("Elegiste a Totodile");
                                                        jugador2 = new totodile();
                                                } else if (opc == 5) {

                                                        System.out.println("Elegiste a Zorua");
                                                        jugador2 = new zorua();
                                                } else {
                                                        System.out.println("Elige tu pokemon del 1 al 5");
                                                }
                                        } while (opc < 1 || opc > 5);

                                        break;
                                default:
                                        System.out.println("opcion incorrecta");
                                        break;
                        }
                } while (resp != 2);
                System.out.println("jugador 1 "+jugador1.salud);
                System.out.println("jugador 2 "+jugador2.salud);
                leer.next();
                limpiarp();
                do{
                
                        System.out.println("Que deseas hacer P1");
                        System.out.println("1: Atacar");
                        System.out.println("2: Curarse");
                        resp = leer.nextInt();
                        if (resp==1) {
                        atacar(jugador2, jugador1);
                        System.out.println("La vida del jugador uno es "+jugador1.salud);
                        System.out.println("La vida del jugador dos es "+jugador2.salud);
                            } else {
                        curar(jugador1);}
                        System.out.println("P1 La nueva vida de tu pokemon es de "+jugador1.salud);
                        System.out.println("P2 La nueva vida de tu pokemon es de "+jugador2.salud);
                        System.out.println("Que deseas hacer P2");
                        System.out.println("1: Atacar");
                        System.out.println("2: Curarse");
                        resp = leer.nextInt();
                        if (resp==1) {
                        atacar(jugador1, jugador2);
                        System.out.println("La vida del jugador uno es "+jugador1.salud);
                        System.out.println("La vida del jugador dos es "+jugador2.salud);
                            } else {
                        curar(jugador2);}
                        jugador1.estado();
                        jugador2.estado();
                        leer.next();
                        limpiarp();
                }while (jugador1.salud>0 && jugador2.salud>0);
                if(jugador2.salud<=0){
                        System.out.println("Gano el Player 1");
                    }else{
                        System.out.println("Gano el Player 2");
                    }
                }
                

        
        static void atacar(personaje uno, personaje dos){
                uno.salud=uno.salud-dos.fuerza;
        }

        
        static void curar(personaje uno){
                uno.salud=uno.salud+uno.regeneracion;
        }

        static void golpecritico(personaje uno, personaje dos){
                uno.fuerza=uno.fuerza*2;
        }
        static void defender(personaje uno, personaje dos){
                uno.salud=dos.fuerza*0;
        }

        static void limpiarp() {
                System.out.print("\033[H\033[2J");
                System.out.flush();
        }
}

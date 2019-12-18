package Chapter07.EX_7_19_PG_387;

//Aplikacja ma przypisywac miejsca na kazdy lot jedynego samolotu przewoznika (pojemnosc 10 miejsc)
//po wpisaniu powinno wyswtielic jakie miejsce zostalo przydzielone i w jakiej klasie
//jezeli wszytskie miejsca w klasie ekonomicznej sa zajete aplikacja powinna zaopytac czy pasazeer chce miejsc w klasie pierwszej iodwrotnie
//jesli nie chce lub nie ma juz wogole miejsc to wyswietlic komunikat ze nstepny lot bedzie za 3 godziny

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Airlines {


    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        boolean[] seats = new boolean[11];
        for (int i = 1; i < seats.length; i++) {
            seats[i] = false;

        }

        int keepGoing = 1;


        while (keepGoing == 1) {
            System.out.println("Please enter 1 for first and 2 for economic class: ");

            int enteredClass = Integer.parseInt(reader.readLine());


            if (enteredClass == 1) {

                for (int i = 1; i <= 5; i++) {
                    if (seats[i] == false) {
                        seats[i] = true;

                        System.out.println("Seat " + i + " in class " + enteredClass + " reserved");
                        break;
                    } else if (
                            seats[5] == true
                    ) {
                        System.out.println("There are no free seats left in first class");
                        System.out.println("Do you want to book seat in economic class? Press 0 for no and 1 for yes");
                        int firstToEco = Integer.parseInt(reader.readLine());


                        if (firstToEco == 1) {

                            for (i = 6; i <= 10; i++) {

                                if (seats[i] == false) {
                                    seats[i] = true;

                                    System.out.println("Seat " + i + " in class " + enteredClass + " reserved");
                                    break;
                                }

                            }
                        }
                    }
                    if (seats[10] == true) {
                        System.out.println("There are no space lest in whole plane - next will start in 3 hours");
                        break;
                    }
                }

            } else if (enteredClass == 2) {

                for (int j = 6; j <= 10; j++) {

                    if (seats[j] == false) {
                        seats[j] = true;

                        System.out.println("Seat " + j + " in class " + enteredClass + " reserved");
                        break;
                    } else if (seats[10] == true) {

                        System.out.println("There are no free seats left in economic  class");
                        System.out.println("Do you want to book seat in first class? Press 0 for no and 1 for yes");

                        int EcoToFirst = Integer.parseInt(reader.readLine());

                        if (EcoToFirst == 1) {
                            enteredClass = 1;

                            for ( j = 1; j <= 5; j++) {
                                if (seats[j] == false) {
                                    seats[j] = true;
                                    System.out.println("Seat " + j + " in class " + enteredClass + " reserved");
                                    break;

                                }
                            }
                            break;
                        }
                    }
                    if (seats[5] == true) {
                        System.out.println("There are no space left in whole plane - next will start in 3 hours");
                        break;
                    }

                }

            }
            System.out.println("Please enter 1 for next passenger");

            keepGoing = Integer.parseInt(reader.readLine());

        }

    }


}

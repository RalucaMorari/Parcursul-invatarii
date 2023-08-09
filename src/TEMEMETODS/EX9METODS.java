package TEMEMETODS;

public class EX9METODS {
    public static void main(String[] args) {
        //9. Creeaza o aplicatie pentru un smart home
        //Aplicatia va fi folosita pentru a controla remote difuzoarele wireless, luminile, securitatea casei, incuietorile usilor si diversi roboti care se afla in casa.
        //Pentru inceput, vrem sa putem face urmatoarele actiuni:
        //
        //pornim sau oprim muzica
        //pornim sau oprim lumina
        //incuiem sau descuiem usa
        //Algoritmul cu care am putea descrie un program pentru este urmatorul:
        //
        //1. cere parola utilizatorului
        //2. verifica daca este corecta
        //3. intreba utilizatorul ce actiune vrea sa faca
        //4. citeste actiunea si daca este suportata, execut-o
        //Sa zicem ca avem deja codul aplicatiei (scheletul), doar ca am folosit o singura metoda:
        //
        //        // ...
        //        int password = 76543210;
        //        String speakersState;
        //        String lampState;
        //        String doorState;
        //
        //        // reading the password
        //        System.out.println("Enter password: ");
        //        int passwordInput = scanner.nextInt();
        //
        //        // checking if the password is correct
        //        if (passwordInput != password) {
        //            System.out.println("Incorrect password!");
        //        } else {
        //            // asking the user what they want to do
        //            System.out.println("Choose the object: 1 – speakers, 2 – lamp, 3 – door");
        //            String action = scanner.next();
        //
        //            switch (action) {
        //                case "1":
        //                    // asking the user about speakers
        //                    switch (speakersState) {
        //                        case "on":
        //                            // ...
        //                        case "off":
        //                            // ...
        //                        default:
        //                            // ...
        //                    }
        //                    break;
        //                case "2":
        //                    // asking the user about lights...
        //                case "3":
        //                    // asking the user about the door...
        //                }
        //        }
        //Dar daca vrem sa adaugam mai multe actiuni? Codul ar deveni complex. Pentru a-l face flexibil, extrage in metode codul original.
        //Apoi adauga o functionalitate noua, acceea de a porni sau opri un aspirator robot.\
    }
}

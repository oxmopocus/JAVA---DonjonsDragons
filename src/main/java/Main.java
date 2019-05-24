import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Personnage[] personnages = new Personnage[20];
        Personnage[] newArray = null;
        ArrayList personnage = new ArrayList();
        int index = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("        ,     \\    /      ,        \n" +
                "       / \\    )\\__/(     / \\       \n" +
                "      /   \\  (_\\  /_)   /   \\      \n" +
                " ____/_____\\__\\@  @/___/_____\\____ \n" +
                "|             |\\../|              |\n" +
                "|              \\VV/               |\n" +
                "|       DONJONS & DRAGONS         |\n" +
                "|_________________________________|\n" +
                " |    /\\ /      \\\\       \\ /\\    | \n" +
                " |  /   V        ))       V   \\  | \n" +
                " |/     `       //        '     \\| \n" +
                " `              V                '\n");

        boolean PlayGame = true;
        while (PlayGame == true) {

            System.out.println("Que voulez-vous faire ?");
            System.out.println("1 . Créer un personnage");
            System.out.println("2 . Afficher tous les personnages");
            System.out.println("3 . Supprimer un personnage");
            System.out.println("4 . Modifier un personnage");
            System.out.println("5 . Quitter le jeu");
            int menu = 0;
            try {
                menu = scanner.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Saisissez un chiffre entre 1 et 5");
            }
            scanner.nextLine();

            // la méthode switch permet de créer mon menu.
            switch (menu) {
                case 1:
                    System.out.println("Veuillez choisir votre personnage : 1 . Guerrier ou 2 . Magicien:");
                    int type = 0;
                    try {
                        type = scanner.nextInt();
                    } catch (java.util.InputMismatchException e) {
                        System.out.println("Saisissez un chiffre correct");
                    }
                    scanner.nextLine();

                    if (type == 1) {
                        System.out.println("Vous avez choisi un guerrier");
                        Scanner stc = new Scanner(System.in);
                        System.out.println("Veuillez saisir le nom du guerrier : ");
                        String nom = stc.nextLine(); // saisie utilisateur
                        System.out.println("Vous avez choisi : " + nom);

                        int vie = (int) (Math.random() * (10 - 5)) + 5;
                        System.out.println("Votre guerrier à : " + vie + " HP");

                        int force = (int) (Math.random() * (10 - 5)) + 5;
                        System.out.println("La force du guerrier est de : " + force + " DMG");
                        Arme newArme = new Arme(Armes.random(), 6);
                        System.out.println("L'arme du guerrier : " + newArme.getNomArme() + " puissance : " + newArme.niveauAttaque);
                        System.out.println("Un guerrier " + nom + " à bien été créé");
                        personnages[index] = new Guerrier(nom, "image", vie, force, "bouclier");
                        System.out.println(personnages[index].toString());
                        index++;


                        System.out.println("------------------------------------------------------------------------------");
                    } else {
                        System.out.println("Vous avez choisi un magicien");
                        Scanner stc = new Scanner(System.in);
                        System.out.println("Veuillez saisir le nom du magicien : ");
                        String nom = stc.nextLine(); // saisie utilisateur
                        System.out.println("Vous avez choisi : " + nom);

                        int viemag = (int) (Math.random() * (6 - 3)) + 3;
                        System.out.println("Votre magicien à : " + viemag + " HP");

                        int forcemag = (int) (Math.random() * (15 - 8)) + 8;
                        System.out.println("La force du magicien est de : " + forcemag + " DMG");

                        Sort newSort = new Sort(Sorts.random(), 8);
                        System.out.println("Le sort du magicien : " + newSort.getNomSort() + " puissance : " + newSort.niveauAttaque);
                        System.out.println("Un magicien " + nom + " à bien été créé");
                        personnages[index] = new Magicien(nom, "image", viemag, forcemag, "philtre");
                        System.out.println(personnages[index].toString());
                        index++;
                        System.out.println("------------------------------------------------------------------------------");
                    }
                    break;
                case 2:
                    for (int i = 0; i < personnages.length; i++) {
                        // System.out.print("(id = " + i + ") ");
                        if (personnages[i] != null) {
                            System.out.println(personnages[i].toString());
                        }
                    }
                    break;
                case 3:
                    // suppression personnage
                    Scanner in = new Scanner(System.in);
                    System.out.print("Sélectionnez l'élément à supprimer (0/1/2/...) :  ");
                    int elem = in.nextInt();

                    for (int i = 0; i < personnages.length; i++) {
                        if (i == elem) {
                            newArray = new Personnage[personnages.length - 1];
                            for (int u = 0; u < i; u++) {
                                newArray[u] = personnages[u];
                            }
                            for (int j = i; j < personnages.length - 1; j++) {
                                newArray[j] = personnages[j + 1];
                            }
                            personnages = new Personnage[newArray.length];
                            for (int z = 0; z < newArray.length; z++) {
                                personnages[z] = newArray[z];
                            }
                        }
                    }
                    System.out.println("Le personnage " + personnages + " à bien été supprimer");
                    break;

                case 4:
                    System.out.println("Quel personnage souhaitez-vous modifier ?");
                    int choix = scanner.nextInt();

                    Personnage modif = personnages[choix];

                    System.out.println("Quel attribut voulez-vous modifier ?");
                    System.out.println("1 . Nom");
                    System.out.println("2 . Vie");
                    System.out.println("3 . Force");

                    int choixModifs = scanner.nextInt();
                    scanner.nextLine();
                    switch (choixModifs) {
                        case 1:
                            System.out.println("Entrez une nouvelle valeur");
                            String nom = scanner.nextLine();
                            modif.setNom(nom);
                            break;

                        case 2:
                            System.out.println("Entrez une nouvelle valeur");
                            int vie = scanner.nextInt();
                            modif.setVie(vie);
                            break;

                        case 3:
                            System.out.println("Entrez une nouvelle valeur");
                            int force = scanner.nextInt();
                            modif.setForce(force);
                            break;
                    }
                    break;
                case 5:
                    PlayGame = false;
                    System.out.println("À bientôt pour de nouvelles aventures !");
                    break;
            }
        }
    }
}

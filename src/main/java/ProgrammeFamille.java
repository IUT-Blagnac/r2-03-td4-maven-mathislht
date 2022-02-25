
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class ProgrammeFamille {
    public static void main(String[] args) {

        /*------------------------------------------------------*/
        /* Plan pour la fonction principale :                   */
        /*                                                      */
        /*  0.  Déclarations des tableaux de noms et prénoms    */
        /*  1.  Affichage des tableaux                          */
        /*  2.  Création de la famille SW                       */
        /*  3.  Création et ajouts des Personne dans la Famille */
        /*  4.  Affichage de la Famille                         */
        /*  5.  Tri de la Famille                               */
        /*  6.  Affichage de la Famille                         */
        /*  7.0 Ajustement des champs de luke, padme et anakin  */
        /*  7.1 Ajout des naissances et unions                  */
        /*  8.  Affichage des champs d'une personne             */
        /*  9.  Affichage du graphe au format texte             */
        /* 10.  Sauvegarde dans un fichier                      */
        /*                                                      */
        /*------------------------------------------------------*/

        String tabNom[] = {
                "AMIDALA",
                "SKYWALKER",
                "CORDE",
                "ORGANA",
                "SKYWALKER",
                "SKYWALKER",
                "SKYWALKER",
                "SKYWALKER",
                "SKYWALKER",
                "SOLO",
                "SOLO",
                "JADE",
                "SOLO",
                "SOLO",
                "SKYWALKER"
            };

        String tabPrenom[] = {
                "Padme",
                "Cade",
                "Morrigan",
                "Leia",
                "Anakin",
                "Ben",
                "Kol",
                "Luke",
                "Nat",
                "Anakin",
                "Han",
                "Mara",
                "Jacen",
                "Jaina",
                "Shmi"
            };

        Personne morrigan = new Personne("Morrigan","CORDE");
        Personne mara = new Personne("Mara","JADE");
        Personne leia = new Personne("Leia","ORGANA");      
        Personne ben = new Personne("Ben","SKYWALKER");
        Personne cade = new Personne("Cade","SKYWALKER");
        Personne kol = new Personne("Kol","SKYWALKER");
        Personne nat = new Personne("Nat","SKYWALKER");
        Personne shmi = new Personne("Shmi","SKYWALKER");
        Personne anakin = new Personne("Anakin","SKYWALKER",shmi,null,null);
        Personne padme = new Personne("Padmé","AMIDALA",null,null,anakin);
        Personne luke = new Personne("Luke","SKYWALKER",anakin,padme,leia);       
        Personne anakins = new Personne("Anakin","SOLO");
        Personne han = new Personne("Han","SOLO");
        Personne jacen = new Personne("Jacen","SOLO");
        Personne jaina = new Personne("Jaina","SOLO");

        Famille Skywalker = new Famille();

        try {
            ajoutPersonne(Skywalker,luke);
            ajoutPersonne(Skywalker,anakin);
            ajoutPersonne(Skywalker,ben);
            ajoutPersonne(Skywalker,cade);
            ajoutPersonne(Skywalker,kol);
            ajoutPersonne(Skywalker,nat);
            ajoutPersonne(Skywalker,shmi);
            ajoutPersonne(Skywalker,anakins);
            ajoutPersonne(Skywalker,han);
            ajoutPersonne(Skywalker,jacen);
            ajoutPersonne(Skywalker,jaina);
            ajoutPersonne(Skywalker,padme);
            ajoutPersonne(Skywalker,morrigan);
            ajoutPersonne(Skywalker,mara);
            ajoutPersonne(Skywalker,leia);
        } catch (Exception e) {
            System.out.print ("Plus de place dans la famille !");
        }
        trierFamille(Skywalker);
        System.out.println("Les 15 membres de la Famille sont :");
        afficherFamille(Skywalker);

        //   for (int i=0; i< tabPrenom.length; i++){   
        //      System.out.println (tabNom[i]);
        //      System.out.println (tabPrenom[i];
        //   }

    }

    public static void ajoutPersonne(Famille pfFamille, Personne pfPersonne) throws Exception {
        if(pfFamille.membres.length < pfFamille.nbMembres + 1) {
            throw new Exception("Plus de place dans la famille !") ;
        }
        pfFamille.membres[pfFamille.nbMembres] = pfPersonne ;
        pfFamille.nbMembres ++ ;
    }

    public static void afficherFamille (Famille pfFamille){
        for(int i=0; i < pfFamille.nbMembres; i++){
            System.out.println(pfFamille.membres[i].nom 
                + " " + pfFamille.membres[i].prenom);
        }
    }

    public static void trierFamille(Famille pfFamille){
        boolean permut = true;
        while (permut == true){
            permut = false;
            for (int i = 0; i < pfFamille.nbMembres - 1; i++){
                String chaine1 = pfFamille.membres[i].prenom;
                String chaine2 = pfFamille.membres[i+1].prenom;
                String chaine3 = pfFamille.membres[i].nom;
                String chaine4 = pfFamille.membres[i+1].nom;
                if ( chaine3.compareTo(chaine4) > 0 ) {
                    // chaine1 est dans l'ordre alphabétique après chaine2 }
                    Personne ech = pfFamille.membres[i];
                    pfFamille.membres[i] = pfFamille.membres[i+1];
                    pfFamille.membres[i+1] = ech;
                    permut = true;
                }

                else {
                    if ( chaine3.compareTo(chaine4) == 0 ) { // chaine1 et chaine2 sont identiques }
                        if ( chaine1.compareTo(chaine2) > 0 ) {
                            Personne ech = pfFamille.membres[i];
                            pfFamille.membres[i] = pfFamille.membres[i+1];
                            pfFamille.membres[i+1] = ech;
                            permut = true;
                        }
                    }
                }
            }
        }
    }
}
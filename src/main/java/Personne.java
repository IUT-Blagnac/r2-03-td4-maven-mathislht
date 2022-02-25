
/**
 * Indiquer le ou les numeros de TP et d'exercice.
 *
 * @author (votre nom)
 */
public class Personne
{
    String nom;
    String prenom;
    Personne pere;
    Personne mere;
    Personne conjoint;
    Personne (){
        this.nom = "inconnu";
        this.prenom = "inconnu";
    }

    Personne (String pfPrenom, String pfNom, Personne pfPere, Personne pfMere, Personne pfConjoint ){
        this.nom = pfNom;
        this.prenom = pfPrenom;
        this.pere = pfPere;
        this.mere = pfMere;
        this.conjoint = pfConjoint;
    }

    Personne (String pfPrenom, String pfNom){
        this.nom = pfNom;
        this.prenom = pfPrenom;
    }
}


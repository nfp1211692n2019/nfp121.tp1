package question3;
/**
 * NFP121 TpIntroduction, usage de BlueJ et du "Submitter".
 * 
 * @version septembre 2009
 * @author � compl�ter
 * @see java.lang.String, java.lang.Math
 */
public class AuditeurCNAM {
    
    /** l'attribut nom de chaque auditeur. */
    private String nom;
    /** l'attribut prenom de chaque auditeur. */
    private String prenom;
    /** l'attribut matricule de chaque auditeur. */
    private String matricule;

    /**
     * "Cr�ation", le constructeur d'un auditeur avec son nom, son pr�nom et son
     * matricule.
     * 
     * @param nom
     *            le nom de l'auditeur
     * @param prenom
     *            son pr�nom
     * @param matricule
     *            sur la carte d'inscription, pr�s de la photo
     */
    public AuditeurCNAM(String nom, String prenom, String matricule) {
        //on doit remplacer les characters speciaux mais la methode replace all n'est vraimant pas la mailleur car on peut utiliser une methode tel que StringUtils.stripAccents qui remplace tout charactere correspondant plus effectivement
        // if(nom.length() > 1 || prenom.length() > 1 || matricule.length() > 1){
            // System.out.println("invalid param");
        // }
        // else{
        // this.nom = nom.toLowerCase();
        // this.prenom = prenom.toLowerCase();
        // this.matricule = matricule.toLowerCase();
        //}
        this.nom = nom;
        this.prenom = prenom;
        this.matricule = matricule;
    }

    /**
     * le login au Cnam : 6 premi�res lettres du nom suivies de la premi�re
     * lettre du pr�nom s�par�es de '_' . le login retourn� est en minuscules,
     * le trait d'union, ou sp�ciaux <i>(pour unix)</i> sont remplac�s par des
     * '_' pas de caract�res accentu�s pour le login voir les classes
     * pr�d�fines, java.lang.String : les m�thodes replaceAll, toLowerCase et
     * substring java.lang.Math : la m�thode min<br>
     * <b>BlueJ : Menu Aide</b>
     * 
     * @return le login du Cnam simplifi�, sans les adaptations dues aux
     *         homonymes...
     */
    //il y a des autres methodes plus efficases en utilisant autre que replace all pour chaque charactere 
    //ceci consiste de normaliser le string en une array et separer les characteres speciaux
    public String login() {
        String login = "";
        if(nom.length() > 6)login += nom.substring(0, 6);
        else {
            login += nom;
        }
        login += "_";
        if(prenom.length() > 1)login += prenom.substring(0, 1);
        else login += prenom;
        login = login.toLowerCase();
        login = login.replaceAll("�", "e");
        login = login.replaceAll("�", "e");
        login = login.replaceAll("�", "a");
        login = login.replaceAll("[^a-z0-9]", "_");
        return login;
    }

    /**
     * Lecture du nom de l'auditeur.
     * 
     * @return son nom
     */
    public String nom() {
        return nom;// � compl�ter
    }

    /**
     * Lecture du pr�nom de l'auditeur.
     * 
     * @return son pr�nom
     */
    public String prenom() {
        return prenom;// � compl�ter
    }

    /**
     * Lecture du matricule de l'auditeur.
     * 
     * @return son matricule
     */
    public String matricule() {
        return matricule;// � compl�ter
    }

    /**
     * m�thode toString ( m�thode red�finie de la classe Object).
     * 
     * @return la concat�nation du nom, du pr�nom et du login, selon cette
     *         syntaxe
     *         <code>nom() + " " + prenom() +  " login : " + login()</code>
     */
    @Override
    public String toString() {
        return (nom() + " " + prenom() +  " login : " + login());
    }

}

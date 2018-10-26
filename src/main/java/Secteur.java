import java.util.List;

public class Secteur {
private String typeAnimauxDansSecteur;
public List<Animal> animauxDansSecteur;
public Secteur(String typeA,List<Animal> listAnimaux) {
	typeAnimauxDansSecteur=typeA;
	
	System.out.println("Un secteur a été créé... par défault il est de type"+typeAnimauxDansSecteur);
	
	
}
public String toString() {
	System.out.println("Ce secteur est de type"+typeAnimauxDansSecteur);
	if(animauxDansSecteur.size()==0){System.println("\nIl n'y a aucun animal dedans");
}

}

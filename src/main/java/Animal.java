
public class Animal
{
 private String nomAnimal;
  private String typeAnimal;
  private String message;
  public Animal()
  {
    nomAnimal="Not set";
    typeAnimal="Not set";
    
  }
  public String toString()
  {
    return ""+nomAnimal+"est un animal de type"+typeAnimal;
  }
  public void setTypeAnimal(String typeDeAnimal) {
	  typeAnimal=typeDeAnimal;
  }
  public void  setNomAnimal(String nomDeAnimal) {
	  nomAnimal=nomDeAnimal;
  }
  public String getTypeAnimal() {
	 return typeAnimal;
  }
  public String getNomAnimal() {
	  return nomAnimal;
  }
  
  
}
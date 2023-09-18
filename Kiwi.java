/**
 *
 * @author roudet
 */
public class Kiwi {
    private double prix;
    private String origine;
	
    public Kiwi() 
    {
        this.prix = 0.5;  //prix en euros
        this.origine="Espagne";
    }
    
    public Kiwi(double prix, String origine) 
    {
	if(prix < 0)
	    this.prix = -prix;  //une solution possible pour interdire les prix negatifs
	else
	    this.prix = prix;

	if(origine.equals(""))
            this.origine = "Espagne";  //Espagne par défaut
	else
            this.origine = origine;   
    }

    public double getPrix(){
	return prix;
    }

    public void setPrix(double prix){
	this.prix=prix;
    }

    public String getOrigine(){
	return origine;
    }
 
    public void setOrigine(String origine){
	this.origine=origine;
    }

    @Override
    public String toString(){
        return "Kiwi de " + origine + " a " + prix + " euros";
    }

    @Override
    public boolean equals(Object o){  //predicat pour tester si 2 Kiwis sont equivalentes
        if(o != null && getClass() == o.getClass()){
            Kiwi or = (Kiwi) o;
            return (prix == or.prix && origine.equals(or.origine));
        }
        return false;
    }

    public boolean isSeedless() {  //predicat indiquant qu'une Kiwi a des pepins
        return false;
    }


    public static void main (String[] args){
        //Ecrire ici vos tests
        Kiwi o1 = new Kiwi();
        Kiwi o2 = new Kiwi(224,"Guinee");
        Kiwi o3 = new Kiwi();
        o3.setOrigine("usa");
        o3.setPrix(-224.0);
	     System.out.println("cet"+" "+o1.toString());
         System.out.println("cet"+" "+ o2.toString() );
         o1.setOrigine("Guinee");
         if(o1.equals(o2))
        {System.out.println(" les deux Kiwis sont de même origine..");}else{
            System.out.println("Elle sont d'orgine differents");
        }

        if(o3.getPrix()<=0.0){
            o1.isSeedless();
            System.out.println("cet"+o3.toString()+" "+ "n'as pas de pépins");
        }else{System.out.println("cet"+o3.toString()+" "+"a du pépins");}
   }
}

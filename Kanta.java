package valjak;

public class Kanta extends Valjak {

/*deklarisanje kolicine tecnosti*/
	double kolicina;
	
/*konstruktor kante*/
	public Kanta(double pocetnor, double pocetnoh, double pocpk)
		{super(pocetnor, pocetnoh);
		kolicina = pocpk;}
	
/*metod za dopunjavanje kante*/
	public void dopuniKantu(double dopuni)
		{kolicina += dopuni;}
	
/*metod za proveru kolicine u kanti*/
	public String ispitajKolicinu(){
		if (kolicina > 0) {return "U kanti ima tecnosti.";}
		else {return "Kanta je prazna.";}}
	
/*metod za ispitivanje karakteristika kante*/
	public String ispitajKantu(){
		return "Ova kanta je zapremine " + zapremina() + " mernih jedinica." + 
		"U njoj se nalazi " + kolicina + " mernih jedinica tecnosti.";
	}
	}
/*Valjak se zadaje poluprecnikom r i visinom h
klasa valjak treba da stvara valjak zadatog poluprecnika r i h,
omogucava unos r i h, izracunava zapreminu valjka
i generise textualni opis valjka

kanta je valjak u koju moze da se sipa tecnost
napisati klasu iznedrenu iz klase valjak koja pored osobina
valjka ima: pocetnu popunjenost kante(ppk), mogucnost
unosenja kolicine tecnosti u kantu ispitivanje da li je
kanta puna ili prazna, tekstualni opis kante i kreirati test
klasu koja ispituje kantu*/

package valjak;

public class Valjak {
/*deklarisanje promenljivih*/
	double r,h;
	
/*zapremina valjka*/
	public double zapremina() {double zapremina = r * r * Math.PI * h;
	return zapremina;}
	
/*konstruktor*/
	public Valjak(double pocetnor, double pocetnoh){
		r = pocetnor; h = pocetnoh;}
	
/*metod za promenu dimenzija*/
	public void promeniDim(double promr, double promh){
		r = promr; h = promh;}
	
/*tekstualni opis valjka*/
	public String ispitajValjak(){
	return "Karakteristike valjka: r=" + r + "; h=" + h + "; V=" + zapremina();}
	
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
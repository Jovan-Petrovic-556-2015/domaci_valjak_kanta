package valjak;

public class Driver {

	public static void main(String[] args) {
		
		Kanta kanta1 = new Kanta(3,4,0);
		Valjak valjak1 = new Valjak(3,4);
		
		
		System.out.println(kanta1.ispitajKantu());
		System.out.println(valjak1.ispitajValjak());
		System.out.println(kanta1.ispitajKolicinu());
		kanta1.dopuniKantu(1);
		System.out.println(kanta1.ispitajKolicinu());
		System.out.println(valjak1.zapremina());
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

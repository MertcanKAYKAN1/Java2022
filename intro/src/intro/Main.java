package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	System.out.println("Hello World!");
		
		
		String ortaMetin = "İlginizi çekebilir";
		String altMetin = "Vade süresi";
		
		System.out.println(ortaMetin);
	
		
		int vade = 12;
		
		double dolarDun = 18.25;
		double dolarBugun = 18.14;
		
		boolean dolarDustuMu = false;
		
		String okYonu ="down.svg";
		
		if (dolarBugun < dolarDun) {//true		//iki türlü de yazdım birisi tanımlayıp içerde kullanmak diğeri ise if veya else içinde tanımlayıp println yapma 31 ve 25. satır
			System.out.println(okYonu);
		} else if(dolarBugun > dolarDun) {
			okYonu = "up.svg";
			System.out.println(okYonu);
		}
		else {							
			okYonu = "equal.svg";
			System.out.println(okYonu);
		} */
		
		//array
		String[] krediler = {"Hızlı Kredi", "Maaşın Halkbanktan", "Mutlu Kredi"};    //bütün bir diziyi yazdırmak için tek tek yazmak değilde for döngüsü ile dizinin 0. elemanından ne kadar eleman varsa yazdırabiliriz.
		

		
		for(int i=0 ; i < krediler.length ; i++) {
			System.out.println(krediler[i]);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

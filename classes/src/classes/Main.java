package classes;

public class Main {

	public static void main(String[] args) {
		CustomerManager customermanager = new CustomerManager();
		CustomerManager customermanager2 = new CustomerManager();
		customermanager=customermanager2;
		customermanager.add();
		customermanager.Remove();
		customermanager.Update();
		
		
		
		//value
		int sayi1 =10;
		int sayi2 =20;
		sayi2=sayi1;
		sayi1=30;
		System.out.println(sayi2);
		
		
		int[] sayilar1 =new int[] {1,2,3,4};
		int[] sayilar2 =new int[] {5,6,7,8};
		sayilar2=sayilar1;
		sayilar1[0] = 10;
		System.out.println(sayilar2[0]);
		
		
	}
	/*customermanager2 oluşturulduğunda 1.customer manager garbage collector tarafından bellekten siliniyor
	customermanager'i tutan referans artık customermanager2'yi tutuyor....*/

	
	
	
	
}
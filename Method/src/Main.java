
public class Main {

	public static void main(String[] args) {
		sayiBulmaca();

	}
	
	public static void sayiBulmaca() {
		int[] sayilar=new int[] {1,2,8,9,7,5};
		int aranacak=2;
		boolean varMi=false;
		
		for(int sayi : sayilar) {
			if(sayi==aranacak) {
				varMi=true;
				break;
			}
		}
		if(varMi) {
			mesajVer(aranacak);
		}else {
			mesajVer(aranacak);
		}
	}
	
	public static void mesajVer(int aranacak){
		System.out.println("Sayı Mevcuttur: " +aranacak);
		
	}

}

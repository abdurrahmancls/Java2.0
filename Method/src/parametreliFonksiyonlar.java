
public class parametreliFonksiyonlar {

	public static void main(String[] args) {
		String mesaj="Bugün hava çok güzel";
		String yeniMesaj= sehirVer();
		int sayi= topla(2,9);
		System.out.println(yeniMesaj);
		System.out.println(sayi);
		int topla= topla2(2,3,4,5,6,7,22);
		System.out.println(topla);
		
	}
	public static void ekle() {
		System.out.println("Eklendi");
	}
	public static void sil() {
		System.out.println("Silindi");

	}
	public static void güncelle() {
		System.out.println("Güncellendi");
		return;
	}
	public static int topla(int sayi1, int sayi2) {
		return sayi1+sayi2;
	}
	public static int topla2(int... sayilar) {
		int toplam = 0;
		for(int sayi:sayilar) {
			toplam+=sayi;
		}
		return toplam;
	}
	
	
	public static String sehirVer() {
		return "Ankara";
		
	}

}

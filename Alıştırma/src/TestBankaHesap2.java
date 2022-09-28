
public class TestBankaHesap2 {
	public static void main(String []args){
		BankaHesap2 b1=new BankaHesap2();
		b1.print();
		
		BankaHesap2 b2;   //sadece deklere edelim
		b2=new BankaHesap2(153, "Ayse Gun",3000);
		b2.print();
		
		BankaHesap2 b3=new BankaHesap2(177,3500);
		b3.print();
		
		b3.paraCek(1500);
		b3.print();
		
		b3.paraYatir(13000);
		b3.print();
	}

}
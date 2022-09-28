public class BankaHesap2 {
	private int id;
	private String isim;
	private double bakiye;
	//ilk yapıcı fonksiyonu yazalım
	public BankaHesap2(){
		id=99999;  isim="xxxxxxx"; bakiye=0;  //fabrika ayarları olan constructor
	}
    public BankaHesap2(int i, String n, double b){
    	id=i; isim=n; bakiye=b;
    }
    public BankaHesap2(int id1, double b1){
    	id=id1;  bakiye=b1;
    	isim="zzzzzzz";
    }
    public void setHesap(int i, String n, double b){
    	id=i; isim=n; bakiye=b;
    }
    public void print(){
    	System.out.println("Id:"+id+" isim:"+isim+" Bakiye:"+bakiye);
    }
    public void paraYatir(double miktar){
    	bakiye=bakiye+miktar;
    }
    public void paraCek(double miktar){
    	if(bakiye>=miktar)
    		bakiye=bakiye-miktar;
    	else
    		System.out.println("Maalesef Bakiyeniz Yetersiz!");
    }
}
public class TestAccount2 {
	public static void main(String []args){
		Account2 a1=new Account2();
		a1.print();
		Account2 a2=new Account2(121,"Mehmet Ay",15000);
		a2.print();
		
		Account2 a3= new Account2(155,3000);  //This initially gives an error as no such constructor
		a3.print();
	}
}
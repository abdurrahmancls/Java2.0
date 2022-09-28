public class Account2 {
	private int id;
	private String name;
	private double balance;
	
	//let us define our constructors
	public Account2(){
		id=99999; name="xxxxxx"; balance=0;   //They are factory setting
	}
	public Account2(int i, String n, double b){
		id=i;  name=n; balance=b;
	}
	public Account2(int id1, double balance1){
		name="zzzz";
		id=id1;
		balance=balance1;
	}
	public void print(){
		System.out.println("ID:"+id+" Name:"+name+" Balance:"+balance);
	}

}
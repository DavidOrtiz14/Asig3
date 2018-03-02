import java.util.ArrayList;

public class Main {


		public static void main(String[] args) {

			
		ArrayList <Integer> progrsOther= new ArrayList<> ();
		progrsOther.add(2);
		progrsOther.add(4);
		progrsOther.add(6);
		progrsOther.add(8);
		progrsOther.add(10);

	 System.out.println("Son iguales?:"	+Progressive.equals(progrsOther) + Progressive.subProg(progrsOther)+Progressive.addProg(progrsOther));
		}
	

}

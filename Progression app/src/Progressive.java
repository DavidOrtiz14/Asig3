import java.util.ArrayList;

public class Progressive implements Combinable{
	ArrayList <Integer> progrs= new ArrayList<> ();


	public Progressive(){
		
		progrs.add(2);
		progrs.add(4);
		progrs.add(6);
		progrs.add(8);
		progrs.add(10);
		
	}
	
	
public static boolean valid(ArrayList <Integer> a) {
		 final Progressive p =new  Progressive();
			return p.progrs.size()==a.size();
			
		}
public static boolean equals(ArrayList <Integer> a) {
	 final Progressive p =new  Progressive();
		return p.progrs.get(0)==a.get(0) && p.progrs.get(0)- p.progrs.get(1)==a.get(0)-a.get(1);
		
	}
public static ArrayList<Integer> subProg(ArrayList<Integer> a) {
	 final Progressive f =new  Progressive();
	ArrayList <Integer> progrsOther1= new ArrayList<> ();
	if(valid(a)) {
		for(int n=0;n<a.size();n++) {
			progrsOther1.add(a.get(n)+f.progrs.get(n));
		}
	}
	return progrsOther1;
	
}
public static ArrayList<Integer> addProg(ArrayList<Integer> a) {
	 final Progressive L =new  Progressive();
	ArrayList <Integer> progrsOther1= new ArrayList<> ();
	if(valid(a)) {
		for(int n=0;n<a.size();n++) {
			progrsOther1.add(a.get(n)-L.progrs.get(n));
		}
	}
	return progrsOther1;
	
}
}

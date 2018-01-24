import java.util.HashSet;
import java.util.Set;

public class duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[] = {"abc", "def", "mno", "xyz", "pqr", "xyz", "def","def"};
		Set<Integer> duplicates = new HashSet<Integer>();

		for(int i=0; i<a.length-1;i++) {
			int c = 1;
			for(int j=i+1;j<a.length;j++) {
				if(a[i].equals(a[j]) && (i!=j)) {
					System.out.println("Duplicate "+ a[j]);
					c++;
					//System.out.println("count " + c); 
				}
				System.out.println("count " + c); 
				
			}
			
		}
		
	}

}

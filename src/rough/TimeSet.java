package rough;

public class TimeSet {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		String str = "Bahaso Minangkabau";
		int iStr = str.indexOf(" ");
		String nStr = str.substring(iStr+1,str.length());
		System.out.println(nStr);
	}

}

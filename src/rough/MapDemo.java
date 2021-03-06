package rough;

import java.util.*;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap map = new HashMap();
		map.put("01","Jan");
		map.put("02","Feb");
		map.put("03","March");
		map.put("04","April");
		map.put("05","May");
		
		System.out.println(map);
		
		System.out.println(map.get("02"));
	}

}

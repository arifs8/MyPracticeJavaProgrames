package Collections;

import java.security.KeyStore.Entry;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.*;

public class mapPractice {

	public static void main(String[] args) {


		Map<Integer, String> ms = new HashMap<Integer, String>();
		ms.put(500, null);
		ms.put(501, "Syed");
		ms.put(502, "Aaru");
		ms.put(503, "Aaki");
		
		
		/*
		 * Set<Integer> st = ms.keySet(); for(Integer key : st) {
		 * System.out.print(key+" "); }
		 * 
		 * System.out.println();
		 * 
		 * Collection<String> col =ms.values(); for(String sty : col) {
		 * System.out.print(sty+" "); }
		 */
		/*
		 * Set<Integer> kets = ms.keySet(); for(Integer key : kets ) {
		 * System.out.println(key + ">>>>>>>>>>>" + ms.get(key)); }
		 */
		
		
		Set<java.util.Map.Entry<Integer, String>> entries = ms.entrySet();
		for(java.util.Map.Entry<Integer, String> ent : entries) {
			Integer key = ent.getKey();
			String valu = ent.getValue();
			
			System.out.println(key+">>>>>>>"+valu);
		}
		

	}

}

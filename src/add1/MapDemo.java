package add1;

import java.util.HashMap;
import java.util.concurrent.SynchronousQueue;

class MapDemo
{
	public static void main(String []args)
	{
		HashMap<String,String>map=new HashMap<String,String>();
		map.put("101", "Bikash");
		map.put("102", "Manash");
		map.put("102", "Manas");
		map.put("103", "priyanka");
		map.put("106", "Manash");
		map.put("104", "Raghu");
		map.put("105", "Sandip");
		map.put("","chitta");
		map.put( "","Bape");
		System.out.println(map);
		System.out.println(map.get("102"));
		System.out.println(map.get(""));
	}
	}
package StreamApi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamApi0cp19 {
	
	public static void main(String a[])
	{
		/*
		 * List<Integer> myNums= new ArrayList<Integer>(); myNums.add(1); myNums.add(2);
		 * myNums.add(3); myNums.add(4); myNums.add(5);
		 * 
		 * OptionalInt num=myNums.parallelStream().mapToInt(i->i*2).findAny();
		 * num.ifPresent(System.out::println);
		 */
		
	HashMap<String,Integer> myNums =new  HashMap<>();
	myNums.put("bangalore",50);
	
	myNums.put("mangalore",10);
	
		
		List<Integer> num= myNums.values().stream().filter(temp->temp>30).collect(Collectors.toList());
		System.out.print(num);
	//	num.ifPresent(System.out::println);
	}

}

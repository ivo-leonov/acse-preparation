import java.util.LinkedList

public class HigherOrderFunctions {
	
	def static void main(String[] args) {
		println("map:\n" + 
			(1..3).map[x | x*x]
		)

		println("\n"+"\nreduce:\n" + 
			(1..3).reduce[x,y | x + y]
		)
		
		println("\n"+"filter:\n" +
			(1..3).filter[x | x%2 == 0]
		)
		
//		println("\n"+"flatten:\n" + 
//			(1..1).flatten
//		)
		
		var int tmp = 1 + (1..3).reduce[x,y | x+y]
		println("\n"+"tmp:\n" +
			tmp
		)
		
		var LinkedList<String> values = new LinkedList<String>();
		values.add("one")
		values.add("two")
		println("\n"+"map strings:\n" + 
			values.map[text | text.replace("o", "O").replace("t", "T")]
		)
		
		println("\n"+"exists:\n" + 
			(1..3).exists[it%2==0]
		)
		
		println("\n"+"forall:\n" + 
			(1..3).forall[it%2==0]
		)
		
		println("\n"+"mixture:\n" + 
			(1..10).map[it+1].filter[it != 11 && it != 5]//.head.toString
		)
		
		println("\nforEach:")
		(1..3).forEach[println(it+"*2 = "+(it*2))]
	}
	
}
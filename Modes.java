	import java.util.ArrayList;
	
	//Name:Yasmin Torres
	//Date: 2018.8.29
    public class Modes
   {
      //complete the functions below main so that the calls will (1) print the array,
      //(2) return the mode or modes of the array (the numbers not counts) 
      //(3) average the number of times numbers appear (that do appear)
      //(4) return what number is at a certain position in the array
       public static void main(String[] args)
      {
         //the array holds how many times the number at that INDEX appears in the array
         int[] tally = {0,0,10,5,10,0,7,1,0,6,0,10,3,0,0,1};
         display(tally);
         int[] modes = calculateModes(tally);
         display(modes);
         System.out.println("The average number of times a number shows up is " + average(tally));
         int s = sum(tally);
         System.out.println("kth \tindex");
         for(int k = 1; k <= s; k++)
            System.out.println(k + "\t\t" + kthDataValue(tally, k));
      }
       // method to calculate sum
       public static int sum(int[] args)
      {
		int sum = 0;
		for(int x: args)
		sum += x; 
		return sum;
      }

       // method to calculate average
       public static double average(int[] args)
      {
		ArrayList <int> list = new ArrayList <int>();
		for(int i = 0; i < args.length; i++)
		if(args[i] != 0)
		list.add(args[i]);
		
		int sum2 = 0;
		for(int x: args)
		sum2 += x;
		return sum2/list.size();	
      }

      /**
      * precondition:  nums.length > 0
      * postcondition: returns the maximal value in nums
      */
       public static int findMax(int[] nums)
      {
       int max = 0;
		 for(int i = 1; i < nums.length; i++)
		 {
		 	if(i < i-1)
			max = i;
		 }
		 return max;
		 
      }

      // method to print array on one line with 1 space between each number
      // remember to add 1 println at end
       public static void display(int[] args)
      {
		for(int i = 0; i < args.length; i++);
		System.out.println(args[i] + " ");
		
      }
            
      /**
      * precondition: tally.length > 0
      * postcondition: returns an int array that contains the modes(s);
      *                the array's length equals the number of modes.
      */
       public static int[] calculateModes(int[] tally)
      {	int c = 0;
      	for(int i = 0; i < tally.length; i++)
			{
			  if(findMax(tally) == tally[i])
			  c++;
			 } 
			  int weewoo[] = new int[c];
			  weewoo[i] = 
			  
			  
	
      }
      
      /**  
      * precondition:  tally.length > 0
      * 	             0 < k <= total number of values in data collection
      * postcondition: returns the kth value in the data collection
      *                represented by tally
      */
       public static int kthDataValue(int[] tally, int k)
      {
      	tally.indexOf(k)
         return -1;
      }
      
   }
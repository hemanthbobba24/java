import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int nums[]= {3,4,1,6,2};
      for(int i=0;i<nums.length;i++) {
    	  for(int j=1;j<nums.length-i;j++) {
    		  if(nums[j]<nums[j-1]) {
    			  int temp=nums[j];
    			  nums[j]=nums[j-1];
    			  nums[j-1]=temp;
    		  }
    	  }
      }
      System.out.println(Arrays.toString(nums));
	}
  
}

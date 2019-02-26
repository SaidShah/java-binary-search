class Demo{

  public static void main(String[] args) {
    int[] intArr = {1,2,3,4,5,6,7,8,11,13,15,24,34,35,45,65,76,78,89,234,545,656,767,898,986};

    		System.out.println("element is at index "+binarySearch(intArr,2));
        	System.out.println("element is at index "+binarySearch(intArr,24));
          	System.out.println("element is at index "+binarySearch(intArr,656));
  }

  public static int binarySearch(int givenArr[], int value) {

  		int left = 0;
  		int right = givenArr.length -1;
  		while(left <= right) {
  			int middle = (left+right)/2;

  			if(givenArr[middle]<value) {
  				left = middle+1;
  			}else if(givenArr[middle] > value){
  				right = middle-1;
  			}else if(givenArr[middle] == value){
          return middle;
        }

  		}
  		return -1;
  	}
}

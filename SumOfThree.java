class SumOfThree{
    public static void main(String[] args){
        int arr[] = {12,1,6,4,8,2};
        int target = 17;

        for(int i = 0; i < arr.length - 2; i++){
            for(int j = i + 1; j < arr.length - 1; j++){
                for(int k = j + 1; k < arr.length; k++){
                    if(arr[i] + arr[j] + arr[k] == target){
                        System.out.println("The Values are : " +arr[i]+ ", " +arr[j]+ ", " + arr[k]+ ".");
                    }
                }
            }
        }
    }
}
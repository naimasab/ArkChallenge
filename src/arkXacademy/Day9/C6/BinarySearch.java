package arkXacademy.Day9.C6;


public class BinarySearch {
    public static void main(String[] args) {
        int[]ints={1,2,4,5,7,9,10};
        System.out.println(binarySearch(ints,10));


    }
    private static int binarySearch (int numbers[],int numberToFind) {
        int small = 0;
        int high =  numbers.length-1;
        while (small<=high){
            int middlePosition=(small+high)/2; //middle position
            int middleNumber=numbers[middlePosition]; //array value in middle position
            if(numberToFind==middleNumber){
                return middlePosition;
            }
            if(numberToFind<middleNumber){
                high=middlePosition-1;
            }else{
                small=middlePosition+ 1;
            }
        }

        return  -1; //fail


    }
}

    // return the index of the value

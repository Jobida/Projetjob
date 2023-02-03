import java.util.ArrayList;

public class MaxSumSubArray {
    public static void main(String[] args){
       // create an arrayList
        ArrayList<Integer> array = new ArrayList<>();
        array.add(-14);     array.add(-15);          array.add(-21);
        array.add(-22);     array.add(-15);          array.add(-23);
        array.add(16);     array.add(-7);          array.add(2);
        array.add(9);     array.add(-1);          array.add(0);
        array.add(-9);     array.add(-8);          array.add(-17);
        array.add(-14);     array.add(2);          array.add(13);
        //print the ArrayList
        System.out.println("Input Given = [");
        for (int i=0;i<array.size();i++){
            System.out.println(array.get(i) +",");
        }
        System.out.print(array.get(array.size()-1));
        System.out.print("]");
        System.out.println("");
              // call method

    }
    // declare a method that print elements of Subarray with maximum sum
    static  void maxSumSubarray(ArrayList<Integer>numbers){
        //initialisation of presentMax and finalMax
        int presentMax = numbers.get(0);
        int finalMax = numbers.get(0);
        //initialisation of endIndex ; startIndex ; finalStartIndex
        int startIndex=0 , endIndex=0,finalStartIndex=0;
        for(int i=1;i<numbers.size();i++){
            if(numbers.get(i)>presentMax + numbers.get(i)){
                presentMax = numbers.get(i);
                startIndex = i;
                //update presentMax only
            } else  if(finalMax < presentMax){
                finalMax = presentMax;
                endIndex = i ;
                finalStartIndex = startIndex;
            }
        }
        // printing the elments of subarray with max sum
        System.out.print("solution = [");
        for(int i= finalStartIndex;i< endIndex ; i++){
            System.out.print(numbers.get(i) + ",");
        }
        System.out.print(numbers.get(endIndex));
        System.out.print("]");
    }
}

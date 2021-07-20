package level1;

public class KeyPresntinSengmentOfArray {
    public static void main(String[] args) {
        int [] arr = {1,2,3,9,3,6,8,3,5,3,4,1};
        int window = 3;

        for(int i = 0; i < arr.length ; i+=3){
            for(int j = i ; j < i+3 ; i++){
                if(arr[j] == 3){
                    return true;

                }
            }
        }
    }
}

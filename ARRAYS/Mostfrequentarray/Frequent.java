//nested for loop
//count the first element and see how many times it appears in the array
// and so on

public class Frequent{
    public static void mostFrequent(int arr[]){
        int mf = 1; //most frequent ocurrence in the array
        int m = 0; // current occurance counter

        int var = 0; // which number is the most counted

        for(int i = 0; i < arr.length; i++){
            for(int j = i; j < arr.length; j++){
                if (arr[i] == arr[j])
                {
                    m++;
                }
                if(mf < m)
                {
                    mf = m;
                    var = arr[i];
                }
            }
            m = 0;  //counter is now set back to 0
        }
        System.out.printf(var + " print out times: " + mf);
    }

    public static void main(String[] args){
        int arr[] = {23, 1, 23, 'b' , 23};
        mostFrequent(arr);
    }
}
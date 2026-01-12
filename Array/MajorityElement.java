package Array;
public class MajorityElement {
    public static void main(String[] args){
        int arr[] = {2,3,2,1,1,21,3,4,3,4,3};
        System.out.println(majorityElement(arr));

    }

    static int majorityElement(int[] arr){
            int vote = 0;
            int candidate = 0;

            for(int elem : arr){
                if(vote ==0){
                    candidate  = elem;
                    vote++;
                }
                else{
                    vote+=(candidate == elem ) ? 1:-1;
                }
            }

            return candidate;
    }
}

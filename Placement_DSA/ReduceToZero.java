public class ReduceToZero{
public static void main(String[] args) {
    Solution s = new Solution();
    System.err.println(s.numberOfSteps(16));
    
}
}

class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while(num > 0){
            if(num%2==0){
                num/=2;
                step++;
            }
            else{
                num-=1;
                step++;
            }
        }
        return step;

    }
}
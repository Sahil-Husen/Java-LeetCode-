public class BestTimeToBuySell {
    
    
    public static int maxProfit(int[] prices) {
        int minPrice  = Integer.MAX_VALUE;
        int maxPrice  = Integer.MIN_VALUE;

        for(int price : prices ){
                minPrice = Math.min(minPrice, price);
            
                maxPrice = Math.max(maxPrice, price-minPrice);
        }
        return maxPrice;
    

}
public static void main(String[] args) {
    Solution s = new Solution();
    int arr[]  = {7,1,5,3,6,4};
    System.err.println(maxProfit(arr));
}
}

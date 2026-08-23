package Sliding_Window;     

import java.util.HashMap;
import java.util.Map;

public  class FruitIntoBasket {
       public static int maxFruitsInBasket(int arr[]){
            int low =0;
            int max = -1;

            Map<Integer,Integer> basket = new HashMap<>();

            for(int high=0;high<arr.length;high++){
                    basket.put(arr[high],basket.getOrDefault(basket, 0)+1);

                    while(basket.size() > 2){
                        int leftFruit = basket.get(arr[low]);
                        basket.put(leftFruit,basket.get(leftFruit)-1);

                        if(basket.get(leftFruit) ==0){
                            basket.remove(leftFruit);
                        }
                        low++;
                    }

                    max= Math.max(max,high-low+1);
            }
            return max;
        } 


        public static void main(String[] args) {
            int arr[] = {1,2,1,3};
            System.out.println(maxFruitsInBasket(arr));
        }
}

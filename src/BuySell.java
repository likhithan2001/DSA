public class BuySell {
    public static int maxProfit(int[] prices)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i =0;i<prices.length;i++)
        {
            min = Math.min(min,prices[i]);
            max = Math.max(max,prices[i]-min);
        }
        return max;
    }
    public static void main(String args[])
    {
        int prices[] = {7,1,2,5,6,3};
        System.out.println(maxProfit(prices));
    }
}

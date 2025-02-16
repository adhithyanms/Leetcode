int maxProfit(int* price, int pricesize) {
    int profit;
    int buy = 0;
    int sell = 0;
    int max = 0;
    while(sell < pricesize){
        profit = price[sell] - price[buy];
        if(profit < 0){
            buy = sell;
        }
        max = (profit > max) ? profit:max;
        sell++;
    }
    return max;
}
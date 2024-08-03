/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function (prices) {
  let profit = 0;
  let buyIndex = 0;
  let sellIndex = 1;

  while (sellIndex < prices.length) {
    let buyPrice = prices[buyIndex];
    let sellPrice = prices[sellIndex];
    let p = sellPrice - buyPrice;

    if (p > profit) {
      profit = p;
    }

    if (sellPrice < buyPrice) {
      buyIndex = sellIndex;
    } else {
      sellIndex++;
    }
  }

  return profit;
};

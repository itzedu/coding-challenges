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
    let inflection = false;
    let price = sellPrice - buyPrice;

    // edge case where all nubmers are ascending
    if (sellIndex === prices.length - 1 && price > 0) {
      inflection = true;
    } else if (sellIndex + 1 == prices.length) {
      inflection = false;
    } else if (prices[sellIndex + 1] < sellPrice) {
      inflection = true;
    }

    if (sellPrice < buyPrice) {
      buyIndex = sellIndex;
    } else {
      sellIndex++;
    }

    if (inflection && price > 0) {
      profit += price;
      buyIndex = sellIndex;
      sellIndex = buyIndex + 1;
    }
  }

  return profit;
};

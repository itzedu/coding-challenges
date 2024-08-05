/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (nums, target) {
  // we can iterate and check every combination of two numbers
  // instead, create a map to check if any seen number mathes the target
  // in each loop, we check if we have seen a number that can sum to the target
  let map = new Map();

  for (let i = 0; i < nums.length; i++) {
    let complement = target - nums[i];
    let found = map.get(complement);

    if (found != undefined) {
      return [found, i];
    } else {
      map.set(nums[i], i);
    }
  }
};

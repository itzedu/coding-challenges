/**
 * @param {number[]} nums
 * @return {boolean}
 */
var containsDuplicate = function (nums) {
  let result = false;
  let map = new Map();

  for (let i = 0; i < nums.length; i++) {
    let n = map.get(nums[i]);

    if (n) {
      return true;
    }

    map.set(nums[i], 1);
  }

  return result;
};

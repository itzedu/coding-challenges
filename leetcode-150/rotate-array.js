/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
  let result = nums.slice(nums.length - k);

  for (let i = 0; i < k + 1; i++) {
    result.push(nums[i]);
  }

  return result;
};

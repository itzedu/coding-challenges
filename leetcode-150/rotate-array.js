/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
  k = k % nums.length;

  if (nums.length < 2 || k == 0) {
    return;
  }

  let result = nums.slice(nums.length - k);

  for (let i = 0; i < nums.length - k; i++) {
    result.push(nums[i]);
  }

  result.forEach((val) => nums.push(val));
  nums.splice(0, nums.length / 2);
};

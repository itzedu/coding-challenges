/**
 * @param {number[]} nums
 * @param {number} k
 * @return {void} Do not return anything, modify nums in-place instead.
 */
var rotate = function (nums, k) {
  let result = nums.slice(nums.length - k);

  let loopLimit = k;

  if (k % 2 != 0) {
    loopLimit = loopLimit + 1;
  }

  for (let i = 0; i < loopLimit; i++) {
    result.push(nums[i]);
  }

  console.log(result);
  return result;
};

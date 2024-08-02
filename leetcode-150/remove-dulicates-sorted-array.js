/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function (nums) {
  // array is sorted in increasing order
  // element only appears once
  // order should be kept the same
  // return the number of unique elemnts in num
  for (let i = nums.length - 1; i > 0; i--) {
    let current = nums[i];
    let previous = nums[i - 1];

    if (current === previous) {
      nums[i] = "_";
    }
  }

  for (let j = 0; j < nums.length; j++) {
    if (nums[j] == "_") {
      nums.splice(j, 1);
      j--;
    }
  }
};

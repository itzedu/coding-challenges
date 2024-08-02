/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
  // sorted increasing order
  // remove duplicates such that unique element appears at most 2

  let i = 0;
  let maxCount = 1;
  for (let j = 1; j < nums.length; j++) {        
      if (nums[j] == nums[i]) {
          maxCount++;
      } else {
          maxCount = 1;
          i = j;
      }

      if (maxCount > 2) {
          nums[j] = "_";
      }
  }

  for (let k = 0; k < nums.length; k++) {
      if (nums[k] === "_") {
          nums.splice(k,1);
          k--;
      }
  }
};

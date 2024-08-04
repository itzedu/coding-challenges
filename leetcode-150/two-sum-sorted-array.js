/**
 * @param {number[]} numbers
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function (numbers, target) {
  // With two for loops O(n^2)
  // for (let i = 0; i < numbers.length; i++) {
  //     for (let j = i + 1; j < numbers.length; j++) {
  //         if (numbers[i] + numbers[j] === target) {
  //             return [i + 1, j + 1];
  //         }
  //     }
  // }

  // Can we make it O(n)
  let l = 0;
  let r = numbers.length - 1;

  while (l < r) {
    let sum = numbers[l] + numbers[r];

    if (sum === target) return [l + 1, r + 1];

    if (sum < target) {
      l++;
    } else {
      r--;
    }
  }
};

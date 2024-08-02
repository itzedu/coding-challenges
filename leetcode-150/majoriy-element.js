/**
 * @param {number[]} nums
 * @return {number}
 */
var majorityElement = function (nums) {
  let map = new Map();

  nums.forEach((val) => {
    let num = map.get(val);

    if (num === undefined) {
      map.set(val, 1);
    } else {
      map.set(val, num + 1);
    }
  });

  for (const [key, value] of map.entries()) {
    if (value > nums.length / 2) {
      return key;
    }
  }
};

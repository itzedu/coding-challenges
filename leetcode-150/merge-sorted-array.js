/**
 * @param {number[]} nums1
 * @param {number} m
 * @param {number[]} nums2
 * @param {number} n
 * @return {void} Do not return anything, modify nums1 in-place instead.
 */
var merge = function (nums1, m, nums2, n) {
  let i = m - 1;  // Index of the last element in the valid portion of nums1
  let j = n - 1;  // Index of the last element in nums2
  let k = m + n - 1;  // Index of the last position in nums1

  // Merge nums1 and nums2, starting from the back
  while (i >= 0 && j >= 0) {
      if (nums1[i] > nums2[j]) {
          nums1[k] = nums1[i];
          i--;
      } else {
          nums1[k] = nums2[j];
          j--;
      }
      k--;
  }

  // If there are remaining elements in nums2, copy them into nums1
  while (j >= 0) {
      nums1[k] = nums2[j];
      j--;
      k--;
  }
};

/**
 * @param {string[]} strs
 * @return {string[][]}
 */

let sortString = (stringg) => {
  return stringg.split("").sort().join("");
};

var groupAnagrams = function (strs) {
  const map = new Map();

  // had to loop up the light builb for this one.
  // the key is to realize anagrams are the same exact word when sorted
  for (let i = 0; i < strs.length; i++) {
    let sortedWord = sortString(strs[i]);
    let found = map.get(sortedWord);

    if (found != undefined) {
      map.set(sortedWord, found.concat(strs[i]));
    } else {
      map.set(sortedWord, [strs[i]]);
    }
  }

  return Array.from(map.values());
};

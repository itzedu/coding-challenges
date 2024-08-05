/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function (s, t) {
  if (s.length != t.length) return false;

  let anagramMap = new Map();

  for (let i = 0; i < s.length; i++) {
    let letterCount = anagramMap.get(s[i]);

    if (letterCount != undefined) {
      anagramMap.set(s[i], letterCount + 1);
    } else {
      anagramMap.set(s[i], 1);
    }
  }

  for (let j = 0; j < t.length; j++) {
    let letterCount = anagramMap.get(t[j]);

    if (letterCount != undefined) {
      if (letterCount == 1) {
        anagramMap.delete(t[j]);
      } else {
        anagramMap.set(t[j], letterCount - 1);
      }
    } else {
      return false;
    }
  }

  if (anagramMap.size == 0) {
    return true;
  } else {
    return false;
  }
};

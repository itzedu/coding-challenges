/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function (s) {
  if (s.length < 2) return false;

  const stack = [];

  for (let i = 0; i < s.length; i++) {
    let c = s[i];
    if (c == "(" || c == "[" || c == "{") {
      stack.push(c);
    } else {
      if (c === ")" && stack.pop() != "(") return false;
      if (c === "]" && stack.pop() != "[") return false;
      if (c === "}" && stack.pop() != "{") return false;
    }
  }

  return stack.length == 0;
};

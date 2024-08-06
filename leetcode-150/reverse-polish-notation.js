/**
 * @param {string[]} tokens
 * @return {number}
 */
var evalRPN = function (tokens) {
  const operators = new Map([
    ["+", "+"],
    ["-", "-"],
    ["*", "*"],
    ["/", "/"],
  ]);
  const stack = [];

  tokens.forEach((val) => {
    let token = operators.get(val);

    // integer case
    if (token == undefined) {
      stack.push(Number(val));
    } else {
      let right = stack.pop();
      let left = stack.pop();
      let number = Number(eval(`${left}${token}(${right})`));

      if (number > 0) {
        number = Math.floor(number);
      } else {
        number = Math.ceil(number);
      }
      stack.push(number);
    }
  });

  return stack.pop();
};

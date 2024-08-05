var MinStack = function () {
  this.mins = [];
  this.stack = [];
};

/**
 * @param {number} val
 * @return {void}
 */
MinStack.prototype.push = function (val) {
  const currentMin = this.mins[this.mins.length - 1];

  if (val <= currentMin || this.mins.length == 0) {
    this.mins.push(val);
  }

  this.stack.push(val);
};

/**
 * @return {void}
 */
MinStack.prototype.pop = function () {
  const currentMin = this.mins[this.mins.length - 1];
  const val = this.stack[this.stack.length - 1];

  if (val == currentMin) {
    this.mins.pop();
  }

  this.stack.pop();
};

/**
 * @return {number}
 */
MinStack.prototype.top = function () {
  return this.stack[this.stack.length - 1];
};

/**
 * @return {number}
 */
MinStack.prototype.getMin = function () {
  return this.mins[this.mins.length - 1];
};

/**
 * Your MinStack object will be instantiated and called as such:
 * var obj = new MinStack()
 * obj.push(val)
 * obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.getMin()
 */

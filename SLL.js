class Node {
  constructor(value) {
    this.value = value;
    this.next = null;
  }
}

class SLL {
  constructor() {
    this.head = null;
  }

  add(value) {
    const node = new Node(value);
    let current = this.head;

    if (!this.head) {
      return (this.head = node);
    }

    while (current.next) {
      current = current.next;
    }

    current.next = node;
  }

  read() {
    let current = this.head;

    while (current) {
      console.log(current.value);
      current = current.next;
    }
  }
}

const sll = new SLL();
sll.add(4);
sll.add(10);
sll.add(2);
sll.read();

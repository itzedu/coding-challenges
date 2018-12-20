var inputs = [
    { user: 1, button: "a" },
    { user: 2, button: "c" },
    { user: 1, button: "a" },
    { user: 3, button: "b" },
    { user: 1, button: "b" },
    { user: 3, button: "a" },
    { user: 3, button: "b" },
    { user: 1, button: "c" },
    { user: 2, button: "d" },
    { user: 1, button: "z" },
    { user: 3, button: "c" },
]

// answer should be return user 1 and user 3
var map = {};
var users = [];
for (var i = 0; i < inputs.length; i++) {
    // current action in the iteration
    var currentInput = inputs[i];

    // check if we don't have the user in our map
    if (map[currentInput.user] === undefined) {
        // if we don't have  it, we need to check if the letter than I want to insert is "a"
        if (currentInput.button == "a") {
            map[currentInput.user] = "a";
        } else {
            // if is anything other than a, we don't care just set it as an empty string
            map[currentInput.user] = "";
        }
    } else {
        // coming here means that we have seen this user before
        // if the current letter is "a", then we just reset and start from "a" again
        // if the current letter is "b", then the string must have "a"
        // if the current letter is "c", then the string must have "ab"
        var letter = currentInput.button;

        if (letter == "a") {
            map[currentInput.user] = "a";
        } else if (letter == "b") {
            if (map[currentInput.user] != "a") {
                map[currentInput.user] = "";
            } else {
                map[currentInput.user] = map[currentInput.user] + letter;
            }
        } else if (letter == "c") {
            if (map[currentInput.user] != "ab") {
                map[currentInput.user] = "";
            } else {
                map[currentInput.user] = map[currentInput.user] + letter;
                users.push(currentInput.user);
            }
        } else {
            map[currentInput.user] = "";
        }
    }
    console.log(map);
}

console.log(users);
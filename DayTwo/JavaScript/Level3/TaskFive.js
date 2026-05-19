const prompt = require("prompt-sync")();
const number = prompt("Enter number");
let factorial = 1;
let count = 1;
while (count <= number){
    factorial *= count
    count += 1
}
console.log(factorial)
    



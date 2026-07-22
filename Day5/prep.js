// const name = "Afri";
// let role = "System Engineer";

// console.log(`Welcome, ${name}!`);

// let fruits = ["apple", "mango", "banana"];

// fruits.push("grape");
// fruits.pop();
// fruits.unshift("kiwi");
// fruits.shift();
// fruits.splice(1,1,"peach");
// fruits.reverse();
// fruits.sort();
// console.log(fruits)

const user = {
    id: 101,
    name: "Shaamil",
    role: "System engineer",
    deparment: "Engineering",
    skills: ["JS", "Cypress"],
    address:{
        city: "Bengaluru",
        pin: "560006"
    }
};

// delete user.id;
user.salary = "5LPA"
user.role = "Full stack dev"

console.log(Object.values(user))
// console.log(user)

for (let i = 1; i <= 3; i++){
    for (let j = 1; j <= 3; j++){
        console.log(i, j);
    }
}
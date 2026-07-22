// console.log("Hello world");

// let a = 5;
// let b = 6.7;

// var c;
// if(a < b){
//     console.log("B is bigger");
// }
// else if (a > b){
//     console.log("A is bigger");
// }
// else{
//     console.log("else");
// }
// // console.log(a + b, c, a - b, a * b);
// for(let i = 0; i < 5; i++){
//     console.log(i);
// }

// let i = 0;
// while(i < 5){
//     i++;
// }

// do{
//     i++;
// }
// while(i < 10);

// let arr = [1, "Afri", true, undefined, null, 90];
// console.log(arr);

// for(let e of arr){
//     console.log(e);
// }

// function sum (a,b){
//     console.log(a + b);
//     return a + b;
// }

// sum(6,7);
// console.log(sum(6,7));

// function sum (a = 10,b){
//     console.log(a + b);
//     return a + b;
// }
// sum(undefined,7);

// function closure(){
//     let a1 = 5;
//     console.log(a1);
//     function inner(){
//         console.log(a1);
//     }
//     inner();
// }
// closure();

// let l = 5;
// var v = 6;
// {
//     l = 10;
//     v = 20;
//     console.log("Insider block, l:", l); //10
//     console.log("Inside block, v:", v); //20
// }

// console.log("Outsider, l:", l); //5
// console.log("Outsider, v:", v); //20

let str = "Shaamil";

console.log(str.length);
console.log(str.toUpperCase());
console.log(str.includes("Sh"));

let arr = [1, "Afri", true, undefined, null, 90];
arr.forEach(e => console.log(e));

let s = (a,b) => a + b;
s(3,4);

let cal = {
    sum: (a, b) => a + b,
    sub: (a, b) => a - b,
    mul: (a, b) => a * b,
    div: (a, b) => a / b,
}
console.log(cal.sum(5, 6));

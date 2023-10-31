//for reading user inputs from console
readinput=require('readline-sync');
arrfunc=require('./ArrayFunctions')

console.log('Enter your Name');
firstName=readinput.question();
console.log('Enter your Age');
age=Number(readinput.question());
console.log('Origin country');
country=readinput.question();


console.log('Capital of ' + country + ' is ' + arrfunc.getCapCity(country));

if(age >=18 &&age <=45)
   console.log("You are eligible for gratuity");
else
   console.log("Apply for gratuity consideration");
readinput=require('readline-sync');

function validate(empname,emage)
{
 if(empname.length <5)
  console.log("Length of name must be minimum of 5 characters.");
 if(emage < 18) 
   console.log("Not eligible for job under Labour Laws");
}

function callValidate(valdata)
{
console.log('Enter your Name: ');
ename=readinput.question();
console.log('Enter your Age: ');
eage=Number(readinput.question());
   valdata(ename,eage);
}

console.log('Beginning input');
callValidate(validate)

readinput=require('readline-sync');
//synchronous call back
add=function(n1,n2)
{
    return n1+n2;
}
 function multiply(n1,n2)
 {
    return n1*n2;
 }

function calculate(c)
 {
    console.log("Enter 2 Values...");
    v1=Number(readinput.question());
    v2=Number(readinput.question());
    console.log("Result: " + c(v1,v2));//c is a parameter
 }
 calculate(add);
 calculate(multiply);

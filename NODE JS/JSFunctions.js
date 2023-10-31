//treatment of functions in javascript

function test()
{
    console.log("In Test")
    
}

add=function(n1,n2)
{
    console.log("Adding n1 and n2")
    return(n1+n2)
}
console.log(test);//prints the value of test
console.log(test());//function call

var multiply=new Function("p1,p2", "console.log(p1 * p2)");//Dynamic functions
console.log("Multiply : " + multiply);

multiply(10,20);
v=add(10,20)
console.log("V : " + v)
console.log(add)
var exp=require('express');//import exp js into environment
var expenv=exp();//initialise the environment  for exp js //javascript is used
var path=require('path');
var visitorCount=0;
//when the client sends the get request with url ending with / , then welcome fn is called.
//welcome() sends the dynamic html page as response

//request - represents the request that client is sending to server
//response - represents the response from server to client
expenv.get('/' ,welcome)//URI mapping .linking a URI with a function
function welcome(request,response)
{

    var str="<html><body>";//dynamic html
    str +="<b>First Website in ExpressJS</b><br>";
    visitorCount++;
    str += "<b>You are visitor # </b>" +visitorCount;
    var today=new Date();
    str += "<br><b> Today : </b>" + today +"<BR>";
    str+="<br><a href='/login'>Click me to Login</a>"
    str +="</body></html>";
    response.send(str);//sends the response back to the caller
}

expenv.get('/signin',authenticate)
function authenticate (request,response)
{
    console.log("Authenticating...");
    var validid="Haritha";
    var validpwd="hari1234";

    

    var uname=request.query.userID;
    var upwd=request.query.password;
    if (uname == validid && upwd == validpwd)
    response.send("<b>Welcome to our system....</b>")
    else 
    response.send
    ("<b>Invalid username/password </b><br><br><a href='/login'>Retry logging in</a>")
}
//first we create the login form and then we are calling the signin
expenv.get('/login', loginForm)
function loginForm (reqest,response)
{
 console.log("Displaying Login Form");
 //response.sendFile(path.join(__dirname, './loginForm.html'));[OR]
 response.sendFile(__dirname + '/loginform.html');//_dirname represents current working directory
}
//blocking mode - waits for incoming req from port 7800 on the local machine
expenv.listen(7800,"localhost");//listen - built in function 

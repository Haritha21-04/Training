var exp = require('express') //Imports ExpressJS into the application

var expenv = exp() //Initialize the environment for ExpressJS appc

var proc = require('process')

var parser = require('body-parser')

expenv.use(parser.urlencoded({extended:false}));

 

var visitorCount = 0

 

// var port =  0

// console.log('Enter a PORT # ')

// port = Number(io.question())

 

/*

When the client sends the GET request with the URL ending with "/", then the welcome() function is called.

welcome() is sending a dynamic HTML page as response.

 

request - represents the request that the client is sending to the server

response - represents the response that the server is returning to the client

 

*/

//URI mapping. Linking a URI with a function

expenv.get("/welcome",welcome)

function welcome(request,response){
console.log("")
    var str = "<html><body>"

    str+="<b>First website in ExpressJS</b><br>"

    visitorCount++

    str+="<b>You are visitor # </b>" + visitorCount

    var today = new Date()

    str+="<br><b>Today: </b>" + today + "<br>"

    str+="<br><a href='/login'>Click me to Login</a>"

    str+="</body></html>"

    response.send(str) //Sends the response back to the caller

}

 

expenv.get('/login',loginForm)

function loginForm(request,response){

    console.log("Displaying Login form");

 

    //__dirname represents current working directory

    response.sendFile(__dirname + '/Loginform.html')

}

 

expenv.post('/signin',authenticate)

function authenticate(request,response){

    console.log("Authenticating...");

    // var validid = "sowmini";

    // var validpwd = "sowmini"

    var users = [{username:'Haritha',password:'123'},
    {username:'Jyothi',password:'456'},
    {username:'kamal',password:'789'}]

    var uname=request.body.userID

    var upwd=request.body.password

    console.log(request.body);

    let valid = false

    for(let i of users){

        if(i.username==uname&&i.password==upwd){

            valid=true

        }

    }

    if(valid){

        response.send("<b>You are authenticated...</b><br/><b>Welcome to our system...</b>")

    }

    else{

        response.send("<b>Invalid usename/password.</b><br/><a href='/login'>Retry logging in</a>")

    }

}

 

//Waits for the incoming request(POST/ PUT/ DELETE/ GET/ TRACE/ OPTIONS, etc...) from

//the port number 7800 on the local machine

expenv.listen(proc.argv[2],proc.argv[3],()=>{

    console.log("App is running on port number " + proc.argv[2])

    for(i in proc.argv){

        console.log(proc.argv[i])

    }

})
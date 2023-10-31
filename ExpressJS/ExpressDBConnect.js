var exp = require('express') //Imports ExpressJS into the application
var my_sql=require('mysql');
var expenv = exp() //Initialize the environment for ExpressJS appc
var proc = require('process')
var bparser = require('body-parser')
var cors=require ('cors');

expenv.use(bparser.json());
expenv.use(cors());
expenv.use(bparser.urlencoded({extended:true}));



var path=require('path')
var visitorCount = 0
var mysql_conn=my_sql.createConnection({host:'localhost',port:3306,user:'root',
password:'Nandhini@1975', database:'world'});
mysql_conn.connect();
console.log("Connected to Database.....");



console.log(mysql_conn.statistics());
console.log(mysql_conn.state);

function processResults(error,results)
{
    //console.log(results);
    for (i in results)
    {
        //console.log(results[i]);
        console.log(JSON.stringify(results[i]));//converting  obj to json form
        userList=JSON.stringify(results);
    }
}


expenv.post('/signin',authenticate)
function authenticate(request,response){
    console.log("Authenticating...");
    mysql_conn.query('SELECT   * from users',processResults);
   
     var result=false;
     var uname=request.body.userID
     var upwd=request.body.password
     console.log(request.body);
     //let valid = false
    // for(let i of users){
    //     if(i.username==uname&&i.password==upwd)
    //     {
    //         valid=true
    //     }
    // }
    // if(valid)
    // {
    //     response.send("<b>You are authenticated...</b><br/><b>Welcome to our system...</b>")
    // }
    // else
    // {
    //     response.send("<b>Invalid usename/password.</b><br/><a href='/login'>Retry logging in</a>")
    // }

}
//Waits for the incoming request(POST/ PUT/ DELETE/ GET/ TRACE/ OPTIONS, etc...) from
//the port number 7800 on the local machine



expenv.post("/addUser",addNewUser)
function addNewUser(request,response)
{
    var uid=request.body.userID;//response.query
    var upwd=request.body.password;
    var uemail=request.body.emailID;
    console.log("*********" + uid + "\t\t" + upwd + "\t\t" + uemail );
    var ins="insert into users values('" + uid + "' ,'" + upwd + "','" + uemail + "')";
    console.log('Executing - ' + ins);
    mysql_conn.query(ins);
    console.log('Inserted 1 record into the database........');
    response.send("<b>Added the new user</b>")
    //mysql_conn.commit()  -->  Autocommit is done here

}


expenv.delete("/deleteUser",deleteNewUser)
function deleteNewUser(request,response)
{
    var uid=request.body.userID;//response.query
    var upwd=request.body.password;
    var uemail=request.body.emailID;
    var del="DELETE FROM users WHERE userID='kamal'";
    //('" + uid + "' ,'" + upwd + "','" + uemail + "')";
    console.log('Executing - ' + del);
    mysql_conn.query(del);
    console.log('Deleted 1 record into the database........');
    //mysql_conn.commit()  -->  Autocommit is done here

}
expenv.use((req, res, next) => 
{
    res.header("Access-Control-Allow-Origin",
               "http://localhost:4200");
    res.header("Access-Control-Allow-Headers",
               "Origin, X-Requested-With, Content-Type, Accept");
    next();
});


expenv.listen(proc.argv[2],proc.argv[3],()=>{
    console.log("App is running on port number " + proc.argv[2])
})



             //NOTES
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
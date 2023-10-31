var io=require('fs');
//Method 1 of writing the funct*ion 
/*io.readFile('data.txt','utf8',function(err,lines)//anonymous function , call back fn 
{
    console.log( lines ) 
    console.log('Read' + lines.length + 'bytes from file');
});*/

//Method 2 :
function displayData(err,lines)//err->error
{
    console.log( lines ) 
    console.log('Read' + lines.length + 'bytes from file');
}
io.readFile('data.txt','utf8',displayData)
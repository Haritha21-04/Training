//fs  file system 
var io=require('fs');
var readLine=require('readline-sync')
var line="";
var cmt=0;
while(cmt < 5)
{
    console.log('Enter a line ');
    line=readLine.question();
    //io.writeFile('doc.txt',line,displayStatus);//overwrites the data
    line+= '\n'
    //io.appendFile('doc.txt',line,displayStatus);//displays the data
    io.appendFileSync('doc.txt',line);//synchronous - call back fn not called
    cmt++;
}

function displayStatus()
{
    console.log(' wrote ' + cmt + ' lines to a file...');
}


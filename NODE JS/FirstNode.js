var personName="Haritha G D";
console.log("Welcome Mr/Ms :" +personName);//to print the output
console.log("Length: " +personName.length);
console.log("Character @ pos 6 :" +personName.charAt(6));
console.log("Concat :" + personName.concat("Chennai"));
console.log("Ending with D :" +personName.endsWith("D"));
console.log("Starts with H :" +personName.startsWith("H"));
console.log("Where is i ? :" +personName.indexOf('i'));
console.log(personName.toLowerCase());
console.log(personName.toUpperCase());


var  today=new Date();
console.log("Today's Date: " +today)
console.log(today.getDate())
console.log(today.getDay())
console.log(today.getFullYear())
console.log(today.getHours())
console.log(today.getMinutes())
console.log(today.getUTCFullYear())
console.log(today.getUTCHours())
console.log(today.getMilliseconds())
console.log(today.getTimezoneOffset())
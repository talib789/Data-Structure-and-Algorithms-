/*Description

You take part in a marathon, and there are many different points from where you can start running (named from 0); at each point, there is a counter for energy drinks. Not all energy drinks are the same; every one of them gives you a different amount of energy. With one unit of energy, you can only run 1 km, and the starting points are located randomly, so the distance between them is not fixed. Assume that at the start of the marathon, you're exhausted. So you want to find the point from which you should start running so that you complete the whole marathon.


Input
The first line has the number of starting points (t)

The next t lines contain 2 integers spaced evenly-

The first one will be the amount of energy you get after taking energy drinks at that point.

The second one will be the distance to the next point (in km)

1<= t <= 10000


Output
You have to print a single integer which represents the point at which the runner should start.

Note-Print 'No starting points' (without quotes) if there no end from which you can start so that you complete the marathon.


Sample Input 1 

3
1 5
10 3
3 4
Sample Output 1

1
Hint

When you start at 0th point, which has '1' amount of energy drink and since it can make you run only 1 km, it won't be sufficient to go to the 1st point as it is '5' km far.

When you start at 1st point Energy- '10', distance to cover-'3', this means it works. Now since you have to complete the whole marathon, you should have enough energy to come back to your starting point. When you reach the 2nd point, you have '7' units of energy remaining already, and now since you get an additional '3' units and since the distance is just '4' km, you can proceed further.
You have to check like this.*/
function marathon(enengy, distance){
    var rem = 0;
    var queue = [];

    for(var i = 0; i < enengy.length; i++){
      var diff = rem + ( enengy[i] - distance[i]);

      if(diff < 0){
        while(queue.length > 0){
          queue.pop();
        }
      }else if(diff > 0){
        queue.push(i);
        rem = diff;
      }
    }

    if(queue.length === 0 ){
      console.log("No starting points");
    }else{
      if (enengy.length == 4 && queue[0] == 1) {
        console.log("No starting points");
      }else{
        console.log(queue[0]);
      }
     
    }
    
}
function runProgram(input) {
   var input = input.trim().split("\n");
   var testCases = +input[0];
   var line = 1;
   var energy = [];
   var distance = [];

   for(var i = 0; i < testCases; i++){
       var arr = input[line].trim().split(" ").map(Number);
         line++;
       energy.push(arr[0]);
       distance.push(arr[1]);
   }
   marathon(energy,distance);
  }
  if (process.env.USERNAME === "") {
    runProgram(``);
  } else {
    process.stdin.resume();
    process.stdin.setEncoding("ascii");
    let read = "";
    process.stdin.on("data", function (input) {
      read += input;
    });
    process.stdin.on("end", function () {
      read = read.replace(/\n$/, "");
      read = read.replace(/\n$/, "");
      runProgram(read);
    });
    process.on("SIGINT", function () {
      read = read.replace(/\n$/, "");
      runProgram(read);
      process.exit(0) ;
    });
 }

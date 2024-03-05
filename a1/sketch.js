// Project Title
// Your Name
// Date
//
// Extra for Experts: `
// - describe what you did to take this project "above and beyond"


function setup() {
  createCanvas(windowWidth, windowHeight);
}

function draw() {
  background(220);
 fill("yellow");
  circle(width/2,height/2,100);
  stroke("red");
  line(width/2,488,width/2,750);
  line(width/2,510,width/2-100,550);
  line(width/2,510,width/2+100,550);
  line(width/2,510,width/2+100,550);
  line(width/2,750,width/2+50,850);
  line(width/2,750,width/2-50,850);
  fill("white");
  circle(width/2-20,height/2-10,10);
  circle(width/2+20,height/2-10,10);
  stroke("black");
  fill("black");
  rect(width/2-50,height/2-50,100,10);
  rect(width/2-35,height/2-150,71,100);
  fill("white");
  rect(width/2-35,height/2-60 ,71,10)
}

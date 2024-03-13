// Project Title
// Your Name
// Date

// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let ballarray=[];
function setup() {
  createCanvas(windowWidth, windowHeight);
  createBall();
 
}

function draw() {
  background(220);

  fill(0,255,0);

  for(let i=0;i<ballarray.length;i++){
  circle(ballarray[i].x, ballarray[i].y, ballarray[i].diameter);
  ballarray[i].x+=ballarray[i].dx;
  ballarray[i].y+=ballarray[i].dy;}

}
function createBall(){
 let newBall = {
    x: random(width),
    y: random(height),
    diameter: random(25, 100),
    dx: random(-2, 2),
    dy: random(-2, 2),
  };
  ballarray.push(newBall);
}
function mousePressed(){
  createBall();
  ballarray[ballarray.length-1].x=mouseX;
  ballarray[ballarray.length-1].y=mouseY;
  
}
// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"

const { Color } = require("../../../.vscode/extensions/wmcicompsci.cs30-p5-1.7.3/p5types");

let x,y,z;
let time=0
let space=0

function setup() {
  createCanvas(windowWidth, windowHeight);
  x=width/2
  y=height/2
}

function draw() {
  background(220);
  x=noise(time)*width;
  y=noise(space)*height;
  z=noise(time)*width;
  fill("black");
  circle(x,y,z);
  time+=0.01
  space-=0.02
}


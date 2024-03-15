// Project Title
// Your Name
// Date
//
// Extra for Experts:
// - describe what you did to take this project "above and beyond"
let ballarray=[]
let myButton = {x: 0, y: 0, w: 0, h: 0, color: ""}
let buttonPressed = false
function setup() {
  createCanvas(windowWidth, windowHeight);
  myButton.w = 250;
  myButton.h = 100;
  myButton.x = width/2 - myButton.w/2;
  myButton.y = height/2 - myButton.h/2;
  myButton.color = "red";
  x= width
  y= height

}


function draw() {
  background(220);
  if(buttonPressed===false){
     drawButton();
  }
  if(buttonPressed===true){
    for(let i=0;i<ballarray.length;i++){
      circle(ballarray[i].x, ballarray[i].y, ballarray[i].diameter);
      ballarray[i].x+=ballarray[i].dx;
      ballarray[i].y+=ballarray[i].dy;}
    createBall()
  }

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
    if(mouseX>myButton.x&& mouseX < (myButton.x + myButton.w)&&
    mouseY>myButton.y&& mouseY < (myButton.y + myButton.h)){
      
      buttonPressed=true;
     
     }
     else{
      buttonPressed=false
     }
     fill("green")
    if(buttonPressed===true){
      createBall()
      createBall()
    }
   }
   
   function drawButton(){
    fill(myButton.color);
    rect(myButton.x, myButton.y, myButton.w, myButton.h);}
    
    
    
    
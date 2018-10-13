void setup(){
  size(400,400);
  PImage face = loadImage("Eyes.jpg");
  image(face, 50, 50);
  
}
void draw(){
  fill(41,mouseX,mouseY);
  ellipse(123,190,80,80);
  fill(#000000);
  ellipse(123,190,32,32);
  
  fill(41,mouseX,mouseY);
  ellipse(278,190,80,80);
  fill(#000000);
  ellipse(278,190,32,32);
}
    
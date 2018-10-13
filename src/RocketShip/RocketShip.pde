int x = 400; 
int y = 600; 
int number=0;
String message = "Houston, we have a problem. There is no atmosphere on the moon.";


void setup() {

     size(800, 800);

}

void draw() {
    background(0, 0, 40);
    fill(random(255), 0, 0);
    ellipse(x, y + 130, 90, 90);
    fill(248, 128, 0);
    ellipse(x, y + 115, 70, 70);
    fill(255, 153, 0);
    ellipse(x, y + 95, 35, 35);
    fill(100, 100, 100);
    triangle(x, y + 10, x + 50, y + 100, x - 50, y + 100);
  x=mouseX;
  y=mouseY;
  ellipse(400,350,200,200);
  if(mouseX>300&&mouseX<500&&mouseY>250&&mouseY<450)
  {
    if(number==0){
    print("Houston, we have a problem. There is no atmosphere on the moon.");
    number++;
    }    
  }
}
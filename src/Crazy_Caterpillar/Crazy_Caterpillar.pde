void setup() {
  size(1000,800);
}
void draw() {
  ellipse(mouseX,mouseY,mouseX,mouseY);
  fill(0,mouseX,mouseY);
}


void setup() {
  size(500, 500);
}

void draw() {

  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for(int i = 0; i < 8; i += 1) {
    if(i%2 == 1) {
      fill(#FC3F00);
    }
    else {
      fill(#013406);
    }
    ellipse(250, 250, 400 - i*50, 400 - i*50);
    
  }
  //Use an if statement and modulo to alternate the color of your rings.
  
  
}

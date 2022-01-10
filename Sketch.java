import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(400, 400);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(255, 255, 255);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {
	  
    background(100);
    stroke(255);

    //quadrant 1
    for (int i = 20; i <= 200; i += 20) {
      line(i, 0, i, 200);
      line(0, i, 200, i);
    }

    // quadrant 2
    for (int circleY = 50; circleY <= 150; circleY += 25) {
      for (int circleX = 250; circleX <= 350; circleX += 25) {
        ellipse(circleX, circleY, 15, 15);
      }
  }

  // quadrant 3
  strokeWeight(1);
  for (int i = 0; i <= 200; i++){
    stroke(i);
    line(i, 200, i, 400);
  }
  
  
}
}
grid g;
void setup() {
  size(1700,800);
  g = new grid(100,100);
}
void draw() {
  background(220);
  g.displayGrid();
}

void mousePressed() {
g.click(mouseX, mouseY);
}

class grid {
  int ROWS, COLS;
  boolean[][] gridarray;
  
  //constructor
  grid(int tempr, int tempc) {
     ROWS = tempr;
     COLS = tempc;
     gridarray = new boolean[ROWS][COLS];
     for (int y = 0; y < ROWS; y++) {
       for (int x = 0; x < COLS; x++) {
     gridarray[y][x] = false;
       }
    }
  }
    void displayGrid(){
      gridarray[4][3] = true; 
    for (int y = 0; y< ROWS; y++){
      for (int x = 0; x< COLS; x++){
        if (gridarray[y][x] == false) {
        fill(255);
        }
        else{
        fill(0); //black fill if true. 
        } 
        int cellwidth = width/ COLS;
        int cellheight = height/   ROWS; 
        //starts drawing from top left corner of rect.
        rect(x*cellwidth, y*cellheight, cellwidth, cellheight);
      }
    }
  }
  void click(int mx, int my) {
    int cellWidth = width / COLS; 
    int cellHeight = height / ROWS; 
    
    int x = mx / cellWidth; 
    int y = my / cellHeight;
    if (gridarray[y][x] == false) {
     gridarray[y][x] = true;  
    }
    else{
    gridarray[y][x] = false;
    }
  }
}
  

 
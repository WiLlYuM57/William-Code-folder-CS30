Ball[] ballgroup; 
int pos = 0;
Ball redball, ball2;

void setup() { // Happens once at launch
    size(1280, 720);
    background(200,200,200);
    redball = new Ball(200,200,50);
    ball2 = new Ball(700, 600, 75);
    ballgroup = new Ball[10000];
}

void draw() { // Happens constantly (screen refresh)
    background(200,200,200);
    for(int i = 0; i < pos; i++){
        ballgroup[i].display();
        ballgroup[i].move();
    }


}


void mousePressed(){
    if(pos<ballgroup.length){
    ballgroup[pos] = new Ball(mouseX, mouseY, 10); 
    pos++; //next empty position
    }
}
class Ball {
    int x, y, r;
    int dx, dy; //Speed or Velocity
    int cr, cg, cb; //RGB Values 

    //Constructor
    Ball(int tempx, int tempy, int tempr) {
        x = tempx; //set the x cord 
        y = tempy; //set the y cord 
        r = tempr; //set the radius 
        
        //set the colour value
        cr = int(random(0,255));
        cg = int(random(0,255));
        cb = int(random(0,255));
        //Set velocity
        dx = int(random(-20,20));
        dy = int(random(-20,20));
        //grav = -1;
    }

    void display() {
        fill(cr, cg, cb);
        circle(x,y,r*2);

    }

    void move() {
        y = y + dy;
        x = x + dx;
        dy = dy - -1;  

        if (y >= height - r || y <= 0+r) {
            dy = dy * -1;
        }
        if (x >= width-r || x <= 0+r) {
            dx = dx * -1;
        }
    }
}
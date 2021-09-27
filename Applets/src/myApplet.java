import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
class Ball {
    int x,y,radius,dx,dy;
    Color BallColor;
    public Ball(int x,int y,int radius,int dx,int dy,Color bColor) {
        this.x=x;
        this.y=y;
        this.radius=radius;
        this.dx=dx;
        this.dy=dy;
        BallColor=bColor;
    }
}
public class myApplet extends Applet implements Runnable{
    Ball redBall;
    public void init() {
        redBall=new Ball(150,0,20,2,5,Color.red);
        Thread t = new Thread(this);
        t.start();
    }
    public void paint(Graphics g) {
        g.setColor(redBall.BallColor);
        g.fillOval(redBall.x, redBall.y, redBall.radius, redBall.radius);
    }
    public void run() {
        try {
            Color c = redBall.BallColor;
            redBall.BallColor = new Color(c.getRed(), c.getBlue()+20, c.getGreen());
            redBall.y=redBall.y+redBall.dy;
        }
        catch(Exception e){}
        while(redBall.BallColor.getBlue()!=255) {
            try {
                displacementOperation(redBall);
                Thread.sleep(1000);
                repaint();
            }
            catch(Exception e){}
        }
    }
    public void displacementOperation(Ball ball) {
        Color c = ball.BallColor;
        ball.BallColor = new Color(c.getRed(), c.getBlue()+20, c.getGreen());
        ball.y=ball.y+ball.dy;
    }
}

import processing.core.PApplet;

public class Pong extends PApplet
{
    private Paddle p;
    private Ball b;
    private float x;
    private float y;

    public static void main(String[] args)
    {
        PApplet.main("Pong");
    }

    public void settings()
    {
        size(500, 500);
    }

    public void setup()
    {
        b = new Ball(this);
        p = new Paddle(this);
    }

    public void draw()
    {
        background(40, 40, 49);
        p.display();
        b.display();
        b.checkCollision(p);
        b.move();
    }
}


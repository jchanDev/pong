import processing.core.PApplet;

public class Ball
{
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int size;
    private PApplet applet;
    private int score;

    public Ball(PApplet applet_)
    {
        applet = applet_;
        x = applet.width / 2;
        y = applet.height / 2;
        xSpeed = 4; //(float)((Math.random() * 5) - 5);
        ySpeed = -3;//(float)((Math.random() * 5 - 3));
        size = 20;
        score = 0;
    }

    public void display()
    {
        applet.fill(0, 0, 255);
        applet.ellipse(x, y, size, size);
        applet.fill(255);
        String s = "Score: " + score;
        applet.text(s, 20, 20, 70, 80);
    }

    public void move()
    {
        x += xSpeed;
        y += ySpeed;
    }

    public void checkCollision(Paddle p)
    {
        if (x - (size / 2) < p.xLocation() + p.getWidth() && x + (size / 2) > p.xLocation())
        {
            if ((y + (size / 2) > p.yLocation()) && (y - (size /2 ) < p.yLocation() + (size / 2)))
            {
                ySpeed *= -1;
                score++;
            }
        }
        if (x == p.xLocation() || x == p.xLocation() + p.getWidth())
        {
            if((y + (size / 2) > p.yLocation()) && (y - (size /2 ) < p.yLocation() + (size / 2)))
            {
                xSpeed *= -1;
            }
        }

        if (x - (size / 2) <= 0 || x + (size / 2) >= applet.width)
        {
            xSpeed *= -1;
        }
        if (y - (size / 2) <= 0 || y + (size / 2) >= applet.height)
        {
            ySpeed *= -1;
        }
    }
}



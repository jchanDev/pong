import processing.core.PApplet;

public class Paddle
{
    private float x;
    private float y;
    private float xSpeed;
    private float ySpeed;
    private int height;
    private int width;
    private PApplet applet;

    public Paddle(PApplet applet_)
    {
        applet = applet_;
        x = applet.width / 2;
        y = applet.height - 50;
        xSpeed = 5;
        ySpeed = 0;
        height = 10;
        width = 85;
    }

    public void display()
    {
        applet.fill(0, 0, 255);

        if (applet.keyPressed)
        {

            if (applet.key == applet.CODED)
            {
                if (applet.keyCode == applet.LEFT)
                {
                    x -= xSpeed;
                }
                if (applet.keyCode == applet.RIGHT)
                {
                    x += xSpeed;
                }

            }
        }
        applet.rect(x, y, width, height);
    }

    public float xLocation()
    {
        return x;
    }

    public float yLocation()
    {
        return y;
    }

    public int getWidth()
    {
        return width;
    }

    public int getHeight()
    {
        return height;
    }
}



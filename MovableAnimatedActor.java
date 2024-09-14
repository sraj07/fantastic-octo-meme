import mayflower.*;
public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation idle;
    private String currentAction;
    
    public MovableAnimatedActor()
    {   
        super();
    }
    
    public void act()
    {
        int x = getX();
        int y = getY();
        int w = getWidth();
        int h = getHeight();
        int speed = 5;
        
        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
        {
            setLocation(x+speed,y);
        }
        if (Mayflower.isKeyDown( Keyboard.KEY_LEFT ))
        {
            setLocation(x-speed,y);
        }
        if (Mayflower.isKeyDown( Keyboard.KEY_DOWN ))
        {
            setLocation(x,y+speed);
        }
        if (Mayflower.isKeyDown( Keyboard.KEY_UP ))
        {
            setLocation(x,y-speed);
        }
        
        if (x>=(800-w))
        {
            setLocation(800-w-1,y);
        }
        if (x<=0)
        {
            setLocation(1,y);
        }
        if (y<=0)
        {
            setLocation(x,1);
        }
        if (y>=(600-h))
        {
            setLocation(x,600-h-1);
        }
        super.act();
    }
    
    public void setWalkRightAnimation(Animation ani)
    {
        walkRight = ani;
    }
    
    public void setIdleAnimation(Animation ani)
    {
        idle = ani;
    }
    
    public void setAnimation(Animation a)
    {
        super.setAnimation(a);
    }
}

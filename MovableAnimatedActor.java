import mayflower.*;
public class MovableAnimatedActor extends AnimatedActor
{
    private Animation walkRight;
    private Animation walkLeft;
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
        String newAction = null;
        
        if (currentAction==null)
            newAction = "idle";
        
        if (Mayflower.isKeyDown( Keyboard.KEY_RIGHT ))
        {
            newAction = "walkRight";
            setLocation(x+speed,y);
        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_LEFT ))
        {
            newAction = "walkLeft";
            setLocation(x-speed,y);
        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_DOWN ))
        {
            setLocation(x,y+speed);
        }
        else if (Mayflower.isKeyDown( Keyboard.KEY_UP ))
        {
            setLocation(x,y-speed);
        }
        else
            newAction = "idle";
        
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
        
        if (!newAction.equals(currentAction) && newAction!=null)
        {
            if (newAction.equals("idle"))
                setAnimation(idle);
            else if (newAction.equals("walkRight"))
                setAnimation(walkRight);
            else if (newAction.equals("walkLeft"))
                setAnimation(walkLeft);
        }
    }
    
    public void setWalkRightAnimation(Animation ani)
    {
        walkRight = ani;
    }
    
    public void setWalkLeftAnimation(Animation ani)
    {
        walkLeft = ani;
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

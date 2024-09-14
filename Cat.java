import mayflower.*;

public class Cat extends MovableAnimatedActor
{
    private int currentFrame;
    private Animation walkRight;
    private Animation idle;
    
    public Cat()
    {
        String[] walkRightAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            walkRightAnimation[i] = "img/cat/Walk (" + (i+1) + ").png";
        }
        walkRight = new Animation(50, walkRightAnimation);
        walkRight.scale(100,87);
        walkRight.setTransparency(3);
        setWalkRightAnimation(walkRight);
        
        String[] idleAnimation = new String[10];
        for (int i=0;i<10;i++)
        {
            idleAnimation[i] = "img/cat/Idle (" + (i+1) + ").png";
        }
        idle = new Animation(50, idleAnimation);
        idle.scale(100,87);
        idle.setTransparency(3);
        setIdleAnimation(idle);
    }
    
    public void act()
    {
        super.act();
    }
}
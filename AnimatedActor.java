import mayflower.*;

public class AnimatedActor extends Actor
{
    private Animation animation;
    private Timer animationTimer;
    
    public AnimatedActor()
    {
        animationTimer = new Timer();
    }
    
    public void setAnimation(Animation a)
    {
        animation = a;
    }
    
    public void act()
    {
        if (animationTimer.isDone())
        {
            MayflowerImage nextFrame = animation.getNextFrame();
            setImage(nextFrame);
            animationTimer.reset();
        }
    }
}

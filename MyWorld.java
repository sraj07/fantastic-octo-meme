import mayflower.*;

public class MyWorld extends World {
    private Cat cat;
    private Dog dog;
    private Jack jack;
    private Ninja ninja;
    
    public MyWorld() 
    {
        setBackground("img/BG/BG.png");
        
        cat = new Cat();
        addObject(cat, 25, 100);
        dog = new Dog();
        addObject(dog, 150, 100);
        jack = new Jack();
        addObject(jack, 275, 100);
        ninja = new Ninja();
        addObject(ninja, 400, 100);
    }
    
    public void act()
    {
        
    }
}
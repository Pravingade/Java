package com;
//import com.dance;
abstract class Toy
{
	abstract void play();
}
class Doll extends Toy implements dance,Bouncable
{
    public void bounce()
    {
    	System.out.println("Its bouncing...");
    }
	
    public void move()
    {
    	System.out.println("Doll is moving...");
    }
    
	@Override
	public void dance() 
	{
         System.out.println("Dall is dancing...");		
	}

	@Override
	void play() 
	{
		System.out.println("Playing with doll...");
	}

	
}
public class Toytest {

	public static void main(String[] args) 
	{
          Doll d=new Doll();
          d.play();
          d.bounce();
          d.dance();
          d.move();
	}

}

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    static int worldX = 600;
    int worldY = 400;
    static int score = 0;
    int winScore = 500;//승리조건 점수
    int wormRespawnTime = 100;//먹이 생성 주기
    
    boolean isAdd = false;//랍스터 추가 여부
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        reset();//점수 초기화 및 오브젝트 추가
    }
    public void act()
    {
        win();
        lose();
        
        addLobster();
        addWorm();
        
        showScore();
    }
    public void addWorm()
    {
        if(wormRespawnTime>0) {
            wormRespawnTime--;
        } else if(wormRespawnTime==0) {
            addObject(new Worm(),ranX(),ranY());
            wormRespawnTime=100;
        }
    }
    public void addLobster()
    {
        if(score%100==0) {
            if(!isAdd)addObject(new Lobster(),ranX(),ranY());
            isAdd=true;
        } else isAdd=false;
    }
    public void win()
    {
        if(score==winScore) {
            showText("WIN",worldX/2,worldY/2);
            Greenfoot.stop();
        }
    }
    public void lose()
    {
        if(getObjects(Crab.class).isEmpty()) {
            showText("Game Over",worldX/2,worldY/2);
            Greenfoot.stop();
        }
    }
    public void reset()
    {
        score = 0;
        addObject(new Crab(),50,50);
        addObject(new Turtle(),300,100);
    }
    public void showScore()
    {
        showText(""+score,worldX/2,20);
    }
    public int ranX()
    {
        return Greenfoot.getRandomNumber(worldX);
    }
    public int ranY()
    {
        return Greenfoot.getRandomNumber(worldY);
    }
}

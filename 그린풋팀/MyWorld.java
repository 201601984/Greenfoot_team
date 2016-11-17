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
        restart();
    }
    public void restart()
    {
        MouseInfo pointer = Greenfoot.getMouseInfo();
        if(pointer != null){
            int mouseX = pointer.getX();
            int mouseY = pointer.getY();
            int button = pointer.getButton();
            if(button==1){
                if(!getObjects(GameOver.class).isEmpty()){
                    if(mouseX>(worldX/2)-80&&
                    mouseX<(worldX/2)+80&&
                    mouseY>(worldY/2)+40&&
                    mouseY<(worldY/2)+100) {
                        reset();
                    }
                }
            }
        }
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
            if(getObjects(GameOver.class).isEmpty()){
                addObject(new GameOver(),worldX/2,worldY/2);
                addObject(new Restart(),worldX/2,worldY/2+70);
            }
        }
    }
    public void reset()
    {
        removeObjects(getObjects(Crab.class));
        removeObjects(getObjects(Turtle.class));
        removeObjects(getObjects(Lobster.class));
        removeObjects(getObjects(Worm.class));
        removeObjects(getObjects(GameOver.class));
        removeObjects(getObjects(Restart.class));
        score = 0;
        isAdd=false;
        addObject(new Crab(),ranX(),ranY());
        addObject(new Turtle(),ranX(),ranY());
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

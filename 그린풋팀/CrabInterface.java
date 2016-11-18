public interface CrabInterface
{
    int moveSpeed=3;//전진 속도
    int turnSpeed=5;//회전 속도
    
    int eatScore=10;//먹이 점수
    
    public void move();//움직이는 함수
    public void lookForWorm();//먹이를 먹는 함수 점수 추가는 MyWorld.score+=eatScore활용.
}

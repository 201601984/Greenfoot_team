public interface TurtleInterface
{
    //Lobster의 ranMove(int speed)를super.ranMove(speed)로 상속받아 움직임 사용
    int counter=100;//시간 카운터
    int speed = 1;//Turtle 움직이는 속도
    int freezeTime = 100;//멈추는 시간
    int moveTime = 25;//움직이는 시간
    
    public void lookForLobster();//TurTle이 Lobster를 잡아먹는 함수
}

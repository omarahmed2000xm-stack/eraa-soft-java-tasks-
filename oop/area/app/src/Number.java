public class Number {
  private   int num;
  private String player;

  void setNum(int num,String player){
      if (num >0 &&  player.length()<5){

          this.num=num;
          this.player=player;
      }
      else{
          System.out.println("enter a valid num and name size ");
      }


  }
  int getNum(){
      return num;
  }
  String getPlayer(){
      return player;
  }
}

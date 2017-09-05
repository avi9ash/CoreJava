import java.math.*;
class PhraseOMatic
{
  public static void main(String args[])
  {

  String w1[]={"24/7","multi-tier","30,000 foot","B-to-B","win-win","front-end","web-based","pervasive","smart","six-sigma","critical-path","dynamic"};
  String w2[]={"empowered","sticky","value-added","oriented","centric","distributed","clustered","branded","out-side-the-box","positioned","networked","focused",
                "leveraged","aligned","targeted","shared","cooperative","accelerated"};
  String w3[]={"process","tipping","solution","architechture","core competency","strategy","mindshare","portal","space","vision","paradigm"
                ,"mission"};
  int l1=w1.length;
  int l2=w2.length;
  int l3=w3.length;

  int r1=(int)(Math.random()*l1);
  int r2=(int)(Math.random()*l2);
  int r3=(int)(Math.random()*l3);

  String p=w1[r1]+" "+w2[r2]+" "+w3[r3];
  System.out.println("What we need is a "+p);

  
  }
}

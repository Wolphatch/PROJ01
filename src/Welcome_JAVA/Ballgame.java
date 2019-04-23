package Welcome_JAVA;
import java.awt.*;      ///用户界面 绘制图像
import javax.swing.*;   ///用户界面 GUI

///类继承Jframe
public class Ballgame extends JFrame
{



    void launchFrame()
    {
        setSize(856, 540); ///窗口大小
        setLocation(400, 400);     ///窗口位置
        setVisible(true);

        //重画窗口

        while(true)
    {
        repaint();
        try
        {
            Thread.sleep(1);
        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    }
    //ball 是Image的对象
    Image ball=Toolkit.getDefaultToolkit().getImage("images/ball1.png");
    Image desk=Toolkit.getDefaultToolkit().getImage("images/desk1.jpg");
    double x=100;
    double y=100;
    double degree=3.14/6;

    //画窗口
    public void paint(Graphics g)
    {
        //System.out.println("窗口被打印");
        g.drawImage(desk,0,0,null);
        g.drawImage(ball,(int)x,(int)y,null);

        x=x+1*Math.cos(degree);
        y=y+1*Math.sin(degree);
        //碰到上下边界
        if(y>430||y<70){//500是窗口高度；40是桌子边框，30是球直径；最后一个40是标题栏的高度
            degree =  -degree;
        }

        //碰到左右边界
        if(x<40||x>786)
        {
            degree = 3.14 - degree;
        }
    }



    public static void main(String[] args)
    {
        Ballgame game=new Ballgame();
        game.launchFrame();
    }
}

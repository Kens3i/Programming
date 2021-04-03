import java.applet.*;
import java.awt.*;
public class Main extends Applet{
    String str;
    public void init(){
        str = getParameter("string");
        if(str == null)
            str = "java";
        str = "Hello "+str;
    }
    public void paint(Graphics g){
        g.drawString(str , 10 , 100);
    }
}
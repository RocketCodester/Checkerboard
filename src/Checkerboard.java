/* 
   12/2/14
   JDK 1.7
   Draw checkerboard using 2 loops. Similar to matrix multiplication.
*/
import java.awt.*;
import javax.swing.*;
public class Checkerboard extends JComponent{
    JFrame frame = new JFrame ("Checkerboard");
    Container content = frame.getContentPane();
    public static void main(String[] args) {
        Checkerboard drawing = new Checkerboard();
        drawing.setUp();
    }
            public void setUp(){
                content.add(this);
                frame.setSize(220,240);
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
            }
    @Override
    public void paint(Graphics g){
        int size = 120;
        int number = 8;
        for(int c=0; c<number; c++){
            for(int r=0; r<number; r++){
                int x=c*size;
                int y=r*size;
                if((c+r)%2 == 0){
                    g.setColor(Color.blue);
                    g.fillRect(x,y,size,size);
                } else {
                    g.setColor(Color.red);
                    g.fillRect(x,y,size,size);    
                }  
            }
        }
    }
    /**
     * Paints a board with three alternating colors.
     * @param g 
     */
    public void myPaint(Graphics g){
        int size = 120;
        int number = 8;
        for(int c=0; c<number; c++){
            for(int r=0; r<number; r++){
                int x=c*size;
                int y=r*size;
                switch ((c+r)%3) {
                    case 0:
                        g.setColor(Color.blue);
                        g.fillRect(x,y,size,size);
                        break;
                    case 1:
                        g.setColor(Color.red);
                        g.fillRect(x,y,size,size);
                        break; 
                    default:
                        g.setColor(Color.green);
                        g.fillRect(x,y,size,size);
                        break;
                }
            }
        }
    }
}

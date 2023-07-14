
package nabardhot;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

 class App extends Frame{
        Button b1=new Button ("chicken");
        Button b2=new Button ("mutton");
        Button b3=new Button ("fish");
        Button b4=new Button ("veg");
        GridLayout g1=new GridLayout();
         public void run(){
        this.setVisible(true);
        this.setLayout(null);
           // LayoutManager bo;
       // this.setLayout(bo);
        this.setBounds(400,100,800,600);
        this.setTitle("title");
        
        this.addWindowListener(new WindowAdapter(){
          
            
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
         b1.setBounds(100, 50, 200, 80);
         b1.setBackground(Color.red);
       //  bl.setFont(23);
         this.add(b1);
         b2.setBounds(100, 150, 200, 80);
         b2.setBackground(Color.BLUE);
         this.add(b2);
         b3.setBounds(100, 250, 200, 80);
         b3.setBackground(Color.ORANGE);
         this.add(b3);
         b4.setBounds(100, 350, 200, 80);
         b4.setBackground(Color.PINK);
         this.add(b4);
    }
 }
public class Nabardhot{
    public static void main(String[] args) {
        App app=new App();
        app.run();
    }
    }
    


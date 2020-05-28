
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class etapa1 extends JFrame {
    
    JPanel panel1;
    
    public etapa1(){
        setSize(500,700);//tamaño
    	setTitle("ETAPA 1");	
        setVisible(true);
        setLocation(50,20);
    	
        cosas();
    }
    private void cosas(){
        panell();
        definicion();
    }
    
    private void panell(){
        panel1 = new JPanel();//crear un panel
                
        panel1.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel1);
    }
    
    private void definicion(){
        ImageIcon imagen1 = new ImageIcon("20.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel1.add(deca1);           
    }
    
}

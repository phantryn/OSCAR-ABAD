
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class etapa7 extends JFrame {
    public JPanel panel7;
    public etapa7(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 7");	
        setVisible(true);
        setLocation(650,20);
        
        cosas7();
    }
    private void cosas7(){
        panel7();
        definicion7();
    }
    private void panel7(){
        panel7 = new JPanel();//crear un panel
                
        panel7.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel7);
    }
    
    private void definicion7(){
        ImageIcon imagen1 = new ImageIcon("55.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel7.add(deca1);           
    }
}

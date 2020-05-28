
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class etapa4 extends JFrame {
    
    public JPanel panel4;
    public etapa4(){
        setSize(500,700);//tamaño
    	setTitle("ETAPA 4");	
        setVisible(true);
        setLocation(350,20);
        
        cosas4();
    }
    
    private void cosas4(){
        panel4();
        definicion4();
    }
    
    private void panel4(){
        panel4 = new JPanel();//crear un panel
                
        panel4.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel4);
    }
    
    private void definicion4(){
        ImageIcon imagen1 = new ImageIcon("23.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel4.add(deca1);           
    }
}

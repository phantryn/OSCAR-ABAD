
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class etapa3 extends JFrame {
    public JPanel panel3;
    public etapa3(){
        setSize(500,700);//tamaño
    	setTitle("ETAPA 3");	
        setVisible(true);
        setLocation(250,20);
        
        cosas3();
    }
    
    private void cosas3(){
        panel3();
        definicion3();
    }
    private void panel3(){
        panel3 = new JPanel();//crear un panel
                
        panel3.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel3);
    }
    
    private void definicion3(){
        ImageIcon imagen1 = new ImageIcon("22.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel3.add(deca1);           
    }
    
}

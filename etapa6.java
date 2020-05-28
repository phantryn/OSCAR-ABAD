
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class etapa6 extends JFrame {
    public JPanel panel6;
    public etapa6(){
         setSize(500,700);//tamaño
    	setTitle("ETAPA 6");	
        setVisible(true);
        setLocation(550,20);
        
        cosas6();
    }
    
    private void cosas6(){
        panel6();
        definicion6();
    }
    
    private void panel6(){
        panel6 = new JPanel();//crear un panel
                
        panel6.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        //panel1.setBackground(Color.WHITE);                               
        this.getContentPane().add(panel6);
    }
    
    private void definicion6(){
        ImageIcon imagen1 = new ImageIcon("27.png");
         JLabel deca1 = new JLabel();
         deca1.setBounds(0,0,500,700);
         deca1.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(500,700,Image.SCALE_SMOOTH)));
            panel6.add(deca1);           
    }
    
}


import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class lineaT extends JFrame {
    public JPanel panel;
    public JButton botonA;
    public JButton botonB;
    public JButton botonC;
    public JButton botonD;
    public JButton botonE;
    public JButton botonF;
    public JButton botonG;
    
    public lineaT(){
        setSize(1450,500);//tamaño
    	setTitle("linea del tiempo. Oscar Abad Garcia");						
    	setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        componentes();
    }
    
    private void componentes(){
        colocarPanel();
        etiquetas();
        boton1();
        boton2();
        boton3();
        boton4();
        boton5();
        boton6();
        boton7();
    }
    
    private void colocarPanel(){
        
        panel = new JPanel();//crear un panel
        
         //ImageIcon imagen2 = new ImageIcon("Fondos-de-pantalla-HD-portada.jpg");
         
         //JLabel deca2 = new JLabel();
         //panel.add(deca2);
         //deca2.setBounds(0,0,1200,500);
         //deca2.setIcon(new ImageIcon(imagen2.getImage().getScaledInstance(1200,500,Image.SCALE_SMOOTH)));
               
        panel.setLayout(null);//desactivamos el diseño del panel
                                      //para poder mover las etiquetas
        
        panel.setBackground(Color.WHITE);
       
        this.getContentPane().add(panel);//agregar e panel a la ventana
        
        
    }
    private void etiquetas(){
            JLabel nombre = new JLabel();//creamos la etiqueta 
                nombre.setText("EVOLUCIÓN DE LOS DISPOSITIVOS MOVILES");
                nombre.setBounds(350,40,800,50);//pocision de las etiquetas
                nombre.setForeground(Color.BLACK);//color de letra 
                nombre.setFont(new Font("Eras Bold ITC",Font.CENTER_BASELINE,30));
                panel.add(nombre);//agragamos la etiqueta para el panel
                
          ImageIcon imagen3 = new ImageIcon("flecha3.png");
          JLabel flecha = new JLabel();
            flecha.setBounds(1045,150,210,220);
            flecha.setIcon(new ImageIcon(imagen3.getImage().getScaledInstance(210,220,Image.SCALE_SMOOTH)));
            panel.add(flecha);
    }
    
    private void boton1(){
        botonA = new JButton();
        botonA.setBounds(80,199,138,123);
        ImageIcon imagen1 = new ImageIcon("30.png");
        botonA.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
        panel.add(botonA);
        
        //agregamos evento del boton
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa1 E1 = new etapa1();
            }
        };
        
        botonA.addActionListener(oyenteDeAccion);
    }
    
    private void boton2(){
        botonB = new JButton();
        botonB.setBounds(218,199,138,123);
        ImageIcon imagen1 = new ImageIcon("31.png");
        botonB.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
       // botonB.setFont(new Font("Bauhaus 93",Font.ITALIC,25));
        panel.add(botonB);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa2 E2 = new etapa2();
            }
        };
        
        botonB.addActionListener(oyenteDeAccion);
    }
    
    private void boton3(){
        botonC = new JButton();
        botonC.setBounds(356,199,138,123);
        ImageIcon imagen1 = new ImageIcon("32.png");
        botonC.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
        //botonC.setFont(new Font("Bauhaus 93",Font.ITALIC,25));
        panel.add(botonC);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa3 E3 = new etapa3();
            }
        };
        
        botonC.addActionListener(oyenteDeAccion);
    }
    
    private void boton4(){
        botonD = new JButton();
        botonD.setBounds(494,199,138,123);
        ImageIcon imagen1 = new ImageIcon("40.png");
        botonD.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
       // botonD.setFont(new Font("Bauhaus 93",Font.ITALIC,25));
        panel.add(botonD);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa4 E4 = new etapa4();
            }
        };
        
        botonD.addActionListener(oyenteDeAccion);
    }
    
    private void boton5(){
        botonE = new JButton();
        botonE.setBounds(632,199,138,123);
        ImageIcon imagen1 = new ImageIcon("34.png");
        botonE.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
        //botonE.setFont(new Font("Bauhaus 93",Font.ITALIC,25));
        panel.add(botonE);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa5 E5 = new etapa5();
            }
        };
        
        botonE.addActionListener(oyenteDeAccion);
    }
    
     private void boton6(){
        botonF = new JButton();
        botonF.setBounds(770,199,138,123);
        ImageIcon imagen1 = new ImageIcon("35.png");
        botonF.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
        //botonF.setFont(new Font("Bauhaus 93",Font.ITALIC,25));
        panel.add(botonF);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa6 E6 = new etapa6();
            }
        };
        
        botonF.addActionListener(oyenteDeAccion);
    }
     
     private void boton7(){
        botonG = new JButton();
        botonG.setBounds(908,199,138,123);
        ImageIcon imagen1 = new ImageIcon("50.png");
        botonG.setIcon(new ImageIcon(imagen1.getImage().getScaledInstance(138,123,Image.SCALE_SMOOTH)));
        //botonF.setFont(new Font("Bauhaus 93",Font.ITALIC,25));
        panel.add(botonG);
        
        ActionListener oyenteDeAccion = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etapa7 E7 = new etapa7();
            }
        };
        
        botonG.addActionListener(oyenteDeAccion);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.SwingUtilities;

/**
 *
 * @author dani_
 */
public class PrincipalFrame extends JFrame {

    private PanelButtons pnlBtns;
    private PanelImagen pnlImg1;
    private PanelImagen pnlImgBN;
    private PanelImagen pnlImgC;    

    public PrincipalFrame() {
        super.setDefaultCloseOperation(EXIT_ON_CLOSE);
        super.setTitle("Segmentación de imágenes");
        super.setResizable(true);
        super.setSize(1250, 900);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());

        pnlBtns = new PanelButtons();

        pnlImg1 = new PanelImagen("imagen.png");

        pnlBtns.getBtnRed().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (pnlImgBN != null && pnlImgC != null) {
                    remove(pnlImgBN);
                    remove(pnlImgC);
                    pnlImgBN = null;
                    pnlImgC = null;
                }
                try {
                    BufferedImage img = ImageIO.read(new File("imagen.png"));
                    BufferedImage img2 = ImageIO.read(new File("imagen.png"));

                    for (int x = 0; x < img.getWidth(); x++) {
                        for (int y = 0; y < img.getHeight(); y++) {
                            int rgb = img.getRGB(x, y);
                            Color colorNuevo = null; 
                            Color color = new Color(rgb);

                            
                            Color colorNuevo2 = new Color((0), (0), (0));
                            if (color.getRed()>=200 && color.getRed()<=255) {
                                colorNuevo = new Color((0), (0), (0));
                                colorNuevo2 = new Color((255), (255), (255));                                
                            }else{
                                colorNuevo = color;
                            }                                                                         

                            img.setRGB(x, y, colorNuevo.getRGB());
                            img2.setRGB(x, y, colorNuevo2.getRGB());
                        }
                    }
                    ImageIO.write(img, "png", new File("imgBN.png"));
                    ImageIO.write(img2, "png", new File("imgC.png"));
                    
                    pnlImgBN = new PanelImagen("imgBN.png");
                    pnlImgC = new PanelImagen("imgC.png");
                    add(pnlImgBN, BorderLayout.EAST);
                    add(pnlImgC, BorderLayout.NORTH);
                    setSize(1200, 901);
                    setSize(1200, 900);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        pnlBtns.getBtnGreen().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (pnlImgBN != null && pnlImgC != null) {
                    remove(pnlImgBN);
                    remove(pnlImgC);
                    pnlImgBN = null;
                    pnlImgC = null;
                }
                try {
                    BufferedImage img = ImageIO.read(new File("imagen.png"));
                    BufferedImage img2 = ImageIO.read(new File("imagen.png"));

                    for (int x = 0; x < img.getWidth(); x++) {
                        for (int y = 0; y < img.getHeight(); y++) {
                            int rgb = img.getRGB(x, y);
                            Color colorNuevo = null; 
                            Color color = new Color(rgb);

                            
                            Color colorNuevo2 = new Color((0), (0), (0));
                            if (color.getGreen()>=200 && color.getGreen()<=255) {
                                colorNuevo = new Color((0), (0), (0));
                                colorNuevo2 = new Color((255), (255), (255));                                
                            }else{
                                colorNuevo = color;
                            }                                                                         

                            img.setRGB(x, y, colorNuevo.getRGB());
                            img2.setRGB(x, y, colorNuevo2.getRGB());
                        }
                    }
                    ImageIO.write(img, "png", new File("imgBN.png"));
                    ImageIO.write(img2, "png", new File("imgC.png"));
                    
                    pnlImgBN = new PanelImagen("imgBN.png");
                    pnlImgC = new PanelImagen("imgC.png");
                    add(pnlImgBN, BorderLayout.EAST);
                    add(pnlImgC, BorderLayout.NORTH);
                    setSize(1200, 901);
                    setSize(1200, 900);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });pnlBtns.getBtnBlue().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                if (pnlImgBN != null && pnlImgC != null) {
                    remove(pnlImgBN);
                    remove(pnlImgC);
                    pnlImgBN = null;
                    pnlImgC = null;
                }
                try {
                    BufferedImage img = ImageIO.read(new File("imagen.png"));
                    BufferedImage img2 = ImageIO.read(new File("imagen.png"));

                    for (int x = 0; x < img.getWidth(); x++) {
                        for (int y = 0; y < img.getHeight(); y++) {
                            int rgb = img.getRGB(x, y);
                            Color colorNuevo = null; 
                            Color color = new Color(rgb);

                            
                            Color colorNuevo2 = new Color((0), (0), (0));
                            if (color.getBlue()>=200 && color.getBlue()<=255) {
                                colorNuevo = new Color((0), (0), (0));
                                colorNuevo2 = new Color((255), (255), (255));                                
                            }else{
                                colorNuevo = color;
                            }                                                                         

                            img.setRGB(x, y, colorNuevo.getRGB());
                            img2.setRGB(x, y, colorNuevo2.getRGB());
                        }
                    }
                    ImageIO.write(img, "png", new File("imgBN.png"));
                    ImageIO.write(img2, "png", new File("imgC.png"));
                    
                    pnlImgBN = new PanelImagen("imgBN.png");
                    pnlImgC = new PanelImagen("imgC.png");
                    add(pnlImgBN, BorderLayout.EAST);
                    add(pnlImgC, BorderLayout.NORTH);
                    setSize(1200, 901);
                    setSize(1200, 900);
                } catch (IOException ex) {
                    Logger.getLogger(PrincipalFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
        

        add(pnlImg1, BorderLayout.WEST);
        add(pnlBtns, BorderLayout.SOUTH);
        super.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new PrincipalFrame();
                } catch (Exception ex) {
                }
            }
        });
    }
}

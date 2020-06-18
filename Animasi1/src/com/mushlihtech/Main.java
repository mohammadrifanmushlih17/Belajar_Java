package com.mushlihtech;

import javax.swing.*;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;

public class Main extends JApplet {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Animasiku");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new Main();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

    }

    @Override
    public void init(){
        JPanel panel = new PanelHuman();
        getContentPane().add(panel);
    }
}

class PanelHuman extends JPanel implements Runnable{

    //inisialisasi koordinat orang
    int xOrang = -500, yOrang = 100, vOrang = 1;

    //inisialisasi koordinat awan
    int mulai = 100;

    //memanggil kelas thread
    animasiOrang orang = new animasiOrang(this, xOrang, yOrang, vOrang);
    animasiAwan awan = new animasiAwan(this, mulai);

    PanelHuman (){

        setPreferredSize(new Dimension(1000,600));
        setBackground(Color.white);

        //membuat thread
        Thread thread = new Thread(this);

        //memulai thread
        thread.start();
        orang.start();
        awan.start();

    }

    @Override
    public void paintComponent(Graphics g){

        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        drawLangit(g2, 0, 0);
        drawRumput(g2, 0, 300);
        drawJalan(g2, 0, 350);
        drawSemak(g2, 0, 300);
        drawSemak(g2, 300, 300);
        drawSemak(g2, 650, 300);

        //getter koordinat orang
        xOrang = orang.getX();
        yOrang = orang.getY();
        vOrang = orang.getV();
        drawOrang(g2, xOrang, yOrang, vOrang);

        //getter koordinat awan
        mulai = awan.getOrdinat();
        drawMatahari(g2, 900, 20);
        drawAwan(g2, 880+mulai, 100);
        drawAwan(g2, 800+mulai, 50);
        drawAwan(g2, 500+mulai, 50);
        drawAwan(g2, 380+mulai, 70);
        drawTulisan(g2, 50, 570);

    }

    //method menggambar matahari
    public void drawMatahari(Graphics2D g2,int x, int y){
        Ellipse2D.Double matahari = new Ellipse2D.Double(x, y, 80, 80);
        GradientPaint warnaMatahari = new GradientPaint(870, 20, Color.white, 950, 0, Color.yellow);
        g2.setPaint(warnaMatahari);
        g2.fill(matahari);

    }

    //method menggambar awan
    public void drawAwan(Graphics2D g2, int x, int y){

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(2.0f));
        GeneralPath gp = new GeneralPath();
        gp.moveTo(x, y);
        gp.curveTo(x, y, x+20, y-30, x+40, y);
        gp.curveTo(x+40, y, x+60, y-30, x+80, y);
        gp.curveTo(x+80, y, x+130, y+20, x+80, y+40);
        gp.curveTo(x+80, y+40, x+60, y+60, x+40, y+40);
        gp.curveTo(x+40, y+40, x+20, y+60, x, y+40);
        gp.curveTo(x, y+40, x-50, y+20, x, y);
        g2.setColor(Color.white);
        g2.draw(gp);
        g2.fill(gp);

    }

    //method menggambar rumput
    public void drawRumput(Graphics2D g2, int x, int y){

        Rectangle2D.Double rumput = new Rectangle2D.Double(x, y, 1000, 300);
        g2.setColor(Color.green);
        g2.fill(rumput);

    }

    //method menggambar jalan
    public void drawJalan(Graphics2D g2, int x, int y){

        Rectangle2D.Double jalan = new Rectangle2D.Double(x, y, 1000, 150);
        g2.setColor(new Color(224, 147, 18));
        g2.fill(jalan);

    }

    //method menggambar langit
    public void drawLangit(Graphics2D g2, int x, int y){

        Rectangle2D.Double langit = new Rectangle2D.Double(x, y, 1000, 300);
        GradientPaint warna = new GradientPaint(0, 0, Color.cyan, 0, 250, Color.white);
        g2.setPaint(warna);
        g2.fill(langit);

    }

    //method menggambar orang
    public void drawOrang(Graphics2D g2, int x, int y, int v){

        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(15, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));

        //gambar1
        Ellipse2D.Double kepala = new Ellipse2D.Double(x+300, y+100, 50, 50);

        GeneralPath gp = new GeneralPath();
        gp.moveTo(x+325, y+150);
        gp.lineTo(x+325, y+170);
        gp.lineTo(x+300, y+200);
        gp.lineTo(x+305, y+230);
        gp.moveTo(x+325, x+170);
        gp.lineTo(x+345, y+210);
        gp.lineTo(x+365, y+225);
        gp.moveTo(x+325, y+170);
        gp.lineTo(x+325, y+240);
        gp.lineTo(x+315, y+280);
        gp.lineTo(x+295, y+310);
        gp.lineTo(x+305, y+310);
        gp.moveTo(x+325, y+240);
        gp.lineTo(x+360, y+310);
        gp.lineTo(x+370, y+310);

        //gambar2
        Ellipse2D.Double kepala2 = new Ellipse2D.Double(x+300, y+100, 50, 50);

        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(x+325, y+150);
        gp2.lineTo(x+325, y+170);
        gp2.lineTo(x+310, y+170);
        gp2.lineTo(x+345, y+230);

        //kaki kiri
        gp2.moveTo(x+325, y+170);
        gp2.lineTo(x+325, y+240);
        gp2.lineTo(x+350, y+270);
        gp2.lineTo(x+300, y+290);
        gp2.lineTo(x+300, y+300);

        //kaki kanan
        gp2.moveTo(x+325, y+240);
        gp2.lineTo(x+325, y+310);
        gp2.lineTo(x+335, y+310);

        g2.setColor(Color.white);
        if (v == 1){
            g2.draw(kepala);
            g2.fill(kepala);
            g2.draw(gp);
        }else {
            g2.draw(kepala2);
            g2.fill(kepala2);
            g2.draw(gp2);
        }

    }

    //method menggambar semak
    public void drawSemak(Graphics2D g2, int x, int y){

        g2.setColor(new Color(44, 133, 55));
        g2.setStroke(new BasicStroke(2.0f));
        GeneralPath gp =new GeneralPath();
        gp.moveTo(x, y);
        gp.quadTo(x+30, y-80, x+60, y-50);
        gp.quadTo(x+80, y-90, x+100, y-50);
        gp.quadTo(x+150, y-100, x+180, y-50);
        gp.quadTo(x+210, y-90, x+230, y-50);
        gp.quadTo(x+250, y-80, x+260, y-50);
        gp.quadTo(x+280, y-70, x+300, y-30);
        gp.quadTo(x+310, y-50, x+320, y);
        gp.lineTo(x, y);
        g2.draw(gp);
        g2.fill(gp);

    }

    //method menggambar tulisan
    public void drawTulisan(Graphics2D g2, int x, int y){
        Font font = new Font("Serif", Font.BOLD,55);
        FontRenderContext frc = g2.getFontRenderContext();
        GlyphVector gv = font.createGlyphVector(frc, "MUSHLIHTECH FOUNDATION");
        Shape glyph = gv.getOutline(x, y);
        g2.setStroke(new BasicStroke(3.0f));
        g2.draw(glyph);
        g2.setColor(Color.orange);
        g2.fill(glyph);

    }

    @Override
    public void run() {
        while (true){
            try{
                Thread.sleep(20);
            }catch (Exception e){}
        }
    }
}

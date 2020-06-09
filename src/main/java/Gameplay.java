import javax.swing.*;
import javax.swing.event.MenuKeyEvent;
import javax.swing.event.MenuKeyListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.Timer;



public class Gameplay extends JPanel implements KeyListener, ActionListener{
        private boolean play = false;
        private int score = 0;

        private int totalBricks = 21;

        private Timer timer;
        private int delay = 8;

        private int playerX = 310;

        private int ballposX = 120;
        private int ballposY = 350;
        private int ballXdir = -1;
        private int ballYdir = -2;

        public Gameplay() {
            addKeyListener(this);
            setFocusable(true);
            setFocusTraversalKeysEnabled(false);
            timer = new Timer(delay, this);
            timer.start();
        }


    public void paint(Graphics g){
        //background
        g.setColor(Color.BLUE);
        g.fillRect(1, 1, 692, 592);

        //borders
        g.setColor(Color.yellow);
        g.fillRect(0, 0, 3, 592);
        g.fillRect(0, 0, 692, 3);
        g.fillRect(691, 0, 3, 592);

        //paddle
        g.setColor(Color.darkGray);
        g.fillRect(playerX, 550, 100, 12);

        //ball
        g.setColor(Color.yellow);
        g.fillOval(ballposX, ballposY, 20, 20);

        g.dispose();

    }
    @Override
    public void actionPerformed(ActionEvent actionEvent) {
    timer.start();
    repaint();
    }

    public void menuKeyTyped(MenuKeyEvent menuKeyEvent) {}

    public void menuKeyReleased(MenuKeyEvent menuKeyEvent) {}


    public void menuKeyPressed(MenuKeyEvent menuKeyEvent) {

        if(menuKeyEvent.getKeyCode()== KeyEvent.VK_RIGHT);{
        if(playerX >= 600){
            playerX = 600;
        }else {
         moveRight();
        }
    }

        if(menuKeyEvent.getKeyCode()== KeyEvent.VK_LEFT);
        if(playerX < 10){
            playerX = 10;
        }else {
            moveLeft();
        }
    }

public void moveRight(){
        play= true;
        playerX += 20;

}
    public void moveLeft(){
        play= true;
        playerX -= 20;

    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()== KeyEvent.VK_RIGHT){
    if(playerX >=600){
        playerX = 600;
    }else{
        moveRight();
    }
        }
        if(e.getKeyCode()== KeyEvent.VK_LEFT){
            if(playerX < 10){
                playerX = 10;
            }else{
                moveLeft();
            }
        }
        }


    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }
}

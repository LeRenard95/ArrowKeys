import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class ArrowKeys {
    public ArrowKeys (){
        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JInternalFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setFocusable(true);

        JPanel panel = new JPanel();
        JLabel UP = new JLabel();
        JLabel DOWN = new JLabel();
        JLabel LEFT = new JLabel();
        JLabel RIGHT = new JLabel();

        panel.add(UP);
        panel.add(DOWN);
        panel.add(LEFT);
        panel.add(RIGHT);

        UP.setText("UP");
        DOWN.setText("DOWN");
        LEFT.setText("LEFT");
        RIGHT.setText("RIGHT");

        frame.addKeyListener(new KeyListener() {

            int upCount = 0;
            int downCount = 0;
            int rightCount = 0;
            int leftCount = 0;

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
            int keyCode = e.getKeyCode();
            switch (keyCode){
                case KeyEvent.VK_UP:
                    UP.setText("UP"+ Integer.toString(upCount++));
                    break;

                case KeyEvent.VK_DOWN:
                    DOWN.setText("DOWN"+ Integer.toString(downCount++));
                    break;

                case KeyEvent.VK_LEFT:
                    LEFT.setText("LEFT"+ Integer.toString(leftCount++));
                    break;

                case KeyEvent.VK_RIGHT:
                    RIGHT.setText("UP"+ Integer.toString(rightCount++));
                    break;
            }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        frame.add(panel);

    }
        public static void main(String[] args) {
        new ArrowKeys();

    }
}

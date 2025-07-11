package module_1.day.sixteen_additional_2.multi_threading;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MultiThreadedShootingGame {
    private static final int FRAME_WIDTH = 800;
    private static final int FRAME_HEIGHT = 600;
    private static final int TARGET_SIZE = 50;
    private static final int MAX_POSITION_X = FRAME_WIDTH - TARGET_SIZE;
    private static final int MAX_POSITION_Y = FRAME_HEIGHT - TARGET_SIZE;

    private static int targetX = 0;
    private static int targetY = 0;
    private static int targetSpeedX = 8;
    private static int targetSpeedY = 4;


    public static void main(String[] args) {
        SwingUtilities.invokeLater(MultiThreadedShootingGame::createAndShowGUI);
    }

    public static void createAndShowGUI() {
        JFrame frame = new JFrame("Multi-Threaded Shooting Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame.setLayout(null);

        JPanel gamePanel = new JPanel() {
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                drawTarget(g);
            }
        };

        gamePanel.setBounds(0, 0, FRAME_WIDTH, FRAME_HEIGHT);
        gamePanel.setOpaque(false);
        frame.add(gamePanel);

        gamePanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                shoot(e.getX(), e.getY());
            }
        });

        Thread thread = new Thread(() -> {
            while (true) {
                moveTarget();
                gamePanel.repaint();
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();

        frame.setVisible(true);

    }

    private static void moveTarget() {
        targetX += targetSpeedX;
        targetY += targetSpeedY;

        if (targetX > MAX_POSITION_X || targetX < 0) {
            targetSpeedX = -targetSpeedX;
        }
        if (targetY > MAX_POSITION_Y || targetY < 0) {
            targetSpeedY = -targetSpeedY;
        }
    }

    private static void shoot(int mouseX, int mouseY) {
        if (mouseX >= targetX && mouseX <= targetX + TARGET_SIZE &&
                mouseY >= targetY && mouseY <= targetY + TARGET_SIZE) {
            JOptionPane.showMessageDialog(null, "Hit !! Target at position: (" + targetX + ", " + targetY + ") ");
        } else {
            JOptionPane.showMessageDialog(null, "Miss !! Target at position: (" + targetX + ", " + targetY + ") ");
        }
    }

    private static void drawTarget(Graphics g) {
        g.setColor(Color.RED);
        g.fillOval(targetX, targetY, TARGET_SIZE, TARGET_SIZE);
    }


}

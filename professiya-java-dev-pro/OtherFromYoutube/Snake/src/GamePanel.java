import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class GamePanel extends JPanel implements ActionListener {

    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (SCREEN_HEIGHT * SCREEN_WIDTH) / UNIT_SIZE;
    static final int DELAY = 200;
    final int[] x = new int[GAME_UNITS];
    final int[] y = new int[GAME_UNITS];
    int bodyParts = 3;
    int applesEaten;
    int applesX;
    int applesY;
    char direction = 'R';
    boolean running = false;
    Timer timer;
    Random random;

    GamePanel() {
        random = new Random();
        this.setPreferredSize(new Dimension(SCREEN_WIDTH, SCREEN_HEIGHT));
        this.setBackground(Color.black);
        this.setFocusable(true);
        this.addKeyListener(new MyKeyAdapter());
        startGame();
    }

    public void startGame() {
        newApple();
        running = true;
        timer = new Timer(DELAY, this);
        timer.start();
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        if (running) {
            g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
            g.fillOval(applesX, applesY, UNIT_SIZE, UNIT_SIZE);

            for (int i = 0; i < bodyParts; i++) {
                if (i == 0) {
                    g.setColor(Color.green);
                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                } else {
                    //g.setColor(new Color(45, 180, 0));
                    g.setColor(new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255)));
//                    g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                    g.fillOval(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
                }
            }
            g.setColor(Color.green);
            g.setFont(new Font("Nautilus Pompilius", Font.BOLD, 40));
            FontMetrics metrics = getFontMetrics(g.getFont());
            g.drawString("Счёт: " + applesEaten,
                    (SCREEN_WIDTH - metrics.stringWidth("Счёт: " + applesEaten)) / 2, g.getFont().getSize());
        } else {
            gameOver(g);
        }
    }

    public void newApple() {
        applesX = random.nextInt(SCREEN_WIDTH / UNIT_SIZE) * UNIT_SIZE;
        applesY = random.nextInt(SCREEN_HEIGHT / UNIT_SIZE) * UNIT_SIZE;
    }

    public void move() {
        for (int i = bodyParts; i > 0; i--) {
            x[i] = x[i - 1];
            y[i] = y[i - 1];
        }

        switch (direction) {
            case 'U' -> y[0] = y[0] - UNIT_SIZE;
            case 'D' -> y[0] = y[0] + UNIT_SIZE;
            case 'L' -> x[0] = x[0] - UNIT_SIZE;
            case 'R' -> x[0] = x[0] + UNIT_SIZE;
        }
    }

    public void checkApple() {
        if ((x[0] == applesX) && (y[0] == applesY)) {
            bodyParts++;
            applesEaten++;
            newApple();
        }
    }

    public void checkCollisions() {
        //проверка, сталкивается ли голова с телом
        for (int i = bodyParts; i > 0; i--) {
            if ((x[0] == x[i]) && (y[0] == y[i])) {
                running = false;
                break;
            }
        }
        //проверка, касается ли голова левой границы
        if (x[0] < 0) {
            running = false;
        }
        //проверка, касается ли голова правой границы
        if (x[0] > SCREEN_WIDTH) {
            running = false;
        }
        //проверка, касается ли голова верхней границы
        if (y[0] < 0) {
            running = false;
        }
        //проверка, касается ли голова нижней границы
        if (y[0] > SCREEN_HEIGHT) {
            running = false;
        }

        if (!running) {
            timer.stop();
        }
    }

    public void gameOver(Graphics g) {
        //Счёт
        g.setColor(Color.red);
        g.setFont(new Font("Nautilus Pompilius", Font.BOLD, 40));
        FontMetrics metrics1 = getFontMetrics(g.getFont());
        g.drawString("Счёт: " + applesEaten,
                (SCREEN_WIDTH - metrics1.stringWidth("Счёт: " + applesEaten)) / 2, g.getFont().getSize());
        //Игра окончена
        g.setColor(Color.red);
        g.setFont(new Font("Nautilus Pompilius", Font.BOLD, 75));
        FontMetrics metrics2 = getFontMetrics(g.getFont());
        g.drawString("Лошара", (SCREEN_WIDTH - metrics2.stringWidth("Лошара")) / 2, SCREEN_HEIGHT / 2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (running) {
            move();
            checkApple();
            checkCollisions();
        }
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {
        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_LEFT:
                    if (direction != 'R') {
                        direction = 'L';
                    }
                    break;
                case KeyEvent.VK_RIGHT:
                    if (direction != 'L') {
                        direction = 'R';
                    }
                    break;
                case KeyEvent.VK_UP:
                    if (direction != 'D') {
                        direction = 'U';
                    }
                    break;
                case KeyEvent.VK_DOWN:
                    if (direction != 'U') {
                        direction = 'D';
                    }
                    break;
            }
        }
    }
}

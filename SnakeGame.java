import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;


public class SnakeGame extends JPanel implements ActionListener,KeyListener {
    @Override
    public void actionPerformed(ActionEvent e) {
        move();
        repaint();//this basically calls draw() over and over again.
         if(gameOver){
             gameLoop.stop();
         }
    }
    @Override
    public void keyPressed(KeyEvent e) {
    if(e.getKeyCode()== KeyEvent.VK_UP && velocityy!=1){
        velocityx=0;
        velocityy=-1;
    }
    else if (e.getKeyCode() == KeyEvent.VK_DOWN && velocityy!= -1){
        velocityx=0;
        velocityy=1;
    }
    else if (e.getKeyCode()== KeyEvent.VK_LEFT && velocityx!=1){
        velocityx =-1;
        velocityy= 0;
    }
    else if (e.getKeyCode() == KeyEvent.VK_RIGHT && velocityx!=-1){
        velocityx= 1;
        velocityy=0;
    }
    }
// we donot need keytyped and keyreleased!!!
    @Override
    public void keyTyped(KeyEvent e) {

    }
    @Override
    public void keyReleased(KeyEvent e) {

    }

    private class Tile {
        int x;
        int y;

        Tile(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    int boardWidth;
    int boardHeight;
    int tileSize = 25;
    // Snake
    Tile snakeHead;
    ArrayList<Tile> snakeBody;
    // Food
    Tile food;
    Random random;
    // Game logic
    Timer gameLoop;
    int velocityx;
    int velocityy;
    boolean gameOver=false;
    //scores
    int currentScore=0;
    int highestScore=0;
    final String SCORE_FILE = "highscore.txt";// here FINAL depicts that the variable value cannot be changed once it is assigned

    SnakeGame(int boardWidth, int boardHeight) {
        this.boardWidth = boardWidth;
        this.boardHeight = boardHeight;
        setPreferredSize(new Dimension(this.boardWidth, this.boardHeight));
        setBackground(Color.BLACK);
        addKeyListener(this);
        setFocusable(true);
        snakeHead = new Tile(5, 5);
        snakeBody= new ArrayList<Tile>();
        food = new Tile(10, 10);
        random = new Random();
        placeFood();

        velocityx=0;
        velocityy=0;

        gameLoop = new Timer(150, this); // Set timer to call actionPerformed every 100 ms
        gameLoop.start();
        loadHighestScore();
    }
    public boolean collision(Tile tile1,Tile tile2){
        return tile1.x ==tile2.x && tile1.y==tile2.y;
    }
    public void move(){
        //eating the food
        if(collision(snakeHead,food)){
            snakeBody.add(new Tile(food.x,food.y));
            placeFood();
        }
        //snake body
        for(int i=snakeBody.size()-1;i>=0;i--){
            Tile snakePart = snakeBody.get(i);
            if(i==0){
                snakePart.x= snakeHead.x;
                snakePart.y= snakeHead.y;
            }
            else {
                Tile prevSnakePart = snakeBody.get(i-1);
                snakePart.x= prevSnakePart.x;
                snakePart.y= prevSnakePart.y;
            }
        }
        //snakehead
        snakeHead.x+= velocityx;
        snakeHead.y+=velocityy;

        //game over condition
        for(int i=0; i<snakeBody.size(); i++){
            Tile snakePart =snakeBody.get(i);
            //collide with the snake head
            if (collision(snakeHead,snakePart)){
                gameOver=true;
            }
        }
        if(snakeHead.x*tileSize<0 || snakeHead.x*tileSize> boardWidth ||
           snakeHead.y*tileSize<0 || snakeHead.y*tileSize> boardHeight) {
            gameOver=true;
        }
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        draw(g);
    }

    public void draw(Graphics g) {
        // Grid
       // for (int i = 0; i < boardWidth / tileSize; i++) {
            // Draw vertical lines
          //  g.drawLine(i * tileSize, 0, i * tileSize, boardHeight);
            // Draw horizontal lines
            //g.drawLine(0, i * tileSize, boardWidth, i * tileSize);
        //}

        // Food
        g.setColor(Color.RED);
       // g.fillRect(food.x * tileSize, food.y * tileSize, tileSize, tileSize);
        g.fill3DRect(food.x * tileSize, food.y * tileSize, tileSize,tileSize,true);
        // Snake head
        g.setColor(Color.BLUE);
        //g.fillRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize);
        g.fill3DRect(snakeHead.x * tileSize, snakeHead.y * tileSize, tileSize, tileSize,true);
        //snake Body
        for(int i=0; i<snakeBody.size(); i++){
            Tile snakePart = snakeBody.get(i);
           // g.fillRect(snakePart.x*tileSize, snakePart.y*tileSize,tileSize,tileSize);
            g.fill3DRect(snakePart.x*tileSize, snakePart.y*tileSize,tileSize,tileSize,true);
        }

        //draw text for score and gamover

        g.setFont(new Font("Arial",Font.PLAIN,16));
        if (gameOver) {
            g.setColor(Color.red);
        g.drawString("GAME OVER: "+String.valueOf(snakeBody.size()),tileSize -16,tileSize );
        }
        else {
            g.drawString("Score: "+ String.valueOf(snakeBody.size()),tileSize -16, tileSize);
        }
        // score
        g.setColor(Color.BLUE);
        g.drawString("Score: " + currentScore, 40, 50);
        g.drawString("Highest Score: " + highestScore, 60, 65);
    }

    public void placeFood() {
        food.x = random.nextInt(boardWidth / tileSize);
        food.y = random.nextInt(boardHeight / tileSize);
        if (currentScore > highestScore) {
            highestScore = currentScore;
        }
    }
    public void loadHighestScore(){
        try (BufferedReader br=new BufferedReader(new FileReader(SCORE_FILE))){
            highestScore=Integer.parseInt(br.readLine());
            System.out.println("load highest score: " + highestScore);
        }
        catch(IOException e){
            // File not found or unable to read, start with a score of 0
            highestScore=0;
            System.out.println("highest score file not found. Starting with score 0.");
        }
    }
    public void saveHighestScore() {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(SCORE_FILE))) {
            bw.write(String.valueOf(highestScore));
            System.out.println("saved highest score: " + highestScore);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Snake Game");
        SnakeGame game = new SnakeGame(600, 600);
        frame.add(game);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        // Add a window listener to save the highest score when the game closes
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                game.saveHighestScore();
            }
        }
        );
    }
}


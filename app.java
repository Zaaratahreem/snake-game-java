import javax.swing.*;
public class app{
    public static void main(String[] args) {
        int boardwidth = 600;
        int boardheight = boardwidth;

        JFrame frame = new JFrame("Snake"); //here jframe will create the frame or  space for the snake to run.
        frame.setVisible(true); //jframe will be visible
        frame.setSize(boardwidth,boardheight); //frame height and width is given above 600
        frame.setLocationRelativeTo(null); // open the frame ate the centre of the screen
        frame.setResizable(false);// the frame size is fixed once it is run
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//frame will be closed only by the close cross on the right hand above.

        SnakeGame SnakeGame= new SnakeGame(boardwidth,boardheight);
        frame.add(SnakeGame);
        frame.pack();//this is used that all its content are at or above than the given size and not less than
        SnakeGame.requestFocus();
    }
}

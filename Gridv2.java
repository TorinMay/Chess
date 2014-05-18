// import java.awt.*;
// import javax.swing.*;
// import javax.swing.border.*;
// import java.awt.image.*;
// import java.io.*;
// import javax.imageio.*;

// public class Gridv2 {

//     private final JPanel gui = new JPanel(new BorderLayout(3, 3));
//     private JButton[][] squares = new JButton[8][8];
//     private JPanel chessBoard;
//     //private static final String COLS = "ABCDEFGH";

//     public static final int QUEEN = 0, KING = 1,
//             ROOK = 2, KNIGHT = 3, BISHOP = 4, PAWN = 5;
//     public static final int[] STARTING_ROW = {
//         ROOK, KNIGHT, BISHOP, KING, QUEEN, BISHOP, KNIGHT, ROOK
//     };

//     public static final int BLACK = 0, WHITE = 1;

//     Gridv2() {
//         initializeGui();
//     }

//     public final void initializeGui() {
//         // set up the main GUI
//         //gui.setBorder(new EmptyBorder(5, 5, 5, 5));
//        // JToolBar tools = new JToolBar();
//         //tools.setFloatable(false);
//         //gui.add(tools, BorderLayout.PAGE_START);

//         chessBoard = new JPanel(new GridLayout(0, 8));
//         chessBoard.setBorder(new LineBorder(Color.BLACK));
//         gui.add(chessBoard);


//         // create the chess board squares
//         Insets buttonMargin = new Insets(0,0,0,0);
//         for (int ii = 0; ii < squares.length; ii++) {
//             for (int jj = 0; jj < squares[ii].length; jj++) {
//                 JButton b = new JButton();
//                 b.setMargin(buttonMargin);
//                 // our chess pieces are 64x64 px in size, so we'll
//                 // 'fill this in' using a transparent icon..
//                 ImageIcon icon = new ImageIcon(
//                         new BufferedImage(64, 64, BufferedImage.TYPE_INT_ARGB));
//                 b.setIcon(icon);
//                 if ((jj % 2 == 1 && ii % 2 == 1)
//                         //) {
//                         || (jj % 2 == 0 && ii % 2 == 0)) {
//                     b.setBackground(Color.WHITE);
//                 } else {
//                     b.setBackground(Color.BLACK);
//                 }
//                 squares[jj][ii] = b;
//             }
//         }

//         //fill the chess board
//         /*
//         chessBoard.add(new JLabel(""));
//         // fill the top row
//         for (int ii = 0; ii < 8; ii++) {
//             chessBoard.add(
//                     new JLabel(COLS.substring(ii, ii + 1),
//                     SwingConstants.CENTER));
//         }
//         */
        
//         // fill the black non-pawn piece row
//         for (int ii = 0; ii < 8; ii++) {
//             for (int jj = 0; jj < 8; jj++) {
//               // switch (jj) {
//                    // case 0:
//                    //     chessBoard.add(new JLabel("" + (ii + 1),
//                    //             SwingConstants.CENTER));
//                    // default:
//                         chessBoard.add(squares[jj][ii]);
//                 }
//            // }
//         }
//     }

//     private final void setupNewGame() {
//         //message.setText("Make your move!");
//         // set up the black pieces
//         for (int ii = 0; ii < STARTING_ROW.length; ii++) {
//             squares[ii][0].setIcon(new ImageIcon(
//                     chessPieceImages[BLACK][STARTING_ROW[ii]]));
//         }
//         for (int ii = 0; ii < STARTING_ROW.length; ii++) {
//             squares[ii][1].setIcon(new ImageIcon(
//                     chessPieceImages[BLACK][PAWN]));
//         }
//         /*
//         // set up the white pieces
//         for (int ii = 0; ii < STARTING_ROW.length; ii++) {
//             squares[ii][6].setIcon(new ImageIcon(
//                     chessPieceImages[WHITE][PAWN]));
//         }
//         for (int ii = 0; ii < STARTING_ROW.length; ii++) {
//             squares[ii][7].setIcon(new ImageIcon(
//                     chessPieceImages[WHITE][STARTING_ROW[ii]]));
// 		}
// 		*/
//     }

//     public final JComponent getChessBoard() {
//         return chessBoard;
//     }

//     public final JComponent getGui() {
//         return gui;
//     }

//     public static void main(String[] args) {
//         Runnable r = new Runnable() {

//             @Override
//             public void run() {
//                 Grid gr = new Grid();

//                 JFrame f = new JFrame("Chess");
//                 f.setResizable(false);
//                 f.add(gr.getGui());
//                 f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//                 f.setLocationByPlatform(true);

//                 // ensures the frame is the minimum size it needs to be
//                 // in order display the components within it
//                 f.pack();
//                 // ensures the minimum size is enforced.
//                 f.setMinimumSize(f.getSize());
//                 f.setVisible(true);
//             }
//         };
//         SwingUtilities.invokeLater(r);
//     }

//     public void set(Point g, Piece l){
// 		//this.getSquare(g).set(l);
// 	}
// }
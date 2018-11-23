package com.devwolves.tests;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //import java.awt.*;
        //import java.awt.event.*;
        //
        //import javax.swing.*;
        //
        //public class ArbaBeShura extends JFrame
        //{
        //	public enum Type{red, blue, empty}
        //	public enum Turn{red,blue}
        //
        //	public Cell[][] matrix;
        //	public Turn turn;
        //	private JPanel panel;
        //	public static void main(String[] args)
        //	{
        //		new ArbaBeShura();
        //	}
        //
        //	public ArbaBeShura(){
        //		super("4 In a Row");
        //		this.matrix = new Cell[7][6];
        //
        //		this.turn = Turn.red;
        //		paint();
        //		setSize(400,400);
        //		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //		addWindowListener(new WindowAdapter(){
        //			public void windowClosing( WindowEvent we ){
        //				System.exit( 0 );
        //			}
        //		});
        //		setResizable(false);
        //		setVisible(true);
        //	}
        //
        //	public void paint(){
        //		this.panel = new JPanel();
        //		this.panel.setLayout(new GridLayout(6,7));
        //		for(int y=0; y<6; y++){
        //			for(int x=0; x<7; x++){
        //				Cell cell = createCell(x,y,Type.empty);
        //				this.matrix[x][y] = cell;
        //				this.panel.add(cell);
        //        		this.panel.validate();
        //			}
        //		}
        //		add(this.panel);
        //        validate();
        //	}
        //
        //	private Cell createCell(final int col, final int row, Type type) {
        //        final Cell c = new Cell(type);
        //        c.setOnClickListener(new MouseAdapter() {
        //
        //            @Override
        //            public void mousePressed(MouseEvent e) {
        //            	switch (ArbaBeShura.this.turn){
        //				case red:
        //					for(int y1 = 5; y1 >= 0; y1--){
        //						if(ArbaBeShura.this.matrix[col][y1].getType() == Type.empty){
        //							ArbaBeShura.this.matrix[col][y1].setType(Type.red);
        //							ArbaBeShura.this.turn = Turn.blue;
        //							break;
        //						}
        //					}
        //					break;
        //				case blue:
        //					for(int y1 = 5; y1 >= 0; y1--){
        //						if(ArbaBeShura.this.matrix[col][y1].getType() == Type.empty){
        //							ArbaBeShura.this.matrix[col][y1].setType(Type.blue);
        //							ArbaBeShura.this.turn = Turn.red;
        //							break;
        //						}
        //					}
        //					break;
        //            	}
        //            	checkIfWin();
        //            }
        //        });
        //        return c;
        //    }
        //
        //
        //	public static class Cell extends JPanel {
        //		Type type = Type.empty;
        //        public Cell(Type t) {
        //        	this.type = t;
        //        	switch(t){
        //        		case red:
        //        			this.setBackground(Color.RED);
        //        			break;
        //        		case blue:
        //        			this.setBackground(Color.BLUE);
        //        			break;
        //        		case empty:
        //        		default:
        //        			this.setBackground(Color.WHITE);
        //        	}
        //        	this.setBorder(BorderFactory.createLineBorder(Color.black));
        //        }
        //        public void setOnClickListener(MouseAdapter listener){
        //        	this.addMouseListener(listener);
        //        }
        //        public MouseListener[] getOnClickListener(){
        //        	return this.getMouseListeners();
        //        }
        //        public Type getType(){
        //        	return this.type;
        //        }
        //        public void setType(Type t){
        //        	this.type = t;
        //        	switch(t){
        //    		case red:
        //    			this.setBackground(Color.RED);
        //    			break;
        //    		case blue:
        //    			this.setBackground(Color.BLUE);
        //    			break;
        //    		case empty:
        //    		default:
        //    			this.setBackground(Color.WHITE);
        //    	}
        //        }
        //    }
        //	private void checkIfWin(){
        //		for(int y=0; y<6; y++){
        //			for(int x=0; x<7; x++){
        //				if(x+3<7){
        //					if(this.matrix[x][y].getType() == Type.red && this.matrix[x+1][y].getType() == Type.red && this.matrix[x+2][y].getType() == Type.red && this.matrix[x+3][y].getType() == Type.red){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x+1][y],this.matrix[x+2][y],this.matrix[x+3][y]});
        //					}
        //				}
        //				if(y+3<6){
        //					if(this.matrix[x][y].getType() == Type.red && this.matrix[x][y+1].getType() == Type.red && this.matrix[x][y+2].getType() == Type.red && this.matrix[x][y+3].getType() == Type.red){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x][y+1],this.matrix[x][y+2],this.matrix[x][y+3]});
        //					}
        //				}
        //				if(x+3<7 && y+3<6){
        //					if(this.matrix[x][y].getType() == Type.red && this.matrix[x+1][y+1].getType() == Type.red && this.matrix[x+2][y+2].getType() == Type.red && this.matrix[x+3][y+3].getType() == Type.red){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x+1][y+1],this.matrix[x+2][y+2],this.matrix[x+3][y+3]});
        //					}
        //				}
        //				if(x-3>=0 && y+3<6){
        //					if(this.matrix[x][y].getType() == Type.red && this.matrix[x-1][y+1].getType() == Type.red && this.matrix[x-2][y+2].getType() == Type.red && this.matrix[x-3][y+3].getType() == Type.red){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x-1][y+1],this.matrix[x-2][y+2],this.matrix[x-3][y+3]});
        //					}
        //				}
        //
        //
        //
        //				if(x+3<7){
        //					if(this.matrix[x][y].getType() == Type.blue && this.matrix[x+1][y].getType() == Type.blue && this.matrix[x+2][y].getType() == Type.blue && this.matrix[x+3][y].getType() == Type.blue){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x+1][y],this.matrix[x+2][y],this.matrix[x+3][y]});
        //					}
        //				}
        //				if(y+3<6){
        //					if(this.matrix[x][y].getType() == Type.blue && this.matrix[x][y+1].getType() == Type.blue && this.matrix[x][y+2].getType() == Type.blue && this.matrix[x][y+3].getType() == Type.blue){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x][y+1],this.matrix[x][y+2],this.matrix[x][y+3]});
        //					}
        //				}
        //				if(x+3<7 && y+3<6){
        //					if(this.matrix[x][y].getType() == Type.blue && this.matrix[x+1][y+1].getType() == Type.blue && this.matrix[x+2][y+2].getType() == Type.blue && this.matrix[x+3][y+3].getType() == Type.blue){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x+1][y+1],this.matrix[x+2][y+2],this.matrix[x+3][y+3]});
        //					}
        //				}
        //				if(x-3>=0 && y+3<6){
        //					if(this.matrix[x][y].getType() == Type.blue && this.matrix[x-1][y+1].getType() == Type.blue && this.matrix[x-2][y+2].getType() == Type.blue && this.matrix[x-3][y+3].getType() == Type.blue){
        //						endGame(new Cell[]{this.matrix[x][y],this.matrix[x-1][y+1],this.matrix[x-2][y+2],this.matrix[x-3][y+3]});
        //					}
        //				}
        //			}
        //		}
        //	}
        //
        //	private void endGame(Cell[] quadro){
        //		for(int y=0; y<6; y++){
        //			for(int x=0; x<7; x++){
        //				this.matrix[x][y].removeMouseListener(this.matrix[x][y].getOnClickListener()[0]);
        //			}
        //		}
        //		for(Cell c : quadro){
        //			c.setBackground(Color.BLACK);
        //		}
        //		Timer timer = new Timer(1000, new ActionListener(){
        //			public void actionPerformed(ActionEvent e)
        //			{
        //				setVisible(false);
        //				final JFrame victoryFrame = new JFrame("4 In a Row");
        //				JPanel victoryPanel = new JPanel();
        //				JLabel victoryLabel = new JLabel("<html><body><div style='text-align: center;'><span style='font-size:20px'>The "+(ArbaBeShura.this.turn == Turn.red ? "blue" : "red")+" player won the game!<br>Congratulations!</span></div></body></html>", JLabel.CENTER);
        //				JButton playAgainButton = new JButton("<html><body><span style='font-size:16px'>PLAY AGAIN</span></body></html>");
        //				playAgainButton.addActionListener(new ActionListener(){
        //					public void actionPerformed(ActionEvent e)
        //					{
        //						victoryFrame.setVisible(false);
        //						new ArbaBeShura();
        //					}
        //				});
        //				victoryPanel.add(victoryLabel);
        //				victoryPanel.add(playAgainButton);
        //				victoryPanel.setBackground(ArbaBeShura.this.turn == Turn.red ? new Color(130,177,255) : new Color(255,138,128));
        //				victoryFrame.add(victoryPanel, BorderLayout.CENTER);
        //				victoryFrame.setSize(400,200);
        //				victoryFrame.setResizable(false);
        //				victoryFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //				victoryFrame.addWindowListener(
        //					      new WindowAdapter()
        //					      {
        //					        public void windowClosing( WindowEvent we )
        //					        {
        //					          System.exit( 0 );
        //					        }
        //					      });
        //				victoryFrame.setVisible(true);
        //			}
        //		});
        //		timer.setRepeats(false);
        //		timer.start();
        //	}
        //}
    }
}

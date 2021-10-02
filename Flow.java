import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Flow extends JFrame implements ActionListener
{
  JButton btnDraw;
  JButton btnColor;
  DrawPanel canvas;
  JPanel panelBtn;
  JComboBox<String> colorBox;
  JComboBox<String> shapeBox;

  public static void main(String[] args)
  {
    new Flow();
  } //end main

  public Flow()
  {

    this.setLayout(new BorderLayout());

    String shapesList[]={" ", "Line", "Rectangle", "Oval", "Arc"};
    shapeBox = new JComboBox<>(shapesList);  

    btnDraw = new JButton("Draw");
    btnDraw.addActionListener(this);
    btnDraw.setVisible(true);

    String colorsList[]={"Black", "Red", "Blue", "Green"};
    colorBox = new JComboBox<>(colorsList);
    //colorBox.addActionListener(this);

    btnColor = new JButton("Change the color");
    btnColor.addActionListener(this);
    btnColor.setVisible(true);

    panelBtn = new JPanel();
    panelBtn.add(shapeBox);
    panelBtn.add(btnDraw);
    panelBtn.add(colorBox);
    panelBtn.add(btnColor);

    this.add(panelBtn, BorderLayout.NORTH);

    canvas = new DrawPanel();
    this.add(canvas, BorderLayout.CENTER);

    this.setSize(500, 450);
    this.setVisible(true);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  } //end constructor

  @Override
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource() == btnDraw)
    {
      canvas.setShape(shapeBox.getSelectedItem().toString());
      canvas.repaint();
    }
    else if(e.getSource() == btnColor)
    {
      if(colorBox.getSelectedItem() == "Black")
      {
        canvas.setColor(Color.BLACK); 
      }
      else if(colorBox.getSelectedItem() == "Red")
      {
        canvas.setColor(Color.RED);
      }
      else if(colorBox.getSelectedItem() == "Blue")
      {
        canvas.setColor(Color.BLUE);
      }
      else if(colorBox.getSelectedItem() == "Green")
      {
        canvas.setColor(Color.GREEN);
      }
      else
      {
        canvas.setColor(Color.YELLOW);
      }
    }
  } //end actionPerformed

} //end class def

class DrawPanel extends JPanel
{
  private Color col;
  private String shape;

  public static void main(String[] args)
  {
    DrawPanel dp = new DrawPanel();
    dp.setColor(Color.BLACK); 
  }

  public DrawPanel()
  {

  }

  @Override
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
 
    Color c = getColor();
    g.setColor(col);
 
    int width = (int)(Math.random() * 300);
    int height = (int)(Math.random() * 300);

    if(shape == "Line")
    {
      g.drawLine(150, 175, width, height);
    }
    else if(shape == "Rectangle")
    {
      g.drawRect(90, 90, width, height);
    }
    else if(shape == "Oval")
    {
      g.drawOval(90, 90, width, height);
    }
    else if(shape == "Arc")
    {
      int sAng = (int)(Math.random() * 360);
      int aAng = (int)(Math.random() * 360);
      g.drawArc(90, 90, width, height, sAng, aAng);
    }

  }//end paintComponent

  public Color getColor()
  {
    return col; 
  }

  public void setColor(Color btn)
  {
    col = btn;
  }

  public String getShape()
  {
    return shape;
  }

  public void setShape(String s)
  {
    shape = s;
  }
}//end DrawPanel

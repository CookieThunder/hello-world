/********************************************************
* Project: Bear.java
* Author: Yamal Marquez Cuevas
*
*/
import javax.swing.*;
import java.util.ArrayList;
public class Bear{

  private String MAKER; //bear´s manufacter
  private String TYPE;// type of bear

  public Bear(String maker, String type) {
    this.MAKER = maker;
    this.TYPE = type;
  }

  public void Display() {
    JOptionPane.showMessageDialog(null, MAKER + " " + TYPE);
  }

  public static void main(String[] args) {
    ArrayList<Bear> teddyBearStore = new ArrayList<Bear>();

    int opc=Integer.parseInt(JOPtionPane.showMessageDialog(null,"............MENU......\n 1.-Add Bear \n 2.-Search \n 3.-Remove \n 3.-Show all \n5.-Exit"));
    do{
      switch(opc){
        case 1:
        String maker=JOPtionPane.showInputDialog("Maker?");
        String type=JOPtionPane.showInputDialog("Type?");
        Bear winniePoo=new Bear(maker, type);
        teddyBearStore.add(winniePoo);
        break;
        case 2:
        int index=parseInt(JOPtionPane.showInputDialog("Index?"));
        JOPtionPane.showMessageDialog(null,teddyBearStore.get(index));
        break;
        case 3:
        index=Integer.parseInt(JOPtionPane.showInputDialog());
      }
  } while(opc != 5);
}
}

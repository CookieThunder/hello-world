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

  public void Menu() {
    JOptionPane.showInputDialog("---MENU--- \n1: ADD Bear \n2: SEARCH Bear \n3: REMOVE Bear \n4: SHOW Bears \n5: EXIT");
  }

  public static void main(String[] args) {
    ArrayList<Bear> teddyBearStore = new ArrayList<Bear>();

    int opc = Integer.parseInt(teddyBearStore.Menu());
    //int opc = Integer.parseInt(JOPtionPane.showInputDialog(null,"............MENU......\n1- Add Bear \n2- Search \n3- Remove \n4- Show all \n5- Exit"));
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

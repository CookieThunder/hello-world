 /***********************************************************
* Name: Yamal Marquez Cuevas                                 *
* Proyect: Terrain.java                                      *
* Description: this program calculed the terrain area        *
 ***********************************************************/
import java.util.Scanner;
 public class Terrain {
   public static void main(String[] args) {
     Scanner userData = new Scanner (System.in);
     double baseTrianguloyRectangulo;
     System.out.println("Enter triangle & rectangle Base");
     baseTrianguloyRectangulo = userData.nextDouble();
     double alturaTrianguloRectanguloUnidos;
     System.out.println("Enter the triangle & rectangle height");
     alturaTrianguloRectanguloUnidos = userData.nextDouble();
     double alturaRectangulo;
     System.out.println("Enter the rectangle height");
     alturaRectangulo = userData.nextDouble();
     double alturaTriangulo = alturaTrianguloRectanguloUnidos - alturaRectangulo;
     double areaTriangulo = alturaTriangulo * baseTrianguloyRectangulo / 2;
     double areaRectangulo = alturaRectangulo * baseTrianguloyRectangulo;
     double areaTotal = areaTriangulo + areaRectangulo;
     System.out.println("Features: ");
     System.out.println("-Triangulo: base " + baseTrianguloyRectangulo + " -altura " + alturaTriangulo + " -area " + areaTriangulo );
     System.out.println("-Rectangulo: base" + baseTrianguloyRectangulo + " -altura " + alturaRectangulo + " -area " + areaRectangulo);
     System.out.println("-Area total del terreno: " + areaTotal);
   }//end main
 }//emd class Terrain

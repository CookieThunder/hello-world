 /***********************************************************
* Name: Yamal Marquez Cuevas                                 *
* Proyect: Terrain.java                                      *
* Description: this program calculed the terrain area        *
 ***********************************************************/
 public class Terrain {
   public static void main(String[] args) {
     double baseTrianguloyRectangulo = 20;
     double alturaTrianguloRactanguloUnidos = 45;
     double alturaRectangulo = 30;
     double alturaTriangulo = alturaTrianguloRactanguloUnidos - alturaRectangulo;
     double areaTriangulo = alturaTriangulo * baseTrianguloyRectangulo / 2;
     double areaRectangulo = alturaRectangulo * baseTrianguloyRectangulo;
     double areaTotal = areaTriangulo + areaRectangulo;
     System.out.println("Features: ");
     System.out.println("-Triangulo: base " + baseTrianguloyRectangulo + " -altura " + alturaTriangulo + " -area " + areaTriangulo );
     System.out.println("-Rectangulo: base" + baseTrianguloyRectangulo + " -altura " + alturaRectangulo + " -area " + areaRectangulo);
     System.out.println("-Area total del terreno: " + areaTotal);
   }
 }

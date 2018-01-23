 /*****************************************************
* Name: Yamal Marquez Cuevas                           *
* Proyect: fourteen.java                               *
* Description: this program calculed the area          *
 *****************************************************/
 public class fourteen {
   public static void main(String[] args) {
     final double PI = 3.1415926535897932384626433;
     double radioAndBase = 2;//Base del triangulo rectangulo y radio
     double hipotenusa = 4;//Hipotenusa del triangulo
     double altura = Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(radioAndBase,2));//Fórmula para hallar el cateto faltante
     double areaTriangulo = radioAndBase * altura;//No dividí entre 2 porque son dos triangulos rectangulos, que forman un rectangulo
     double areaCircular = (Math.pow(radioAndBase, 2) * PI) / 2;// Area del Circulo
     double areaTotal = areaTriangulo + areaCircular;//Area total de la figura
     System.out.println("-Radio y Base: " + radioAndBase + " -Hipotenusa: " + hipotenusa + " -Cateto (altura): " + altura );
     System.out.println("-Area del triangulo: " + areaTriangulo);
     System.out.println("-Area del Circulo: " + areaCircular);
     System.out.println("-Area Total de la figura: " + areaTotal);
   }
 }

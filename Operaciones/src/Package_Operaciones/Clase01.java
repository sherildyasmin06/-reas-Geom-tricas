package Package_Operaciones;

public class Clase01 {
	
 public double Factorial(int xnumero){
	double xfact=1;
	int ynumero=xnumero;
	for (int i=1;i<=ynumero;i++){
		xfact*=i;
	}
	return xfact;
    }
 
 public double Trapecio(int xbmenor, int xbmayor, int xaltura){
	 double yareatrapecio=0;
	 if(xbmenor>=xbmayor){
		 yareatrapecio=0;
	 }else{
		 yareatrapecio=(((xbmenor+xbmayor)/2)*xaltura);
	 }
	 return yareatrapecio;
 }
 public double Promedio(int x1,int x2, int x3){
	 double ypromedio=((x1+x2+x3)/3);
	 return ypromedio;
	 	 
 }
 public String Observacion(double vpromedio){
	 String cadena="";
	 if(vpromedio>=0&& vpromedio<5){
		 cadena="A CARGO";
	 }else{
		 if(vpromedio>=5&&vpromedio<10.5){
			 cadena="REPITENTE";
		 }else{
			 if(vpromedio>=10.5&&vpromedio<15){
				 cadena="REGULAR";
			 }else{
				 if(vpromedio>15&&vpromedio<17){
					 cadena="BUENO";
				 }else{
					 if(vpromedio>=17&&vpromedio<20){
						 cadena="EXCELENTE"; 
					 } 
				 }
			 }
		 }
	 }return cadena;
 }
 public double Triangulo(int xtbase, int xtaltura){
	 
	 double yareatriangulo=0;

	yareatriangulo=((xtbase*xtaltura)/2);
	
	 return yareatriangulo;
  }
}
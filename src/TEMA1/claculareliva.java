package TEMA1;

public class claculareliva {
   
	public static void main(String[] args) {
		   // TODO Auto-generated method stub 
		
		int iva = 21;
		double precio = 100;
		
		System.out.println("El precio sin iva es:"+precio);
		System.out.println("IVA: "+iva);
		precio = precio+ precio*iva/100;
		System.out.println("Precio con IVA: "+precio);
	}
}

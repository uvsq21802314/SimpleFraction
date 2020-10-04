public class Fraction {

	private int numerateur;
	private int denominateur;

	public Fraction (int n,int m){
		this.numerateur=n;
		this.denominateur=m;
	}
	public String toString(){
		return "numerateur = "+this.numerateur+" denominateur = "+this.denominateur;
	}
}
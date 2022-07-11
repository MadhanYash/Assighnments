package mypack;

public class hcf {
	public static int Hcf(int a,int b) {
		int g=0;
		for(int i=1;i<=a||i<b;i++) {
			if(a%i==0&&b%i==0)
				g=i;
			
		}
		return g;
	}

}

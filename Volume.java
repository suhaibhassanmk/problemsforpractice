package hackerrankprograms;

public class Volume {
	double l,b,w;
	Volume(double length,double breadth,double width){
		l=length;
		b=breadth;
		w=width;
	}
	double volume() {
		return(l*b*w);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Volume b=new Volume(9,3,4);
		System.out.println(b.volume());
		
	}

}
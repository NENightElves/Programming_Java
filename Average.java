interface Average_inter{
	double average();
}

class Average1 implements Average_inter{
	int[] a;
	public Average1(int[] a){
			this.a=a;
	}
	public double average(){
		int s=0;
		for(int i=0;i<=a.length-1;i++)
			s+=a[i];
		return s/a.length;
	}
}

class Average2 implements Average_inter{
	int[] a;
	public Average2(int[] a){
			this.a=a;
	}
	public double average(){
		int s=0;
		int min=a[0],max=a[0];
		for(int i=0;i<=a.length-1;i++)
		{
			s+=a[i];
			if (min>a[i]) a[i]=min;
			if (max<a[i]) a[i]=max;
		}
		return (s-max-min)/a.length;
	}
}

class Average3 implements Average_inter{
	int[] a;
	int[] b;
	public Average3(int[] a,int[] b){
			this.a=a;
			this.b=b;
	}
	public double average(){
		int s=0;
		for(int i=0;i<=a.length-1;i++)
			s+=a[i]*b[i];
		return s/a.length;
	}
}


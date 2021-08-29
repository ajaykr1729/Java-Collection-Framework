//by Ajay Kumar
public class Prac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countPunct();
	

	}
	public static void countPunct(){
		String str="i live in @asansol #";
		int pun=0;
		int normal=0;
		for(char c:str.toLowerCase().toCharArray()){
			if(c==' ')
				continue;
		if((int)c<97 || (int)c>(122))
		 pun++;
		
		else
			normal++;
	}
		System.out.println("normal-> "+normal+" punctuations-> "+pun );
		

}
	
}
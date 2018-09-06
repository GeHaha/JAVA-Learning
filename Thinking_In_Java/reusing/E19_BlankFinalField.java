class WithBlankFinalField{
	private final Integer i;
}
public WithBlankFinalField(int ii){
	i = new Integer(ii);
}
public Integer geti(){
	return i ;
	}
public class E19_BlankFinalField{
	public static void main(String[] args){
		WithBlankFinalField wbff = new WithBlankFinalField(10);
			System.out.println(wbff.geti());
	}
}
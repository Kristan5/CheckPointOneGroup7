package absyn;

public class ArrayDec extends VarDec {
    public IntExp size;
    public int pos; 
	public ArrayDec(int pos, Type type, String name, IntExp size){
		this.pos = pos;
		this.type = type;
		this.name = name;
		this.size = size;
	}  
}

import java.util.*;

class CDMException extends Exception{
	String msg;
	
	CDMException(String msg){
		super(msg);
		this.msg = msg;
	}
	
	public String toString(){
		return msg;
	}


}
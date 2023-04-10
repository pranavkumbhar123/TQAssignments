package demo2;

public class Department {

	private int dId;
	private String dname;
	
	public Department()
	{
		
	}
	public Department(int dId, String dname) {
	
		this.dId=dId;
		this.dname=dname;
	}
	public void setDId(int dId)
	{
		this.dId=dId;
	}
	public int getDId()
	{
		return dId;
	}
	public void setName(String dname)
	{
		this.dname=dname;
	}
	public String getName()
	{
		return dname;
	}
	
	public String toString()
	{
		return "Department:"+dId+" "+dname;
	}
	
}

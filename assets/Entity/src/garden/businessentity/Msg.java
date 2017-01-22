package garden.businessentity;

public class Msg {
	private String type;
	private String name;
	
	public Msg(){
		super();
	}
	
	public Msg(String name, String type){
		this.name = name;
		this.type = type;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
}
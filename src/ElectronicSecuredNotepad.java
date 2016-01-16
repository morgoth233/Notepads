
public class ElectronicSecuredNotepad extends SecuredNotepad implements IÅlectronicDevice{
	
	public String state = "Off";
	
	ElectronicSecuredNotepad(String title, int pageCount, String password) {
		super(title, pageCount, password);
		
	}

	@Override
	public void start() {
		this.state = "On";		
	}

	@Override
	public void stop() {
		this.state = "Off";	
	}

	@Override
	public String isStarted() {
		return state;
	}

}

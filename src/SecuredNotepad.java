import java.util.Scanner;

public class SecuredNotepad extends SimpleNotepad implements INotepad {

	private String password;
	
	private String getPassword() {
		return password;
	}

	SecuredNotepad(String title, int pageCount, String password) {
		super(title, pageCount);
		this.password = password;
	}

	@Override
	public void addTextToPage(int pageNumber, String content) {
		TurnOnIfElectronic();
		if (passwordCheck()) {
			super.addTextToPage(pageNumber, content);
		}
	}

	@Override
	public void replaceText(int pageNumber, String content) {
		TurnOnIfElectronic();
		if (passwordCheck()) {
			super.replaceText(pageNumber, content);
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		TurnOnIfElectronic();
		if (passwordCheck()) {
			super.deleteText(pageNumber);
		}
	}

	@Override
	public void readNotepad() {
		TurnOnIfElectronic();
		if (passwordCheck()) {
			super.readNotepad();
		}
	}
	
	public void TurnOnIfElectronic(){
		if (this instanceof ElectronicSecuredNotepad) {
			if (((ElectronicSecuredNotepad)this).state.equals("Off")) {
				((ElectronicSecuredNotepad) this).start();
			}
		}
	}

	private boolean passwordCheck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password for " + this.title);
		String pass = sc.nextLine();
		if (this.getPassword().equals(pass)) {
			return true;
		} else {
			System.out.println("Wrong password!");
			return false;
		}
		
	}

	@Override
	public void searchWord(String word) {
		TurnOnIfElectronic();
		if (passwordCheck()) {
			super.searchWord(word);
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		TurnOnIfElectronic();
		if (passwordCheck()) {
			super.printAllPagesWithDigits();
		}

	}

	

	
	
}

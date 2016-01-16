
public class Page {
	
	protected String title;
	protected String text;
	
	Page(){
		this.text = "";
		this.title = "";
	}
		
	public void addText(String text) {
		this.text += text;
	}
	public void deleteText() {
		this.text = "";
		this.title = "";
	}
	public void readPage() {
		System.out.println(this.title);
		System.out.println(this.text);
	}
	
	protected boolean containsDigits(){
		if (this.text.matches(".*\\d+.*")) {
			return true;
		}else{
			return false;
		}
	}

	public boolean searchWord(String word) {
		return this.text.contains(word);
	}


	
}

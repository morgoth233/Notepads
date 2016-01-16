
public interface INotepad {
	
	void replaceText(int pageNumber, String content);
	void deleteText(int pageNumber);
	void readNotepad();
	void addTextToPage(int pageNumber, String content);
	void searchWord(String word);
	void printAllPagesWithDigits();
}

public class SimpleNotepad implements INotepad {

	protected String title;
	protected Page[] pages;

	SimpleNotepad(String title, int pageCount) {
		this.title = title;
		this.pages = new Page[pageCount];
		//pages start from zero
		for (int i = 0; i < pages.length; i++) {
			this.pages[i] = new Page();
			this.pages[i].title = "Page " + String.valueOf(i);
		}
	}

	@Override
	public void addTextToPage(int pageNumber, String content) {
		if (pageNumber < this.pages.length) {
			this.pages[pageNumber].addText(content);
		} else {
			System.out.println("Page not found");
		}

	}

	@Override
	public void replaceText(int pageNumber, String content) {
		if (pageNumber < this.pages.length) {
			this.pages[pageNumber].text = content;
		} else {
			System.out.println("Page not found");
		}
	}

	@Override
	public void deleteText(int pageNumber) {
		if (pageNumber < this.pages.length) {
			System.out.println("Deleting text on Page " + pageNumber);
			this.pages[pageNumber].text = "";
		}
	}

	@Override
	public void readNotepad() {
		System.out.println("Reading " + this.title);
		for (int i = 0; i < this.pages.length; i++) {
			if (pages[i].text.equals("")) {
				continue;
			}
			pages[i].readPage();
		}

	}
	
	@Override
	public void searchWord(String word) {
		System.out.println("Searching for " + word + " in " + this.title);
		boolean found = false;
		for (int i = 0; i < this.pages.length; i++) {
			if (this.pages[i].searchWord(word)) {
				System.out.println(word + " se sydyrja v: " + pages[i].title);
				found = true;
			}
		}
		if (!found) {
			System.out.println("ne e namerena takava duma v tetradkata");
		}
	}

	@Override
	public void printAllPagesWithDigits() {
		System.out.println("Seraching for pages with digits in " + this.title);
		for (int i = 0; i < this.pages.length; i++) {
			if (this.pages[i].containsDigits()) {
				System.out.println(this.pages[i].title);
			}
		}

	}

}


public class Demo {

	public static void main(String[] args) {
		
		Page stranica = new Page();
		stranica.addText("stranica bez title");
		
		SimpleNotepad knijka = new SimpleNotepad("obiknovenna tetradka", 10);
		knijka.addTextToPage(1, "Imalo edno vreme");
		knijka.addTextToPage(2, "V edna dalechna strana");
		knijka.addTextToPage(9, "I 3-ri dena qli, pili i se veselili");
		knijka.pages[5] = stranica;
		knijka.readNotepad();
		knijka.searchWord("pili");
		knijka.printAllPagesWithDigits();
		
		SecuredNotepad sigurnaknijka = new SecuredNotepad("tetradka s parola", 10, "pass");
//		sigurnaknijka.pages[1]=knijka.pages[1];
//		sigurnaknijka.addTextToPage(2, "taen tekst");
//		sigurnaknijka.pages[2].readPage();		
//		sigurnaknijka.replaceText(2, "zamesten tekst");
//		sigurnaknijka.readNotepad();
		
		ElectronicSecuredNotepad elkniga = new ElectronicSecuredNotepad("elektronna knijka", 10,"qwerty");
		System.out.println(elkniga.state);
		elkniga.addTextToPage(3, "Tekst na stranica 3 ot elektronnata knijka s parola");
		System.out.println(elkniga.state);
		elkniga.readNotepad();
	

	}

}

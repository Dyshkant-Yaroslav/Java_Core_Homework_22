package ua.lviv.desctop.pt3;

public class Main {

	public static void main(String[] args) {

		Amphibia frog = act -> System.out.println(act);
		frog.doSomething("Eaaaaaating");
		frog.doSomething("Sleeeping");
		frog.doSomething("Swimmmmming");
		frog.doSomething("Wallllking");
	}

}

interface Amphibia {
	void doSomething(String action);
}

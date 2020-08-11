package ua.lviv.desctop.pt1;

public class Main {

	public static void main(String[] args) {
		PatVoice cow = voiced -> System.out.println("I am a " + voiced);
		PatVoice cat = voiced -> System.out.println("I am a " + voiced);
		PatVoice dog = voiced -> System.out.println("I am a " + voiced);
		cow.voice("cow : Muuuuuuu");
		cat.voice("cat : Meooooow");
		dog.voice("dog : Gaaaaaav");
	}

}

interface PatVoice {
	void voice(String voice);
}

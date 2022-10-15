package stringsDemo;

public class Main {

	public static void main(String[] args) {
		String mesaj = "bugun hava cok guzel.";
		System.out.println(mesaj);

		System.out.println("eleman sayisi : " + mesaj.length());
		System.out.println("5. eleman: " + mesaj.charAt(4));
		System.out.println(mesaj.concat("yasasın!"));
		System.out.println(mesaj.startsWith("a"));
		System.out.println(mesaj.endsWith("."));
		char[] karakterler = new char[5];
		mesaj.getChars(0, 5, karakterler, 0);
		System.out.println(karakterler);
		System.out.println(mesaj.indexOf("av"));
		System.out.println(mesaj.lastIndexOf("a"));
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj);
		System.out.println(mesaj.substring(2,5));
		for(String kelime : mesaj.split(" ")) {
			System.out.println(kelime);
			
		}
		System.out.println(mesaj.toUpperCase());
		System.out.println(mesaj.trim());
	}
	{
		String mesaj = "bugun hava cok guzel.";
		char[] karakterler;
		System.out.println(mesaj);
		System.out.println(mesaj.replace(" ", "-"));
		System.out.println(mesaj);
		String yeniMesaj = mesaj.replace(" ", "-");
		System.out.println(yeniMesaj);
		System.out.println(mesaj.substring(2));
	}
}

package other;
class ChattingApps{
	String name;
	long number;
	double marks;
	String about;
}
public class SocialMedia {
	
	public static void main(String[] args) {
		ChattingApps whatsapp=new ChattingApps();
		
		whatsapp.name="𝐏𝐫𝐚𝐬𝐚𝐧𝐧𝐚 𝐊𝐮𝐦𝐚𝐫 🥰";
		whatsapp.number=+919963961371l;
		whatsapp.about="𝙿𝚞𝚝 𝙾𝚗 𝙰 𝙷𝚊𝚙𝚙𝚢 𝙵𝚊𝚌𝚎...🎭";
		
		System.out.println("Name 	= "+whatsapp.name);
		System.out.println("Number 	= "+whatsapp.number);
		System.out.println("About 	= "+whatsapp.about);
	}
}
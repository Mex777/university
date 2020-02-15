import java.util.Scanner;
public class main {
	public static void main(String[] args) {
		university[] lista = new university[8]; 
		for (int i=0; i<8; i++)
			lista[i] = new university();
		lista[0].setName("KEA");
		lista[0].setCountry("Denmark");
		lista[0].setCity("Copenhagen");
		lista[0].setDegree("Computer Science");
		lista[0].setPrice("0");
		lista[0].setDuration("4", "240");
		lista[0].setEnglish("false");
		lista[0].setKeyInfo("W.I.P");
		lista[0].setTotal(lista[0]);

		lista[1].setName("University of Gothenburg");
		lista[1].setCountry("Sweden");
		lista[1].setCity("Gothenburg");
		lista[1].setDegree("Software Engineeering and Management");
		lista[1].setPrice("0");
		lista[1].setDuration("3", "180");  
		lista[1].setEnglish("true");
		lista[1].setKeyInfo("W.I.P");
	    lista[1].setTotal(lista[1]);

	    lista[2].setName("HAMK");
		lista[2].setCountry("Finland");
		lista[2].setCity("Häme");
		lista[2].setDegree("Business Administration, Computer Applications");
		lista[2].setPrice("0");
		lista[2].setDuration("3.5", "210");  
		lista[2].setEnglish("false");
		lista[2].setKeyInfo("Possible jobs:  Software Developer/Engineer, Application Designer/Developer, Digital Business Analyst, Systems Developer, Programmer, Web Developer, Application Developer, Game Programmer, User Interface Designer, Project Manager, IT Specialist, Entrepreneur, AR/VR Developer, Data Analyst, AI Programmer.");
	    lista[2].setTotal(lista[2]);

	    lista[3].setName("Linnaeus University");
		lista[3].setCountry("Sweden");
		lista[3].setCity("Växjö");
		lista[3].setDegree("Bachelor of Science with specialization in Software Technology.\nMain field of study: Computer Science.");
		lista[3].setPrice("0");
		lista[3].setDuration("3", "180"); 
		lista[3].setEnglish("true");
		lista[3].setKeyInfo("6th largest listaversity in Sweden in terms of number of students.\nA first job will likely mean that you work as programmer within a larger organization. You may then go on to work as project manager, consultant or educator. Regardless of where you work, you will probably be working in a team with other persons. The IT world is global, so work abroad may be just as likely as work in Sweden. ");
	    lista[3].setTotal(lista[3]);

	    lista[4].setName("UCN");
		lista[4].setCountry("Denmark");
		lista[4].setCity("Aalborg");
		lista[4].setDegree("Academy Profession in Computer Science + specialization in Software Developement");
		lista[4].setPrice("0");
		lista[4].setDuration("4", "240"); 
		lista[4].setEnglish("false");
		lista[4].setKeyInfo("Based on C# and Java.\nPossible jobs: programmer, systems developer, web developer, network administrator, IT consultant or game developer, project manager,\nsoftware engineer, software developer, system constructor, system designer, systems planner");
	    lista[4].setTotal(lista[4]);

	    lista[5].setName("Vrije University of Amsterdam");
		lista[5].setCountry("Netherlands");
		lista[5].setCity("Amsterdam");
		lista[5].setDegree("Computer Science");
		lista[5].setPrice("2000");
		lista[5].setDuration("3", "180");
		lista[5].setEnglish("true");
		lista[5].setKeyInfo("Cultural advantage.\nIs consistently listed among the world's top listaversities in various rankings.\nHelps you with housing, visas and the administrative side of studying in the Netherlands.");
	    lista[5].setTotal(lista[5]);

	    lista[6].setName("TUNI");
		lista[6].setCountry("Finland");
		lista[6].setCity("Tampere");
		lista[6].setDegree("Software Engineering");
		lista[6].setPrice("0");
		lista[6].setDuration("4", "240");
		lista[6].setEnglish("false");
		lista[6].setKeyInfo("Possible jobs: Software Engineer, Software Developer, Software Architect, Software Consultant, Data Engineer, Web Application Developer, Web Programmer and Mobile Application Developer.\nStudy contents: Programming Languages (C++, Java, Javascript, etc.) , Web Development (Frontend, Backend, APIs, etc.), User Interfaces, Usability and UX, Software Architectures and Engineering,  Data Analytics and Machine Learning, Software Projects");
	    lista[6].setTotal(lista[6]);

	    lista[7].setName("VIA University College");
		lista[7].setCountry("Denmark");
		lista[7].setCity("Viborg/Horsens");
		lista[7].setDegree("Software Technology");
		lista[7].setPrice("0");
		lista[7].setDuration("3.5", "210");
		lista[7].setEnglish("false");
		lista[7].setKeyInfo("5th semester it’s an internship");
	    lista[7].setTotal(lista[7]);

	    int numar=1;
	    for (int i=0; i<8; i++) {
	    	System.out.println(numar + ". " + lista[i].getName());
	    	numar++;
	    } 
	    System.out.print("Choose your university: ");
	    Scanner input = new Scanner(System.in);
	    int varianta = input.nextInt();
	    varianta--;
	    System.out.print(" 1.Name \n 2.Country \n 3.City \n 4.Degree \n 5.Price \n 6.Duration and Points \n 7.English Profiecency \n 8.General Information \n 9.Total \n");
	    System.out.print("Choose the number to get the information, you can pick for how many times you want. \nIf you want to stop press 0.");
	    int nrInfo = input.nextInt();
	    while (nrInfo!=0) { 
	    	switch (nrInfo) {
	    		case 1: System.out.println(lista[varianta].getName());
	    		break;
	    		case 2: System.out.println(lista[varianta].getCountry());
	    		break;
	    		case 3: System.out.println(lista[varianta].getCity());
	    		break;
	    		case 4: System.out.println(lista[varianta].getDegree());
	    		break;
	    		case 5: System.out.println(lista[varianta].getPrice());
	    		break;
	    		case 6: System.out.println(lista[varianta].getDuration());
	    		break;
	    		case 7: System.out.println(lista[varianta].getEnglish());
	    		break;
	    		case 8: System.out.println(lista[varianta].getKeyInfo());
	    		break;
	    		case 9: System.out.println(lista[varianta].getTotal());
	    		break;
	    		default: System.out.println("Your number is invalid, try again");
	    		break;
	    	}
	    	nrInfo = input.nextInt();
	    } 
	}
}
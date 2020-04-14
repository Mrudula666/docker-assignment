import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class CreateFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("filename.txt");
      if (myObj.createNewFile()) {
        try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("The name of the city, deriving from Latin forms Venetia and Venetiae, is most likely taken from "Venetia et Histria", the Roman name of Regio X of Roman Italy, but applied to the coastal part of the region that remained under Roman Empire outside of Gothic, Lombard, and Frankish control. The name Venetia, however, derives from the Roman name for the people known as the Veneti, and called by the Greeks Enetoi (Ἐνετοί). The meaning of the word is uncertain, although there are other Indo-European tribes with similar-sounding names, such as the Celtic Veneti and the Slavic Vistula Veneti. Linguists suggest that the name is based on an Indo-European root *wen ("love"), so that *wenetoi would mean "beloved", "lovable", or "friendly". A connection with the Latin word venetus, meaning the color 'sea-blue', is also possible. Supposed connections of Venetia with the Latin verb venire (to come), such as Marin Sanudo's veni etiam ("Yet, I have come!"), the supposed cry of the first refugees to the Venetian lagoon from the mainland, or even with venia ("forgiveness") are fanciful. The alternative obsolete form is Vinegia [viˈnɛːdʒa];[18] (Venetian: Venèxia [veˈnɛzja]; Latin: Venetiae; Slovene: Benetke; Croatian: Venecija).");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
			} catch (IOException e) {
					System.out.println("An error occurred.");
					e.printStackTrace();
    }
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}

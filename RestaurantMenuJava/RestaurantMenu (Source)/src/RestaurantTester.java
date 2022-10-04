import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class RestaurantTester {


	public static void main(String[] args) throws FileNotFoundException {
		
		try{
			
			String PassString = (JOptionPane.showInputDialog("Please enter a password: "));
			Boolean PassBool = false;
			while (PassBool == false) {
				Scanner PassRead = new Scanner(new File ("Password.txt"));
				while(PassRead.hasNext()) {
					String CurrentPass = PassRead.next();
					System.out.println(CurrentPass);
					System.out.println(PassString + "\n");
					if(CurrentPass.equals(PassString)) {
						PassBool = true;
						break;
					}
			
				}
			if(PassBool == false)
				PassString = (JOptionPane.showInputDialog("Incorrect Password Please enter a valid password"));
			}
			
			MainFrame guiFrame = new MainFrame(new File ("Menu.txt"));
		}
		
		
		catch(FileNotFoundException e) {
			JOptionPane.showMessageDialog(null,"Error! Menu File not found!", "Please reinput", JOptionPane.ERROR_MESSAGE);
		}
		catch(Exception e) {
		
			JOptionPane.showMessageDialog(null, "Error! Program terminated"
					 , " Error", JOptionPane.ERROR_MESSAGE);
			//System.out.print(e);
		}
		
		
	}

}
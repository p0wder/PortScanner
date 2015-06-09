import java.net.Socket;
import java.util.Scanner;

/**
* @author: Scott C Gramig
* @program: Simple port scanner that tells if a port on a host is open.
*/

public class PortScanner {
	private static String host;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Host IP (ex. 127.0.0.1): ");
		host = in.nextLine();
		
		System.out.println();
		// scans ports i through 10001.  change the values of i or 10001 to scan a different range
		for(int i = 1; i < 10001; i++){
			try {
				Socket socket = new Socket(host, i);
				System.out.println("Port " + i + " is open....");
				socket.close();
			} catch (Exception e){
				//System.out.println("Port " + i + " is not open....");
			}
		}
	}

}

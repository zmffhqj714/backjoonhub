import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		String a = br.readLine();
		int b = Integer.parseInt(a);
		String sum = "";
		for (int i = 1; i <= b; i++) {
//			String c = br.readLine();

			sum += "*";

			bw.write(sum + "\n");

		}

		bw.flush();
		bw.close();

	}
}

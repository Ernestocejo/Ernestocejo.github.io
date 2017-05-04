import java.io.*;

public class Lector {
	private String dato = "";
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public String leeString() {
		try{
			this.dato = br.readLine();
		}catch (IOException e) {}

		return this.dato;
	}

	public float leeFloat() {
		try{
			return Float.valueOf(br.readLine());
		} catch (IOException e) {}

		return 0.0F;
	}

	public int leeInt() {
		try{
			return Integer.valueOf(br.readLine());
		} catch (IOException e) {}

		return 0;
	}
}
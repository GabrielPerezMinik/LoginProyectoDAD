package login;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Escribir {

	static RandomAccessFile fileram;
	
	final static int TAMANOREGISTRO = 45;
	
	public void EscribirUsuario(String nombre,String contrasena) throws IOException {
	fileram.seek(0);
	int autoIncremento = fileram.readInt();
	if(fileram.readInt()==' '){
		fileram.writeInt(1);
		fileram.writeChar(',');
		fileram.writeChars("usuario:");
		fileram.writeChars(nombre);
		fileram.writeChar(',');
		fileram.writeChars("contrasena:");
		fileram.writeChars(contrasena);
		fileram.writeChar(',');
	}
	else{
		fileram.seek(fileram.length());
		fileram.writeInt(autoIncremento+1);
		fileram.writeChar(',');
		fileram.writeChars("usuario:");
		fileram.writeChars(nombre);
		fileram.writeChar(',');
		fileram.writeChars("contrasena:");
		fileram.writeChars(contrasena);
		fileram.writeChar(',');
	}
	
	}
}

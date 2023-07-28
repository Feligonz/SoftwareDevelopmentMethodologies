import java.util.ArrayList;

public class Cooperativa {

	// ArrayList<>

	private ArrayList<SolicitudRetiro> solicitudes;
	private CarteleraVirtual cartelera;

	private String Secretaria, password; // Referente a usuario y contraseña de secretaria
	private float x, y;

	public void agregarSolicitud(SolicitudRetiro r) {
		solicitudes.add(r);
	}

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

}

package dto;

import java.util.ArrayList;
import java.util.List;

public class EstacionesConHorariosDto {
	public String codigo;
	public String nombreEstacion;
	public String distrito;
	public String direccion;
	public double posicionLatitud;
	public double posicionLongitud;
	public List<String> rumboAVes = new ArrayList<String>();
	public List<String> rumboAGrau = new ArrayList<String>();
}

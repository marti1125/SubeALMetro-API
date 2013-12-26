package util;

import java.util.ArrayList;
import java.util.List;

import models.Estacion;
import models.Horario;
import play.mvc.Http.Header;
import dto.EstacionesConHorariosDto;

public class Util {
	
	public List<EstacionesConHorariosDto> obtenerHorariosMasEstaciones(String criterio){
		List<Estacion> estaciones = Estacion.findAll();
		List<EstacionesConHorariosDto> estacionesConHorariosDto = new ArrayList<EstacionesConHorariosDto>();
		for(Estacion estacion : estaciones){
			EstacionesConHorariosDto eConHorariosDeLVDto = new EstacionesConHorariosDto();
			eConHorariosDeLVDto.codigo = estacion.codigo;
			eConHorariosDeLVDto.nombreEstacion = estacion.nombreEstacion;
			eConHorariosDeLVDto.distrito = estacion.distrito.toString();
			eConHorariosDeLVDto.direccion = estacion.direccion;
			eConHorariosDeLVDto.posicionLatitud = estacion.posicionLatitud;
			eConHorariosDeLVDto.posicionLongitud = estacion.posicionLongitud;
			List<Horario> horarios = Horario.find(""+ criterio +" estacion.codigo = ?1",estacion.codigo).fetch();
			for(Horario horario : horarios){
				eConHorariosDeLVDto.rumboAVes.add(horario.rumboAVes);
				eConHorariosDeLVDto.rumboAGrau.add(horario.rumboAGrau);
			}
			estacionesConHorariosDto.add(eConHorariosDeLVDto);
		}
		return estacionesConHorariosDto;
	}
	
}

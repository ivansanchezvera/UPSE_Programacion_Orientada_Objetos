package solar;

public enum Mes {
	ENERO("ENE"),
	FEBRERO("FEB"),
	MARZO("MAR"),
	ABRIL("ABR"),
	MAYO("MAY"),
	JUNIO("JUN"),
	AGOSTO("AGO"),
	SEPTIEMBRE("SEP"),
	OCTUBRE("OCT"),
	NOVIEMBRE("NOV"),
	DICIEMBRE("DIC");
	
	String abreviacion;
	Mes(String abreviacion){
		this.abreviacion = abreviacion;
	}
	
	public String abreviacion(){ return abreviacion;	}
	
}

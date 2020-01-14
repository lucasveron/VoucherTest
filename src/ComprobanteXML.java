import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement(name = "project")
//@XmlAccessorType(XmlAccessType.FIELD)
public class ComprobanteXML {

	@XmlElement
	private String cuit;
	@XmlElement
	private String contrasenia;
	@XmlElement
	private String punto_venta;
	@XmlElement
	private String tipo_comprobante;
	@XmlElement
	private String nro_comprobante;
	
	//constructors
	@Override
	public String toString() {
		return "Soy un comprobante!";
	}
}

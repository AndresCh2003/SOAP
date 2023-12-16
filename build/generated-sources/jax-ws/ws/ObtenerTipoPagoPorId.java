
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para obtenerTipoPagoPorId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="obtenerTipoPagoPorId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="idTipoPago" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "obtenerTipoPagoPorId", propOrder = {
    "idTipoPago"
})
public class ObtenerTipoPagoPorId {

    protected int idTipoPago;

    /**
     * Obtiene el valor de la propiedad idTipoPago.
     * 
     */
    public int getIdTipoPago() {
        return idTipoPago;
    }

    /**
     * Define el valor de la propiedad idTipoPago.
     * 
     */
    public void setIdTipoPago(int value) {
        this.idTipoPago = value;
    }

}

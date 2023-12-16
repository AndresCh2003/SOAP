
package ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para tipoPago complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="tipoPago"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="desripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="id_tipo_pago" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "tipoPago", propOrder = {
    "desripcion",
    "idTipoPago",
    "tipo"
})
public class TipoPago {

    protected String desripcion;
    @XmlElement(name = "id_tipo_pago")
    protected int idTipoPago;
    protected String tipo;

    /**
     * Obtiene el valor de la propiedad desripcion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesripcion() {
        return desripcion;
    }

    /**
     * Define el valor de la propiedad desripcion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesripcion(String value) {
        this.desripcion = value;
    }

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

    /**
     * Obtiene el valor de la propiedad tipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Define el valor de la propiedad tipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTipo(String value) {
        this.tipo = value;
    }

}

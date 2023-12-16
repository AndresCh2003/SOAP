
package ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ws package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CrearClasificacion_QNAME = new QName("http://ws/", "crearClasificacion");
    private final static QName _CrearClasificacionResponse_QNAME = new QName("http://ws/", "crearClasificacionResponse");
    private final static QName _CrearFactura_QNAME = new QName("http://ws/", "crearFactura");
    private final static QName _CrearFacturaResponse_QNAME = new QName("http://ws/", "crearFacturaResponse");
    private final static QName _CrearPersona_QNAME = new QName("http://ws/", "crearPersona");
    private final static QName _CrearPersonaResponse_QNAME = new QName("http://ws/", "crearPersonaResponse");
    private final static QName _CrearProveedor_QNAME = new QName("http://ws/", "crearProveedor");
    private final static QName _CrearProveedorResponse_QNAME = new QName("http://ws/", "crearProveedorResponse");
    private final static QName _CrearTipoPago_QNAME = new QName("http://ws/", "crearTipoPago");
    private final static QName _CrearTipoPagoResponse_QNAME = new QName("http://ws/", "crearTipoPagoResponse");
    private final static QName _ListarFacturas_QNAME = new QName("http://ws/", "listarFacturas");
    private final static QName _ListarFacturasResponse_QNAME = new QName("http://ws/", "listarFacturasResponse");
    private final static QName _ListarTiposPago_QNAME = new QName("http://ws/", "listarTiposPago");
    private final static QName _ListarTiposPagoResponse_QNAME = new QName("http://ws/", "listarTiposPagoResponse");
    private final static QName _ObtenerTipoPagoPorId_QNAME = new QName("http://ws/", "obtenerTipoPagoPorId");
    private final static QName _ObtenerTipoPagoPorIdResponse_QNAME = new QName("http://ws/", "obtenerTipoPagoPorIdResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CrearClasificacion }
     * 
     */
    public CrearClasificacion createCrearClasificacion() {
        return new CrearClasificacion();
    }

    /**
     * Create an instance of {@link CrearClasificacionResponse }
     * 
     */
    public CrearClasificacionResponse createCrearClasificacionResponse() {
        return new CrearClasificacionResponse();
    }

    /**
     * Create an instance of {@link CrearFactura }
     * 
     */
    public CrearFactura createCrearFactura() {
        return new CrearFactura();
    }

    /**
     * Create an instance of {@link CrearFacturaResponse }
     * 
     */
    public CrearFacturaResponse createCrearFacturaResponse() {
        return new CrearFacturaResponse();
    }

    /**
     * Create an instance of {@link CrearPersona }
     * 
     */
    public CrearPersona createCrearPersona() {
        return new CrearPersona();
    }

    /**
     * Create an instance of {@link CrearPersonaResponse }
     * 
     */
    public CrearPersonaResponse createCrearPersonaResponse() {
        return new CrearPersonaResponse();
    }

    /**
     * Create an instance of {@link CrearProveedor }
     * 
     */
    public CrearProveedor createCrearProveedor() {
        return new CrearProveedor();
    }

    /**
     * Create an instance of {@link CrearProveedorResponse }
     * 
     */
    public CrearProveedorResponse createCrearProveedorResponse() {
        return new CrearProveedorResponse();
    }

    /**
     * Create an instance of {@link CrearTipoPago }
     * 
     */
    public CrearTipoPago createCrearTipoPago() {
        return new CrearTipoPago();
    }

    /**
     * Create an instance of {@link CrearTipoPagoResponse }
     * 
     */
    public CrearTipoPagoResponse createCrearTipoPagoResponse() {
        return new CrearTipoPagoResponse();
    }

    /**
     * Create an instance of {@link ListarFacturas }
     * 
     */
    public ListarFacturas createListarFacturas() {
        return new ListarFacturas();
    }

    /**
     * Create an instance of {@link ListarFacturasResponse }
     * 
     */
    public ListarFacturasResponse createListarFacturasResponse() {
        return new ListarFacturasResponse();
    }

    /**
     * Create an instance of {@link ListarTiposPago }
     * 
     */
    public ListarTiposPago createListarTiposPago() {
        return new ListarTiposPago();
    }

    /**
     * Create an instance of {@link ListarTiposPagoResponse }
     * 
     */
    public ListarTiposPagoResponse createListarTiposPagoResponse() {
        return new ListarTiposPagoResponse();
    }

    /**
     * Create an instance of {@link ObtenerTipoPagoPorId }
     * 
     */
    public ObtenerTipoPagoPorId createObtenerTipoPagoPorId() {
        return new ObtenerTipoPagoPorId();
    }

    /**
     * Create an instance of {@link ObtenerTipoPagoPorIdResponse }
     * 
     */
    public ObtenerTipoPagoPorIdResponse createObtenerTipoPagoPorIdResponse() {
        return new ObtenerTipoPagoPorIdResponse();
    }

    /**
     * Create an instance of {@link TipoPago }
     * 
     */
    public TipoPago createTipoPago() {
        return new TipoPago();
    }

    /**
     * Create an instance of {@link Persona }
     * 
     */
    public Persona createPersona() {
        return new Persona();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClasificacion }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearClasificacion }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearClasificacion")
    public JAXBElement<CrearClasificacion> createCrearClasificacion(CrearClasificacion value) {
        return new JAXBElement<CrearClasificacion>(_CrearClasificacion_QNAME, CrearClasificacion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearClasificacionResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearClasificacionResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearClasificacionResponse")
    public JAXBElement<CrearClasificacionResponse> createCrearClasificacionResponse(CrearClasificacionResponse value) {
        return new JAXBElement<CrearClasificacionResponse>(_CrearClasificacionResponse_QNAME, CrearClasificacionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFactura }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearFactura }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearFactura")
    public JAXBElement<CrearFactura> createCrearFactura(CrearFactura value) {
        return new JAXBElement<CrearFactura>(_CrearFactura_QNAME, CrearFactura.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearFacturaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearFacturaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearFacturaResponse")
    public JAXBElement<CrearFacturaResponse> createCrearFacturaResponse(CrearFacturaResponse value) {
        return new JAXBElement<CrearFacturaResponse>(_CrearFacturaResponse_QNAME, CrearFacturaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPersona }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearPersona }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearPersona")
    public JAXBElement<CrearPersona> createCrearPersona(CrearPersona value) {
        return new JAXBElement<CrearPersona>(_CrearPersona_QNAME, CrearPersona.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearPersonaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearPersonaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearPersonaResponse")
    public JAXBElement<CrearPersonaResponse> createCrearPersonaResponse(CrearPersonaResponse value) {
        return new JAXBElement<CrearPersonaResponse>(_CrearPersonaResponse_QNAME, CrearPersonaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProveedor }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProveedor }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearProveedor")
    public JAXBElement<CrearProveedor> createCrearProveedor(CrearProveedor value) {
        return new JAXBElement<CrearProveedor>(_CrearProveedor_QNAME, CrearProveedor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearProveedorResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearProveedorResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearProveedorResponse")
    public JAXBElement<CrearProveedorResponse> createCrearProveedorResponse(CrearProveedorResponse value) {
        return new JAXBElement<CrearProveedorResponse>(_CrearProveedorResponse_QNAME, CrearProveedorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTipoPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearTipoPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearTipoPago")
    public JAXBElement<CrearTipoPago> createCrearTipoPago(CrearTipoPago value) {
        return new JAXBElement<CrearTipoPago>(_CrearTipoPago_QNAME, CrearTipoPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CrearTipoPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CrearTipoPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "crearTipoPagoResponse")
    public JAXBElement<CrearTipoPagoResponse> createCrearTipoPagoResponse(CrearTipoPagoResponse value) {
        return new JAXBElement<CrearTipoPagoResponse>(_CrearTipoPagoResponse_QNAME, CrearTipoPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFacturas }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarFacturas }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarFacturas")
    public JAXBElement<ListarFacturas> createListarFacturas(ListarFacturas value) {
        return new JAXBElement<ListarFacturas>(_ListarFacturas_QNAME, ListarFacturas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarFacturasResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarFacturasResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarFacturasResponse")
    public JAXBElement<ListarFacturasResponse> createListarFacturasResponse(ListarFacturasResponse value) {
        return new JAXBElement<ListarFacturasResponse>(_ListarFacturasResponse_QNAME, ListarFacturasResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTiposPago }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarTiposPago }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarTiposPago")
    public JAXBElement<ListarTiposPago> createListarTiposPago(ListarTiposPago value) {
        return new JAXBElement<ListarTiposPago>(_ListarTiposPago_QNAME, ListarTiposPago.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListarTiposPagoResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListarTiposPagoResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "listarTiposPagoResponse")
    public JAXBElement<ListarTiposPagoResponse> createListarTiposPagoResponse(ListarTiposPagoResponse value) {
        return new JAXBElement<ListarTiposPagoResponse>(_ListarTiposPagoResponse_QNAME, ListarTiposPagoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTipoPagoPorId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTipoPagoPorId }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerTipoPagoPorId")
    public JAXBElement<ObtenerTipoPagoPorId> createObtenerTipoPagoPorId(ObtenerTipoPagoPorId value) {
        return new JAXBElement<ObtenerTipoPagoPorId>(_ObtenerTipoPagoPorId_QNAME, ObtenerTipoPagoPorId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ObtenerTipoPagoPorIdResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ObtenerTipoPagoPorIdResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "obtenerTipoPagoPorIdResponse")
    public JAXBElement<ObtenerTipoPagoPorIdResponse> createObtenerTipoPagoPorIdResponse(ObtenerTipoPagoPorIdResponse value) {
        return new JAXBElement<ObtenerTipoPagoPorIdResponse>(_ObtenerTipoPagoPorIdResponse_QNAME, ObtenerTipoPagoPorIdResponse.class, null, value);
    }

}

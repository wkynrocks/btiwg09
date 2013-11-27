//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.5-2 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.11.27 a las 12:33:31 PM CET 
//


package google.geocodingservice.geocoder;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Response">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="Status">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Placemark">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                             &lt;element name="AddressDetails">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Country">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="CountryNameCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                 &lt;element name="AdministrativeArea">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="AdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                           &lt;element name="SubAdministrativeArea">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;sequence>
 *                                                                     &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                                     &lt;element name="Locality">
 *                                                                       &lt;complexType>
 *                                                                         &lt;complexContent>
 *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                             &lt;sequence>
 *                                                                               &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                                               &lt;element name="Thoroughfare">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                               &lt;element name="PostalCode">
 *                                                                                 &lt;complexType>
 *                                                                                   &lt;complexContent>
 *                                                                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                                       &lt;sequence>
 *                                                                                         &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                                                                       &lt;/sequence>
 *                                                                                     &lt;/restriction>
 *                                                                                   &lt;/complexContent>
 *                                                                                 &lt;/complexType>
 *                                                                               &lt;/element>
 *                                                                             &lt;/sequence>
 *                                                                           &lt;/restriction>
 *                                                                         &lt;/complexContent>
 *                                                                       &lt;/complexType>
 *                                                                     &lt;/element>
 *                                                                   &lt;/sequence>
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Point">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="coordinates" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "response"
})
@XmlRootElement(name = "kml")
public class Kml {

    @XmlElement(name = "Response", required = true)
    protected Kml.Response response;

    /**
     * Obtiene el valor de la propiedad response.
     * 
     * @return
     *     possible object is
     *     {@link Kml.Response }
     *     
     */
    public Kml.Response getResponse() {
        return response;
    }

    /**
     * Define el valor de la propiedad response.
     * 
     * @param value
     *     allowed object is
     *     {@link Kml.Response }
     *     
     */
    public void setResponse(Kml.Response value) {
        this.response = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="Status">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Placemark">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                   &lt;element name="AddressDetails">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Country">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="CountryNameCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                       &lt;element name="AdministrativeArea">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="AdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                 &lt;element name="SubAdministrativeArea">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;sequence>
     *                                                           &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                           &lt;element name="Locality">
     *                                                             &lt;complexType>
     *                                                               &lt;complexContent>
     *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                   &lt;sequence>
     *                                                                     &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                                     &lt;element name="Thoroughfare">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                     &lt;element name="PostalCode">
     *                                                                       &lt;complexType>
     *                                                                         &lt;complexContent>
     *                                                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                                             &lt;sequence>
     *                                                                               &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                                                                             &lt;/sequence>
     *                                                                           &lt;/restriction>
     *                                                                         &lt;/complexContent>
     *                                                                       &lt;/complexType>
     *                                                                     &lt;/element>
     *                                                                   &lt;/sequence>
     *                                                                 &lt;/restriction>
     *                                                               &lt;/complexContent>
     *                                                             &lt;/complexType>
     *                                                           &lt;/element>
     *                                                         &lt;/sequence>
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Point">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="coordinates" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "status",
        "placemark"
    })
    public static class Response {

        @XmlElement(required = true)
        protected Object name;
        @XmlElement(name = "Status", required = true)
        protected Kml.Response.Status status;
        @XmlElement(name = "Placemark", required = true)
        protected Kml.Response.Placemark placemark;

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setName(Object value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad status.
         * 
         * @return
         *     possible object is
         *     {@link Kml.Response.Status }
         *     
         */
        public Kml.Response.Status getStatus() {
            return status;
        }

        /**
         * Define el valor de la propiedad status.
         * 
         * @param value
         *     allowed object is
         *     {@link Kml.Response.Status }
         *     
         */
        public void setStatus(Kml.Response.Status value) {
            this.status = value;
        }

        /**
         * Obtiene el valor de la propiedad placemark.
         * 
         * @return
         *     possible object is
         *     {@link Kml.Response.Placemark }
         *     
         */
        public Kml.Response.Placemark getPlacemark() {
            return placemark;
        }

        /**
         * Define el valor de la propiedad placemark.
         * 
         * @param value
         *     allowed object is
         *     {@link Kml.Response.Placemark }
         *     
         */
        public void setPlacemark(Kml.Response.Placemark value) {
            this.placemark = value;
        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="address" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="AddressDetails">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Country">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="CountryNameCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                             &lt;element name="AdministrativeArea">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="AdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                       &lt;element name="SubAdministrativeArea">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;sequence>
         *                                                 &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                                 &lt;element name="Locality">
         *                                                   &lt;complexType>
         *                                                     &lt;complexContent>
         *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                         &lt;sequence>
         *                                                           &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                                           &lt;element name="Thoroughfare">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                           &lt;element name="PostalCode">
         *                                                             &lt;complexType>
         *                                                               &lt;complexContent>
         *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                                                   &lt;sequence>
         *                                                                     &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                                                                   &lt;/sequence>
         *                                                                 &lt;/restriction>
         *                                                               &lt;/complexContent>
         *                                                             &lt;/complexType>
         *                                                           &lt;/element>
         *                                                         &lt;/sequence>
         *                                                       &lt;/restriction>
         *                                                     &lt;/complexContent>
         *                                                   &lt;/complexType>
         *                                                 &lt;/element>
         *                                               &lt;/sequence>
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Point">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="coordinates" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "address",
            "addressDetails",
            "point"
        })
        public static class Placemark {

            @XmlElement(required = true)
            protected Object address;
            @XmlElement(name = "AddressDetails", required = true)
            protected Kml.Response.Placemark.AddressDetails addressDetails;
            @XmlElement(name = "Point", required = true)
            protected Kml.Response.Placemark.Point point;

            /**
             * Obtiene el valor de la propiedad address.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getAddress() {
                return address;
            }

            /**
             * Define el valor de la propiedad address.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setAddress(Object value) {
                this.address = value;
            }

            /**
             * Obtiene el valor de la propiedad addressDetails.
             * 
             * @return
             *     possible object is
             *     {@link Kml.Response.Placemark.AddressDetails }
             *     
             */
            public Kml.Response.Placemark.AddressDetails getAddressDetails() {
                return addressDetails;
            }

            /**
             * Define el valor de la propiedad addressDetails.
             * 
             * @param value
             *     allowed object is
             *     {@link Kml.Response.Placemark.AddressDetails }
             *     
             */
            public void setAddressDetails(Kml.Response.Placemark.AddressDetails value) {
                this.addressDetails = value;
            }

            /**
             * Obtiene el valor de la propiedad point.
             * 
             * @return
             *     possible object is
             *     {@link Kml.Response.Placemark.Point }
             *     
             */
            public Kml.Response.Placemark.Point getPoint() {
                return point;
            }

            /**
             * Define el valor de la propiedad point.
             * 
             * @param value
             *     allowed object is
             *     {@link Kml.Response.Placemark.Point }
             *     
             */
            public void setPoint(Kml.Response.Placemark.Point value) {
                this.point = value;
            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Country">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="CountryNameCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                   &lt;element name="AdministrativeArea">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="AdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                             &lt;element name="SubAdministrativeArea">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;sequence>
             *                                       &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                                       &lt;element name="Locality">
             *                                         &lt;complexType>
             *                                           &lt;complexContent>
             *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                               &lt;sequence>
             *                                                 &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                                                 &lt;element name="Thoroughfare">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                                 &lt;element name="PostalCode">
             *                                                   &lt;complexType>
             *                                                     &lt;complexContent>
             *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                                         &lt;sequence>
             *                                                           &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *                                                         &lt;/sequence>
             *                                                       &lt;/restriction>
             *                                                     &lt;/complexContent>
             *                                                   &lt;/complexType>
             *                                                 &lt;/element>
             *                                               &lt;/sequence>
             *                                             &lt;/restriction>
             *                                           &lt;/complexContent>
             *                                         &lt;/complexType>
             *                                       &lt;/element>
             *                                     &lt;/sequence>
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Accuracy" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "country"
            })
            public static class AddressDetails {

                @XmlElement(name = "Country", required = true)
                protected Kml.Response.Placemark.AddressDetails.Country country;
                @XmlAttribute(name = "Accuracy")
                protected String accuracy;

                /**
                 * Obtiene el valor de la propiedad country.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Kml.Response.Placemark.AddressDetails.Country }
                 *     
                 */
                public Kml.Response.Placemark.AddressDetails.Country getCountry() {
                    return country;
                }

                /**
                 * Define el valor de la propiedad country.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Kml.Response.Placemark.AddressDetails.Country }
                 *     
                 */
                public void setCountry(Kml.Response.Placemark.AddressDetails.Country value) {
                    this.country = value;
                }

                /**
                 * Obtiene el valor de la propiedad accuracy.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAccuracy() {
                    return accuracy;
                }

                /**
                 * Define el valor de la propiedad accuracy.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAccuracy(String value) {
                    this.accuracy = value;
                }


                /**
                 * <p>Clase Java para anonymous complex type.
                 * 
                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="CountryNameCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *         &lt;element name="AdministrativeArea">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="AdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                   &lt;element name="SubAdministrativeArea">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;sequence>
                 *                             &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                             &lt;element name="Locality">
                 *                               &lt;complexType>
                 *                                 &lt;complexContent>
                 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                     &lt;sequence>
                 *                                       &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                                       &lt;element name="Thoroughfare">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                       &lt;element name="PostalCode">
                 *                                         &lt;complexType>
                 *                                           &lt;complexContent>
                 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                                               &lt;sequence>
                 *                                                 &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                 *                                               &lt;/sequence>
                 *                                             &lt;/restriction>
                 *                                           &lt;/complexContent>
                 *                                         &lt;/complexType>
                 *                                       &lt;/element>
                 *                                     &lt;/sequence>
                 *                                   &lt;/restriction>
                 *                                 &lt;/complexContent>
                 *                               &lt;/complexType>
                 *                             &lt;/element>
                 *                           &lt;/sequence>
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "countryNameCode",
                    "administrativeArea"
                })
                public static class Country {

                    @XmlElement(name = "CountryNameCode", required = true)
                    protected Object countryNameCode;
                    @XmlElement(name = "AdministrativeArea", required = true)
                    protected Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea administrativeArea;

                    /**
                     * Obtiene el valor de la propiedad countryNameCode.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Object }
                     *     
                     */
                    public Object getCountryNameCode() {
                        return countryNameCode;
                    }

                    /**
                     * Define el valor de la propiedad countryNameCode.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Object }
                     *     
                     */
                    public void setCountryNameCode(Object value) {
                        this.countryNameCode = value;
                    }

                    /**
                     * Obtiene el valor de la propiedad administrativeArea.
                     * 
                     * @return
                     *     possible object is
                     *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea }
                     *     
                     */
                    public Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea getAdministrativeArea() {
                        return administrativeArea;
                    }

                    /**
                     * Define el valor de la propiedad administrativeArea.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea }
                     *     
                     */
                    public void setAdministrativeArea(Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea value) {
                        this.administrativeArea = value;
                    }


                    /**
                     * <p>Clase Java para anonymous complex type.
                     * 
                     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="AdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *         &lt;element name="SubAdministrativeArea">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;sequence>
                     *                   &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *                   &lt;element name="Locality">
                     *                     &lt;complexType>
                     *                       &lt;complexContent>
                     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                           &lt;sequence>
                     *                             &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *                             &lt;element name="Thoroughfare">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                             &lt;element name="PostalCode">
                     *                               &lt;complexType>
                     *                                 &lt;complexContent>
                     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                                     &lt;sequence>
                     *                                       &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                     *                                     &lt;/sequence>
                     *                                   &lt;/restriction>
                     *                                 &lt;/complexContent>
                     *                               &lt;/complexType>
                     *                             &lt;/element>
                     *                           &lt;/sequence>
                     *                         &lt;/restriction>
                     *                       &lt;/complexContent>
                     *                     &lt;/complexType>
                     *                   &lt;/element>
                     *                 &lt;/sequence>
                     *               &lt;/restriction>
                     *             &lt;/complexContent>
                     *           &lt;/complexType>
                     *         &lt;/element>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "administrativeAreaName",
                        "subAdministrativeArea"
                    })
                    public static class AdministrativeArea {

                        @XmlElement(name = "AdministrativeAreaName", required = true)
                        protected Object administrativeAreaName;
                        @XmlElement(name = "SubAdministrativeArea", required = true)
                        protected Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea subAdministrativeArea;

                        /**
                         * Obtiene el valor de la propiedad administrativeAreaName.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Object }
                         *     
                         */
                        public Object getAdministrativeAreaName() {
                            return administrativeAreaName;
                        }

                        /**
                         * Define el valor de la propiedad administrativeAreaName.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Object }
                         *     
                         */
                        public void setAdministrativeAreaName(Object value) {
                            this.administrativeAreaName = value;
                        }

                        /**
                         * Obtiene el valor de la propiedad subAdministrativeArea.
                         * 
                         * @return
                         *     possible object is
                         *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea }
                         *     
                         */
                        public Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea getSubAdministrativeArea() {
                            return subAdministrativeArea;
                        }

                        /**
                         * Define el valor de la propiedad subAdministrativeArea.
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea }
                         *     
                         */
                        public void setSubAdministrativeArea(Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea value) {
                            this.subAdministrativeArea = value;
                        }


                        /**
                         * <p>Clase Java para anonymous complex type.
                         * 
                         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;complexContent>
                         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *       &lt;sequence>
                         *         &lt;element name="SubAdministrativeAreaName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                         *         &lt;element name="Locality">
                         *           &lt;complexType>
                         *             &lt;complexContent>
                         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                 &lt;sequence>
                         *                   &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                         *                   &lt;element name="Thoroughfare">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                   &lt;element name="PostalCode">
                         *                     &lt;complexType>
                         *                       &lt;complexContent>
                         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                         *                           &lt;sequence>
                         *                             &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                         *                           &lt;/sequence>
                         *                         &lt;/restriction>
                         *                       &lt;/complexContent>
                         *                     &lt;/complexType>
                         *                   &lt;/element>
                         *                 &lt;/sequence>
                         *               &lt;/restriction>
                         *             &lt;/complexContent>
                         *           &lt;/complexType>
                         *         &lt;/element>
                         *       &lt;/sequence>
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "subAdministrativeAreaName",
                            "locality"
                        })
                        public static class SubAdministrativeArea {

                            @XmlElement(name = "SubAdministrativeAreaName", required = true)
                            protected Object subAdministrativeAreaName;
                            @XmlElement(name = "Locality", required = true)
                            protected Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality locality;

                            /**
                             * Obtiene el valor de la propiedad subAdministrativeAreaName.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Object }
                             *     
                             */
                            public Object getSubAdministrativeAreaName() {
                                return subAdministrativeAreaName;
                            }

                            /**
                             * Define el valor de la propiedad subAdministrativeAreaName.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Object }
                             *     
                             */
                            public void setSubAdministrativeAreaName(Object value) {
                                this.subAdministrativeAreaName = value;
                            }

                            /**
                             * Obtiene el valor de la propiedad locality.
                             * 
                             * @return
                             *     possible object is
                             *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality }
                             *     
                             */
                            public Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality getLocality() {
                                return locality;
                            }

                            /**
                             * Define el valor de la propiedad locality.
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality }
                             *     
                             */
                            public void setLocality(Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality value) {
                                this.locality = value;
                            }


                            /**
                             * <p>Clase Java para anonymous complex type.
                             * 
                             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                             * 
                             * <pre>
                             * &lt;complexType>
                             *   &lt;complexContent>
                             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *       &lt;sequence>
                             *         &lt;element name="LocalityName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                             *         &lt;element name="Thoroughfare">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *         &lt;element name="PostalCode">
                             *           &lt;complexType>
                             *             &lt;complexContent>
                             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                             *                 &lt;sequence>
                             *                   &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                             *                 &lt;/sequence>
                             *               &lt;/restriction>
                             *             &lt;/complexContent>
                             *           &lt;/complexType>
                             *         &lt;/element>
                             *       &lt;/sequence>
                             *     &lt;/restriction>
                             *   &lt;/complexContent>
                             * &lt;/complexType>
                             * </pre>
                             * 
                             * 
                             */
                            @XmlAccessorType(XmlAccessType.FIELD)
                            @XmlType(name = "", propOrder = {
                                "localityName",
                                "thoroughfare",
                                "postalCode"
                            })
                            public static class Locality {

                                @XmlElement(name = "LocalityName", required = true)
                                protected Object localityName;
                                @XmlElement(name = "Thoroughfare", required = true)
                                protected Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.Thoroughfare thoroughfare;
                                @XmlElement(name = "PostalCode", required = true)
                                protected Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.PostalCode postalCode;

                                /**
                                 * Obtiene el valor de la propiedad localityName.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Object }
                                 *     
                                 */
                                public Object getLocalityName() {
                                    return localityName;
                                }

                                /**
                                 * Define el valor de la propiedad localityName.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Object }
                                 *     
                                 */
                                public void setLocalityName(Object value) {
                                    this.localityName = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad thoroughfare.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.Thoroughfare }
                                 *     
                                 */
                                public Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.Thoroughfare getThoroughfare() {
                                    return thoroughfare;
                                }

                                /**
                                 * Define el valor de la propiedad thoroughfare.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.Thoroughfare }
                                 *     
                                 */
                                public void setThoroughfare(Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.Thoroughfare value) {
                                    this.thoroughfare = value;
                                }

                                /**
                                 * Obtiene el valor de la propiedad postalCode.
                                 * 
                                 * @return
                                 *     possible object is
                                 *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.PostalCode }
                                 *     
                                 */
                                public Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.PostalCode getPostalCode() {
                                    return postalCode;
                                }

                                /**
                                 * Define el valor de la propiedad postalCode.
                                 * 
                                 * @param value
                                 *     allowed object is
                                 *     {@link Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.PostalCode }
                                 *     
                                 */
                                public void setPostalCode(Kml.Response.Placemark.AddressDetails.Country.AdministrativeArea.SubAdministrativeArea.Locality.PostalCode value) {
                                    this.postalCode = value;
                                }


                                /**
                                 * <p>Clase Java para anonymous complex type.
                                 * 
                                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="PostalCodeNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "postalCodeNumber"
                                })
                                public static class PostalCode {

                                    @XmlElement(name = "PostalCodeNumber", required = true)
                                    protected Object postalCodeNumber;

                                    /**
                                     * Obtiene el valor de la propiedad postalCodeNumber.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public Object getPostalCodeNumber() {
                                        return postalCodeNumber;
                                    }

                                    /**
                                     * Define el valor de la propiedad postalCodeNumber.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public void setPostalCodeNumber(Object value) {
                                        this.postalCodeNumber = value;
                                    }

                                }


                                /**
                                 * <p>Clase Java para anonymous complex type.
                                 * 
                                 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
                                 * 
                                 * <pre>
                                 * &lt;complexType>
                                 *   &lt;complexContent>
                                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                                 *       &lt;sequence>
                                 *         &lt;element name="ThoroughfareName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
                                 *       &lt;/sequence>
                                 *     &lt;/restriction>
                                 *   &lt;/complexContent>
                                 * &lt;/complexType>
                                 * </pre>
                                 * 
                                 * 
                                 */
                                @XmlAccessorType(XmlAccessType.FIELD)
                                @XmlType(name = "", propOrder = {
                                    "thoroughfareName"
                                })
                                public static class Thoroughfare {

                                    @XmlElement(name = "ThoroughfareName", required = true)
                                    protected Object thoroughfareName;

                                    /**
                                     * Obtiene el valor de la propiedad thoroughfareName.
                                     * 
                                     * @return
                                     *     possible object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public Object getThoroughfareName() {
                                        return thoroughfareName;
                                    }

                                    /**
                                     * Define el valor de la propiedad thoroughfareName.
                                     * 
                                     * @param value
                                     *     allowed object is
                                     *     {@link Object }
                                     *     
                                     */
                                    public void setThoroughfareName(Object value) {
                                        this.thoroughfareName = value;
                                    }

                                }

                            }

                        }

                    }

                }

            }


            /**
             * <p>Clase Java para anonymous complex type.
             * 
             * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="coordinates" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "coordinates"
            })
            public static class Point {

                @XmlElement(required = true)
                protected Object coordinates;

                /**
                 * Obtiene el valor de la propiedad coordinates.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCoordinates() {
                    return coordinates;
                }

                /**
                 * Define el valor de la propiedad coordinates.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCoordinates(Object value) {
                    this.coordinates = value;
                }

            }

        }


        /**
         * <p>Clase Java para anonymous complex type.
         * 
         * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="code" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *         &lt;element name="request" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "code",
            "request"
        })
        public static class Status {

            @XmlElement(required = true)
            protected Object code;
            @XmlElement(required = true)
            protected Object request;

            /**
             * Obtiene el valor de la propiedad code.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCode() {
                return code;
            }

            /**
             * Define el valor de la propiedad code.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCode(Object value) {
                this.code = value;
            }

            /**
             * Obtiene el valor de la propiedad request.
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getRequest() {
                return request;
            }

            /**
             * Define el valor de la propiedad request.
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setRequest(Object value) {
                this.request = value;
            }

        }

    }

}

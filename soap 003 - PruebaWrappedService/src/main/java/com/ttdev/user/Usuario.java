//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.19 a las 12:04:33 PM BST 
//


package com.ttdev.user;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para result element declaration.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;element name="result">
 *   &lt;complexType>
 *     &lt;complexContent>
 *       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *         &lt;sequence>
 *           &lt;element name="uid" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="mail" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="theme" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="signature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="signature_format" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="created" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="access" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="login" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *           &lt;element name="status" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *           &lt;element name="timezone" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="language" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="picture" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="init" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="data" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *           &lt;element name="roles">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="rdf_mapping">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="rdftype">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="name">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="homepage">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="predicates">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                       &lt;sequence>
 *                                         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;/sequence>
 *                                       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;/restriction>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/sequence>
 *       &lt;/restriction>
 *     &lt;/complexContent>
 *   &lt;/complexType>
 * &lt;/element>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "uid",
    "name",
    "mail",
    "theme",
    "signature",
    "signatureFormat",
    "created",
    "access",
    "login",
    "status",
    "timezone",
    "language",
    "picture",
    "init",
    "data",
    "roles",
    "rdfMapping"
})
@XmlRootElement(name = "result")
public class Usuario {

    protected byte uid;
    @XmlElement(required = true)
    protected String name;
    @XmlElement(required = true)
    protected String mail;
    @XmlElement(required = true)
    protected String theme;
    @XmlElement(required = true)
    protected String signature;
    @XmlElement(name = "signature_format", required = true)
    protected String signatureFormat;
    protected int created;
    protected int access;
    protected int login;
    protected byte status;
    @XmlElement(required = true)
    protected String timezone;
    @XmlElement(required = true)
    protected String language;
    @XmlElement(required = true)
    protected String picture;
    @XmlElement(required = true)
    protected String init;
    @XmlElement(required = true)
    protected String data;
    @XmlElement(required = true)
    protected Usuario.Roles roles;
    @XmlElement(name = "rdf_mapping", required = true)
    protected Usuario.RdfMapping rdfMapping;

    /**
     * Obtiene el valor de la propiedad uid.
     * 
     */
    public byte getUid() {
        return uid;
    }

    /**
     * Define el valor de la propiedad uid.
     * 
     */
    public void setUid(byte value) {
        this.uid = value;
    }

    /**
     * Obtiene el valor de la propiedad name.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Define el valor de la propiedad name.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Obtiene el valor de la propiedad mail.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMail() {
        return mail;
    }

    /**
     * Define el valor de la propiedad mail.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMail(String value) {
        this.mail = value;
    }

    /**
     * Obtiene el valor de la propiedad theme.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTheme() {
        return theme;
    }

    /**
     * Define el valor de la propiedad theme.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTheme(String value) {
        this.theme = value;
    }

    /**
     * Obtiene el valor de la propiedad signature.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignature() {
        return signature;
    }

    /**
     * Define el valor de la propiedad signature.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignature(String value) {
        this.signature = value;
    }

    /**
     * Obtiene el valor de la propiedad signatureFormat.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignatureFormat() {
        return signatureFormat;
    }

    /**
     * Define el valor de la propiedad signatureFormat.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignatureFormat(String value) {
        this.signatureFormat = value;
    }

    /**
     * Obtiene el valor de la propiedad created.
     * 
     */
    public int getCreated() {
        return created;
    }

    /**
     * Define el valor de la propiedad created.
     * 
     */
    public void setCreated(int value) {
        this.created = value;
    }

    /**
     * Obtiene el valor de la propiedad access.
     * 
     */
    public int getAccess() {
        return access;
    }

    /**
     * Define el valor de la propiedad access.
     * 
     */
    public void setAccess(int value) {
        this.access = value;
    }

    /**
     * Obtiene el valor de la propiedad login.
     * 
     */
    public int getLogin() {
        return login;
    }

    /**
     * Define el valor de la propiedad login.
     * 
     */
    public void setLogin(int value) {
        this.login = value;
    }

    /**
     * Obtiene el valor de la propiedad status.
     * 
     */
    public byte getStatus() {
        return status;
    }

    /**
     * Define el valor de la propiedad status.
     * 
     */
    public void setStatus(byte value) {
        this.status = value;
    }

    /**
     * Obtiene el valor de la propiedad timezone.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimezone() {
        return timezone;
    }

    /**
     * Define el valor de la propiedad timezone.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimezone(String value) {
        this.timezone = value;
    }

    /**
     * Obtiene el valor de la propiedad language.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * Define el valor de la propiedad language.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * Obtiene el valor de la propiedad picture.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPicture() {
        return picture;
    }

    /**
     * Define el valor de la propiedad picture.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPicture(String value) {
        this.picture = value;
    }

    /**
     * Obtiene el valor de la propiedad init.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInit() {
        return init;
    }

    /**
     * Define el valor de la propiedad init.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInit(String value) {
        this.init = value;
    }

    /**
     * Obtiene el valor de la propiedad data.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getData() {
        return data;
    }

    /**
     * Define el valor de la propiedad data.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setData(String value) {
        this.data = value;
    }

    /**
     * Obtiene el valor de la propiedad roles.
     * 
     * @return
     *     possible object is
     *     {@link Usuario.Roles }
     *     
     */
    public Usuario.Roles getRoles() {
        return roles;
    }

    /**
     * Define el valor de la propiedad roles.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario.Roles }
     *     
     */
    public void setRoles(Usuario.Roles value) {
        this.roles = value;
    }

    /**
     * Obtiene el valor de la propiedad rdfMapping.
     * 
     * @return
     *     possible object is
     *     {@link Usuario.RdfMapping }
     *     
     */
    public Usuario.RdfMapping getRdfMapping() {
        return rdfMapping;
    }

    /**
     * Define el valor de la propiedad rdfMapping.
     * 
     * @param value
     *     allowed object is
     *     {@link Usuario.RdfMapping }
     *     
     */
    public void setRdfMapping(Usuario.RdfMapping value) {
        this.rdfMapping = value;
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
     *         &lt;element name="rdftype">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="name">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="homepage">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="predicates">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
        "rdftype",
        "name",
        "homepage"
    })
    public static class RdfMapping {

        @XmlElement(required = true)
        protected Usuario.RdfMapping.Rdftype rdftype;
        @XmlElement(required = true)
        protected Usuario.RdfMapping.Name name;
        @XmlElement(required = true)
        protected Usuario.RdfMapping.Homepage homepage;

        /**
         * Obtiene el valor de la propiedad rdftype.
         * 
         * @return
         *     possible object is
         *     {@link Usuario.RdfMapping.Rdftype }
         *     
         */
        public Usuario.RdfMapping.Rdftype getRdftype() {
            return rdftype;
        }

        /**
         * Define el valor de la propiedad rdftype.
         * 
         * @param value
         *     allowed object is
         *     {@link Usuario.RdfMapping.Rdftype }
         *     
         */
        public void setRdftype(Usuario.RdfMapping.Rdftype value) {
            this.rdftype = value;
        }

        /**
         * Obtiene el valor de la propiedad name.
         * 
         * @return
         *     possible object is
         *     {@link Usuario.RdfMapping.Name }
         *     
         */
        public Usuario.RdfMapping.Name getName() {
            return name;
        }

        /**
         * Define el valor de la propiedad name.
         * 
         * @param value
         *     allowed object is
         *     {@link Usuario.RdfMapping.Name }
         *     
         */
        public void setName(Usuario.RdfMapping.Name value) {
            this.name = value;
        }

        /**
         * Obtiene el valor de la propiedad homepage.
         * 
         * @return
         *     possible object is
         *     {@link Usuario.RdfMapping.Homepage }
         *     
         */
        public Usuario.RdfMapping.Homepage getHomepage() {
            return homepage;
        }

        /**
         * Define el valor de la propiedad homepage.
         * 
         * @param value
         *     allowed object is
         *     {@link Usuario.RdfMapping.Homepage }
         *     
         */
        public void setHomepage(Usuario.RdfMapping.Homepage value) {
            this.homepage = value;
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
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="type" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "predicates",
            "type"
        })
        public static class Homepage {

            @XmlElement(required = true)
            protected Usuario.RdfMapping.Homepage.Predicates predicates;
            @XmlElement(required = true)
            protected String type;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Usuario.RdfMapping.Homepage.Predicates }
             *     
             */
            public Usuario.RdfMapping.Homepage.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Usuario.RdfMapping.Homepage.Predicates }
             *     
             */
            public void setPredicates(Usuario.RdfMapping.Homepage.Predicates value) {
                this.predicates = value;
            }

            /**
             * Obtiene el valor de la propiedad type.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Define el valor de la propiedad type.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
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
         *         &lt;element name="predicates">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "predicates"
        })
        public static class Name {

            @XmlElement(required = true)
            protected Usuario.RdfMapping.Name.Predicates predicates;

            /**
             * Obtiene el valor de la propiedad predicates.
             * 
             * @return
             *     possible object is
             *     {@link Usuario.RdfMapping.Name.Predicates }
             *     
             */
            public Usuario.RdfMapping.Name.Predicates getPredicates() {
                return predicates;
            }

            /**
             * Define el valor de la propiedad predicates.
             * 
             * @param value
             *     allowed object is
             *     {@link Usuario.RdfMapping.Name.Predicates }
             *     
             */
            public void setPredicates(Usuario.RdfMapping.Name.Predicates value) {
                this.predicates = value;
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
             *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "item"
            })
            public static class Predicates {

                @XmlElement(required = true)
                protected String item;
                @XmlAttribute(name = "is_array")
                protected String isArray;

                /**
                 * Obtiene el valor de la propiedad item.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getItem() {
                    return item;
                }

                /**
                 * Define el valor de la propiedad item.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setItem(String value) {
                    this.item = value;
                }

                /**
                 * Obtiene el valor de la propiedad isArray.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIsArray() {
                    return isArray;
                }

                /**
                 * Define el valor de la propiedad isArray.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIsArray(String value) {
                    this.isArray = value;
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
         *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "item"
        })
        public static class Rdftype {

            @XmlElement(required = true)
            protected String item;
            @XmlAttribute(name = "is_array")
            protected String isArray;

            /**
             * Obtiene el valor de la propiedad item.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getItem() {
                return item;
            }

            /**
             * Define el valor de la propiedad item.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setItem(String value) {
                this.item = value;
            }

            /**
             * Obtiene el valor de la propiedad isArray.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIsArray() {
                return isArray;
            }

            /**
             * Define el valor de la propiedad isArray.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIsArray(String value) {
                this.isArray = value;
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
     *         &lt;element name="item" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="is_array" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "item"
    })
    public static class Roles {

        protected List<String> item;
        @XmlAttribute(name = "is_array")
        protected String isArray;

        /**
         * Gets the value of the item property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the item property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItem() {
            if (item == null) {
                item = new ArrayList<String>();
            }
            return this.item;
        }

        /**
         * Obtiene el valor de la propiedad isArray.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIsArray() {
            return isArray;
        }

        /**
         * Define el valor de la propiedad isArray.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIsArray(String value) {
            this.isArray = value;
        }

    }

}

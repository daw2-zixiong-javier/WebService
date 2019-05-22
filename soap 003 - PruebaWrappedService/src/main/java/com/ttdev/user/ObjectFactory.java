//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.19 a las 12:04:33 PM BST 
//


package com.ttdev.user;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.ttdev.user package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.ttdev.user
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Usuario }
     * 
     */
    public Usuario createUsuario() {
        return new Usuario();
    }

    /**
     * Create an instance of {@link Usuario.RdfMapping }
     * 
     */
    public Usuario.RdfMapping createUsuarioRdfMapping() {
        return new Usuario.RdfMapping();
    }

    /**
     * Create an instance of {@link Usuario.RdfMapping.Homepage }
     * 
     */
    public Usuario.RdfMapping.Homepage createUsuarioRdfMappingHomepage() {
        return new Usuario.RdfMapping.Homepage();
    }

    /**
     * Create an instance of {@link Usuario.RdfMapping.Name }
     * 
     */
    public Usuario.RdfMapping.Name createUsuarioRdfMappingName() {
        return new Usuario.RdfMapping.Name();
    }

    /**
     * Create an instance of {@link Usuario.Roles }
     * 
     */
    public Usuario.Roles createUsuarioRoles() {
        return new Usuario.Roles();
    }

    /**
     * Create an instance of {@link Usuario.RdfMapping.Rdftype }
     * 
     */
    public Usuario.RdfMapping.Rdftype createUsuarioRdfMappingRdftype() {
        return new Usuario.RdfMapping.Rdftype();
    }

    /**
     * Create an instance of {@link Usuario.RdfMapping.Homepage.Predicates }
     * 
     */
    public Usuario.RdfMapping.Homepage.Predicates createUsuarioRdfMappingHomepagePredicates() {
        return new Usuario.RdfMapping.Homepage.Predicates();
    }

    /**
     * Create an instance of {@link Usuario.RdfMapping.Name.Predicates }
     * 
     */
    public Usuario.RdfMapping.Name.Predicates createUsuarioRdfMappingNamePredicates() {
        return new Usuario.RdfMapping.Name.Predicates();
    }

}

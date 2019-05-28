//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.6 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: PM.05.28 a las 12:33:25 PM BST 
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
     * Create an instance of {@link Usuario.User }
     * 
     */
    public Usuario.User createUsuarioUser() {
        return new Usuario.User();
    }

    /**
     * Create an instance of {@link Usuario.User.RdfMapping }
     * 
     */
    public Usuario.User.RdfMapping createUsuarioUserRdfMapping() {
        return new Usuario.User.RdfMapping();
    }

    /**
     * Create an instance of {@link Usuario.User.RdfMapping.Homepage }
     * 
     */
    public Usuario.User.RdfMapping.Homepage createUsuarioUserRdfMappingHomepage() {
        return new Usuario.User.RdfMapping.Homepage();
    }

    /**
     * Create an instance of {@link Usuario.User.RdfMapping.Name }
     * 
     */
    public Usuario.User.RdfMapping.Name createUsuarioUserRdfMappingName() {
        return new Usuario.User.RdfMapping.Name();
    }

    /**
     * Create an instance of {@link Usuario.User.Roles }
     * 
     */
    public Usuario.User.Roles createUsuarioUserRoles() {
        return new Usuario.User.Roles();
    }

    /**
     * Create an instance of {@link Usuario.User.RdfMapping.Rdftype }
     * 
     */
    public Usuario.User.RdfMapping.Rdftype createUsuarioUserRdfMappingRdftype() {
        return new Usuario.User.RdfMapping.Rdftype();
    }

    /**
     * Create an instance of {@link Usuario.User.RdfMapping.Homepage.Predicates }
     * 
     */
    public Usuario.User.RdfMapping.Homepage.Predicates createUsuarioUserRdfMappingHomepagePredicates() {
        return new Usuario.User.RdfMapping.Homepage.Predicates();
    }

    /**
     * Create an instance of {@link Usuario.User.RdfMapping.Name.Predicates }
     * 
     */
    public Usuario.User.RdfMapping.Name.Predicates createUsuarioUserRdfMappingNamePredicates() {
        return new Usuario.User.RdfMapping.Name.Predicates();
    }

}

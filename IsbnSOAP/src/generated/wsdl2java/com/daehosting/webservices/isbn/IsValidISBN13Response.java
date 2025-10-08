
package com.daehosting.webservices.isbn;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java de anonymous complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="IsValidISBN13Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "isValidISBN13Result"
})
@XmlRootElement(name = "IsValidISBN13Response")
public class IsValidISBN13Response {

    @XmlElement(name = "IsValidISBN13Result")
    protected boolean isValidISBN13Result;

    /**
     * Obtém o valor da propriedade isValidISBN13Result.
     * 
     */
    public boolean isIsValidISBN13Result() {
        return isValidISBN13Result;
    }

    /**
     * Define o valor da propriedade isValidISBN13Result.
     * 
     */
    public void setIsValidISBN13Result(boolean value) {
        this.isValidISBN13Result = value;
    }

}

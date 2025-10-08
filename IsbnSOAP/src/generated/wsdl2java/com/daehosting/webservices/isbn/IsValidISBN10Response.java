
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
 *         &lt;element name="IsValidISBN10Result" type="{http://www.w3.org/2001/XMLSchema}boolean"/&gt;
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
    "isValidISBN10Result"
})
@XmlRootElement(name = "IsValidISBN10Response")
public class IsValidISBN10Response {

    @XmlElement(name = "IsValidISBN10Result")
    protected boolean isValidISBN10Result;

    /**
     * Obtém o valor da propriedade isValidISBN10Result.
     * 
     */
    public boolean isIsValidISBN10Result() {
        return isValidISBN10Result;
    }

    /**
     * Define o valor da propriedade isValidISBN10Result.
     * 
     */
    public void setIsValidISBN10Result(boolean value) {
        this.isValidISBN10Result = value;
    }

}

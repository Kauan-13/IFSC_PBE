
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
 *         &lt;element name="sISBN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "sisbn"
})
@XmlRootElement(name = "IsValidISBN10")
public class IsValidISBN10 {

    @XmlElement(name = "sISBN", required = true)
    protected String sisbn;

    /**
     * Obtém o valor da propriedade sisbn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSISBN() {
        return sisbn;
    }

    /**
     * Define o valor da propriedade sisbn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSISBN(String value) {
        this.sisbn = value;
    }

}

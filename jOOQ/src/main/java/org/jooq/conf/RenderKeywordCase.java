
package org.jooq.conf;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RenderKeywordCase.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="RenderKeywordCase"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="AS_IS"/&gt;
 *     &lt;enumeration value="LOWER"/&gt;
 *     &lt;enumeration value="UPPER"/&gt;
 *     &lt;enumeration value="PASCAL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RenderKeywordCase")
@XmlEnum
public enum RenderKeywordCase {


    /**
     * Keywords are rendered "as is", i.e. mostly in lower case. For instance:
     *            select .. from .. where ..
     * 
     */
    AS_IS,

    /**
     * Keywords are rendered in lower case. For instance:
     *            select .. from .. where ..
     * 
     */
    LOWER,

    /**
     * Keywords are rendered in upper case. For instance:
     *            SELECT .. FROM .. WHERE ..
     * 
     */
    UPPER,

    /**
     * Keywords are rendered in Pascal Case. For instance:
     *            Select .. From .. Where ..
     * 
     */
    PASCAL;

    public String value() {
        return name();
    }

    public static RenderKeywordCase fromValue(String v) {
        return valueOf(v);
    }

}

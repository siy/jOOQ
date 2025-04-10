
package org.jooq.meta.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Nullability.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="Nullability"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ALL"/&gt;
 *     &lt;enumeration value="NULL"/&gt;
 *     &lt;enumeration value="NOT_NULL"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "Nullability")
@XmlEnum
public enum Nullability {


    /**
     * A {@link ForcedType} should match all columns, attributes, and parameters, irrespective of nullability.
     * 
     */
    ALL,

    /**
     * A {@link ForcedType} should match only columns, attributes, and parameters, which are nullable.
     * 
     */
    NULL,

    /**
     * A {@link ForcedType} should match only columns, attributes, and parameters, which are non-nullable.
     * 
     */
    NOT_NULL;

    public String value() {
        return name();
    }

    public static Nullability fromValue(String v) {
        return valueOf(v);
    }

}

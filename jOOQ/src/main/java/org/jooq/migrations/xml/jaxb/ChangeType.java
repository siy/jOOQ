
package org.jooq.migrations.xml.jaxb;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ChangeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <pre>
 * &lt;simpleType name="ChangeType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="ADD"/&gt;
 *     &lt;enumeration value="MODIFY"/&gt;
 *     &lt;enumeration value="DELETE"/&gt;
 *     &lt;enumeration value="RENAME"/&gt;
 *     &lt;enumeration value="COPY"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "ChangeType")
@XmlEnum
public enum ChangeType {


    /**
     * ADD a file to the migration.
     * 
     */
    ADD,

    /**
     * MODIFY a file from the migration.
     * 
     */
    MODIFY,

    /**
     * DELETE a file from the migration.
     * 
     */
    DELETE,

    /**
     * RENAME a file in the migration.
     * 
     */
    RENAME,

    /**
     * COPY a file within the migration.
     * 
     */
    COPY;

    public String value() {
        return name();
    }

    public static ChangeType fromValue(String v) {
        return valueOf(v);
    }

}

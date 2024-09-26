/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.hsqldb.information_schema.tables;


import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.hsqldb.information_schema.InformationSchema;
import org.jooq.meta.hsqldb.information_schema.Keys;


/**
 * one row for each check constraint included in a domain definition
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class DomainConstraints extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code>
     */
    public static final DomainConstraints DOMAIN_CONSTRAINTS = new DomainConstraints();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.CONSTRAINT_CATALOG</code>.
     */
    public final TableField<Record, String> CONSTRAINT_CATALOG = createField(DSL.name("CONSTRAINT_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.CONSTRAINT_SCHEMA</code>.
     */
    public final TableField<Record, String> CONSTRAINT_SCHEMA = createField(DSL.name("CONSTRAINT_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.CONSTRAINT_NAME</code>.
     */
    public final TableField<Record, String> CONSTRAINT_NAME = createField(DSL.name("CONSTRAINT_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.DOMAIN_CATALOG</code>.
     */
    public final TableField<Record, String> DOMAIN_CATALOG = createField(DSL.name("DOMAIN_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.DOMAIN_SCHEMA</code>.
     */
    public final TableField<Record, String> DOMAIN_SCHEMA = createField(DSL.name("DOMAIN_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.DOMAIN_NAME</code>.
     */
    public final TableField<Record, String> DOMAIN_NAME = createField(DSL.name("DOMAIN_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.IS_DEFERRABLE</code>.
     */
    public final TableField<Record, String> IS_DEFERRABLE = createField(DSL.name("IS_DEFERRABLE"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS.INITIALLY_DEFERRED</code>.
     */
    public final TableField<Record, String> INITIALLY_DEFERRED = createField(DSL.name("INITIALLY_DEFERRED"), SQLDataType.VARCHAR(3), this, "");

    private DomainConstraints(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private DomainConstraints(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("one row for each check constraint included in a domain definition"), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code>
     * table reference
     */
    public DomainConstraints(String alias) {
        this(DSL.name(alias), DOMAIN_CONSTRAINTS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code>
     * table reference
     */
    public DomainConstraints(Name alias) {
        this(alias, DOMAIN_CONSTRAINTS);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.DOMAIN_CONSTRAINTS</code> table
     * reference
     */
    public DomainConstraints() {
        this(DSL.name("DOMAIN_CONSTRAINTS"), null);
    }

    public <O extends Record> DomainConstraints(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, DOMAIN_CONSTRAINTS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_DOMAIN_CONSTRAINTS__SYNTHETIC_PK_CHECK_CONSTRAINTS, Keys.SYNTHETIC_FK_DOMAIN_CONSTRAINTS__SYNTHETIC_PK_DOMAINS, Keys.SYNTHETIC_FK_DOMAIN_CONSTRAINTS__SYNTHETIC_PK_SCHEMATA);
    }

    private transient CheckConstraints _checkConstraints;

    /**
     * Get the implicit join path to the
     * <code>INFORMATION_SCHEMA.CHECK_CONSTRAINTS</code> table.
     */
    public CheckConstraints checkConstraints() {
        if (_checkConstraints == null)
            _checkConstraints = new CheckConstraints(this, Keys.SYNTHETIC_FK_DOMAIN_CONSTRAINTS__SYNTHETIC_PK_CHECK_CONSTRAINTS, null);

        return _checkConstraints;
    }

    private transient Domains _domains;

    /**
     * Get the implicit join path to the <code>INFORMATION_SCHEMA.DOMAINS</code>
     * table.
     */
    public Domains domains() {
        if (_domains == null)
            _domains = new Domains(this, Keys.SYNTHETIC_FK_DOMAIN_CONSTRAINTS__SYNTHETIC_PK_DOMAINS, null);

        return _domains;
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>INFORMATION_SCHEMA.SCHEMATA</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.SYNTHETIC_FK_DOMAIN_CONSTRAINTS__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    @Override
    public DomainConstraints as(String alias) {
        return new DomainConstraints(DSL.name(alias), this);
    }

    @Override
    public DomainConstraints as(Name alias) {
        return new DomainConstraints(alias, this);
    }

    @Override
    public DomainConstraints as(Table<?> alias) {
        return new DomainConstraints(alias.getQualifiedName(), this);
    }
}

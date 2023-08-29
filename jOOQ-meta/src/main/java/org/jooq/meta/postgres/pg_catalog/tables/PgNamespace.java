/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.pg_catalog.tables;


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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.pg_catalog.Keys;
import org.jooq.meta.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgNamespace extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_namespace</code>
     */
    public static final PgNamespace PG_NAMESPACE = new PgNamespace();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_namespace.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspname</code>.
     */
    public final TableField<Record, String> NSPNAME = createField(DSL.name("nspname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspowner</code>.
     */
    public final TableField<Record, Long> NSPOWNER = createField(DSL.name("nspowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_namespace.nspacl</code>.
     */
    public final TableField<Record, String[]> NSPACL = createField(DSL.name("nspacl"), SQLDataType.VARCHAR.array(), this, "");

    private PgNamespace(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgNamespace(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace(String alias) {
        this(DSL.name(alias), PG_NAMESPACE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace(Name alias) {
        this(alias, PG_NAMESPACE);
    }

    /**
     * Create a <code>pg_catalog.pg_namespace</code> table reference
     */
    public PgNamespace() {
        this(DSL.name("pg_namespace"), null);
    }

    public <O extends Record> PgNamespace(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, PG_NAMESPACE);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_PG_NAMESPACE;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_NAMESPACE_OID_INDEX, Keys.PG_NAMESPACE_NSPNAME_INDEX);
    }

    private transient PgClass _pgClass;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_class</code> table
     */
    public PgClass pgClass() {
        if (_pgClass == null)
            _pgClass = new PgClass(this, null, Keys.PG_CLASS__SYNTHETIC_FK_PG_CLASS__SYNTHETIC_PK_PG_NAMESPACE.getInverseKey());

        return _pgClass;
    }

    private transient PgConstraint _pgConstraint;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_constraint</code> table
     */
    public PgConstraint pgConstraint() {
        if (_pgConstraint == null)
            _pgConstraint = new PgConstraint(this, null, Keys.PG_CONSTRAINT__SYNTHETIC_FK_PG_CONSTRAINT__SYNTHETIC_PK_PG_NAMESPACE.getInverseKey());

        return _pgConstraint;
    }

    private transient PgProc _pgProc;

    /**
     * Get the implicit to-many join path to the <code>pg_catalog.pg_proc</code>
     * table
     */
    public PgProc pgProc() {
        if (_pgProc == null)
            _pgProc = new PgProc(this, null, Keys.PG_PROC__SYNTHETIC_FK_PG_PROC__SYNTHETIC_PK_PG_NAMESPACE.getInverseKey());

        return _pgProc;
    }

    private transient PgType _pgType;

    /**
     * Get the implicit to-many join path to the <code>pg_catalog.pg_type</code>
     * table
     */
    public PgType pgType() {
        if (_pgType == null)
            _pgType = new PgType(this, null, Keys.PG_TYPE__SYNTHETIC_FK_PG_TYPE__SYNTHETIC_PK_PG_NAMESPACE.getInverseKey());

        return _pgType;
    }

    @Override
    public PgNamespace as(String alias) {
        return new PgNamespace(DSL.name(alias), this);
    }

    @Override
    public PgNamespace as(Name alias) {
        return new PgNamespace(alias, this);
    }

    @Override
    public PgNamespace as(Table<?> alias) {
        return new PgNamespace(alias.getQualifiedName(), this);
    }
}

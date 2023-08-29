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
import org.jooq.impl.DefaultDataType;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.pg_catalog.Keys;
import org.jooq.meta.postgres.pg_catalog.PgCatalog;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PgClass extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>pg_catalog.pg_class</code>
     */
    public static final PgClass PG_CLASS = new PgClass();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>pg_catalog.pg_class.oid</code>.
     */
    public final TableField<Record, Long> OID = createField(DSL.name("oid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relname</code>.
     */
    public final TableField<Record, String> RELNAME = createField(DSL.name("relname"), SQLDataType.VARCHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relnamespace</code>.
     */
    public final TableField<Record, Long> RELNAMESPACE = createField(DSL.name("relnamespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltype</code>.
     */
    public final TableField<Record, Long> RELTYPE = createField(DSL.name("reltype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reloftype</code>.
     */
    public final TableField<Record, Long> RELOFTYPE = createField(DSL.name("reloftype"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relowner</code>.
     */
    public final TableField<Record, Long> RELOWNER = createField(DSL.name("relowner"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relam</code>.
     */
    public final TableField<Record, Long> RELAM = createField(DSL.name("relam"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relfilenode</code>.
     */
    public final TableField<Record, Long> RELFILENODE = createField(DSL.name("relfilenode"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltablespace</code>.
     */
    public final TableField<Record, Long> RELTABLESPACE = createField(DSL.name("reltablespace"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relpages</code>.
     */
    public final TableField<Record, Integer> RELPAGES = createField(DSL.name("relpages"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltuples</code>.
     */
    public final TableField<Record, Float> RELTUPLES = createField(DSL.name("reltuples"), SQLDataType.REAL.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relallvisible</code>.
     */
    public final TableField<Record, Integer> RELALLVISIBLE = createField(DSL.name("relallvisible"), SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reltoastrelid</code>.
     */
    public final TableField<Record, Long> RELTOASTRELID = createField(DSL.name("reltoastrelid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasindex</code>.
     */
    public final TableField<Record, Boolean> RELHASINDEX = createField(DSL.name("relhasindex"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relisshared</code>.
     */
    public final TableField<Record, Boolean> RELISSHARED = createField(DSL.name("relisshared"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relpersistence</code>.
     */
    public final TableField<Record, String> RELPERSISTENCE = createField(DSL.name("relpersistence"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relkind</code>.
     */
    public final TableField<Record, String> RELKIND = createField(DSL.name("relkind"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relnatts</code>.
     */
    public final TableField<Record, Short> RELNATTS = createField(DSL.name("relnatts"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relchecks</code>.
     */
    public final TableField<Record, Short> RELCHECKS = createField(DSL.name("relchecks"), SQLDataType.SMALLINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhasrules</code>.
     */
    public final TableField<Record, Boolean> RELHASRULES = createField(DSL.name("relhasrules"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhastriggers</code>.
     */
    public final TableField<Record, Boolean> RELHASTRIGGERS = createField(DSL.name("relhastriggers"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relhassubclass</code>.
     */
    public final TableField<Record, Boolean> RELHASSUBCLASS = createField(DSL.name("relhassubclass"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relrowsecurity</code>.
     */
    public final TableField<Record, Boolean> RELROWSECURITY = createField(DSL.name("relrowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relforcerowsecurity</code>.
     */
    public final TableField<Record, Boolean> RELFORCEROWSECURITY = createField(DSL.name("relforcerowsecurity"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relispopulated</code>.
     */
    public final TableField<Record, Boolean> RELISPOPULATED = createField(DSL.name("relispopulated"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relreplident</code>.
     */
    public final TableField<Record, String> RELREPLIDENT = createField(DSL.name("relreplident"), SQLDataType.CHAR.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relispartition</code>.
     */
    public final TableField<Record, Boolean> RELISPARTITION = createField(DSL.name("relispartition"), SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relrewrite</code>.
     */
    public final TableField<Record, Long> RELREWRITE = createField(DSL.name("relrewrite"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relfrozenxid</code>.
     */
    public final TableField<Record, Long> RELFROZENXID = createField(DSL.name("relfrozenxid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relminmxid</code>.
     */
    public final TableField<Record, Long> RELMINMXID = createField(DSL.name("relminmxid"), SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_class.relacl</code>.
     */
    public final TableField<Record, String[]> RELACL = createField(DSL.name("relacl"), SQLDataType.VARCHAR.array(), this, "");

    /**
     * The column <code>pg_catalog.pg_class.reloptions</code>.
     */
    public final TableField<Record, String[]> RELOPTIONS = createField(DSL.name("reloptions"), SQLDataType.CLOB.array(), this, "");

    /**
     * @deprecated Unknown data type. If this is a qualified, user-defined type,
     * it may have been excluded from code generation. If this is a built-in
     * type, you can define an explicit {@link org.jooq.Binding} to specify how
     * this type should be handled. Deprecation can be turned off using
     * {@literal <deprecationOnUnknownTypes/>} in your code generator
     * configuration.
     */
    @Deprecated
    public final TableField<Record, Object> RELPARTBOUND = createField(DSL.name("relpartbound"), DefaultDataType.getDefaultDataType("\"pg_catalog\".\"pg_node_tree\""), this, "");

    private PgClass(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private PgClass(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass(String alias) {
        this(DSL.name(alias), PG_CLASS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass(Name alias) {
        this(alias, PG_CLASS);
    }

    /**
     * Create a <code>pg_catalog.pg_class</code> table reference
     */
    public PgClass() {
        this(DSL.name("pg_class"), null);
    }

    public <O extends Record> PgClass(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, PG_CLASS);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : PgCatalog.PG_CATALOG;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_PG_CLASS;
    }

    @Override
    public List<UniqueKey<Record>> getUniqueKeys() {
        return Arrays.asList(Keys.PG_CLASS_OID_INDEX, Keys.PG_CLASS_RELNAME_NSP_INDEX);
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.PG_CLASS__SYNTHETIC_FK_PG_CLASS__SYNTHETIC_PK_PG_NAMESPACE);
    }

    private transient PgNamespace _pgNamespace;

    /**
     * Get the implicit join path to the <code>pg_catalog.pg_namespace</code>
     * table.
     */
    public PgNamespace pgNamespace() {
        if (_pgNamespace == null)
            _pgNamespace = new PgNamespace(this, Keys.PG_CLASS__SYNTHETIC_FK_PG_CLASS__SYNTHETIC_PK_PG_NAMESPACE, null);

        return _pgNamespace;
    }

    private transient PgAttribute _pgAttribute;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_attribute</code> table
     */
    public PgAttribute pgAttribute() {
        if (_pgAttribute == null)
            _pgAttribute = new PgAttribute(this, null, Keys.PG_ATTRIBUTE__SYNTHETIC_FK_PG_ATTRIBUTE__SYNTHETIC_PK_PG_CLASS.getInverseKey());

        return _pgAttribute;
    }

    private transient PgConstraint _pgConstraint;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_constraint</code> table
     */
    public PgConstraint pgConstraint() {
        if (_pgConstraint == null)
            _pgConstraint = new PgConstraint(this, null, Keys.PG_CONSTRAINT__SYNTHETIC_FK_PG_CONSTRAINT__SYNTHETIC_PK_PG_CLASS.getInverseKey());

        return _pgConstraint;
    }

    private transient PgIndex _indexClass;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_index</code> table, via the <code>INDEX_CLASS</code>
     * key
     */
    public PgIndex indexClass() {
        if (_indexClass == null)
            _indexClass = new PgIndex(this, null, Keys.PG_INDEX__INDEX_CLASS.getInverseKey());

        return _indexClass;
    }

    private transient PgIndex _tableClass;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_index</code> table, via the <code>TABLE_CLASS</code>
     * key
     */
    public PgIndex tableClass() {
        if (_tableClass == null)
            _tableClass = new PgIndex(this, null, Keys.PG_INDEX__TABLE_CLASS.getInverseKey());

        return _tableClass;
    }

    private transient PgSequence _pgSequence;

    /**
     * Get the implicit to-many join path to the
     * <code>pg_catalog.pg_sequence</code> table
     */
    public PgSequence pgSequence() {
        if (_pgSequence == null)
            _pgSequence = new PgSequence(this, null, Keys.PG_SEQUENCE__SYNTHETIC_FK_PG_SEQUENCE__SYNTHETIC_PK_PG_CLASS.getInverseKey());

        return _pgSequence;
    }

    @Override
    public PgClass as(String alias) {
        return new PgClass(DSL.name(alias), this);
    }

    @Override
    public PgClass as(Name alias) {
        return new PgClass(alias, this);
    }

    @Override
    public PgClass as(Table<?> alias) {
        return new PgClass(alias.getQualifiedName(), this);
    }
}

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
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.hsqldb.information_schema.InformationSchema;
import org.jooq.meta.hsqldb.information_schema.Keys;


/**
 * one row for each external sequence generator
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class Sequences extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.SEQUENCES</code>
     */
    public static final Sequences SEQUENCES = new Sequences();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_CATALOG</code>.
     */
    public final TableField<Record, String> SEQUENCE_CATALOG = createField(DSL.name("SEQUENCE_CATALOG"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_SCHEMA</code>.
     */
    public final TableField<Record, String> SEQUENCE_SCHEMA = createField(DSL.name("SEQUENCE_SCHEMA"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.SEQUENCE_NAME</code>.
     */
    public final TableField<Record, String> SEQUENCE_NAME = createField(DSL.name("SEQUENCE_NAME"), SQLDataType.VARCHAR(128), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.DATA_TYPE</code>.
     */
    public final TableField<Record, String> DATA_TYPE = createField(DSL.name("DATA_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> NUMERIC_PRECISION = createField(DSL.name("NUMERIC_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SEQUENCES.NUMERIC_PRECISION_RADIX</code>.
     */
    public final TableField<Record, Long> NUMERIC_PRECISION_RADIX = createField(DSL.name("NUMERIC_PRECISION_RADIX"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> NUMERIC_SCALE = createField(DSL.name("NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.START_VALUE</code>.
     */
    public final TableField<Record, String> START_VALUE = createField(DSL.name("START_VALUE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.MINIMUM_VALUE</code>.
     */
    public final TableField<Record, String> MINIMUM_VALUE = createField(DSL.name("MINIMUM_VALUE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.MAXIMUM_VALUE</code>.
     */
    public final TableField<Record, String> MAXIMUM_VALUE = createField(DSL.name("MAXIMUM_VALUE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.INCREMENT</code>.
     */
    public final TableField<Record, String> INCREMENT = createField(DSL.name("INCREMENT"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.CYCLE_OPTION</code>.
     */
    public final TableField<Record, String> CYCLE_OPTION = createField(DSL.name("CYCLE_OPTION"), SQLDataType.VARCHAR(3), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.DECLARED_DATA_TYPE</code>.
     */
    public final TableField<Record, String> DECLARED_DATA_TYPE = createField(DSL.name("DECLARED_DATA_TYPE"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SEQUENCES.DECLARED_NUMERIC_PRECISION</code>.
     */
    public final TableField<Record, Long> DECLARED_NUMERIC_PRECISION = createField(DSL.name("DECLARED_NUMERIC_PRECISION"), SQLDataType.BIGINT, this, "");

    /**
     * The column
     * <code>INFORMATION_SCHEMA.SEQUENCES.DECLARED_NUMERIC_SCALE</code>.
     */
    public final TableField<Record, Long> DECLARED_NUMERIC_SCALE = createField(DSL.name("DECLARED_NUMERIC_SCALE"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.START_WITH</code>.
     */
    public final TableField<Record, String> START_WITH = createField(DSL.name("START_WITH"), SQLDataType.VARCHAR(65536), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.SEQUENCES.NEXT_VALUE</code>.
     */
    public final TableField<Record, String> NEXT_VALUE = createField(DSL.name("NEXT_VALUE"), SQLDataType.VARCHAR(65536), this, "");

    private Sequences(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Sequences(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment("one row for each external sequence generator"), TableOptions.table(), where);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SEQUENCES</code> table
     * reference
     */
    public Sequences(String alias) {
        this(DSL.name(alias), SEQUENCES);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.SEQUENCES</code> table
     * reference
     */
    public Sequences(Name alias) {
        this(alias, SEQUENCES);
    }

    /**
     * Create a <code>INFORMATION_SCHEMA.SEQUENCES</code> table reference
     */
    public Sequences() {
        this(DSL.name("SEQUENCES"), null);
    }

    public <O extends Record> Sequences(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, SEQUENCES);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_SEQUENCES;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.SYNTHETIC_FK_SEQUENCES__SYNTHETIC_PK_SCHEMATA);
    }

    private transient Schemata _schemata;

    /**
     * Get the implicit join path to the
     * <code>INFORMATION_SCHEMA.SCHEMATA</code> table.
     */
    public Schemata schemata() {
        if (_schemata == null)
            _schemata = new Schemata(this, Keys.SYNTHETIC_FK_SEQUENCES__SYNTHETIC_PK_SCHEMATA, null);

        return _schemata;
    }

    @Override
    public Sequences as(String alias) {
        return new Sequences(DSL.name(alias), this);
    }

    @Override
    public Sequences as(Name alias) {
        return new Sequences(alias, this);
    }

    @Override
    public Sequences as(Table<?> alias) {
        return new Sequences(alias.getQualifiedName(), this);
    }
}

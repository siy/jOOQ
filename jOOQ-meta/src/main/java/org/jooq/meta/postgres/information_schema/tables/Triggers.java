/*
 * This file is generated by jOOQ.
 */
package org.jooq.meta.postgres.information_schema.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.InverseForeignKey;
import org.jooq.Name;
import org.jooq.Path;
import org.jooq.Record;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;
import org.jooq.meta.postgres.information_schema.InformationSchema;
import org.jooq.meta.postgres.information_schema.Keys;
import org.jooq.meta.postgres.information_schema.tables.Tables.TablesPath;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Triggers extends TableImpl<Record> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>information_schema.triggers</code>
     */
    public static final Triggers TRIGGERS = new Triggers();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<Record> getRecordType() {
        return Record.class;
    }

    /**
     * The column <code>information_schema.triggers.trigger_catalog</code>.
     */
    public final TableField<Record, String> TRIGGER_CATALOG = createField(DSL.name("trigger_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.trigger_schema</code>.
     */
    public final TableField<Record, String> TRIGGER_SCHEMA = createField(DSL.name("trigger_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.trigger_name</code>.
     */
    public final TableField<Record, String> TRIGGER_NAME = createField(DSL.name("trigger_name"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_manipulation</code>.
     */
    public final TableField<Record, String> EVENT_MANIPULATION = createField(DSL.name("event_manipulation"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_object_catalog</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_CATALOG = createField(DSL.name("event_object_catalog"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_object_schema</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_SCHEMA = createField(DSL.name("event_object_schema"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.event_object_table</code>.
     */
    public final TableField<Record, String> EVENT_OBJECT_TABLE = createField(DSL.name("event_object_table"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_order</code>.
     */
    public final TableField<Record, Integer> ACTION_ORDER = createField(DSL.name("action_order"), SQLDataType.INTEGER, this, "");

    /**
     * The column <code>information_schema.triggers.action_condition</code>.
     */
    public final TableField<Record, String> ACTION_CONDITION = createField(DSL.name("action_condition"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_statement</code>.
     */
    public final TableField<Record, String> ACTION_STATEMENT = createField(DSL.name("action_statement"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_orientation</code>.
     */
    public final TableField<Record, String> ACTION_ORIENTATION = createField(DSL.name("action_orientation"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.action_timing</code>.
     */
    public final TableField<Record, String> ACTION_TIMING = createField(DSL.name("action_timing"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_old_table</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_OLD_TABLE = createField(DSL.name("action_reference_old_table"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_new_table</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_NEW_TABLE = createField(DSL.name("action_reference_new_table"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_old_row</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_OLD_ROW = createField(DSL.name("action_reference_old_row"), SQLDataType.VARCHAR, this, "");

    /**
     * The column
     * <code>information_schema.triggers.action_reference_new_row</code>.
     */
    public final TableField<Record, String> ACTION_REFERENCE_NEW_ROW = createField(DSL.name("action_reference_new_row"), SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>information_schema.triggers.created</code>.
     */
    public final TableField<Record, Timestamp> CREATED = createField(DSL.name("created"), SQLDataType.TIMESTAMP(0), this, "");

    private Triggers(Name alias, Table<Record> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private Triggers(Name alias, Table<Record> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view(), where);
    }

    /**
     * Create an aliased <code>information_schema.triggers</code> table
     * reference
     */
    public Triggers(String alias) {
        this(DSL.name(alias), TRIGGERS);
    }

    /**
     * Create an aliased <code>information_schema.triggers</code> table
     * reference
     */
    public Triggers(Name alias) {
        this(alias, TRIGGERS);
    }

    /**
     * Create a <code>information_schema.triggers</code> table reference
     */
    public Triggers() {
        this(DSL.name("triggers"), null);
    }

    public <O extends Record> Triggers(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
        super(path, childPath, parentPath, TRIGGERS);
    }

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    public static class TriggersPath extends Triggers implements Path<Record> {
        public <O extends Record> TriggersPath(Table<O> path, ForeignKey<O, Record> childPath, InverseForeignKey<O, Record> parentPath) {
            super(path, childPath, parentPath);
        }
        private TriggersPath(Name alias, Table<Record> aliased) {
            super(alias, aliased);
        }

        @Override
        public TriggersPath as(String alias) {
            return new TriggersPath(DSL.name(alias), this);
        }

        @Override
        public TriggersPath as(Name alias) {
            return new TriggersPath(alias, this);
        }

        @Override
        public TriggersPath as(Table<?> alias) {
            return new TriggersPath(alias.getQualifiedName(), this);
        }
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : InformationSchema.INFORMATION_SCHEMA;
    }

    @Override
    public UniqueKey<Record> getPrimaryKey() {
        return Keys.SYNTHETIC_PK_TRIGGERS;
    }

    @Override
    public List<ForeignKey<Record, ?>> getReferences() {
        return Arrays.asList(Keys.TRIGGERS__SYNTHETIC_FK_TRIGGERS__SYNTHETIC_PK_TABLES);
    }

    private transient TablesPath _tables;

    /**
     * Get the implicit join path to the <code>information_schema.tables</code>
     * table.
     */
    public TablesPath tables() {
        if (_tables == null)
            _tables = new TablesPath(this, Keys.TRIGGERS__SYNTHETIC_FK_TRIGGERS__SYNTHETIC_PK_TABLES, null);

        return _tables;
    }

    @Override
    public Triggers as(String alias) {
        return new Triggers(DSL.name(alias), this);
    }

    @Override
    public Triggers as(Name alias) {
        return new Triggers(alias, this);
    }

    @Override
    public Triggers as(Table<?> alias) {
        return new Triggers(alias.getQualifiedName(), this);
    }
}

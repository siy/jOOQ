/*
 * This file is generated by jOOQ.
 */
package org.jooq.example.testcontainersflyway.db.tables;


import java.math.BigDecimal;
import java.util.Collection;

import org.jooq.Condition;
import org.jooq.Field;
import org.jooq.Name;
import org.jooq.PlainSQL;
import org.jooq.QueryPart;
import org.jooq.SQL;
import org.jooq.Schema;
import org.jooq.Select;
import org.jooq.Stringly;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.TableOptions;
import org.jooq.example.testcontainersflyway.db.Public;
import org.jooq.example.testcontainersflyway.db.enums.MpaaRating;
import org.jooq.example.testcontainersflyway.db.tables.records.FilmListRecord;
import org.jooq.impl.DSL;
import org.jooq.impl.SQLDataType;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class FilmList extends TableImpl<FilmListRecord> {

    private static final long serialVersionUID = 1L;

    /**
     * The reference instance of <code>public.film_list</code>
     */
    public static final FilmList FILM_LIST = new FilmList();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmListRecord> getRecordType() {
        return FilmListRecord.class;
    }

    /**
     * The column <code>public.film_list.fid</code>.
     */
    public final TableField<FilmListRecord, Long> FID = createField(DSL.name("fid"), SQLDataType.BIGINT, this, "");

    /**
     * The column <code>public.film_list.title</code>.
     */
    public final TableField<FilmListRecord, String> TITLE = createField(DSL.name("title"), SQLDataType.VARCHAR(255), this, "");

    /**
     * The column <code>public.film_list.description</code>.
     */
    public final TableField<FilmListRecord, String> DESCRIPTION = createField(DSL.name("description"), SQLDataType.CLOB, this, "");

    /**
     * The column <code>public.film_list.category</code>.
     */
    public final TableField<FilmListRecord, String> CATEGORY = createField(DSL.name("category"), SQLDataType.VARCHAR(25), this, "");

    /**
     * The column <code>public.film_list.price</code>.
     */
    public final TableField<FilmListRecord, BigDecimal> PRICE = createField(DSL.name("price"), SQLDataType.NUMERIC(4, 2), this, "");

    /**
     * The column <code>public.film_list.length</code>.
     */
    public final TableField<FilmListRecord, Short> LENGTH = createField(DSL.name("length"), SQLDataType.SMALLINT, this, "");

    /**
     * The column <code>public.film_list.rating</code>.
     */
    public final TableField<FilmListRecord, MpaaRating> RATING = createField(DSL.name("rating"), SQLDataType.VARCHAR.asEnumDataType(MpaaRating.class), this, "");

    /**
     * The column <code>public.film_list.actors</code>.
     */
    public final TableField<FilmListRecord, String> ACTORS = createField(DSL.name("actors"), SQLDataType.CLOB, this, "");

    private FilmList(Name alias, Table<FilmListRecord> aliased) {
        this(alias, aliased, (Field<?>[]) null, null);
    }

    private FilmList(Name alias, Table<FilmListRecord> aliased, Field<?>[] parameters, Condition where) {
        super(alias, null, aliased, parameters, DSL.comment(""), TableOptions.view("""
        create view "film_list" as  SELECT film.film_id AS fid,
          film.title,
          film.description,
          category.name AS category,
          film.rental_rate AS price,
          film.length,
          film.rating,
          group_concat((((actor.first_name)::text || ' '::text) || (actor.last_name)::text)) AS actors
         FROM ((((category
           LEFT JOIN film_category ON ((category.category_id = film_category.category_id)))
           LEFT JOIN film ON ((film_category.film_id = film.film_id)))
           JOIN film_actor ON ((film.film_id = film_actor.film_id)))
           JOIN actor ON ((film_actor.actor_id = actor.actor_id)))
        GROUP BY film.film_id, film.title, film.description, category.name, film.rental_rate, film.length, film.rating;
        """), where);
    }

    /**
     * Create an aliased <code>public.film_list</code> table reference
     */
    public FilmList(String alias) {
        this(DSL.name(alias), FILM_LIST);
    }

    /**
     * Create an aliased <code>public.film_list</code> table reference
     */
    public FilmList(Name alias) {
        this(alias, FILM_LIST);
    }

    /**
     * Create a <code>public.film_list</code> table reference
     */
    public FilmList() {
        this(DSL.name("film_list"), null);
    }

    @Override
    public Schema getSchema() {
        return aliased() ? null : Public.PUBLIC;
    }

    @Override
    public FilmList as(String alias) {
        return new FilmList(DSL.name(alias), this);
    }

    @Override
    public FilmList as(Name alias) {
        return new FilmList(alias, this);
    }

    @Override
    public FilmList as(Table<?> alias) {
        return new FilmList(alias.getQualifiedName(), this);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(String name) {
        return new FilmList(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Name name) {
        return new FilmList(name, null);
    }

    /**
     * Rename this table
     */
    @Override
    public FilmList rename(Table<?> name) {
        return new FilmList(name.getQualifiedName(), null);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Condition condition) {
        return new FilmList(getQualifiedName(), aliased() ? this : null, null, condition);
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Collection<? extends Condition> conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Condition... conditions) {
        return where(DSL.and(conditions));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList where(Field<Boolean> condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(SQL condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(@Stringly.SQL String condition) {
        return where(DSL.condition(condition));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(@Stringly.SQL String condition, Object... binds) {
        return where(DSL.condition(condition, binds));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    @PlainSQL
    public FilmList where(@Stringly.SQL String condition, QueryPart... parts) {
        return where(DSL.condition(condition, parts));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList whereExists(Select<?> select) {
        return where(DSL.exists(select));
    }

    /**
     * Create an inline derived table from this table
     */
    @Override
    public FilmList whereNotExists(Select<?> select) {
        return where(DSL.notExists(select));
    }
}

/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Other licenses:
 * -----------------------------------------------------------------------------
 * Commercial licenses for this work are available. These replace the above
 * Apache-2.0 license and offer limited warranties, support, maintenance, and
 * commercial database integrations.
 *
 * For more information, please visit: https://www.jooq.org/legal/licensing
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */
package org.jooq.impl;

import static org.jooq.impl.DSL.row;

import java.util.Arrays;
import java.util.Collection;

import org.jooq.BetweenAndStep19;
import org.jooq.Comparator;
import org.jooq.Condition;
import org.jooq.DataType;
import org.jooq.Field;
import org.jooq.Function19;
import org.jooq.QuantifiedSelect;
import org.jooq.Record;
import org.jooq.Record19;
import org.jooq.Result;
import org.jooq.Row;
import org.jooq.Row19;
import org.jooq.Select;
import org.jooq.SelectField;
import org.jooq.Statement;

import org.jetbrains.annotations.NotNull;

/**
 * @author Lukas Eder
 */
@SuppressWarnings({ "rawtypes", "unchecked" })
final class RowImpl19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>
extends
    AbstractRow<Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>>
implements
    Row19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> {

    RowImpl19(SelectField<T1> field1, SelectField<T2> field2, SelectField<T3> field3, SelectField<T4> field4, SelectField<T5> field5, SelectField<T6> field6, SelectField<T7> field7, SelectField<T8> field8, SelectField<T9> field9, SelectField<T10> field10, SelectField<T11> field11, SelectField<T12> field12, SelectField<T13> field13, SelectField<T14> field14, SelectField<T15> field15, SelectField<T16> field16, SelectField<T17> field17, SelectField<T18> field18, SelectField<T19> field19) {
        super(field1, field2, field3, field4, field5, field6, field7, field8, field9, field10, field11, field12, field13, field14, field15, field16, field17, field18, field19);
    }

    RowImpl19(FieldsImpl<?> fields) {
        super((FieldsImpl) fields);
    }

    // ------------------------------------------------------------------------
    // Mapping convenience methods
    // ------------------------------------------------------------------------

    @Override
    public final SelectField mapping(Function19 function) {
        return convertFrom(r -> r == null ? null : function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18(), r.value19()));
    }

    @Override
    public final SelectField mapping(Class uType, Function19 function) {
        return convertFrom(uType, r -> r == null ? null : function.apply(r.value1(), r.value2(), r.value3(), r.value4(), r.value5(), r.value6(), r.value7(), r.value8(), r.value9(), r.value10(), r.value11(), r.value12(), r.value13(), r.value14(), r.value15(), r.value16(), r.value17(), r.value18(), r.value19()));
    }

    // ------------------------------------------------------------------------
    // XXX: Row accessor API
    // ------------------------------------------------------------------------

    @Override
    public final Field<T1> field1() {
        return (@NotNull Field<T1>) fields.field(0);
    }

    @Override
    public final Field<T2> field2() {
        return (@NotNull Field<T2>) fields.field(1);
    }

    @Override
    public final Field<T3> field3() {
        return (@NotNull Field<T3>) fields.field(2);
    }

    @Override
    public final Field<T4> field4() {
        return (@NotNull Field<T4>) fields.field(3);
    }

    @Override
    public final Field<T5> field5() {
        return (@NotNull Field<T5>) fields.field(4);
    }

    @Override
    public final Field<T6> field6() {
        return (@NotNull Field<T6>) fields.field(5);
    }

    @Override
    public final Field<T7> field7() {
        return (@NotNull Field<T7>) fields.field(6);
    }

    @Override
    public final Field<T8> field8() {
        return (@NotNull Field<T8>) fields.field(7);
    }

    @Override
    public final Field<T9> field9() {
        return (@NotNull Field<T9>) fields.field(8);
    }

    @Override
    public final Field<T10> field10() {
        return (@NotNull Field<T10>) fields.field(9);
    }

    @Override
    public final Field<T11> field11() {
        return (@NotNull Field<T11>) fields.field(10);
    }

    @Override
    public final Field<T12> field12() {
        return (@NotNull Field<T12>) fields.field(11);
    }

    @Override
    public final Field<T13> field13() {
        return (@NotNull Field<T13>) fields.field(12);
    }

    @Override
    public final Field<T14> field14() {
        return (@NotNull Field<T14>) fields.field(13);
    }

    @Override
    public final Field<T15> field15() {
        return (@NotNull Field<T15>) fields.field(14);
    }

    @Override
    public final Field<T16> field16() {
        return (@NotNull Field<T16>) fields.field(15);
    }

    @Override
    public final Field<T17> field17() {
        return (@NotNull Field<T17>) fields.field(16);
    }

    @Override
    public final Field<T18> field18() {
        return (@NotNull Field<T18>) fields.field(17);
    }

    @Override
    public final Field<T19> field19() {
        return (@NotNull Field<T19>) fields.field(18);
    }

    // ------------------------------------------------------------------------
    // Generic comparison predicates
    // ------------------------------------------------------------------------

    @Override
    public final Condition compare(Comparator comparator, Row19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> row) {
        return compare(this, comparator, row);
    }

    @Override
    public final Condition compare(Comparator comparator, Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19> record) {
        return compare(this, comparator, record.valuesRow());
    }

    @Override
    public final Condition compare(Comparator comparator, T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(comparator, row(Tools.field(t1, (DataType<T1>) dataType(0)), Tools.field(t2, (DataType<T2>) dataType(1)), Tools.field(t3, (DataType<T3>) dataType(2)), Tools.field(t4, (DataType<T4>) dataType(3)), Tools.field(t5, (DataType<T5>) dataType(4)), Tools.field(t6, (DataType<T6>) dataType(5)), Tools.field(t7, (DataType<T7>) dataType(6)), Tools.field(t8, (DataType<T8>) dataType(7)), Tools.field(t9, (DataType<T9>) dataType(8)), Tools.field(t10, (DataType<T10>) dataType(9)), Tools.field(t11, (DataType<T11>) dataType(10)), Tools.field(t12, (DataType<T12>) dataType(11)), Tools.field(t13, (DataType<T13>) dataType(12)), Tools.field(t14, (DataType<T14>) dataType(13)), Tools.field(t15, (DataType<T15>) dataType(14)), Tools.field(t16, (DataType<T16>) dataType(15)), Tools.field(t17, (DataType<T17>) dataType(16)), Tools.field(t18, (DataType<T18>) dataType(17)), Tools.field(t19, (DataType<T19>) dataType(18))));
    }

    @Override
    public final Condition compare(Comparator comparator, Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(comparator, row(Tools.nullSafe(t1, dataType(0)), Tools.nullSafe(t2, dataType(1)), Tools.nullSafe(t3, dataType(2)), Tools.nullSafe(t4, dataType(3)), Tools.nullSafe(t5, dataType(4)), Tools.nullSafe(t6, dataType(5)), Tools.nullSafe(t7, dataType(6)), Tools.nullSafe(t8, dataType(7)), Tools.nullSafe(t9, dataType(8)), Tools.nullSafe(t10, dataType(9)), Tools.nullSafe(t11, dataType(10)), Tools.nullSafe(t12, dataType(11)), Tools.nullSafe(t13, dataType(12)), Tools.nullSafe(t14, dataType(13)), Tools.nullSafe(t15, dataType(14)), Tools.nullSafe(t16, dataType(15)), Tools.nullSafe(t17, dataType(16)), Tools.nullSafe(t18, dataType(17)), Tools.nullSafe(t19, dataType(18))));
    }

    @Override
    public final Condition compare(Comparator comparator, Select<? extends Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> select) {
        return new RowSubqueryCondition(this, select, comparator);
    }

    @Override
    public final Condition compare(Comparator comparator, QuantifiedSelect<? extends Record19<T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18, T19>> select) {
        return new RowSubqueryCondition(this, select, comparator);
    }

    // ------------------------------------------------------------------------
    // Equal / Not equal comparison predicates
    // ------------------------------------------------------------------------

    @Override
    public final Condition equal(Row19 row) {
        return compare(Comparator.EQUALS, row);
    }

    @Override
    public final Condition equal(Record19 record) {
        return compare(Comparator.EQUALS, record);
    }

    @Override
    public final Condition equal(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(Comparator.EQUALS, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition equal(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(Comparator.EQUALS, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition eq(Row19 row) {
        return equal(row);
    }

    @Override
    public final Condition eq(Record19 record) {
        return equal(record);
    }

    @Override
    public final Condition eq(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return equal(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition eq(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return equal(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition notEqual(Row19 row) {
        return compare(Comparator.NOT_EQUALS, row);
    }

    @Override
    public final Condition notEqual(Record19 record) {
        return compare(Comparator.NOT_EQUALS, record);
    }

    @Override
    public final Condition notEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(Comparator.NOT_EQUALS, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition notEqual(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(Comparator.NOT_EQUALS, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition ne(Row19 row) {
        return notEqual(row);
    }

    @Override
    public final Condition ne(Record19 record) {
        return notEqual(record);
    }

    @Override
    public final Condition ne(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return notEqual(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition ne(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return notEqual(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    // ------------------------------------------------------------------------
    // Ordering comparison predicates
    // ------------------------------------------------------------------------

    @Override
    public final Condition lessThan(Row19 row) {
        return compare(Comparator.LESS, row);
    }

    @Override
    public final Condition lessThan(Record19 record) {
        return compare(Comparator.LESS, record);
    }

    @Override
    public final Condition lessThan(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(Comparator.LESS, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition lessThan(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(Comparator.LESS, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition lt(Row19 row) {
        return lessThan(row);
    }

    @Override
    public final Condition lt(Record19 record) {
        return lessThan(record);
    }

    @Override
    public final Condition lt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return lessThan(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition lt(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return lessThan(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition lessOrEqual(Row19 row) {
        return compare(Comparator.LESS_OR_EQUAL, row);
    }

    @Override
    public final Condition lessOrEqual(Record19 record) {
        return compare(Comparator.LESS_OR_EQUAL, record);
    }

    @Override
    public final Condition lessOrEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(Comparator.LESS_OR_EQUAL, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition lessOrEqual(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(Comparator.LESS_OR_EQUAL, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition le(Row19 row) {
        return lessOrEqual(row);
    }

    @Override
    public final Condition le(Record19 record) {
        return lessOrEqual(record);
    }

    @Override
    public final Condition le(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return lessOrEqual(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition le(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return lessOrEqual(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition greaterThan(Row19 row) {
        return compare(Comparator.GREATER, row);
    }

    @Override
    public final Condition greaterThan(Record19 record) {
        return compare(Comparator.GREATER, record);
    }

    @Override
    public final Condition greaterThan(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(Comparator.GREATER, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition greaterThan(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(Comparator.GREATER, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition gt(Row19 row) {
        return greaterThan(row);
    }

    @Override
    public final Condition gt(Record19 record) {
        return greaterThan(record);
    }

    @Override
    public final Condition gt(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return greaterThan(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition gt(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return greaterThan(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition greaterOrEqual(Row19 row) {
        return compare(Comparator.GREATER_OR_EQUAL, row);
    }

    @Override
    public final Condition greaterOrEqual(Record19 record) {
        return compare(Comparator.GREATER_OR_EQUAL, record);
    }

    @Override
    public final Condition greaterOrEqual(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return compare(Comparator.GREATER_OR_EQUAL, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition greaterOrEqual(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return compare(Comparator.GREATER_OR_EQUAL, t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition ge(Row19 row) {
        return greaterOrEqual(row);
    }

    @Override
    public final Condition ge(Record19 record) {
        return greaterOrEqual(record);
    }

    @Override
    public final Condition ge(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return greaterOrEqual(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    @Override
    public final Condition ge(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return greaterOrEqual(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19);
    }

    // ------------------------------------------------------------------------
    // [NOT] BETWEEN predicates
    // ------------------------------------------------------------------------

    @Override
    public final BetweenAndStep19 between(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return between(row(Tools.field(t1, (DataType) dataType(0)), Tools.field(t2, (DataType) dataType(1)), Tools.field(t3, (DataType) dataType(2)), Tools.field(t4, (DataType) dataType(3)), Tools.field(t5, (DataType) dataType(4)), Tools.field(t6, (DataType) dataType(5)), Tools.field(t7, (DataType) dataType(6)), Tools.field(t8, (DataType) dataType(7)), Tools.field(t9, (DataType) dataType(8)), Tools.field(t10, (DataType) dataType(9)), Tools.field(t11, (DataType) dataType(10)), Tools.field(t12, (DataType) dataType(11)), Tools.field(t13, (DataType) dataType(12)), Tools.field(t14, (DataType) dataType(13)), Tools.field(t15, (DataType) dataType(14)), Tools.field(t16, (DataType) dataType(15)), Tools.field(t17, (DataType) dataType(16)), Tools.field(t18, (DataType) dataType(17)), Tools.field(t19, (DataType) dataType(18))));
    }

    @Override
    public final BetweenAndStep19 between(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return between(row(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19));
    }

    @Override
    public final BetweenAndStep19 between(Row19 row) {
        return new RowBetweenCondition<>(this, row, false, false);
    }

    @Override
    public final BetweenAndStep19 between(Record19 record) {
        return between(record.valuesRow());
    }

    @Override
    public final Condition between(Row19 minValue, Row19 maxValue) {
        return between(minValue).and(maxValue);
    }

    @Override
    public final Condition between(Record19 minValue, Record19 maxValue) {
        return between(minValue).and(maxValue);
    }

    @Override
    public final BetweenAndStep19 betweenSymmetric(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return betweenSymmetric(row(Tools.field(t1, (DataType) dataType(0)), Tools.field(t2, (DataType) dataType(1)), Tools.field(t3, (DataType) dataType(2)), Tools.field(t4, (DataType) dataType(3)), Tools.field(t5, (DataType) dataType(4)), Tools.field(t6, (DataType) dataType(5)), Tools.field(t7, (DataType) dataType(6)), Tools.field(t8, (DataType) dataType(7)), Tools.field(t9, (DataType) dataType(8)), Tools.field(t10, (DataType) dataType(9)), Tools.field(t11, (DataType) dataType(10)), Tools.field(t12, (DataType) dataType(11)), Tools.field(t13, (DataType) dataType(12)), Tools.field(t14, (DataType) dataType(13)), Tools.field(t15, (DataType) dataType(14)), Tools.field(t16, (DataType) dataType(15)), Tools.field(t17, (DataType) dataType(16)), Tools.field(t18, (DataType) dataType(17)), Tools.field(t19, (DataType) dataType(18))));
    }

    @Override
    public final BetweenAndStep19 betweenSymmetric(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return betweenSymmetric(row(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19));
    }

    @Override
    public final BetweenAndStep19 betweenSymmetric(Row19 row) {
        return new RowBetweenCondition<>(this, row, false, true);
    }

    @Override
    public final BetweenAndStep19 betweenSymmetric(Record19 record) {
        return betweenSymmetric(record.valuesRow());
    }

    @Override
    public final Condition betweenSymmetric(Row19 minValue, Row19 maxValue) {
        return betweenSymmetric(minValue).and(maxValue);
    }

    @Override
    public final Condition betweenSymmetric(Record19 minValue, Record19 maxValue) {
        return betweenSymmetric(minValue).and(maxValue);
    }

    @Override
    public final BetweenAndStep19 notBetween(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return notBetween(row(Tools.field(t1, (DataType) dataType(0)), Tools.field(t2, (DataType) dataType(1)), Tools.field(t3, (DataType) dataType(2)), Tools.field(t4, (DataType) dataType(3)), Tools.field(t5, (DataType) dataType(4)), Tools.field(t6, (DataType) dataType(5)), Tools.field(t7, (DataType) dataType(6)), Tools.field(t8, (DataType) dataType(7)), Tools.field(t9, (DataType) dataType(8)), Tools.field(t10, (DataType) dataType(9)), Tools.field(t11, (DataType) dataType(10)), Tools.field(t12, (DataType) dataType(11)), Tools.field(t13, (DataType) dataType(12)), Tools.field(t14, (DataType) dataType(13)), Tools.field(t15, (DataType) dataType(14)), Tools.field(t16, (DataType) dataType(15)), Tools.field(t17, (DataType) dataType(16)), Tools.field(t18, (DataType) dataType(17)), Tools.field(t19, (DataType) dataType(18))));
    }

    @Override
    public final BetweenAndStep19 notBetween(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return notBetween(row(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19));
    }

    @Override
    public final BetweenAndStep19 notBetween(Row19 row) {
        return new RowBetweenCondition<>(this, row, true, false);
    }

    @Override
    public final BetweenAndStep19 notBetween(Record19 record) {
        return notBetween(record.valuesRow());
    }

    @Override
    public final Condition notBetween(Row19 minValue, Row19 maxValue) {
        return notBetween(minValue).and(maxValue);
    }

    @Override
    public final Condition notBetween(Record19 minValue, Record19 maxValue) {
        return notBetween(minValue).and(maxValue);
    }

    @Override
    public final BetweenAndStep19 notBetweenSymmetric(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return notBetweenSymmetric(row(Tools.field(t1, (DataType) dataType(0)), Tools.field(t2, (DataType) dataType(1)), Tools.field(t3, (DataType) dataType(2)), Tools.field(t4, (DataType) dataType(3)), Tools.field(t5, (DataType) dataType(4)), Tools.field(t6, (DataType) dataType(5)), Tools.field(t7, (DataType) dataType(6)), Tools.field(t8, (DataType) dataType(7)), Tools.field(t9, (DataType) dataType(8)), Tools.field(t10, (DataType) dataType(9)), Tools.field(t11, (DataType) dataType(10)), Tools.field(t12, (DataType) dataType(11)), Tools.field(t13, (DataType) dataType(12)), Tools.field(t14, (DataType) dataType(13)), Tools.field(t15, (DataType) dataType(14)), Tools.field(t16, (DataType) dataType(15)), Tools.field(t17, (DataType) dataType(16)), Tools.field(t18, (DataType) dataType(17)), Tools.field(t19, (DataType) dataType(18))));
    }

    @Override
    public final BetweenAndStep19 notBetweenSymmetric(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return notBetweenSymmetric(row(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19));
    }

    @Override
    public final BetweenAndStep19 notBetweenSymmetric(Row19 row) {
        return new RowBetweenCondition<>(this, row, true, true);
    }

    @Override
    public final BetweenAndStep19 notBetweenSymmetric(Record19 record) {
        return notBetweenSymmetric(record.valuesRow());
    }

    @Override
    public final Condition notBetweenSymmetric(Row19 minValue, Row19 maxValue) {
        return notBetweenSymmetric(minValue).and(maxValue);
    }

    @Override
    public final Condition notBetweenSymmetric(Record19 minValue, Record19 maxValue) {
        return notBetweenSymmetric(minValue).and(maxValue);
    }

    // ------------------------------------------------------------------------
    // [NOT] DISTINCT predicates
    // ------------------------------------------------------------------------

    @Override
    public final Condition isNotDistinctFrom(Row19 row) {
        return new RowIsDistinctFrom(this, row, true);
    }

    @Override
    public final Condition isNotDistinctFrom(Record19 record) {
        return isNotDistinctFrom(record.valuesRow());
    }

    @Override
    public final Condition isNotDistinctFrom(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return isNotDistinctFrom(Tools.field(t1, (DataType) dataType(0)), Tools.field(t2, (DataType) dataType(1)), Tools.field(t3, (DataType) dataType(2)), Tools.field(t4, (DataType) dataType(3)), Tools.field(t5, (DataType) dataType(4)), Tools.field(t6, (DataType) dataType(5)), Tools.field(t7, (DataType) dataType(6)), Tools.field(t8, (DataType) dataType(7)), Tools.field(t9, (DataType) dataType(8)), Tools.field(t10, (DataType) dataType(9)), Tools.field(t11, (DataType) dataType(10)), Tools.field(t12, (DataType) dataType(11)), Tools.field(t13, (DataType) dataType(12)), Tools.field(t14, (DataType) dataType(13)), Tools.field(t15, (DataType) dataType(14)), Tools.field(t16, (DataType) dataType(15)), Tools.field(t17, (DataType) dataType(16)), Tools.field(t18, (DataType) dataType(17)), Tools.field(t19, (DataType) dataType(18)));
    }

    @Override
    public final Condition isNotDistinctFrom(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return isNotDistinctFrom(row(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19));
    }

    @Override
    public final Condition isNotDistinctFrom(Select select) {
        return new RowIsDistinctFrom(this, select, true);
    }

    @Override
    public final Condition isDistinctFrom(Row19 row) {
        return new RowIsDistinctFrom(this, row, false);
    }

    @Override
    public final Condition isDistinctFrom(Record19 record) {
        return isDistinctFrom(record.valuesRow());
    }

    @Override
    public final Condition isDistinctFrom(T1 t1, T2 t2, T3 t3, T4 t4, T5 t5, T6 t6, T7 t7, T8 t8, T9 t9, T10 t10, T11 t11, T12 t12, T13 t13, T14 t14, T15 t15, T16 t16, T17 t17, T18 t18, T19 t19) {
        return isDistinctFrom(Tools.field(t1, (DataType) dataType(0)), Tools.field(t2, (DataType) dataType(1)), Tools.field(t3, (DataType) dataType(2)), Tools.field(t4, (DataType) dataType(3)), Tools.field(t5, (DataType) dataType(4)), Tools.field(t6, (DataType) dataType(5)), Tools.field(t7, (DataType) dataType(6)), Tools.field(t8, (DataType) dataType(7)), Tools.field(t9, (DataType) dataType(8)), Tools.field(t10, (DataType) dataType(9)), Tools.field(t11, (DataType) dataType(10)), Tools.field(t12, (DataType) dataType(11)), Tools.field(t13, (DataType) dataType(12)), Tools.field(t14, (DataType) dataType(13)), Tools.field(t15, (DataType) dataType(14)), Tools.field(t16, (DataType) dataType(15)), Tools.field(t17, (DataType) dataType(16)), Tools.field(t18, (DataType) dataType(17)), Tools.field(t19, (DataType) dataType(18)));
    }

    @Override
    public final Condition isDistinctFrom(Field t1, Field t2, Field t3, Field t4, Field t5, Field t6, Field t7, Field t8, Field t9, Field t10, Field t11, Field t12, Field t13, Field t14, Field t15, Field t16, Field t17, Field t18, Field t19) {
        return isDistinctFrom(row(t1, t2, t3, t4, t5, t6, t7, t8, t9, t10, t11, t12, t13, t14, t15, t16, t17, t18, t19));
    }

    @Override
    public final Condition isDistinctFrom(Select select) {
        return new RowIsDistinctFrom(this, select, false);
    }

    // ------------------------------------------------------------------------
    // [NOT] IN predicates
    // ------------------------------------------------------------------------

    @Override
    public final Condition in(Row19... rows) {
        return in(Arrays.asList(rows));
    }

    @Override
    public final Condition in(Record19... records) {
        QueryPartList<Row> rows = new QueryPartList<>();

        for (Record record : records)
            rows.add(record.valuesRow());

        return new RowInCondition(this, rows, false);
    }

    @Override
    public final Condition notIn(Row19... rows) {
        return notIn(Arrays.asList(rows));
    }

    @Override
    public final Condition notIn(Record19... records) {
        QueryPartList<Row> rows = new QueryPartList<>();

        for (Record record : records)
            rows.add(record.valuesRow());

        return new RowInCondition(this, rows, true);
    }

    @Override
    public final Condition in(Collection rows) {
        return new RowInCondition(this, new QueryPartList<Row>(rows), false);
    }

    @Override
    public final Condition in(Result result) {
        return new RowInCondition(this, new QueryPartList<Row>(Tools.rows(result)), false);
    }

    @Override
    public final Condition notIn(Collection rows) {
        return new RowInCondition(this, new QueryPartList<Row>(rows), true);
    }

    @Override
    public final Condition notIn(Result result) {
        return new RowInCondition(this, new QueryPartList<Row>(Tools.rows(result)), true);
    }

    // ------------------------------------------------------------------------
    // Predicates involving subqueries
    // ------------------------------------------------------------------------

    @Override
    public final Condition equal(Select select) {
        return compare(Comparator.EQUALS, select);
    }

    @Override
    public final Condition equal(QuantifiedSelect select) {
        return compare(Comparator.EQUALS, select);
    }

    @Override
    public final Condition eq(Select select) {
        return equal(select);
    }

    @Override
    public final Condition eq(QuantifiedSelect select) {
        return equal(select);
    }

    @Override
    public final Condition notEqual(Select select) {
        return compare(Comparator.NOT_EQUALS, select);
    }

    @Override
    public final Condition notEqual(QuantifiedSelect select) {
        return compare(Comparator.NOT_EQUALS, select);
    }

    @Override
    public final Condition ne(Select select) {
        return notEqual(select);
    }

    @Override
    public final Condition ne(QuantifiedSelect select) {
        return notEqual(select);
    }

    @Override
    public final Condition greaterThan(Select select) {
        return compare(Comparator.GREATER, select);
    }

    @Override
    public final Condition greaterThan(QuantifiedSelect select) {
        return compare(Comparator.GREATER, select);
    }

    @Override
    public final Condition gt(Select select) {
        return greaterThan(select);
    }

    @Override
    public final Condition gt(QuantifiedSelect select) {
        return greaterThan(select);
    }

    @Override
    public final Condition greaterOrEqual(Select select) {
        return compare(Comparator.GREATER_OR_EQUAL, select);
    }

    @Override
    public final Condition greaterOrEqual(QuantifiedSelect select) {
        return compare(Comparator.GREATER_OR_EQUAL, select);
    }

    @Override
    public final Condition ge(Select select) {
        return greaterOrEqual(select);
    }

    @Override
    public final Condition ge(QuantifiedSelect select) {
        return greaterOrEqual(select);
    }

    @Override
    public final Condition lessThan(Select select) {
        return compare(Comparator.LESS, select);
    }

    @Override
    public final Condition lessThan(QuantifiedSelect select) {
        return compare(Comparator.LESS, select);
    }

    @Override
    public final Condition lt(Select select) {
        return lessThan(select);
    }

    @Override
    public final Condition lt(QuantifiedSelect select) {
        return lessThan(select);
    }

    @Override
    public final Condition lessOrEqual(Select select) {
        return compare(Comparator.LESS_OR_EQUAL, select);
    }

    @Override
    public final Condition lessOrEqual(QuantifiedSelect select) {
        return compare(Comparator.LESS_OR_EQUAL, select);
    }

    @Override
    public final Condition le(Select select) {
        return lessOrEqual(select);
    }

    @Override
    public final Condition le(QuantifiedSelect select) {
        return lessOrEqual(select);
    }

    @Override
    public final Condition in(Select select) {
        return compare(Comparator.IN, select);
    }

    @Override
    public final Condition notIn(Select select) {
        return compare(Comparator.NOT_IN, select);
    }

































}

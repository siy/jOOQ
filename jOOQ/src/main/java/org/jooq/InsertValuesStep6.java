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
package org.jooq;

import java.util.Collection;
import java.util.function.Function;

import org.jetbrains.annotations.NotNull;

/**
 * This type is used for the {@link Insert}'s DSL API.
 * <p>
 * Example: <pre><code>
 * using(configuration)
 *       .insertInto(table, field1, field2, field3, .., field5, field6)
 *       .values(valueA1, valueA2, valueA3, .., valueA5, valueA6)
 *       .values(valueB1, valueB2, valueB3, .., valueB5, valueB6)
 *       .onDuplicateKeyUpdate()
 *       .set(field1, value1)
 *       .set(field2, value2)
 *       .execute();
 * </code></pre>
 *
 * @author Lukas Eder
 */
public interface InsertValuesStep6<R extends Record, T1, T2, T3, T4, T5, T6> extends InsertOnDuplicateStep<R> {

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> values(T1 value1, T2 value2, T3 value3, T4 value4, T5 value5, T6 value6);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> values(Field<T1> value1, Field<T2> value2, Field<T3> value3, Field<T4> value4, Field<T5> value5, Field<T6> value6);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> values(Collection<?> values);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> values(Row6<T1, T2, T3, T4, T5, T6> values);

    /**
     * Add a single row of values to the insert statement.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> values(Record6<T1, T2, T3, T4, T5, T6> values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times, but
     * allows for dynamic construction of row arrays.
     *
     * @see Rows#toRowArray(Function, Function, Function, Function, Function, Function)
     */
    @NotNull @CheckReturnValue
    @Support
    @SuppressWarnings("unchecked")
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> valuesOfRows(Row6<T1, T2, T3, T4, T5, T6>... values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times, but
     * allows for dynamic construction of row arrays.
     *
     * @see Rows#toRowList(Function, Function, Function, Function, Function, Function)
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> valuesOfRows(Collection<? extends Row6<T1, T2, T3, T4, T5, T6>> values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times,
     * but allows for dynamic construction of row arrays.
     * <p>
     * <strong>Note</strong>: Irrespective of individual
     * {@link Record#touched()} or {@link Record#modified()} flag values, all
     * record values are copied to the <code>VALUES</code> clause using
     * {@link Record#intoArray()}, to match insert columns by position, not by
     * name. If you prefer omitting untouched or unmodified values and adding
     * values by field name rather than by index, use
     * {@link InsertSetStep#set(Record...)} instead. That syntax is available
     * only if you omit the explicit insert columns list.
     */
    @NotNull @CheckReturnValue
    @Support
    @SuppressWarnings("unchecked")
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> valuesOfRecords(Record6<T1, T2, T3, T4, T5, T6>... values);

    /**
     * Add multiple rows of values to the insert statement.
     * <p>
     * This is equivalent to calling the other values clauses multiple times,
     * but allows for dynamic construction of row arrays.
     * <p>
     * <strong>Note</strong>: Irrespective of individual
     * {@link Record#touched()} or {@link Record#modified()} flag values, all
     * record values are copied to the <code>VALUES</code> clause using
     * {@link Record#intoArray()}, to match insert columns by position, not by
     * name. If you prefer omitting untouched or unmodified values and adding
     * values by field name rather than by index, use
     * {@link InsertSetStep#set(Record...)} instead. That syntax is available
     * only if you omit the explicit insert columns list.
     */
    @NotNull @CheckReturnValue
    @Support
    InsertValuesStep6<R, T1, T2, T3, T4, T5, T6> valuesOfRecords(Collection<? extends Record6<T1, T2, T3, T4, T5, T6>> values);

    /**
     * Use a <code>SELECT</code> statement as the source of values for the
     * <code>INSERT</code> statement
     * <p>
     * This variant of the <code>INSERT … SELECT</code> statement expects a
     * select returning exactly as many fields as specified previously in the
     * <code>INTO</code> clause:
     * {@link DSLContext#insertInto(Table, Field, Field, Field, Field, Field, Field)}
     */
    @NotNull @CheckReturnValue
    @Support
    InsertOnDuplicateStep<R> select(Select<? extends Record6<T1, T2, T3, T4, T5, T6>> select);
}

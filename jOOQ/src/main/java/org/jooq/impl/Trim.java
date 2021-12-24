/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
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
 * ASL 2.0 and offer limited warranties, support, maintenance, and commercial
 * database integrations.
 *
 * For more information, please visit: http://www.jooq.org/licenses
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

import static org.jooq.impl.DSL.*;
import static org.jooq.impl.Internal.*;
import static org.jooq.impl.Keywords.*;
import static org.jooq.impl.Names.*;
import static org.jooq.impl.SQLDataType.*;
import static org.jooq.impl.Tools.*;
import static org.jooq.impl.Tools.BooleanDataKey.*;
import static org.jooq.impl.Tools.DataExtendedKey.*;
import static org.jooq.impl.Tools.DataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.Function1;
import org.jooq.Record;
import org.jooq.conf.*;
import org.jooq.impl.*;
import org.jooq.impl.QOM.*;
import org.jooq.tools.*;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;


/**
 * The <code>TRIM</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
final class Trim
extends
    AbstractField<String>
implements
    QOM.Trim
{

    final Field<String> string;
    final Field<String> characters;

    Trim(
        Field<String> string
    ) {
        super(
            N_TRIM,
            allNotNull(VARCHAR, string)
        );

        this.string = nullSafeNotNull(string, VARCHAR);
        this.characters = null;
    }

    Trim(
        Field<String> string,
        Field<String> characters
    ) {
        super(
            N_TRIM,
            allNotNull(VARCHAR, string, characters)
        );

        this.string = nullSafeNotNull(string, VARCHAR);
        this.characters = nullSafeNotNull(characters, VARCHAR);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------








    @Override
    public final void accept(Context<?> ctx) {







        if (characters == null) {





            ctx.visit(N_TRIM).sql('(').visit(string).sql(')');
        }
        else {
            switch (ctx.family()) {

                case SQLITE:
                    ctx.visit(N_TRIM).sql('(').visit(string).sql(", ").visit(characters).sql(')');
                    break;







                default:
                    ctx.visit(N_TRIM).sql('(').visit(K_BOTH).sql(' ').visit(characters).sql(' ').visit(K_FROM).sql(' ').visit(string).sql(')');
                    break;
            }
        }
    }
















    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<String> $string() {
        return string;
    }

    @Override
    public final Field<String> $characters() {
        return characters;
    }

    @Override
    public final QOM.Trim $string(Field<String> newValue) {
        return constructor().apply(newValue, $characters());
    }

    @Override
    public final QOM.Trim $characters(Field<String> newValue) {
        return constructor().apply($string(), newValue);
    }

    public final Function2<? super Field<String>, ? super Field<String>, ? extends QOM.Trim> constructor() {
        return (a1, a2) -> new Trim(a1, a2);
    }




























    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Trim) { QOM.Trim o = (QOM.Trim) that;
            return
                StringUtils.equals($string(), o.$string()) &&
                StringUtils.equals($characters(), o.$characters())
            ;
        }
        else
            return super.equals(that);
    }
}

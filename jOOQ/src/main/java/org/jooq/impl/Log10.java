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
import java.math.BigDecimal;


/**
 * The <code>LOG10</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unused" })
final class Log10
extends
    AbstractField<BigDecimal>
implements
    QOM.Log10
{

    final Field<? extends Number> value;

    Log10(
        Field<? extends Number> value
    ) {
        super(
            N_LOG10,
            allNotNull(NUMERIC, value)
        );

        this.value = nullSafeNotNull(value, INTEGER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------

    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {











            case YUGABYTE:
                ctx.visit(DSL.log(value, inline(10)));
                break;








            case POSTGRES: {






                ctx.visit(N_LOG10).sql('(').visit(value).sql(')');
                break;
            }

            default:
                ctx.visit(function(N_LOG10, getDataType(), value));
                break;
        }
    }












    // -------------------------------------------------------------------------
    // XXX: Query Object Model
    // -------------------------------------------------------------------------

    @Override
    public final Field<? extends Number> $value() {
        return value;
    }

    @Override
    public final QOM.Log10 $value(Field<? extends Number> newValue) {
        return constructor().apply(newValue);
    }

    public final Function1<? super Field<? extends Number>, ? extends QOM.Log10> constructor() {
        return (a1) -> new Log10(a1);
    }


























    // -------------------------------------------------------------------------
    // XXX: The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof QOM.Log10) { QOM.Log10 o = (QOM.Log10) that;
            return
                StringUtils.equals($value(), o.$value())
            ;
        }
        else
            return super.equals(that);
    }
}

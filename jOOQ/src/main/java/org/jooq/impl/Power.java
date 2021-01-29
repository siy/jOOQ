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
import static org.jooq.impl.Tools.DataKey.*;
import static org.jooq.SQLDialect.*;

import org.jooq.*;
import org.jooq.conf.*;
import org.jooq.impl.*;
import org.jooq.tools.*;

import java.util.*;
import java.math.BigDecimal;


/**
 * The <code>POWER</code> statement.
 */
@SuppressWarnings({ "rawtypes", "unused" })
final class Power
extends
    AbstractField<BigDecimal>
{

    private static final long serialVersionUID = 1L;

    private final Field<? extends Number> value;
    private final Field<? extends Number> exponent;

    Power(
        Field<? extends Number> value,
        Field<? extends Number> exponent
    ) {
        super(
            N_POWER,
            allNotNull(NUMERIC, value, exponent)
        );

        this.value = nullSafeNotNull(value, INTEGER);
        this.exponent = nullSafeNotNull(exponent, INTEGER);
    }

    // -------------------------------------------------------------------------
    // XXX: QueryPart API
    // -------------------------------------------------------------------------



    @Override
    public final void accept(Context<?> ctx) {
        switch (ctx.family()) {






            case DERBY:
            case SQLITE:
                ctx.visit(DSL.exp(imul(DSL.ln(value), exponent)));
                break;

            default:
                ctx.visit(N_POWER).sql('(').visit(value).sql(", ").visit(exponent).sql(')');
                break;
        }
    }



    // -------------------------------------------------------------------------
    // The Object API
    // -------------------------------------------------------------------------

    @Override
    public boolean equals(Object that) {
        if (that instanceof Power) {
            return
                StringUtils.equals(value, ((Power) that).value) &&
                StringUtils.equals(exponent, ((Power) that).exponent)
            ;
        }
        else
            return super.equals(that);
    }
}

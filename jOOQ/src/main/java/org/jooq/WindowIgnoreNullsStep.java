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

import org.jetbrains.annotations.*;

// ...
// ...
// ...
import static org.jooq.SQLDialect.DUCKDB;
// ...
import static org.jooq.SQLDialect.H2;
// ...
// ...
// ...
// ...
// ...
// ...
// ...
import static org.jooq.SQLDialect.TRINO;
// ...

/**
 * This type is used for the window function DSL API.
 * <p>
 * Example: <pre><code>
 * field.firstValue()
 *      .ignoreNulls()
 *      .over()
 *      .partitionBy(AUTHOR_ID)
 *      .orderBy(PUBLISHED_IN.asc())
 *      .rowsBetweenUnboundedPreceding()
 *      .andUnboundedFollowing()
 * </code></pre>
 *
 * @param <T> The function return type
 * @author Lukas Eder
 */
public interface WindowIgnoreNullsStep<T> extends WindowOverStep<T> {

    /**
     * Add an <code>IGNORE NULLS</code> clause to the window function. This
     * might not be supported by all dialects.
     */
    @NotNull
    @Support({ DUCKDB, H2, TRINO })
    WindowOverStep<T> ignoreNulls();

    /**
     * Add a <code>RESPECT NULLS</code> clause to the window function. This
     * might not be supported by all dialects.
     */
    @NotNull
    @Support({ DUCKDB, H2, TRINO })
    WindowOverStep<T> respectNulls();
}

/*
 * Copyright (c) 2017 Eclectic Logic LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.eclecticlogic.orc.impl

import com.eclecticlogic.orc.Graduate
import com.eclecticlogic.orc.api.Factory

import org.testng.Assert
import org.testng.annotations.Test

/**
 * Created by kabram
 */
@Test
class TestSchemaImpl {

    void testFieldNames() {
        SchemaSpiImpl schema = Factory.createSchema(Graduate)
            .field {it.name}
            .field {it.age}
            .field('money') {it.allowance }
        Assert.assertEquals(schema.fieldNames, ['name', 'age', 'money'])
        Assert.assertEquals(schema.accessorNames, ['name', 'age', 'allowance'])
    }
}

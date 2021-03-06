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

package com.eclecticlogic.orc

import java.time.LocalDate
import java.time.YearMonth

/**
 * Created by kabram on 2/28/17.
 */
class GraduationConverter implements Converter<YearMonth, Integer> {

    @Override
    Class<Integer> getConvertedClass() {
        return Integer
    }

    @Override
    Integer convert(YearMonth instance) {
        return instance.year * 100 + instance.month
    }
}

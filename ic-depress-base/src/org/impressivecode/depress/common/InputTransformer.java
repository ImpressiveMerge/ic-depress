/*
 ImpressiveCode Depress Framework
 Copyright (C) 2013  ImpressiveCode contributors

 This program is free software: you can redistribute it and/or modify
 it under the terms of the GNU General Public License as published by
 the Free Software Foundation, either version 3 of the License, or
 (at your option) any later version.

 This program is distributed in the hope that it will be useful,
 but WITHOUT ANY WARRANTY; without even the implied warranty of
 MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 GNU General Public License for more details.

 You should have received a copy of the GNU General Public License
 along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.impressivecode.depress.common;

import java.util.List;

import org.knime.core.data.DataColumnSpec;
import org.knime.core.data.DataRow;
import org.knime.core.data.DataTable;
import org.knime.core.data.DataTableSpec;
import org.knime.core.node.InvalidSettingsException;

/**
 * 
 * @author Marek Majchrzak, ImpressiveCode
 * 
 */
public interface InputTransformer<T> {

    List<T> transform(final DataTable inTable);

    InputTransformer<T> validate() throws InvalidSettingsException;

    InputTransformer<T> setMinimalSpec(DataTableSpec spec);

    InputTransformer<T> setInputSpec(DataTableSpec dataTableSpec);

    T transformRow(DataRow row);

    InputTransformer<T> setMinimalOrSpec(DataColumnSpec... columnSpecs);

}
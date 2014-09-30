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
package org.impressivecode.depress.mr.googlemetrics;

import static org.junit.Assert.assertEquals;
import java.util.List;

import javax.xml.bind.JAXBException;
import org.impressivecode.depress.mr.googlemetrics.GoogleMetricsEntriesParser;
import org.impressivecode.depress.mr.googlemetrics.GoogleMetricsXmlResult.MetricResultScope;
import org.impressivecode.depress.mr.googlemetrics.GoogleMetricsXmlResult.MetricResultScope.MetricResult;
import org.junit.Test;
import org.knime.core.data.DataRow;
import org.knime.core.data.def.DoubleCell;
import static org.impressivecode.depress.common.Cells.doubleOrMissingCell;
/**
 * 
 * @author Zuzanna Pacholczyk, Capgemini Polska
 * 
 */
public class GoogleMetricsParserTest {

	 @Test
	    public void shouldUnmarshalResults() throws JAXBException {
	        List<MetricResultScope> results = GoogleMetricsEntriesParser.unmarshalResults(getClass().getResource("google.xml").getPath());
	        assertEquals(results.size(), 65);
	    }
	 
	 @Test
	    public void shouldCreateAppropriateRow() throws JAXBException {
	        List<MetricResultScope> results = GoogleMetricsEntriesParser.unmarshalResults(getClass().getResource("google.xml").getPath());
            List<MetricResult> score = results.get(0).getMetricResult();
            String className = results.get(0).getScope();
            DataRow row = GoogleMetricsTableFactory.createTableRow(className, score, (long) 0);
            assertEquals(((DoubleCell)row.getCell(1)).getDoubleValue(), 0.76, 0.00);
	}
}

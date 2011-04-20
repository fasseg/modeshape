/*
 * ModeShape (http://www.modeshape.org)
 * See the COPYRIGHT.txt file distributed with this work for information
 * regarding copyright ownership.  Some portions may be licensed
 * to Red Hat, Inc. under one or more contributor license agreements.
 * See the AUTHORS.txt file in the distribution for a full listing of 
 * individual contributors. 
 *
 * ModeShape is free software. Unless otherwise indicated, all code in ModeShape
 * is licensed to you under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * ModeShape is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.modeshape.graph;

import static org.mockito.Mockito.mock;
import org.junit.Test;
import org.modeshape.common.AbstractI18nTest;
import org.modeshape.graph.connector.RepositoryConnectionPool;
import org.modeshape.graph.connector.RepositorySource;
import org.modeshape.graph.connector.federation.FederatedRepositorySource;
import org.modeshape.graph.connector.inmemory.InMemoryRepositorySource;
import org.modeshape.graph.connector.xmlfile.XmlFileRepositorySource;

/**
 * @author Randall Hauch
 */
public class GraphI18nTest extends AbstractI18nTest {

    public GraphI18nTest() {
        super(GraphI18n.class);
    }

    @Test
    public void shouldHaveI18nConstantsAndPropertiesForInMemoryRepositorySource() throws Exception {
        verifyI18nForAnnotationsOnObject(new InMemoryRepositorySource());
    }

    @Test
    public void shouldHaveI18nConstantsAndPropertiesForFederatedRepositorySource() throws Exception {
        verifyI18nForAnnotationsOnObject(new FederatedRepositorySource());
    }

    @Test
    public void shouldHaveI18nConstantsAndPropertiesForXmlFileRepositorySource() throws Exception {
        verifyI18nForAnnotationsOnObject(new XmlFileRepositorySource());
    }

    @Test
    public void shouldHaveI18nConstantsAndPropertiesForRepositoryConnectionPool() throws Exception {
        RepositorySource source = mock(RepositorySource.class);
        verifyI18nForAnnotationsOnObject(new RepositoryConnectionPool(source));
    }
}

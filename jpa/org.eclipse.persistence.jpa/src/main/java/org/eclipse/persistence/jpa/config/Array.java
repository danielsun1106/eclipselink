/*
 * Copyright (c) 2013, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Guy Pelletier - initial API and implementation
package org.eclipse.persistence.jpa.config;

/**
 * JPA scripting API implementation.
 *
 * @author Guy Pelletier
 * @since EclipseLink 2.5.1
 */
public interface Array {

    public Property addProperty();
    public Array setAccess(String access);
    public AccessMethods setAccessMethods();
    public Array setAttributeType(String attributeType);
    public Column setColumn();
    public Array setConvert(String convert);
    public Converter setConverter();
    public Array setDatabaseType(String databaseType);
    public Enumerated setEnumerated();
    public Lob setLob();
    public Array setName(String name);
    public ObjectTypeConverter setObjectTypeConverter();
    public StructConverter setStructConverter();
    public Array setTargetClass(String targetClass);
    public Temporal setTemporal();
    public TypeConverter setTypeConverter();

}

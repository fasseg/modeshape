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
package org.modeshape.jcr.value;

import org.modeshape.common.annotation.Immutable;

/**
 * A runtime exception denoting that a value could not be converted to a specific type because of the value's format.
 */
@Immutable
public class ValueFormatException extends RuntimeException {

    /**
     */
    private static final long serialVersionUID = 1L;

    private final Object value;
    private final PropertyType targetType;

    /**
     * @param value the value that was not able to be converted
     * @param targetType the {@link PropertyType} to which the value was being converted
     * @param message the message
     */
    public ValueFormatException( Object value,
                                 PropertyType targetType,
                                 String message ) {
        super(message);
        this.value = value;
        this.targetType = targetType;
    }

    /**
     * @param targetType the {@link PropertyType} to which the value was being converted
     * @param message the message
     * @param cause the cause of the exception
     */
    public ValueFormatException( PropertyType targetType,
                                 String message,
                                 Throwable cause ) {
        super(message, cause);
        this.targetType = targetType;
        this.value = null;
    }

    /**
     * @param value the value that was not able to be converted
     * @param targetType the {@link PropertyType} to which the value was being converted
     * @param message the message
     * @param cause the cause of the exception
     */
    public ValueFormatException( Object value,
                                 PropertyType targetType,
                                 String message,
                                 Throwable cause ) {
        super(message, cause);
        this.value = value;
        this.targetType = targetType;
    }

    /**
     * Get the {@link PropertyType} to which the {@link #getValue() value} was being converted.
     *
     * @return the target type
     */
    public PropertyType getTargetType() {
        return targetType;
    }

    /**
     * Get the original value that was being converted.
     *
     * @return the value, which can be {@code null} in certain cases (e.g. when streams cause this exception)
     */
    public Object getValue() {
        return value;
    }
}

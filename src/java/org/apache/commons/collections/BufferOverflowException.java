/*
 * $Header: /home/jerenkrantz/tmp/commons/commons-convert/cvs/home/cvs/jakarta-commons//collections/src/java/org/apache/commons/collections/BufferOverflowException.java,v 1.4 2002/10/13 12:57:12 scolebourne Exp $
 * $Revision: 1.4 $
 * $Date: 2002/10/13 12:57:12 $
 *
 * ====================================================================
 *
 * The Apache Software License, Version 1.1
 *
 * Copyright (c) 1999-2002 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution, if
 *    any, must include the following acknowlegement:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowlegement may appear in the software itself,
 *    if and wherever such third-party acknowlegements normally appear.
 *
 * 4. The names "The Jakarta Project", "Commons", and "Apache Software
 *    Foundation" must not be used to endorse or promote products derived
 *    from this software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache"
 *    nor may "Apache" appear in their names without prior written
 *    permission of the Apache Group.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */
package org.apache.commons.collections;

/**
 * The BufferOverflowException is used when the buffer's capacity has been
 * exceeded.
 *
 * @author Avalon
 * @author <a href="mailto:bloritsch@apache.org">Berin Loritsch</a>
 * @author <a href="mailto:jefft@apache.org">Jeff Turner</a>
 * @author Paul Jack
 * @author Stephen Colebourne
 * @since 2.1
 * @version $Id: BufferOverflowException.java,v 1.4 2002/10/13 12:57:12 scolebourne Exp $
 */
public class BufferOverflowException extends RuntimeException {
    private final Throwable m_throwable;

    /**
     * Constructs a new <code>BufferOverflowException</code>.
     */
    public BufferOverflowException() {
        super();
        m_throwable = null;
    }

    /** 
     * Construct a new <code>BufferOverflowException</code>.
     * 
     * @param message  the detail message for this exception
     */
    public BufferOverflowException(String message) {
        this(message, null);
    }

    /** 
     * Construct a new <code>BufferOverflowException</code>.
     * 
     * @param message  the detail message for this exception
     * @param throwable  the root cause of the exception
     */
    public BufferOverflowException(String message, Throwable exception) {
        super(message);
        m_throwable = exception;
    }

    /**
     * Gets the root cause of the exception.
     *
     * @return the root cause
     */
    public final Throwable getCause() {
        return m_throwable;
    }
}

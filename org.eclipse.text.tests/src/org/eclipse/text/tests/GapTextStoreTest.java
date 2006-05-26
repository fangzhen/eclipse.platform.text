/*******************************************************************************
 * Copyright (c) 2000, 2003 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Common Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/cpl-v10.html
 * 
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.text.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.jface.text.GapTextStore;
import org.eclipse.jface.text.ITextStore;

public class GapTextStoreTest extends TextStoreTest {

	public static Test suite() {
		return new TestSuite(GapTextStoreTest.class); 
	}
	
	protected ITextStore createTextStore() {
		return new GapTextStore(256, 4096, 0.1f);
	}

}

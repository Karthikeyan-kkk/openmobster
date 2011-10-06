/**
 * Copyright (c) {2003,2011} {openmobster@gmail.com} {individual contributors as indicated by the @authors tag}.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */

package org.openmobster.core.mobileObject.xml;

import java.util.List;


/**
 * @author openmobster@gmail.com
 */
public class ResultSet 
{
	private Bean[] beans;
	
	public ResultSet()
	{
		
	}

	public Bean[] getBeans() 
	{
		return beans;
	}

	public void setBeans(Bean[] beans) 
	{
		this.beans = beans;
	}	
}

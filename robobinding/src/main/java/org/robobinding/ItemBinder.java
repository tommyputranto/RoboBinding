/**
 * Copyright 2012 Cheng Wei, Robert Taylor
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 */
package org.robobinding;

import java.util.Collection;
import java.util.List;


import com.google.common.collect.Lists;

import android.view.View;

/**
 * 
 * @since 1.0
 * @version $Revision: 1.0 $
 * @author Robert Taylor
 * @author Cheng Wei
 */
public class ItemBinder
{
	private BinderImplementor binderImplementor;
	private List<PredefinedPendingAttributesForView> predefinedPendingAttributesForViewGroup;

	public ItemBinder(BinderImplementor binderImplementor)
	{
		this.binderImplementor = binderImplementor;
		predefinedPendingAttributesForViewGroup = Lists.newArrayList();
	}

	public ItemBinder setPredefinedPendingAttributesForViewGroup(Collection<PredefinedPendingAttributesForView> predefinedPendingAttributesForViewGroup)
	{
		this.predefinedPendingAttributesForViewGroup = Lists.newArrayList(predefinedPendingAttributesForViewGroup);
		return this;
	}
	
	public View inflateAndBind(int layoutId, Object presentationModel)
	{
		return binderImplementor.inflateAndBind(layoutId, presentationModel, predefinedPendingAttributesForViewGroup);
	}
}

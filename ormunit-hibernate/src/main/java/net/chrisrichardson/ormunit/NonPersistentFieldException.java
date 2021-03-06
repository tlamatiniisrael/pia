/*
 * Copyright (c) 2005 Chris Richardson
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
 
package net.chrisrichardson.ormunit;

import java.util.*;

/** Thrown when a test asserts that a persistent field is non-persistent but really is*/

public class NonPersistentFieldException extends ORMUnitMappingException {

	private final Set fields;
	private final Class type;

	public NonPersistentFieldException(Class type, Set fields) {
		super("Type: " + type.getName() + " These fields are really persistent " + fields);
		this.type = type;
		this.fields = fields;
	}

	public Set getFields() {
		return fields;
	}

	public Class getType() {
		return type;
	}

}

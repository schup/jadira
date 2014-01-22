/*
 *  Copyright 2013 Chris Pheby
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */
package org.jadira.reflection.cloning.annotation;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import org.jadira.reflection.cloning.BasicCloner;

/**
 * This annotation is intended as a hint that the annotated class does not contain multiple references
 * to itself or any classes reachable from it. Cloning will not track references whilst handling 
 * this class. Processing of this annotation can be enabled or disabled in {@link BasicCloner}
 */
@Retention(RUNTIME)
@Target({ TYPE })
@Documented
public @interface Flat {
}

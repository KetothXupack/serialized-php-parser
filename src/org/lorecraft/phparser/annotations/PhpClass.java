package org.lorecraft.phpparser.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Php class annotation that can be used to map a java class to a php class.
 * The mapped class is expected to contain some other Php annotations indicating how
 * its properties map up to their php counterparts. If no other annotations are found,
 * a one-to-one mapping is assumed.
 *
 * @author Petrus Rademeyer
 * @since 25 September 2012
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface PhpClass {
	String value();
}

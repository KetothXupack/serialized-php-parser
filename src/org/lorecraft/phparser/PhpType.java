package org.lorecraft.phparser;

/**
 * Enum for representing the various data types available in php.
 *
 * @author Petrus Rademeyer
 * @since 25 September 2012
 */
public enum PhpType {
	INTEGER,
	DOUBLE,
	BOOLEAN,
	STRING,
	ARRAY,
	OBJECT,
	REFERENCE,
	NULL;

	/**
	 * Returns the appropriate enum type based on the provided character,
	 * if unmatched, this will return null.
	 *
	 * @param type The type character used in php to denote the object type.
	 * @return the correct enum
	 */
	public static PhpType fromChar(char type) {
		switch(type) {
			case 'i':
				return INTEGER;
				break;

			case 'd':
				return DOUBLE;
				break;

			case 'b':
				return BOOLEAN;
				break;

			case 's':
				return STRING;
				break;

			case 'a':
				return ARRAY;
				break;

			case 'O':
				return OBJECT;
				break;

			case 'R':
				return REFERENCE;
				break;

			case 'N':
			default:
				return NULL;
				break;
		}
	}
}

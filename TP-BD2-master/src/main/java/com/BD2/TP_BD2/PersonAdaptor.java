package com.BD2.TP_BD2;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

/**
 * This Adaptor allows us to separate our domain object, Person, from our library-specific classes, in this case the MongoDB-specific
 * DBObject.
 */
public final class PersonAdaptor {
    public static final DBObject toDBObject(Person person) {
//        throw new UnsupportedOperationException("You need to implement this");
		DBObject person_created = new BasicDBObject("_id", person.getId())
        .append("name", person.getName())
        .append("dni", person.getDni());
		
		return person_created;
    }
}

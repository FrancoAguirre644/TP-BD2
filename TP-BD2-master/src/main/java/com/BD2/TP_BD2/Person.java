package com.BD2.TP_BD2;

public class Person {
	
    private final String id;
    private final String name;
    private final int dni;

    public Person(final String id, final String name, final int dni) {
        this.id = id;
        this.name = name;
        this.dni = dni;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getDni() {
		return dni;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", dni=" + dni + "]";
	}

}
package com.BD2.TP_BD2.utils;

import java.io.FileWriter;
import java.io.IOException;

import org.bson.Document;

import com.mongodb.client.MongoCursor;

public class Export {

	public static void toJson(MongoCursor<Document> cursor) {
		try {

			FileWriter file = new FileWriter("target/ventas.json");

			while (cursor.hasNext()) {
				file.write(cursor.next().toJson());
			}

			file.close();

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			cursor.close();
		}

	}

}

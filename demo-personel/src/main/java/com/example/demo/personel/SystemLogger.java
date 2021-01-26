package com.example.demo.personel;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class SystemLogger {
	private Logger logger;//
	private static SystemLogger instance;

	private SystemLogger(Logger logger) {
		this.logger=logger;
	}

	public static SystemLogger getInstance() {
		synchronized (SystemLogger.class) {
			if (instance == null) {
				instance = new SystemLogger(Logger.getLogger(SystemLogger.class));
			}
		}
		return instance;
	}

	public void write(String data) throws IOException {
		logger.info(data);
	}

}
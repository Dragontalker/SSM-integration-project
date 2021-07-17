package com.dragontalker.crud.test;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;

public class MBGTest {

	public static void main(String[] args) throws Exception{
		List<String> warnings = new ArrayList<String>();
		boolean overwrite = true;
		File configfile = new File("generatorConfig.xml");
		ConfigurationParser cp = new ConfigurationParser(warnings);
		Configuration config = cp.parseConfiguration(configfile);
		
	}
}

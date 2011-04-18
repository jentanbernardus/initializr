package com.jverrecchia.initializr.builder.modules;

import java.util.ArrayList;
import java.util.List;

public class ModulesRegistry {
	public static List<Module> modules;
	
	public static void register(Module module){
		modules.add(module);
	}
	
	public static List<Module> getModulesByTag(String tag){
		List<Module> foundModules = new ArrayList<Module>();
		
		for (Module currentModule : modules){
			if (currentModule.getInsert().getWhere().equals(tag))
				foundModules.add(currentModule);
		}
		return foundModules;
	}

}

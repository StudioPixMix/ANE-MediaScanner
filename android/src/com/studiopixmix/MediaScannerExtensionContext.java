package com.studiopixmix;

import java.util.HashMap;
import java.util.Map;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;

public class MediaScannerExtensionContext extends FREContext {

	@Override
	public Map<String, FREFunction> getFunctions() {
		
		Map<String, FREFunction> functions = new HashMap<String, FREFunction>();
		functions.put("mediascanner_scanFile", new ScanFileFunction());
		
		return functions;
	}

	
	@Override
	public void dispose() {
		
	}
}

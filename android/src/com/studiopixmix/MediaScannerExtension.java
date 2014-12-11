package com.studiopixmix;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREExtension;

public class MediaScannerExtension implements FREExtension {

	@Override
	public FREContext createContext(String type) {
		return new MediaScannerExtensionContext();
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void initialize() {
		
	}

}

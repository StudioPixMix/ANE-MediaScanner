package com.studiopixmix.mediascanner {
	import flash.external.ExtensionContext;
	import flash.system.Capabilities;
	
	/**
	 * Call <code>MediaScanner.scanFile()</code> for the given file to be added to the device's library.
	 */
	public final class MediaScanner {
		
		/**
		 * On Android, this will ask the MediaScanner to scan the file. As a result, the file will be added to the Gallery of the 
		 * device. If not on Android, this will do nothing.
		 */
		public static function scanFile(localFileURL:String):void {
			if(Capabilities.manufacturer.toLowerCase().indexOf("and") == -1)
				return;
			
			const context:ExtensionContext = ExtensionContext.createExtensionContext("com.studiopixmix.MediaScanner", null);
			
			if(!context)
				return;
			
			context.call("mediascanner_scanFile", localFileURL);
		}
		
	}
}
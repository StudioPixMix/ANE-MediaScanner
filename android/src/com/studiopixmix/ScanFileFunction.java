package com.studiopixmix;

import android.media.MediaScannerConnection;
import android.net.Uri;
import android.util.Log;

import com.adobe.fre.FREContext;
import com.adobe.fre.FREFunction;
import com.adobe.fre.FREObject;

public class ScanFileFunction implements FREFunction {

	@Override
	public FREObject call(FREContext context, FREObject[] args) {
		
		try {
			Log.i("MediaScannerExtension", "Askes to scan a file. Reading file URL from arguments ...");
			String fileURI = args[0].getAsString();
			Log.i("MediaScannerExtension", "Asking to scan " + fileURI + " ...");
			
			MediaScannerConnection.scanFile(
					context.getActivity(), 
					new String[] { fileURI }, 
					null, 
					new MediaScannerConnection.OnScanCompletedListener() {
						@Override public void onScanCompleted(String path, Uri uri) {
							Log.i("MediaScannerExtension", "File scanned successfully (path : " + path + " ; uri : " + uri + ").");
						}
					}
				);
		}
		catch(Exception e) {
			Log.e("MediaScannerExtension", "Failed to scan file : " + e);
			e.printStackTrace();
		}
		
		return null;
	}

}

package com.sciaps.alogcat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ShareReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		//Log.d("alogcat", "received intent for share");

		com.sciaps.alogcat.Intent.handleExtras(context, intent);

		Lock.acquire(context);

		Intent svcIntent = new Intent(context, ShareService.class);
		context.startService(svcIntent);
	}

}

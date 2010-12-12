package org.andnav.osm.tileprovider.util;

import org.andnav.osm.tileprovider.IRegisterReceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class SimpleRegisterReceiver implements IRegisterReceiver {

	private Context mContext;

	public SimpleRegisterReceiver(Context pContext) {
		super();
		mContext = pContext;
	}

	@Override
	public Intent registerReceiver(final BroadcastReceiver aReceiver,
			final IntentFilter aFilter) {
		return mContext.registerReceiver(aReceiver, aFilter);
	}

	@Override
	public void unregisterReceiver(final BroadcastReceiver aReceiver) {
		mContext.unregisterReceiver(aReceiver);
	}
}
package com.Alert.alert;

import android.animation.AnimatorSet.Builder;
import android.app.Dialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.WindowManager;

public class AlertReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context arg0, Intent arg1) {
		// TODO Auto-generated method stub
		Bundle bundle = arg1.getExtras();
		String message = bundle.getString("alert");
		
		android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(arg0);
		builder.setTitle("APP Test");
		builder.setMessage(message);
		builder.setNegativeButton("ok", null);
		Dialog dialog = builder.create();
		dialog.getWindow().setType(WindowManager.LayoutParams.TYPE_SYSTEM_ALERT);
		dialog.show();
	}

}

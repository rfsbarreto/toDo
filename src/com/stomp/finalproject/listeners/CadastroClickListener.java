package com.stomp.finalproject.listeners;

import com.stomp.finalproject.R;
import android.content.Context;
import android.support.v4.app.NavUtils;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class CadastroClickListener implements OnClickListener{
	
	private Context context;

	public CadastroClickListener(Context context) {
		this.context = context;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method
		int viewId = v.getId();
		switch (viewId) {
		case R.id.btn_cancelar:
			Log.v("stomp","Click cancelar cadastro.");
			NavUtils.navigateUpFromSameTask(null);
			break;

		default:
			break;
		}
		
	}

}

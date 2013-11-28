package com.stomp.finalproject.listeners;

import com.stomp.finalproject.R;
import com.stomp.finalproject.activitys.CadastroActivity;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginClickListener implements OnClickListener {
	
	private Context context;

	public LoginClickListener(Context context) {
		this.context = context;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		int viewId = v.getId();
		switch (viewId) {
		case R.id.btn_login:
			Log.v("stomp","click login");
			break;
		case R.id.txt_nao_e_cadastrado:
			Log.v("stomp","click nao eh cadastrado");
			startCadastroActivity();
			break;
		}
	}

	protected void startCadastroActivity() {
		Intent i = new Intent(context, CadastroActivity.class);
		context.startActivity(i);
	}

}

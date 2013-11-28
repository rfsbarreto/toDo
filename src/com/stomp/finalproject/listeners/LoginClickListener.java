package com.stomp.finalproject.listeners;

import com.stomp.finalproject.R;
import com.stomp.finalproject.activitys.CadastroActivity;
import com.stomp.finalproject.activitys.LoginActivity;


import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class LoginClickListener implements OnClickListener {
	
	private LoginActivity activity;
	

	public LoginClickListener(LoginActivity activity) {
		this.activity = activity;
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
		Intent i = new Intent(activity, CadastroActivity.class);
		activity.startActivityForResult(i,LoginActivity.TELEFONE_REQUEST_CODE);
	}
	
	protected void startListaActivity(){
	
	}

}

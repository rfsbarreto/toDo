package com.stomp.finalproject.listeners;

import com.stomp.finalproject.R;
import com.stomp.finalproject.activitys.*;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;

public class CadastroClickListener implements OnClickListener{
	
	private CadastroActivity cadastroActivity;

	public CadastroClickListener(CadastroActivity cadastroActivity) {
		this.cadastroActivity = cadastroActivity;
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method
		int viewId = v.getId();
		switch (viewId) {
		case R.id.btn_cancelar:
			Log.v("stomp","Click cancelar cadastro.");
			
			break;
		case R.id.btn_cadastrar:
			Log.v("stomp","Click cadastrar.");
			retornarLoginResult();
			break;

		default:
			break;
		}
		
	}

	protected void retornarLoginResult(){
		Intent resultIntent = new Intent();
		resultIntent.putExtra(LoginActivity.TELEFONE_IDENTIFIER, true);
		this.cadastroActivity.setResult(Activity.RESULT_OK, resultIntent);
		this.cadastroActivity.finish();
	}
}

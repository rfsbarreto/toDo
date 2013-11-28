package com.stomp.finalproject.activitys;

import com.stomp.finalproject.R;
import com.stomp.finalproject.listeners.LoginClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends Activity {
	
	private EditText telefone ;
	public static final int TELEFONE_REQUEST_CODE = 0;
	public static final String TELEFONE_IDENTIFIER = "telefone";
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_login);
		
		Button btnLogin = (Button) findViewById(R.id.btn_login);
		TextView txtNaoCadastrado = (TextView) findViewById(R.id.txt_nao_e_cadastrado);
		
		LoginClickListener lgClickListener = new LoginClickListener(this);
		
		btnLogin.setOnClickListener(lgClickListener);
		txtNaoCadastrado.setOnClickListener(lgClickListener);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}
	
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if(requestCode == TELEFONE_REQUEST_CODE){
			if (resultCode == RESULT_OK) {
				telefone.setText((String) data.getExtras().get(TELEFONE_IDENTIFIER));
			}
		}
		
	}
	
	

}

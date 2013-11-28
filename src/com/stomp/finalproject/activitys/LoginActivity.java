package com.stomp.finalproject.activitys;

import com.stomp.finalproject.R;
import com.stomp.finalproject.listeners.LoginClickListener;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends Activity {
	
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
	
	

}

package com.stomp.finalproject.activitys;

import com.stomp.finalproject.R;
import com.stomp.finalproject.listeners.CadastroClickListener;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.widget.Button;

@SuppressLint("NewApi")
public class CadastroActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_cadastro);
		
		getActionBar().setDisplayHomeAsUpEnabled(true);
		
		Button btnCancelar = (Button) findViewById(R.id.btn_cancelar);
		
		CadastroClickListener cadastroClickListener = new CadastroClickListener(this);
		
		btnCancelar.setOnClickListener(cadastroClickListener);		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.cadastro, menu);
		return true;
	}

}

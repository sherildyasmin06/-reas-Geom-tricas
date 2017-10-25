package com.aplica01operaciones;

import Package_Operaciones.Clase01;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Triangulo extends Activity {
	
	EditText txtbase,txtaltura, txtresultado;
	Button btnnuevo, btncalcular, btnsalir;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_triangulo);
		txtbase = (EditText)findViewById(R.id.tribase);
		txtaltura = (EditText)findViewById(R.id.trialtura);
		txtresultado = (EditText)findViewById(R.id.triresultado);
		btnnuevo = (Button)findViewById(R.id.btnnuevo4);
		btncalcular = (Button)findViewById(R.id.btncalcular4);
		btnsalir = (Button)findViewById(R.id.btnsalir4);
		btnnuevo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txtbase.setText("");
				txtaltura.setText("");
				txtresultado.setText("");
				txtbase.requestFocus();
			}
		});
        btncalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Clase01 objtriangulo=new Clase01();
				int mtbase=Integer.parseInt(txtbase.getText().toString());
				int mtaltura=Integer.parseInt(txtaltura.getText().toString());
				txtresultado.setText(String.valueOf(objtriangulo.Triangulo(mtbase, mtaltura)));
				
			}
		});

        btnsalir.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		finish();
	}
});
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.triangulo, menu);
		return true;
	}

}

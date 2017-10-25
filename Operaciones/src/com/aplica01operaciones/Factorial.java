package com.aplica01operaciones;

import Package_Operaciones.Clase01;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Factorial extends Activity {

	EditText txtnumero,txtfactorial;
	Button btnnuevo,btncalcular,btnsalir;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_factorial);
		txtnumero=(EditText)findViewById(R.id.tnumero);
		txtfactorial=(EditText)findViewById(R.id.tfactorial);
		btnnuevo=(Button)findViewById(R.id.btnuevo);
		btncalcular=(Button)findViewById(R.id.btcalcular);
		btnsalir=(Button)findViewById(R.id.btsalir);
		btnnuevo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txtnumero.setText("");
				txtfactorial.setText("");
				txtnumero.requestFocus();
			}
		});
         btncalcular.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Clase01 objfactorial = new Clase01();
				int ynumero=Integer.parseInt(txtnumero.getText().toString());
				txtfactorial.setText(String.valueOf(objfactorial.Factorial(ynumero)));
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
		getMenuInflater().inflate(R.menu.factorial, menu);
		return true;
	}

}

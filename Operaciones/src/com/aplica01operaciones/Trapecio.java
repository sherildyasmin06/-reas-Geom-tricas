package com.aplica01operaciones;

import Package_Operaciones.Clase01;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Trapecio extends Activity {
	
	EditText txtbmenor, txtbmayor, txtaltura, txtarea;
	Button btnnuevo, btncalcular, btnsalir;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_trapecio);
		txtbmenor = (EditText)findViewById(R.id.tbmenor);
		txtbmayor = (EditText)findViewById(R.id.tbmayor);
		txtaltura = (EditText)findViewById(R.id.taltura);
		txtarea = (EditText)findViewById(R.id.tareatrapecio);
		btnnuevo = (Button)findViewById(R.id.bnuevo);
		btncalcular = (Button)findViewById(R.id.bcalcular);
		btnsalir = (Button)findViewById(R.id.bsalir);
		btnnuevo.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				txtbmenor.setText("");
				txtbmayor.setText("");
				txtaltura.setText("");
				txtarea.setText("");
				txtbmenor.requestFocus();
			}
		});
		btncalcular.setOnClickListener(new View.OnClickListener() {
					
					@Override
					public void onClick(View arg0) {
						// TODO Auto-generated method stub
						Clase01 objtrapecio=new Clase01();
						int mbmenor=Integer.parseInt(txtbmenor.getText().toString());
						int mbmayor=Integer.parseInt(txtbmayor.getText().toString());
						int maltura=Integer.parseInt(txtaltura.getText().toString());
						txtarea.setText(String.valueOf(objtrapecio.Trapecio(mbmenor, mbmayor, maltura)));
						
						
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
		getMenuInflater().inflate(R.menu.trapecio, menu);
		return true;
	}

}

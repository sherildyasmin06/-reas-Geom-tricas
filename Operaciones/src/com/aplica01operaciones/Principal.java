package com.aplica01operaciones;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.ImageButton;


public class Principal extends Activity {

	ImageButton imgb1,imgb2,imgb3,imgb4,imgb5;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   
        setContentView(R.layout.activity_principal);
        imgb1 = (ImageButton)findViewById(R.id.factorial);
        imgb2 = (ImageButton)findViewById(R.id.trapecio);
        imgb3 = (ImageButton)findViewById(R.id.promedio);
        imgb4 = (ImageButton)findViewById(R.id.triangulo);
        imgb5 = (ImageButton)findViewById(R.id.salir);
        
        imgb1.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent v1 =new Intent(getApplicationContext(),Factorial.class);
				startActivity(v1);
			}
		});
        imgb2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent v2 =new Intent(getApplicationContext(),Trapecio.class);
				startActivity(v2);
				
			}
		});
         imgb3.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent v3 =new Intent(getApplicationContext(),Promedio.class);
		startActivity(v3);
	}
});
         imgb4.setOnClickListener(new View.OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		Intent v4 =new Intent(getApplicationContext(),Triangulo.class);
		startActivity(v4);
	}
});
       imgb5.setOnClickListener(new View.OnClickListener() {
	
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
        getMenuInflater().inflate(R.menu.principal, menu);
        return true;
    }
    
}

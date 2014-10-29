package com.example.usuario;





import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends ActionBarActivity {
	
	
	private Button entrar;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		this.entrar = (Button) findViewById(R.id.login);
		
		
		
	}

	
	public void btnLoginOnClick(View v){
		
		String usuario = ((EditText) findViewById(R.id.usuario)).getText().toString();
		String password = ((EditText) findViewById(R.id.pass)).getText().toString();
	    if(usuario.equals("root") && password.equals("moviles")){
	    	Intent envio = new Intent(MainActivity.this,correo.class);
	    	startActivity(envio);
	    }else{
	    	Toast.makeText(getApplicationContext(), "Usuario Incorrecto", Toast.LENGTH_SHORT).show();
	    }
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}

package br.com.tairoroberto.testefragment;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends FragmentActivity {
	//FragmentManager para gerenciar os fragments
	FragmentManager fragmentManager = getSupportFragmentManager();
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Log.i("Script", "onCreate()");
		
		
		//verifica de saveStance é nullo
		if (savedInstanceState == null) {
			Fragment1 frag1 = new Fragment1();
			
			FragmentTransaction transaction = fragmentManager.beginTransaction();
			transaction.add(R.id.layouDireito, frag1, "frag1");
		}
		
		String[] lista = new String[]{"Fragment 1","Altera texto fragment 1","Fragment 2","Fragment 3"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,lista);
		ListView listView =(ListView)findViewById(R.id.listView1);
		listView.setAdapter(adapter);
		
		//implementa o evento de click do listView
		listView.setOnItemClickListener(new ListView.OnItemClickListener(){
			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
				// TODO Auto-generated method stub
				if (position == 0) {
					Fragment1 frag1 = new Fragment1();
					
					FragmentTransaction transaction = fragmentManager.beginTransaction();
					transaction.replace(R.id.layouDireito, frag1,"frag1");
					transaction.addToBackStack("pilha");
					transaction.commit();					
				}else if (position == 1) {
					Fragment1 frag1 = (Fragment1) fragmentManager.findFragmentByTag("frag1");
					if (frag1 != null) {
						frag1.alteraTextView("Fragment 1 - TextView Alterado");
					}					
				}else if (position == 2) {
					Fragment2 frag2 = new Fragment2();
					
					FragmentTransaction transaction = fragmentManager.beginTransaction();
					transaction.replace(R.id.layouDireito, frag2,"frag2");
					transaction.addToBackStack("pilha");
					transaction.commit();	
				}else if (position == 3) {
					Fragment3 frag3 = new Fragment3();
					
					FragmentTransaction transaction = fragmentManager.beginTransaction();
					transaction.replace(R.id.layouDireito, frag3,"frag3");
					transaction.addToBackStack("pilha");
					transaction.commit();	
				}
			}
		});
		
		
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
	
	//ciclo de vida da activity
	@Override
	protected void onStart() {
		// TODO Auto-generated method stub
		super.onStart();
		Log.i("Script", "onStart()");
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		Log.i("Script", "onResume()");
	}
	
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		Log.i("Script", "onPause()");
	}
	
	@Override
	protected void onStop() {
		// TODO Auto-generated method stub
		super.onStop();
		Log.i("Script", "onStop()");
	}
	
	@Override
	protected void onDestroy() {
		// TODO Auto-generated method stub
		super.onDestroy();
		Log.i("Script", "onDestroy()");
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		Log.i("Script", "onSaveInstanceState()");
		super.onSaveInstanceState(outState);
	}
}

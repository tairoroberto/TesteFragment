package br.com.tairoroberto.testefragment;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
	
	private int contador = 0;
	//Ciclos de vida da activity
	
	@Override
	public void onAttach(Activity activity) {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onAttach()");
		Log.i("Script", " --> HOST: "+ activity.getClass().getName());
		super.onAttach(activity);
	}
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onCreate()");
		
		super.onCreate(savedInstanceState);
	}
	
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		Log.i("Script", " --> onCreateView()");
		
		// Atribui o xml ao fragment
		View view = inflater.inflate(R.layout.layout_frag_1, null);		
		
		//verifica se tem alguma instacia salva
		/*if (savedInstanceState != null) {
			if (savedInstanceState.getInt("contador")!= 0) {
				contador = savedInstanceState.getInt("contador");
			}			
		}*/
		setRetainInstance(true);
		Log.i("Script", " --> Valor do contador:" + contador);
		return view;
	}
	
	@Override
	public void onViewCreated(View view, Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onViewCreated()");
		
		super.onViewCreated(view, savedInstanceState);
	}
	
	@Override
	public void onStart() {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onStart()");
		
		super.onStart();
	}
	
	@Override
	public void onResume() {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onResume()");
		contador++;
		super.onResume();
	}
	
	@Override
	public void onPause() {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onPause()");
		
		super.onPause();
	}
	
	@Override
	public void onStop() {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onStop()");
		
		super.onStop();
	}
	
	@Override
	public void onDestroy() {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onDestroy()");
		
		super.onDestroy();
	}
	
	@Override
	public void onSaveInstanceState(Bundle outState) {
		// TODO Auto-generated method stub
		Log.i("Script", " --> onSaveInstanceState()");
		super.onSaveInstanceState(outState);
		//outState.putInt("contador", contador);
	}
	
	//metodo parar alterar o texto
	public void alteraTextView(String text) {
		TextView textView =(TextView)getView().findViewById(R.id.txtFrag_1);
		textView.setText(text);
	}
		
}

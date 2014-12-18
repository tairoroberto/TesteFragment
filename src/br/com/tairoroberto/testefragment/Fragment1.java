package br.com.tairoroberto.testefragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment1 extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// Atribui o xml ao fragment
		View view = inflater.inflate(R.layout.layout_frag_1, null);		
		return view;
	}
	
	public void alteraTextView(String text) {
		TextView editText =(TextView)getView().findViewById(R.id.txtFrag_1);
		editText.setText(text);
	}
	
}

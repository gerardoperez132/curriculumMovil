package com.example.curriculummovil;

import android.os.Bundle;
import org.apache.cordova.*; /*Importamos la Librerias de PhoneGap*/

public class MainActivity extends DroidGap { /*Cambiamo la clase que heredamos*/

	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
		super.onCreate(savedInstanceState);
		/*Metodos loadUrl y Config*/
		super.loadUrl(Config.getStartUrl());
	}
}

package com.tecsup.lab6.jsf.bean;

import javax.faces.bean.ManagedBean;

//Gracias al ManagedBean podemos nombrar o identificar como "helloWorld" una instancia la clase HelloWorld
@ManagedBean(name = "helloWorld", eager = true)
public class HelloWorld {

	private String message = "Laboratorio N°6: Utilizando JSF ...!";

	public void setMessage(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message + "----";
	}

}


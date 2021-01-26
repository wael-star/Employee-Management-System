package com.jabbour.ems.ui.view.login;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.Footer;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.html.NativeButton;
import com.vaadin.flow.component.html.Paragraph;
import com.vaadin.flow.component.login.LoginForm;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.BeforeEnterEvent;
import com.vaadin.flow.router.BeforeEnterObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.theme.lumo.Lumo;

@SuppressWarnings("serial")
@Route("login")
@PageTitle("Login | Slick EMS")
public class LoginView extends VerticalLayout implements BeforeEnterObserver {
	
	private LoginForm login = new LoginForm();

	
	public LoginView() {
		
		

		addClassName("login-view");
	
	
		Paragraph footer = new Paragraph("");
		
	
		
		setSizeFull();
		setAlignItems(Alignment.CENTER);
		setJustifyContentMode(JustifyContentMode.CENTER);
		
		
		login.setAction("login");
		add(new H1("Skill mangment system"), login);
		add(footer);
	}
	
	
	@Override
	public void beforeEnter(BeforeEnterEvent beforeEnterEvent) {
		
		if(beforeEnterEvent.getLocation()
		.getQueryParameters()
		.getParameters()
		.containsKey("error")) {
			login.setError(true);
		}
	}
}

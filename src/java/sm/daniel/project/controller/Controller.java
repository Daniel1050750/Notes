package sm.daniel.project.controller;

import javax.servlet.http.HttpServletRequest;

public interface Controller {
	
	public void execute();
	public void init(HttpServletRequest request);
	public String getPage();
}
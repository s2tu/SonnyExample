package com.training.tags;

import java.util.logging.Logger;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.Tag;
import javax.servlet.jsp.tagext.TagSupport;



public class GreetingTag extends TagSupport {
	private String message;
		private static Logger log = Logger.getLogger("mylogger");
	public GreetingTag(){
		super();
	}
	public void setMessage(String message){
		this.message = message;
		log.info("Set Message Called");
		
	}
	/* (non-Javadoc)
	 * @see javax.servlet.jsp.tagext.TagSupport#doStartTag()
	 */
	@Override
	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();
		try {
			if(message!=null){
				out.println(message);
			}else{
				out.println("Welcome to Tag Programming");	
			}				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return Tag.SKIP_BODY;

	}
}

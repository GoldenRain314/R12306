package com.vcode.ticket.loginEventImpl;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vcode.ticket.methods.LoginMethods;
import com.vcode.ticket.ui.LoginPage;

/**
 * 登录界面--登录按钮事件
 * @author hh
 * @param <T>
 *
 */
@Component
public class LoginBtEvent<T> implements ActionListener {
	
	private Logger Log = Logger.getLogger(LoginBtEvent.class.getName());

	@Autowired
	private LoginPage<T> Page;
	
	
	public void actionPerformed(ActionEvent e) {
		//需要判断表单
		Log.info("正在验证表单。。。。");
		LoginMethods.CheckCode(Page);

	}

}

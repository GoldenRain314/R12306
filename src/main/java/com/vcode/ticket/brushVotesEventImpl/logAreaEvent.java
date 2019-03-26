package com.vcode.ticket.brushVotesEventImpl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import org.springframework.beans.factory.annotation.Autowired;

import com.vcode.ticket.ui.HomePage;

/**
 * 日志输出区事件
 * @author hh
 * @param <T>
 *
 */
public class logAreaEvent<T> implements MouseListener {

	@Autowired
	private HomePage<T> Page;

	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getButton() == e.BUTTON3) {
			Page.logArea.setText("");
			Page.printLog("信息输出区清空完毕");
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

}

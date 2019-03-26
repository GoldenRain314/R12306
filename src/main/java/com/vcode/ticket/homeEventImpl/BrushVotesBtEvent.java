package com.vcode.ticket.homeEventImpl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vcode.ticket.ui.HomePage;

/**
 * 刷票按钮事件
 * @author hh
 * @param <T>
 *
 */
@Component
public class BrushVotesBtEvent<T> implements MouseListener{

	@Autowired
	private HomePage<T> Page;

	@Override
	public void mouseClicked(MouseEvent e) {
		//未完成
		if (Page.ticket_type == 1) {
			if (Page.isRun) {
				Page.isRun = false;
				Page.result = false;
				Page.printLog("已停止刷票");
				Page.brushVotesBt.setText("自动刷票");
			} else {
				Page.isRun = true;
				Page.brushVotesBt.setText("停止刷票");
				Page.checkAllColRow();
			}
		} else {
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

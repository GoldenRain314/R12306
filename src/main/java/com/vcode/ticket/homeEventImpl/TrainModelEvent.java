package com.vcode.ticket.homeEventImpl;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vcode.ticket.ui.HomePage;

/**
 * 刷票模式复选框事件
 * @author hh
 * @param <T>
 *
 */
@Component
public class TrainModelEvent<T> implements MouseListener {

	@Autowired
	private HomePage<T> Page;

	@Override
	public void mouseClicked(MouseEvent e) {
		if (Page.trainModel.isSelected()) {
			Page.brushVotesBt.setText("自动刷票");
			Page.ticket_type = 1;
		} else {
			if (!Page.isRun) {
				Page.brushVotesBt.setText("手动查票");
				Page.ticket_type = 0;
			} else {
				Page.printLog("请先停止刷票");
				Page.trainModel.setSelected(true);
				return;
			}
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

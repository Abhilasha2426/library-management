package com.capgemini.librarymanagement.dao;

import java.util.Iterator;
import java.util.List;
import com.capgemini.librarymanagement.db.DbStore1;
import com.capgemini.librarymanagement.dto.BookInfo;
import com.capgemini.librarymanagement.dto.UserInfoBean;

public class AdminBookDaoImpl implements AdminBookDao {

	public boolean addBook(BookInfo bookInfo) {
		System.out.println(bookInfo);
		DbStore1.bookInfo.add(bookInfo);
		return true;
	}

	public boolean addUser(UserInfoBean userInfoBean) {
		boolean isAddUser = false;
		DbStore1.userInfoBean.add(userInfoBean);
		isAddUser = true;
		return isAddUser;
	}

	public boolean deleteUser(int userId) {
		Iterator<UserInfoBean> itr = DbStore1.userInfoBean.iterator();
		while (itr.hasNext()) {
			UserInfoBean book = itr.next();
			if (book.getUsrId() == userId) {
				DbStore1.userInfoBean.remove(book);
				return true;
			}
		}
		return false;
	}

	public boolean deleteBook(int bookId) {
		Iterator<BookInfo> itr = DbStore1.bookInfo.iterator();
		while (itr.hasNext()) {
			BookInfo book = itr.next();
			if (book.getBookId() == bookId) {
				DbStore1.bookInfo.remove(book);
				return true;
			}
		}
		return false;
	}

	public List<BookInfo> showAllBooks() {
		return DbStore1.bookInfo;

	}

	public List<UserInfoBean> showAllUser() {
		return (DbStore1.userInfoBean);
	}

	public UserInfoBean updateUser(UserInfoBean userInfoBean) {
		UserInfoBean bean;
		Iterator<UserInfoBean> itr = DbStore1.userInfoBean.iterator();
		while (itr.hasNext()) {
			bean = itr.next();
			if (bean.getUsrId() != userInfoBean.getUsrId()) {
				bean.setUsrId(userInfoBean.getUsrId());
				bean.setUsrName(userInfoBean.getUsrName());
				bean.setUsrEmail(userInfoBean.getUsrEmail());
				bean.setUsrPassword(userInfoBean.getUsrPassword());
				return bean;
			} else {
				return null;
			}
		}
		return userInfoBean;
		

	}

}

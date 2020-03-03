package com.capgemini.librarymanagement.db;

import java.util.LinkedList;
import java.util.List;

import com.capgemini.librarymanagement.dto.AdminInfoBean;
import com.capgemini.librarymanagement.dto.BookInfo;
import com.capgemini.librarymanagement.dto.BookUserRel;
import com.capgemini.librarymanagement.dto.UserBookDetail;
import com.capgemini.librarymanagement.dto.UserInfoBean;

public class DbStore1 {
	public final static List<AdminInfoBean> adminInfoBeans = new LinkedList<AdminInfoBean>();
	public final static List<BookInfo> bookInfo = new LinkedList<BookInfo>();
	public final static List<UserInfoBean> userInfoBean = new LinkedList<UserInfoBean>();
	public final static List<UserBookDetail> userBookDetails = new LinkedList<UserBookDetail>();
	public final static List<UserInfoBean> user = new LinkedList<UserInfoBean>();
	public final static List<BookUserRel> userBorrowedBook = new LinkedList<BookUserRel>();
	public final static List<BookUserRel> userReturnBooks = new LinkedList<BookUserRel>();

}

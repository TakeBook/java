package cn.java.reglogin;

import java.io.FileOutputStream;
import java.io.IOException;

public class UserFile {
	public String createUserFile(User user) throws IOException {
		/*
		  *  ��ͨ���û��������ļ� ���ڸĽ�������ID��ѯ
		 */
		String username = "./"+user.getUsername()+".txt";
		System.out.println(username);
//		File file = new File(username);
//		System.out.println(file.exists());
//		if(file.exists()) {
			FileOutputStream fos = new FileOutputStream(username);
			String userInfo = user.toString();
			byte[] data = userInfo.getBytes("utf-8");
			fos.write(data);
			System.out.println("�ļ�����");
			fos.close();
//		}
		return null;
	}
}

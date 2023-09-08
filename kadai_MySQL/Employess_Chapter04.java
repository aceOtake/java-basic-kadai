package kadai_004;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employess_Chapter04 {

	public static void main(String[] args) {
		
		Connection con 		 = null;
		Statement  statement = null;
		
		try	{
			
			//�f�[�^�x�[�X�ɐڑ�
			con = DriverManager.getConnection(
				"jdbc:mysql://localhost/challenge_java",
				"root",
				"root"
			);
			
			System.out.println("�f�[�^�x�[�X�ڑ�����");
			
			//SQL�N�G��������
			statement = con.createStatement();
			String sql = """
						CREATE TABLE employees (
							id INT(11) NOT NULL AUTO_INCREMENT PRIMARY KEY,
							name VARCHAR(60) NOT NULL,
							email VARCHAR(255) NOT NULL,
							age INT(11),
							address VARCHAR(255)
						);
						""";
			
			//SQL�N�G�������s�iDBMS�ɑ��M�j
//				�F�X�V�n�N�G���̏ꍇ��executeUpdate���\�b�h
			int rowCnt = statement.executeUpdate(sql);
			System.out.println("�e�[�u�����쐬:rowCnt=" + rowCnt);
			
		} catch (SQLException e) {
			System.out.println("�G���[����:" + e.getMessage());
		} finally {
			
			//�g�p�����I�u�W�F�N�g�����
			if (statement != null) {
				try { statement.close(); } catch (SQLException ignore) {}
			}
			if (con != null) {
				try { con.close(); } catch (SQLException ignore) {}
			}	
		}
	}

}

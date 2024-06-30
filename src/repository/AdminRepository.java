package repository;

import model.Admin;
import model.User;
import utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminRepository {
    //��ѯ
    public ResultSet select(Admin admin) { //����user�е���Ϣ���в�ѯ
        StringBuilder sql = new StringBuilder("SELECT * FROM user WHERE 1=1");

        // �����û���Ϣ������ѯ����
        if (admin.getAdmin_no() != null && !admin.getAdmin_no().isEmpty()) {
            sql.append(" AND admin_no = ?");
        }
        if (admin.getAdmin_password() != null && !admin.getAdmin_password().isEmpty()) {
            sql.append(" AND admin_password = ?");
        }

        try (Connection conn = DBUtil.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql.toString())) {
            int index = 1;

            // ���ò�ѯ����
            if (admin.getAdmin_no() != null && !admin.getAdmin_no().isEmpty()) {
                stmt.setString(index++, admin.getAdmin_no());
            }
            if (admin.getAdmin_password() != null && !admin.getAdmin_password().isEmpty()) {
                stmt.setString(index++, admin.getAdmin_password());
            }

            return stmt.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}

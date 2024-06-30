package service;

import model.Admin;
import repository.AdminRepository;


import java.sql.ResultSet;
import java.util.List;

public class AdminService {
    private AdminRepository adminRepository;

    public AdminService() {
        adminRepository = new AdminRepository();
    }

    //��
    public List<Admin> select(Admin admin) {
        return adminRepository.select(admin);
    }
}

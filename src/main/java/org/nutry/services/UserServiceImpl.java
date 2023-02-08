package org.nutry.services;

import org.nutry.models.UserModel;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService{
    @Override
    public List<UserModel> getUsers() {
        ArrayList list = new ArrayList();
        list.add(new UserModel());
        return list;
    }
}

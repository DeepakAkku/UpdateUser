package com.cgi.userupdate.service;

import com.cgi.userupdate.Models.request.AddUserRequest;
import com.cgi.userupdate.Models.request.UpdateUserRequest;

public interface UserUpdateService {
    public String addUser(AddUserRequest addUserRequest);
    public String updateUser(UpdateUserRequest updateUserRequest,String id);
    public String addMemberToGroup(String id,String userId);
}


package com.cgi.userupdate.service;

import com.cgi.userupdate.Models.request.AddUserRequest;
import com.cgi.userupdate.Models.request.UpdateUserRequest;
import com.cgi.userupdate.client.IcamnudaClient;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserUpdateServiceImpl implements UserUpdateService {
    private IcamnudaClient client;


    @Override
    public String addUser(AddUserRequest request) {

        String response = client.addUser(request);

        return "";

    }

    @Override
    public String updateUser(UpdateUserRequest request,String id) {

        String response = client.updateUser(id, request);
        return "";
    }

    @Override
    public String addMemberToGroup(String id,String userId) {

        String response = client.addMemberToGroup(id, userId);
        return "";
    }


}

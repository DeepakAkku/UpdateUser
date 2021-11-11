package com.cgi.userupdate.client;

import com.cgi.userupdate.Models.request.AddUserRequest;
import com.cgi.userupdate.Models.request.UpdateUserRequest;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@FeignClient(name = "camundaClient",url = "${cgi.userUpdate.host}")
public interface IcamnudaClient {
    @PostMapping(value = "/user/create")
    String addUser(AddUserRequest request);
    @PutMapping (path = "/user/{id}/credentials")
    String updateUser(@PathVariable(value = "id")String id, UpdateUserRequest request);
    @PutMapping (path = "/group/{id}/members/{userId}")
    String addMemberToGroup(@PathVariable(value = "id")String id,@PathVariable(value = "userId")String userId);
}

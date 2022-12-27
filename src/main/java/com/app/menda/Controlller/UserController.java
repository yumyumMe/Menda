package com.app.menda.Controlller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.menda.Entity.Users;
import com.app.menda.Service.UserService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.ApiResponse;

@RestController
public class UserController {
    
    @Autowired
    private UserService userService;

    /**
     * ユーザー全件取得
     * 
     * @return 全ユーザー情報
     */
    @GetMapping("/users")
    @ResponseBody
    @ApiOperation(value = "ユーザー全件取得API", notes = "全ユーザーを取得するAPI")
    @ApiResponse(code = 200, message = "Success", response = Users.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Request supplied"),
                            @ApiResponse(code = 404, message = "URL not found") })
    public List<Users> getAllUsers() {
        List<Users> result = userService.getAllUsers();
        return result;
    }

    /**
     * 指定ユーザー取得
     * 
     * @param employee_number 従業員No
     * @return 指定ユーザー情報
     */
    @GetMapping("/user")
    @ResponseBody
    @ApiOperation(value = "ユーザー取得API", notes = "指定IDのユーザーを取得するAPI")
    @ApiResponse(code = 200, message = "Success", response = Users.class)
    @ApiResponses(value = { @ApiResponse(code = 400, message = "Invalid Request supplied"),
                            @ApiResponse(code = 404, message = "URL not found") })
    public Users getUser(@Validated @RequestParam("employeeNumber") Integer employeeNumber) {
        Users result = userService.getUser(employeeNumber);
        return result;
    }

}

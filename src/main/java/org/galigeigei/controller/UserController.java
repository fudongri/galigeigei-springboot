package org.galigeigei.controller;

import java.util.List;

import javax.validation.Valid;

import org.galigeigei.core.rest.ApiResult;
import org.galigeigei.core.rest.ApiResultEnum;
import org.galigeigei.core.rest.ApiResultModel;
import org.galigeigei.domain.User;
import org.galigeigei.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Restful api的小例子
 * 
 * @author fudongri
 */
@RestController
@RequestMapping("/api/v1")
public class UserController {

	private final Logger logger = LoggerFactory.getLogger(getClass());

	@Autowired
	private UserService userService;

	/**
	 * 添加用户
	 */
	@PostMapping("/users")
	public ApiResultModel add(@RequestBody @Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return ApiResult.error(ApiResultEnum.PARAM_ERROR.getCode(),
					ApiResultEnum.PARAM_ERROR.getMsg() + bindingResult.getFieldError().getDefaultMessage());
		}
		logger.info("user name-->{}", user.getName());
		userService.add(user);
		return ApiResult.succ();
	}

	/**
	 * 查询所有
	 */
	@GetMapping("/users")
	public List<User> findAll() {
		List<User> userList = userService.findAll();
		return userList;
	}

	/**
	 * 根据Id查询
	 */
	@GetMapping("/users/{id}")
	public ResponseEntity<User> findById(@PathVariable int id) {
		User user = userService.findById(id);
		return ResponseEntity.ok(user);
	}

	/**
	 * 更新
	 */
	@PutMapping("/users/{id}")
	public void update(@PathVariable int id, @RequestBody User user) {
		user.setId(id);
		userService.update(user);
	}

	/**
	 * 删除
	 */
	@DeleteMapping("/users/{id}")
	public void delete(@PathVariable int id) {
		userService.deleteById(id);
	}

}

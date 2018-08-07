package cn.deepmax.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import cn.deepmax.mapper.UserMapper;
import cn.deepmax.pojo.User;
import cn.deepmax.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User getUser(Integer id) {
		User user = userMapper.getUser(id);
		return user;
	}

}

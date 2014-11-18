package jp.fores.gruul.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import jp.fores.gruul.db.entity.IUser;
import jp.fores.gruul.db.entity.IUserExample;
import jp.fores.gruul.db.map.IUserMapper;
import jp.fores.gruul.dto.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private IUserMapper userMapper;

	/**
	 * 
	 * @param user
	 * @return
	 */
	public static User serializeUser(IUser iUser) {
		User user = new User();
		user.setUuid(iUser.getUuid());
		user.setNickname(iUser.getNickname());
		user.setCreatedAt(iUser.getCreatedAt());
		return user;
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "", method = RequestMethod.GET)
	public List<User> index() {
		List<IUser> iUsers = userMapper.selectByExample(new IUserExample());
		if (iUsers.isEmpty()) {
			return new ArrayList<User>();
		}
		return iUsers.stream().limit(1).map(UserController::serializeUser)
				.collect(Collectors.toList());
	}

	/**
	 * 
	 * @return
	 */
	@RequestMapping(value = "/{uuid}", method = RequestMethod.GET)
	public User show(@PathVariable(value = "uuid") String uuid) {
		IUserExample example = new IUserExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<IUser> iUsers = userMapper.selectByExample(example);
		if (iUsers.isEmpty()) {
			return new User();
		}
		return UserController.serializeUser(iUsers.get(0));
	}
}

package com.controller;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import com.entity.UserEntity;
import com.repository.UserRepository;

@Controller
public class UserController {

	@Autowired
	UserRepository userRepository;

	@Autowired
	Cloudinary cloudinary;

	@GetMapping("newuser")
	public String newUser() {
		return "NewUser";
	}

	@PostMapping("saveuser")
	public String saveUser(UserEntity userEntity, MultipartFile profilePic) {

		System.out.println(profilePic.getOriginalFilename());

		// dzko8yjs6
//		812235955324293
		// myUUXHnsXifcK0DyinTVjQKan_U

		try {
			Map map = cloudinary.uploader().upload(profilePic.getBytes(), ObjectUtils.emptyMap());
			String profilePicUrl = map.get("url").toString();

			userEntity.setProfilePicUrl(profilePicUrl);
			System.out.println(profilePicUrl);
			userRepository.save(userEntity);// insert

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "NewUser";
	}

	@GetMapping("listuser")
	public String listUser(Model model) {
		List<UserEntity> allUser = userRepository.findAll();// select * from users;
		// send data -> controller -> jsp
		model.addAttribute("allUser", allUser);
		return "ListUser";
	}

	@GetMapping("deleteuser")
	public String deleteUser(Integer userId) {
		userRepository.deleteById(userId);

		return "redirect:/listuser";// open listuser url
	}

	@GetMapping("viewuser")
	public String viewUser(Integer userId, Model model) {

		Optional<UserEntity> op = userRepository.findById(userId);

		if (op.isEmpty()) {
			// error
			return "redirect:/listuser";
		} else {
			UserEntity user = op.get();
			model.addAttribute("user", user);
		}

		return "ViewUser";
	}

	@GetMapping("searchuser")
	public String searchUser() {
		return "SearchUser";
	}

	@PostMapping("searchuser")
	public String searchUserDb(String firstName, Model model) {
		List<UserEntity> users = userRepository.findByFirstName(firstName);
		model.addAttribute("allUser", users);
		return "ListUser";
	}

	@GetMapping("edituser")
	public String editUser(Integer userId, Model model) {

		Optional<UserEntity> op = userRepository.findById(userId);
		if (op.isEmpty()) {
			return "redirect:/listuser";
		} else {
			model.addAttribute("user", op.get());
			return "EditUser";
		}
	}

	@PostMapping("edituser")
	public String updateUser(UserEntity user) {
		Optional<UserEntity> op = userRepository.findById(user.getUserId());
		if (op.isPresent()) {
			UserEntity dbUser = op.get();
			dbUser.setFirstName(user.getFirstName());
			dbUser.setEmail(user.getEmail());
			userRepository.save(dbUser);

		}

		return "redirect:/listuser";
	}

}

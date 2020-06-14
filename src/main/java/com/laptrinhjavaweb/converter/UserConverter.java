package com.laptrinhjavaweb.converter;

import com.laptrinhjavaweb.dto.UserDTO;
import com.laptrinhjavaweb.entity.UserEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserConverter {

	@Autowired
	private ModelMapper modelMapper;

	public UserDTO convertToDto(UserEntity entity) {
		if (entity != null) {
			return modelMapper.map(entity, UserDTO.class);
		} else {
			return null;
		}
	}

	public UserEntity convertToEntity(UserDTO dto) {
		UserEntity result = modelMapper.map(dto, UserEntity.class);
		return result;
	}
}

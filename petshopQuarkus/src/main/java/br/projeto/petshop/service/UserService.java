package br.projeto.petshop.service;

import java.util.List;

import br.projeto.petshop.dto.UserDTO;
import br.projeto.petshop.dto.UserResponseDTO;

public interface UserService {
    public UserResponseDTO insert(UserDTO dto);

    public UserResponseDTO update(Long id, UserDTO dto);

    public UserResponseDTO findById(long id);

    public UserResponseDTO findByUsername(String username);

    public UserResponseDTO findByEmail(String email);

    public UserResponseDTO findByEmailAndPassword(String email, String Password);

    public List<UserResponseDTO> findAll();
}

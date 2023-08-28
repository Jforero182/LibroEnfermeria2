package com.example.notasenfermeria;

import java.util.List;

interface UserApiInterface {
    void createUser(String username, String email);
    void updateUser(int userId, String newUsername, String newEmail);
    void deleteUser(int userId);
    <User> User getUserById(int userId);
    <User> List<User> getAllUsers();


    public class UserApiImplementation implements UserApiInterface {
        @Override
        public void createUser(String username, String email) {
            // Lógica para crear un usuario en la base de datos
        }

        @Override
        public void updateUser(int userId, String newUsername, String newEmail) {
            // Lógica para actualizar la información de un usuario
        }

        @Override
        public void deleteUser(int userId) {
            // Lógica para eliminar un usuario de la base de datos
        }

        @Override
        public Object getUserById(int userId) {
            // Lógica para obtener un usuario por su ID
            return null;
        }

        @Override
        public <User> List<User> getAllUsers() {
            // Lógica para obtener una lista de todos los usuarios
            return null;
        }
    }

}


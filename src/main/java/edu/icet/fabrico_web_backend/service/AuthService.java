package edu.icet.fabrico_web_backend.service;

import edu.icet.fabrico_web_backend.dto.UpdatePasswordDto;
import edu.icet.fabrico_web_backend.dto.User;
import edu.icet.fabrico_web_backend.template.SuccessfulResponsesData;
import edu.icet.fabrico_web_backend.template.SuccessfulResponsesMessage;

public interface AuthService {
    SuccessfulResponsesData login(String email , String password);
    SuccessfulResponsesMessage registerUser(User user);

    boolean validateToken(String token, String email);
    boolean updatePassword(int id, UpdatePasswordDto updatePasswordDto);
    boolean updateOfflineStatus(int id);
    boolean updateAccountStatus(int id , String jwt , String status);
}

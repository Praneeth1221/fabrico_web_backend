package edu.icet.fabrico_web_backend.utill;

public interface MD5HashingUtil {
    String hashWithMD5(String input);
    boolean compareMD5(String rawInput, String storedHash);
}

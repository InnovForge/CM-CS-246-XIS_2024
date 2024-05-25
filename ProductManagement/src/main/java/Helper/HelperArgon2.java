/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helper;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;

/**
 *
 * @author harvous
 */
public class HelperArgon2 {
    Argon2 argon2;

    public HelperArgon2() {
        argon2 = Argon2Factory.create();
    }
    public String hash(char[] password) {
        int iterations = 3; // Số lần lặp
        int memory = 65536; // Chi phí bộ nhớ tính bằng KB
        int parallelism = 1; // Số lượng luồng xử lý song song

        // Băm mật khẩu sử dụng Argon2
        String hash = null;
        try {
            hash = argon2.hash(iterations, memory, parallelism, password);
        } finally {
            // Xóa mật khẩu khỏi bộ nhớ sau khi sử dụng
            java.util.Arrays.fill(password, '\0');
        }
        return hash;
    }


    public boolean verify(String hash, char[] value) {
        boolean isVerified = false;
        try {
            isVerified = argon2.verify(hash, value);
        } finally {
            // Xóa mật khẩu khỏi bộ nhớ sau khi sử dụng
            java.util.Arrays.fill(value, '\0');
        }
        return isVerified;
    }
}

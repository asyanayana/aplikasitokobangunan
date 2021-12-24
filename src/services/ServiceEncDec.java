package services;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import java.util.Arrays;
import java.util.Base64;
import java.util.Random;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class ServiceEncDec {

    private final Random random = new SecureRandom();
    private final String characters;
    private final int iterations;
    private final int keylength;
    private final String saltValue;
    private String password;
    private String encryptedPassword;

    public ServiceEncDec(String password, String saltValue) {
        this.password = password;
        this.saltValue = saltValue;
        this.keylength = 256;
        this.iterations = 10000;
        this.characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
    }

    public String getSaltValue() {
        return saltValue;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    /* Method to generate the salt value. */
    public String generateSaltValue(Integer lengthSaltValue) {
        StringBuilder finalval = new StringBuilder(lengthSaltValue);

        for (int i = 0; i < lengthSaltValue; i++) {
            finalval.append(characters.charAt(random.nextInt(characters.length())));
        }

        return new String(finalval);
    }

    /* Method to generate the hash value */
    public byte[] hash(char[] password, byte[] salt) {
        PBEKeySpec spec = new PBEKeySpec(password, salt, iterations, keylength);
        Arrays.fill(password, Character.MIN_VALUE);
        try {
            SecretKeyFactory skf = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1");
            return skf.generateSecret(spec).getEncoded();
        } catch (NoSuchAlgorithmException | InvalidKeySpecException e) {
            throw new AssertionError("Error while hashing a password: " + e.getMessage(), e);
        } finally {
            spec.clearPassword();
        }
    }

    /* Method to encrypt the password using the original password and salt value. */
    public String generateSecurePassword(String password, String salt) {
        String finalval = null;

        byte[] securePassword = hash(password.toCharArray(), salt.getBytes());

        finalval = Base64.getEncoder().encodeToString(securePassword);

        return finalval;
    }

    /* Method to verify if both password matches or not */
    public boolean verifyUserPassword(String providedPassword, String securedPassword, String salt) {
        boolean finalval = false;

        /* Generate New secure password with the same salt */
        String newSecurePassword = generateSecurePassword(providedPassword, salt);

        /* Check if two passwords are equal */
        finalval = newSecurePassword.equalsIgnoreCase(securedPassword);

        return finalval;
    }

    /* Driver Code */
    public void main() {

        /* generates an encrypted password. It can be stored in a database.*/
        setEncryptedPassword(generateSecurePassword(getPassword(), getSaltValue()));

    }
}

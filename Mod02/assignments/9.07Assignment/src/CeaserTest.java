/*
 * @author Cole Woodyard
 * @version 5/16/2021
 * @about tester class for encryption and decryption
 * 
 */
public class CeaserTest {

    public static void main(String[] args) {
        System.out.println("Encrypting");
        System.out.println(Encryption.Encrypt("l ol", 63));
        System.out.println();
        System.out.println("Decrypting");
        System.out.println(Encryption.Decrypt("w zw", 63));

    }

}

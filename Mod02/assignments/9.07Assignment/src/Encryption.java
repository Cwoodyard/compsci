/*
 * @author Cole Woodyard
 * @version 5/16/2021
 * @about main class for encryption and decryption
 * 
 */
public class Encryption {
    static int sh;
    static String ph;
    static int difference;

    public static String Encrypt(String phrase, int shift) {
        sh = shift;
        ph = phrase;
        difference = shift;
        String finalPhrase = "";

        for (int i = 0; i < phrase.length(); i++) {

//            System.out.println("0 <= (shift + (phrase.charAt(i) - 96)): " + ((shift + (phrase.charAt(i) - 96))));
//            System.out.println("(shift + (phrase.charAt(i) - 96) < 26): " + (shift + (phrase.charAt(i) - 96)));
            if (0 <= (shift + (phrase.charAt(i) - 96)) && (shift + (phrase.charAt(i) - 96) < 26)) {

                // Debug
//                findChar(phrase.charAt(i));

                if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {
//                    finalPhrase = finalPhrase + Character.toString((phrase.charAt(i) + difference));
                    System.out.println(finalPhrase);

                } else {
                    if (shift + phrase.charAt(i) >= 122) {
                        differencePatch(phrase.charAt(i));
//                        System.out.println("Difference: " + difference);

                        if (phrase.charAt(i) != 32) {
                            // Debug
//                            findChar(phrase.charAt(i));

                            if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {
//                                finalPhrase = finalPhrase + Character.toString((phrase.charAt(i) + difference));
                                System.out.println(finalPhrase);
                            }

                        }

                    }

                }
                System.out.println("i: " + i);

            } else if ((shift + (phrase.charAt(i) - 96)) >= 26) {
                // Debug
//                findChar(phrase.charAt(i));

                if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {

                } else {
                    if (shift + phrase.charAt(i) >= 122) {
                        differencePatch(phrase.charAt(i));
//                        System.out.println("Difference: " + difference);

                        if (phrase.charAt(i) != 32) {
                            // Debug
//                            findChar(phrase.charAt(i));

                            if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {

                            }

                        }

                    }
                    finalPhrase = finalPhrase + Character.toString((difference));
                    System.out.println(finalPhrase);

                }
//                System.out.println("i: " + i);
            } else {
                finalPhrase = finalPhrase + Character.toString((phrase.charAt(i)));
                System.out.println(finalPhrase);
            }

            difference = shift;
        }
        return finalPhrase;

    }

    public static void differencePatch(int pos) {
        double d;
        for (d = difference; d > 26;) {

            d = d - 26;
//            System.out.println("dif: " + d);
        }

//        System.out.println("pos: " + pos);
        difference = (int) (pos + d);
//        System.out.println("diference: " + difference);
    }

    public static String Decrypt(String phrase, int shift) {
        sh = shift;
        ph = phrase;
        difference = shift;
        String finalPhrase = "";

        for (int i = 0; i < phrase.length(); i++) {

//            System.out.println("0 <= (shift + (phrase.charAt(i) - 96)): " + ((shift + (phrase.charAt(i) - 96))));
//            System.out.println("(shift + (phrase.charAt(i) - 96) < 26): " + (shift + (phrase.charAt(i) - 96)));
            if (0 <= (shift + (phrase.charAt(i) - 96)) && (shift + (phrase.charAt(i) - 96) < 26)) {

                // Debug
                findChar(phrase.charAt(i));

                if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {
//                    finalPhrase = finalPhrase + Character.toString((phrase.charAt(i) + difference));
                    System.out.println(finalPhrase);

                } else {
                    if (shift + phrase.charAt(i) >= 122) {
                        differenceDecryptPatch(phrase.charAt(i));
//                        System.out.println("Difference: " + difference);

                        if (phrase.charAt(i) != 32) {
                            // Debug
                            findChar(phrase.charAt(i));

                            if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {
                                finalPhrase = finalPhrase + Character.toString((phrase.charAt(i) + difference));
                                System.out.println(finalPhrase);
                            }

                        }

                    }

                }
//                System.out.println("i: " + i);

            } else if ((shift + (phrase.charAt(i) - 96)) >= 26) {
                // Debug
//                findChar(phrase.charAt(i));

                if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {

                } else {
                    if (shift + phrase.charAt(i) >= 122) {
                        differenceDecryptPatch(phrase.charAt(i));
//                        System.out.println("Difference: " + difference);

                        if (phrase.charAt(i) != 32) {
                            // Debug
//                            findChar(phrase.charAt(i));

                            if ((phrase.charAt(i) + shift) < 123 && (phrase.charAt(i) + shift) > 96) {

                            }

                        }

                    }
                    finalPhrase = finalPhrase + Character.toString((difference));
                    System.out.println(finalPhrase);

                }
                System.out.println("i: " + i);
            } else {
                finalPhrase = finalPhrase + Character.toString((phrase.charAt(i)));
                System.out.println(finalPhrase);
            }

            difference = shift;
        }
        return finalPhrase;

    }

    public static void differenceDecryptPatch(int pos) {
        double d;
        for (d = difference; d > 26;) {

            d = d - 26;
//            System.out.println("dif: " + d);
        }

//        System.out.println("pos: " + pos);
        difference = (int) (pos - d);
//        System.out.println("difference: " + difference);
    }

    public static String findChar(char ch) {
        int s = ch;
        System.out.println("Before: " + Character.getNumericValue(s));
        s = s + 1;
        System.out.println(s);
        System.out.println("After: " + Character.getNumericValue(s));
        return Character.toString(ch);

    }
}

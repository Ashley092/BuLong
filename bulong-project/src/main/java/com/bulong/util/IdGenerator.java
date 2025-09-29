package main.java.com.bulong.util;

import java.util.Random;

public class IdGenerator {

    private static final char[] BASE36_CHARS = "0123456789abcdefghijklmnopqrstuvwxyz".toCharArray();
    
    private final char[] characterSet;
    private final int base;
    private final int randomSuffixLength;
    private final Random random;

    public IdGenerator(char[] characterSet, int randomSuffixLength) {
        this.characterSet = characterSet;
        this.base = characterSet.length;
        this.randomSuffixLength = randomSuffixLength;
        this.random = new Random();
    }

    public static IdGenerator createBase36Generator(int randomSuffixLength) {
        return new IdGenerator(BASE36_CHARS, randomSuffixLength);
    }

    public String generate() {
        long timestamp = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        long temp = timestamp;

        do {
            int remainder = (int) (temp % base);
            sb.append(characterSet[remainder]);
            temp = temp / base;
        } while (temp > 0);
        String timestampEncoded = sb.reverse().toString();

        StringBuilder randomSuffix = new StringBuilder();
        for (int i = 0; i < randomSuffixLength; i++) {
            randomSuffix.append(characterSet[random.nextInt(base)]);
        }

        return timestampEncoded + randomSuffix.toString();
    }
}
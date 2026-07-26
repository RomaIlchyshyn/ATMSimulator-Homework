package utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

    public class InputUtils {

        private static final BufferedReader reader =
                new BufferedReader(new InputStreamReader(System.in));

        public static String readString() throws IOException {
            return reader.readLine();
        }

        public static int readInt() throws IOException {
            return Integer.parseInt(reader.readLine());
        }

        public static BigDecimal readBigDecimal() throws IOException {
            return new BigDecimal(reader.readLine());
        }
    }


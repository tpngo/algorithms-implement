package algo.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class StringUtilTest {
    @ParameterizedTest
    @CsvSource({"abc, true", "abbb, false", "(-5@9), true"})
    void testContainsUniqueCharsacters(String str, boolean result){
        Assertions.assertEquals(result, StringUtil.containsUniqueCharacters(str));
    }

    @ParameterizedTest
    @CsvSource({"abc,bca,true", "abbb, bbbac, false", "(-5@9), )-5@9(,  true"})
    void testCheckPermutation(String str1, String str2, boolean result){
        Assertions.assertEquals(result, StringUtil.checkPermutation(str1, str2));
    }
}

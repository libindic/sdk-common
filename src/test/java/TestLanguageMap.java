import android.test.AndroidTestCase;
import android.test.suitebuilder.annotation.LargeTest;
import android.test.suitebuilder.annotation.MediumTest;
import android.test.suitebuilder.annotation.SmallTest;

import org.libindic.sdk.common.LanguageDetect;

/**
 * Created by sujith on 6/6/14.
 */
public class TestLanguageMap extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @SmallTest
    @MediumTest
    @LargeTest
    public void testCharCompare() {

        assertEquals("kn_IN", LanguageDetect.detectLanguage("ನಮಸ್ಕಾರ").get("ನಮಸ್ಕಾರ"));
        assertEquals("hi_IN", LanguageDetect.detectLanguage("बॆंगलूरु").get("बॆंगलूरु"));
        assertEquals("bn_IN", LanguageDetect.detectLanguage("বাংগ্লা").get("বাংগ্লা"));
        assertEquals("ml_IN", LanguageDetect.detectLanguage("മലയാളം").get("മലയാളം"));
        assertEquals("ta_IN", LanguageDetect.detectLanguage("தமிள்").get("தமிள்"));
        assertEquals("te_IN", LanguageDetect.detectLanguage("తెలుగు").get("తెలుగు"));
        assertEquals("or_IN", LanguageDetect.detectLanguage("଒ରିଯା").get("଒ରିଯା"));
        assertEquals("pa_IN", LanguageDetect.detectLanguage("ਪਂਜਾਬਿ").get("ਪਂਜਾਬਿ"));
        assertEquals("gu_IN", LanguageDetect.detectLanguage("ગુજરાતિ").get("ગુજરાતિ"));
        assertEquals("en_US", LanguageDetect.detectLanguage("English").get("English"));
    }

    @Override
    protected void tearDown() throws Exception {
        super.tearDown();
    }
}

package kg1;

import android.util.Log;
import java.util.logging.Level;
import jg1.C41444f;

/* renamed from: kg1.c */
public class C41514c implements C41444f {

    /* renamed from: a */
    private final String f97683a;

    public C41514c(String str) {
        this.f97683a = str;
    }

    /* renamed from: c */
    private int m120420c(Level level) {
        int intValue = level.intValue();
        if (intValue < 800) {
            return intValue < 500 ? 2 : 3;
        }
        if (intValue < 900) {
            return 4;
        }
        return intValue < 1000 ? 5 : 6;
    }

    /* renamed from: a */
    public void mo96193a(Level level, String str, Throwable th) {
        if (level != Level.OFF) {
            int c = m120420c(level);
            String str2 = this.f97683a;
            Log.println(c, str2, str + "\n" + Log.getStackTraceString(th));
        }
    }

    /* renamed from: b */
    public void mo96194b(Level level, String str) {
        if (level != Level.OFF) {
            Log.println(m120420c(level), this.f97683a, str);
        }
    }
}

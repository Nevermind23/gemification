package yf1;

import java.util.logging.Level;
import java.util.logging.LogRecord;

/* renamed from: yf1.g */
public abstract class C43382g {
    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final int m124454b(LogRecord logRecord) {
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            return 5;
        }
        if (logRecord.getLevel().intValue() == Level.INFO.intValue()) {
            return 4;
        }
        return 3;
    }
}

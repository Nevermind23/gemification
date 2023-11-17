package yf1;

import java.util.logging.Handler;
import java.util.logging.LogRecord;
import kotlin.jvm.internal.C41536l;

/* renamed from: yf1.f */
public final class C43381f extends Handler {

    /* renamed from: a */
    public static final C43381f f101224a = new C43381f();

    private C43381f() {
    }

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        C41536l.m120489i(logRecord, "record");
        C43380e eVar = C43380e.f101221a;
        String loggerName = logRecord.getLoggerName();
        C41536l.m120488h(loggerName, "record.loggerName");
        int a = C43382g.m124454b(logRecord);
        String message = logRecord.getMessage();
        C41536l.m120488h(message, "record.message");
        eVar.mo102059a(loggerName, a, message, logRecord.getThrown());
    }
}

package ba1;

import kotlin.jvm.internal.C41536l;
import p342j$.time.ZoneOffset;
import p342j$.time.ZonedDateTime;
import p342j$.time.format.DateTimeFormatter;

/* renamed from: ba1.h0 */
public final class C10198h0 {

    /* renamed from: a */
    public static final C10198h0 f28253a = new C10198h0();

    private C10198h0() {
    }

    /* renamed from: a */
    public final String mo26766a() {
        String format = DateTimeFormatter.RFC_1123_DATE_TIME.format(ZonedDateTime.now(ZoneOffset.UTC));
        C41536l.m120488h(format, "RFC_1123_DATE_TIME\n     …Time.now(ZoneOffset.UTC))");
        return format;
    }
}

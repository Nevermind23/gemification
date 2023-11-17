package r51;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;

/* renamed from: r51.c */
public abstract class C38287c {
    /* renamed from: a */
    public static final String m112557a(long j) {
        String format = new SimpleDateFormat("dd.MM.yyyy", Locale.getDefault()).format(new Date(j));
        C41536l.m120488h(format, "SimpleDateFormat(\"dd.MM.…etDefault()).format(date)");
        return format;
    }
}

package o31;

import android.util.LruCache;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p342j$.util.DesugarTimeZone;
import ue1.C43064a;

/* renamed from: o31.e */
public abstract class C37595e {

    /* renamed from: a */
    private static final LruCache f90338a = new LruCache(10);

    /* renamed from: b */
    private static final LruCache f90339b = new LruCache(10);

    /* renamed from: o31.e$a */
    static final class C37596a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ String f90340d;

        /* renamed from: e */
        final /* synthetic */ Locale f90341e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37596a(String str, Locale locale) {
            super(0);
            this.f90340d = str;
            this.f90341e = locale;
        }

        /* renamed from: b */
        public final DateFormat invoke() {
            return new SimpleDateFormat(this.f90340d, this.f90341e);
        }
    }

    /* renamed from: o31.e$b */
    static final class C37597b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ String f90342d;

        /* renamed from: e */
        final /* synthetic */ Locale f90343e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C37597b(String str, Locale locale) {
            super(0);
            this.f90342d = str;
            this.f90343e = locale;
        }

        /* renamed from: b */
        public final DecimalFormat invoke() {
            return new DecimalFormat(this.f90342d, DecimalFormatSymbols.getInstance(this.f90343e));
        }
    }

    /* renamed from: a */
    public static final DateFormat m110565a(String str, Locale locale) {
        C37607n nVar;
        C41536l.m120489i(str, "pattern");
        if (locale == null) {
            locale = Locale.getDefault();
        }
        C41536l.m120488h(locale, "_locale");
        int c = m110567c(str, locale);
        LruCache lruCache = f90339b;
        synchronized (lruCache) {
            nVar = (C37607n) lruCache.get(Integer.valueOf(c));
            if (nVar == null) {
                nVar = new C37607n(new C37596a(str, locale));
                lruCache.put(Integer.valueOf(c), nVar);
            }
        }
        return (DateFormat) nVar.mo90790a();
    }

    /* renamed from: b */
    public static final DecimalFormat m110566b(String str, Locale locale) {
        C37607n nVar;
        C41536l.m120489i(str, "pattern");
        if (locale == null) {
            locale = Locale.ROOT;
        }
        C41536l.m120488h(locale, "_locale");
        int c = m110567c(str, locale);
        LruCache lruCache = f90338a;
        synchronized (lruCache) {
            nVar = (C37607n) lruCache.get(Integer.valueOf(c));
            if (nVar == null) {
                nVar = new C37607n(new C37597b(str, locale));
                lruCache.put(Integer.valueOf(c), nVar);
            }
        }
        return (DecimalFormat) nVar.mo90790a();
    }

    /* renamed from: c */
    private static final int m110567c(String str, Locale locale) {
        return Objects.hash(new Object[]{str, locale});
    }

    /* renamed from: d */
    public static final String m110568d(Date date) {
        C41536l.m120489i(date, "date");
        try {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'", Locale.getDefault());
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            String format = simpleDateFormat.format(date);
            C41536l.m120488h(format, "{\n        val dateFormat…Format.format(date)\n    }");
            return format;
        } catch (Exception unused) {
            return "";
        }
    }
}

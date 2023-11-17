package o31;

import af1.C40303i;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.properties.C41554d;

/* renamed from: o31.m */
public final class C37606m {

    /* renamed from: a */
    public static final C37606m f90354a = new C37606m();

    private C37606m() {
    }

    /* renamed from: d */
    public static /* synthetic */ C41554d m110587d(C37606m mVar, String str, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = null;
        }
        return mVar.mo90788c(str, locale);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final DateFormat m110588e(String str, Locale locale, Object obj, C40303i iVar) {
        C41536l.m120489i(str, "$pattern");
        C41536l.m120489i(obj, "<anonymous parameter 0>");
        C41536l.m120489i(iVar, "<anonymous parameter 1>");
        return C37595e.m110565a(str, locale);
    }

    /* renamed from: g */
    public static /* synthetic */ C41554d m110589g(C37606m mVar, String str, Locale locale, int i, Object obj) {
        if ((i & 2) != 0) {
            locale = null;
        }
        return mVar.mo90789f(str, locale);
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final DecimalFormat m110590h(String str, Locale locale, Object obj, C40303i iVar) {
        C41536l.m120489i(str, "$pattern");
        C41536l.m120489i(obj, "<anonymous parameter 0>");
        C41536l.m120489i(iVar, "<anonymous parameter 1>");
        return C37595e.m110566b(str, locale);
    }

    /* renamed from: c */
    public final C41554d mo90788c(String str, Locale locale) {
        C41536l.m120489i(str, "pattern");
        return new C37604k(str, locale);
    }

    /* renamed from: f */
    public final C41554d mo90789f(String str, Locale locale) {
        C41536l.m120489i(str, "pattern");
        return new C37605l(str, locale);
    }
}

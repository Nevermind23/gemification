package p341ge.bog.chat.presentation.activity;

import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import p419fg.C12870a;

/* renamed from: ge.bog.chat.presentation.activity.k0 */
public abstract class C13037k0 {
    /* renamed from: a */
    public static final boolean m49202a(C12870a aVar) {
        C41536l.m120489i(aVar, "<this>");
        if (aVar.mo33554a() == null || !m49203b(aVar.mo33554a())) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static final boolean m49203b(String str) {
        C41536l.m120489i(str, "mimeType");
        Locale locale = Locale.ROOT;
        C41536l.m120488h(locale, "ROOT");
        String lowerCase = str.toLowerCase(locale);
        C41536l.m120488h(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (!C40439w.m117109H(lowerCase, "image", false, 2, (Object) null)) {
            return false;
        }
        C41536l.m120488h(locale, "ROOT");
        String lowerCase2 = str.toLowerCase(locale);
        C41536l.m120488h(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
        if (!C40440x.m117139M(lowerCase2, "djvu", false, 2, (Object) null)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final int m49204c(C13027g0 g0Var, C13034j0 j0Var) {
        boolean z;
        C41536l.m120489i(g0Var, "<this>");
        C41536l.m120489i(j0Var, "message");
        if (j0Var.mo34300o() == C13032i0.FILE_ATTACHMENT) {
            C12870a f = j0Var.mo34290f();
            if (f != null) {
                z = m49202a(f);
            } else {
                z = false;
            }
            if (!z) {
                return 4;
            }
        }
        return g0Var.mo34282c();
    }
}

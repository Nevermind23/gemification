package r90;

import ad0.C19227a;
import cf1.C40419j;
import iu0.C36546y;
import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import n41.C37353c;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p530nf.C16919b;
import p953yq.C30107a;
import p953yq.C30108b;

/* renamed from: r90.a */
public final class C27950a {

    /* renamed from: a */
    public static final C27950a f71164a = new C27950a();

    /* renamed from: b */
    private static final C30107a f71165b;

    /* renamed from: c */
    private static final C30108b f71166c;

    /* renamed from: r90.a$a */
    public interface C27951a {
        /* renamed from: e */
        C30108b mo32855e();

        /* renamed from: h */
        C30107a mo32869h();
    }

    static {
        C36546y N = C36546y.m108285N();
        C41536l.m120488h(N, "getInstance()");
        C27951a aVar = (C27951a) C16919b.m59518a(N, C27951a.class);
        f71165b = aVar.mo32869h();
        f71166c = aVar.mo32855e();
    }

    private C27950a() {
    }

    /* renamed from: a */
    public static final String m86284a(String str) {
        return m86287d(str, false, 2, (Object) null);
    }

    /* renamed from: b */
    public static final String m86285b(String str, C37353c cVar, boolean z, Object... objArr) {
        C41536l.m120489i(cVar, "lang");
        C41536l.m120489i(objArr, "additionalVariables");
        if (str == null) {
            return "key not found";
        }
        if (z) {
            return m86289f(str, cVar, Arrays.copyOf(objArr, objArr.length));
        }
        return m86288e(str, cVar, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: c */
    public static final String m86286c(String str, boolean z) {
        C37353c language = PreferencesApiManager.getInstance().getLanguage();
        C41536l.m120488h(language, "getInstance().getLanguage()");
        return C40439w.m117103B(C40439w.m117103B(C40439w.m117103B(m86285b(str, language, z, new Object[0]), "<br/>", "\n", false, 4, (Object) null), "<br />", "\n", false, 4, (Object) null), "<br>", "\n", false, 4, (Object) null);
    }

    /* renamed from: d */
    public static /* synthetic */ String m86287d(String str, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return m86286c(str, z);
    }

    /* renamed from: e */
    public static final String m86288e(String str, C37353c cVar, Object... objArr) {
        boolean z;
        C41536l.m120489i(str, "key");
        C41536l.m120489i(cVar, "lang");
        C41536l.m120489i(objArr, "additionalVariables");
        C19227a a = f71165b.mo47929a(str);
        if (a != null) {
            boolean z2 = false;
            if (cVar == C37353c.EN) {
                String e = a.mo47465e();
                if (e == null || e.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = a.mo47465e();
                    C41536l.m120486f(str);
                }
            }
            if (cVar == C37353c.KA) {
                String f = a.mo47467f();
                if (f == null || f.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    str = a.mo47467f();
                    C41536l.m120486f(str);
                }
            }
        }
        return m86292i(str, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: f */
    public static final String m86289f(String str, C37353c cVar, Object... objArr) {
        boolean z;
        C41536l.m120489i(str, "key");
        C41536l.m120489i(cVar, "lang");
        C41536l.m120489i(objArr, "additionalVariables");
        C19227a a = f71166c.mo47931a(str);
        if (a != null) {
            boolean z2 = false;
            if (cVar == C37353c.EN) {
                String e = a.mo47465e();
                if (e == null || e.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    str = a.mo47465e();
                    C41536l.m120486f(str);
                }
            }
            if (cVar == C37353c.KA) {
                String f = a.mo47467f();
                if (f == null || f.length() == 0) {
                    z2 = true;
                }
                if (!z2) {
                    str = a.mo47467f();
                    C41536l.m120486f(str);
                }
            }
        }
        return m86292i(str, Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: g */
    public static final String m86290g(String str, boolean z, Object... objArr) {
        C41536l.m120489i(objArr, "additionalVariables");
        return m86292i(m86286c(str, z), Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: h */
    public static final String m86291h(String str, Object... objArr) {
        C41536l.m120489i(objArr, "additionalVariables");
        return m86292i(m86286c(str, false), Arrays.copyOf(objArr, objArr.length));
    }

    /* renamed from: i */
    private static final String m86292i(String str, Object... objArr) {
        int length = objArr.length;
        int i = 0;
        while (i < length) {
            int i2 = i + 1;
            str = new C40419j("\\{" + i2 + "s\\}").mo94490g(str, objArr[i].toString());
            i = i2;
        }
        return str;
    }
}

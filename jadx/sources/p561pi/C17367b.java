package p561pi;

import cf1.C40419j;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: pi.b */
public final class C17367b implements C17365a {

    /* renamed from: e */
    public static final C17368a f48700e = new C17368a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private String f48701a;

    /* renamed from: b */
    private String f48702b;

    /* renamed from: c */
    private final String f48703c;

    /* renamed from: d */
    private String f48704d;

    /* renamed from: pi.b$a */
    public static final class C17368a {
        private C17368a() {
        }

        public /* synthetic */ C17368a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C17367b(String str, String str2, String str3, String str4) {
        C41536l.m120489i(str3, "separator");
        C41536l.m120489i(str4, "pattern");
        this.f48701a = str;
        this.f48702b = str2;
        this.f48703c = str3;
        this.f48704d = str4;
    }

    /* renamed from: g */
    private final String m60763g(String str, String str2, String str3) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return "";
        }
        if (str2 == null) {
            str2 = "";
        }
        String i = m60765i(str);
        if (str3 == null) {
            str3 = "";
        }
        return str2 + i + str3;
    }

    /* renamed from: h */
    static /* synthetic */ String m60764h(C17367b bVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = bVar.mo44808k();
        }
        if ((i & 4) != 0) {
            str3 = bVar.mo44805e();
        }
        return bVar.m60763g(str, str2, str3);
    }

    /* renamed from: i */
    private final String m60765i(String str) {
        try {
            String format = new DecimalFormat(mo44807j(), DecimalFormatSymbols.getInstance(Locale.ROOT)).format(Double.parseDouble(str));
            C41536l.m120488h(format, "{\n            DecimalFor…lue.toDouble())\n        }");
            return format;
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public void mo44801a(String str) {
        this.f48701a = str;
    }

    /* renamed from: b */
    public String mo44802b(String str, String str2, String str3) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        return m60763g(str, str2, str3);
    }

    /* renamed from: c */
    public String mo44803c(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        String e = mo44805e();
        String l = mo44809l();
        return new C40419j("[" + e + l + "]").mo94490g(str, "");
    }

    /* renamed from: d */
    public String mo44804d(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        return m60764h(this, str, (String) null, (String) null, 6, (Object) null);
    }

    /* renamed from: e */
    public String mo44805e() {
        return this.f48701a;
    }

    /* renamed from: f */
    public int mo44806f() {
        return 8194;
    }

    /* renamed from: j */
    public String mo44807j() {
        return this.f48704d;
    }

    /* renamed from: k */
    public String mo44808k() {
        return this.f48702b;
    }

    /* renamed from: l */
    public String mo44809l() {
        return this.f48703c;
    }

    /* renamed from: m */
    public void mo44810m(String str) {
        C41536l.m120489i(str, "<set-?>");
        this.f48704d = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C17367b(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "," : str3, (i & 8) != 0 ? "###,###.##" : str4);
    }
}

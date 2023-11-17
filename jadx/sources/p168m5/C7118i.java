package p168m5;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p168m5.C7103b;

/* renamed from: m5.i */
public abstract class C7118i {

    /* renamed from: m5.i$a */
    public static abstract class C7119a {
        /* renamed from: a */
        public final C7119a mo21379a(String str, int i) {
            mo21334e().put(str, String.valueOf(i));
            return this;
        }

        /* renamed from: b */
        public final C7119a mo21380b(String str, long j) {
            mo21334e().put(str, String.valueOf(j));
            return this;
        }

        /* renamed from: c */
        public final C7119a mo21381c(String str, String str2) {
            mo21334e().put(str, str2);
            return this;
        }

        /* renamed from: d */
        public abstract C7118i mo21333d();

        /* access modifiers changed from: protected */
        /* renamed from: e */
        public abstract Map mo21334e();

        /* access modifiers changed from: protected */
        /* renamed from: f */
        public abstract C7119a mo21335f(Map map);

        /* renamed from: g */
        public abstract C7119a mo21336g(Integer num);

        /* renamed from: h */
        public abstract C7119a mo21337h(C7117h hVar);

        /* renamed from: i */
        public abstract C7119a mo21338i(long j);

        /* renamed from: j */
        public abstract C7119a mo21339j(String str);

        /* renamed from: k */
        public abstract C7119a mo21340k(long j);
    }

    /* renamed from: a */
    public static C7119a m27441a() {
        return new C7103b.C7105b().mo21335f(new HashMap());
    }

    /* renamed from: b */
    public final String mo21374b(String str) {
        String str2 = (String) mo21324c().get(str);
        return str2 == null ? "" : str2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract Map mo21324c();

    /* renamed from: d */
    public abstract Integer mo21325d();

    /* renamed from: e */
    public abstract C7117h mo21326e();

    /* renamed from: f */
    public abstract long mo21328f();

    /* renamed from: g */
    public final int mo21375g(String str) {
        String str2 = (String) mo21324c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Integer.valueOf(str2).intValue();
    }

    /* renamed from: h */
    public final long mo21376h(String str) {
        String str2 = (String) mo21324c().get(str);
        if (str2 == null) {
            return 0;
        }
        return Long.valueOf(str2).longValue();
    }

    /* renamed from: i */
    public final Map mo21377i() {
        return Collections.unmodifiableMap(mo21324c());
    }

    /* renamed from: j */
    public abstract String mo21330j();

    /* renamed from: k */
    public abstract long mo21331k();

    /* renamed from: l */
    public C7119a mo21378l() {
        return new C7103b.C7105b().mo21339j(mo21330j()).mo21336g(mo21325d()).mo21337h(mo21326e()).mo21338i(mo21328f()).mo21340k(mo21331k()).mo21335f(new HashMap(mo21324c()));
    }
}

package p218q3;

import java.io.File;
import p218q3.C7864a;

/* renamed from: q3.d */
public abstract class C7871d implements C7864a.C7865a {

    /* renamed from: a */
    private final long f22812a;

    /* renamed from: b */
    private final C7872a f22813b;

    /* renamed from: q3.d$a */
    public interface C7872a {
        /* renamed from: a */
        File mo22840a();
    }

    public C7871d(C7872a aVar, long j) {
        this.f22812a = j;
        this.f22813b = aVar;
    }

    /* renamed from: a */
    public C7864a mo22835a() {
        File a = this.f22813b.mo22840a();
        if (a == null) {
            return null;
        }
        if (a.isDirectory() || a.mkdirs()) {
            return C7873e.m29816c(a, this.f22812a);
        }
        return null;
    }
}

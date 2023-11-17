package p212pa;

import android.os.Bundle;
import p134ja.C6763a;

/* renamed from: pa.f */
public final class C7783f {

    /* renamed from: b */
    private static final C6763a f22500b = C6763a.m26371e();

    /* renamed from: a */
    private final Bundle f22501a;

    public C7783f() {
        this(new Bundle());
    }

    /* renamed from: d */
    private C7784g m29486d(String str) {
        if (!mo22542a(str)) {
            return C7784g.m29491a();
        }
        try {
            return C7784g.m29492b((Integer) this.f22501a.get(str));
        } catch (ClassCastException e) {
            f22500b.mo20805b("Metadata key %s contains type other than int: %s", str, e.getMessage());
            return C7784g.m29491a();
        }
    }

    /* renamed from: a */
    public boolean mo22542a(String str) {
        return str != null && this.f22501a.containsKey(str);
    }

    /* renamed from: b */
    public C7784g mo22543b(String str) {
        if (!mo22542a(str)) {
            return C7784g.m29491a();
        }
        try {
            return C7784g.m29492b((Boolean) this.f22501a.get(str));
        } catch (ClassCastException e) {
            f22500b.mo20805b("Metadata key %s contains type other than boolean: %s", str, e.getMessage());
            return C7784g.m29491a();
        }
    }

    /* renamed from: c */
    public C7784g mo22544c(String str) {
        if (!mo22542a(str)) {
            return C7784g.m29491a();
        }
        Object obj = this.f22501a.get(str);
        if (obj == null) {
            return C7784g.m29491a();
        }
        if (obj instanceof Float) {
            return C7784g.m29493e(Double.valueOf(((Float) obj).doubleValue()));
        }
        if (obj instanceof Double) {
            return C7784g.m29493e((Double) obj);
        }
        f22500b.mo20805b("Metadata key %s contains type other than double: %s", str);
        return C7784g.m29491a();
    }

    /* renamed from: e */
    public C7784g mo22545e(String str) {
        C7784g d = m29486d(str);
        if (d.mo22547d()) {
            return C7784g.m29493e(Long.valueOf((long) ((Integer) d.mo22546c()).intValue()));
        }
        return C7784g.m29491a();
    }

    public C7783f(Bundle bundle) {
        this.f22501a = (Bundle) bundle.clone();
    }
}

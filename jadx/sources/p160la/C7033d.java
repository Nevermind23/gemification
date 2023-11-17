package p160la;

import java.util.Map;
import p134ja.C6763a;
import p212pa.C7778b;
import p225qa.C7990m;

/* renamed from: la.d */
final class C7033d extends C7034e {

    /* renamed from: b */
    private static final C6763a f20943b = C6763a.m26371e();

    /* renamed from: a */
    private final C7990m f20944a;

    C7033d(C7990m mVar) {
        this.f20944a = mVar;
    }

    /* renamed from: g */
    private boolean m27225g(Map map) {
        for (Map.Entry entry : map.entrySet()) {
            try {
                C7034e.m27239d((String) entry.getKey(), (String) entry.getValue());
            } catch (IllegalArgumentException e) {
                f20943b.mo20812j(e.getLocalizedMessage());
                return false;
            }
        }
        return true;
    }

    /* renamed from: h */
    private boolean m27226h(C7990m mVar) {
        return m27227i(mVar, 0);
    }

    /* renamed from: i */
    private boolean m27227i(C7990m mVar, int i) {
        if (mVar == null) {
            return false;
        }
        if (i > 1) {
            f20943b.mo20812j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        }
        for (Map.Entry entry : mVar.mo23116k0().entrySet()) {
            if (!m27230l((String) entry.getKey())) {
                C6763a aVar = f20943b;
                aVar.mo20812j("invalid CounterId:" + ((String) entry.getKey()));
                return false;
            } else if (!m27231m((Long) entry.getValue())) {
                C6763a aVar2 = f20943b;
                aVar2.mo20812j("invalid CounterValue:" + entry.getValue());
                return false;
            }
        }
        for (C7990m i2 : mVar.mo23121t0()) {
            if (!m27227i(i2, i + 1)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    private boolean m27228j(C7990m mVar) {
        boolean z;
        boolean z2;
        if (mVar.mo23115j0() > 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return true;
        }
        for (C7990m j0 : mVar.mo23121t0()) {
            if (j0.mo23115j0() > 0) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m27229k(C7990m mVar) {
        return mVar.mo23119r0().startsWith("_st_");
    }

    /* renamed from: l */
    private boolean m27230l(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty()) {
            f20943b.mo20812j("counterId is empty");
            return false;
        } else if (trim.length() <= 100) {
            return true;
        } else {
            f20943b.mo20812j("counterId exceeded max length 100");
            return false;
        }
    }

    /* renamed from: m */
    private boolean m27231m(Long l) {
        return l != null;
    }

    /* renamed from: n */
    private boolean m27232n(C7990m mVar) {
        Long l = (Long) mVar.mo23116k0().get(C7778b.FRAMES_TOTAL.toString());
        if (l == null || l.compareTo(0L) <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: o */
    private boolean m27233o(C7990m mVar, int i) {
        if (mVar == null) {
            f20943b.mo20812j("TraceMetric is null");
            return false;
        } else if (i > 1) {
            f20943b.mo20812j("Exceed MAX_SUBTRACE_DEEP:1");
            return false;
        } else if (!m27235q(mVar.mo23119r0())) {
            C6763a aVar = f20943b;
            aVar.mo20812j("invalid TraceId:" + mVar.mo23119r0());
            return false;
        } else if (!m27234p(mVar)) {
            C6763a aVar2 = f20943b;
            aVar2.mo20812j("invalid TraceDuration:" + mVar.mo23118n0());
            return false;
        } else if (!mVar.mo23122u0()) {
            f20943b.mo20812j("clientStartTimeUs is null.");
            return false;
        } else if (!m27229k(mVar) || m27232n(mVar)) {
            for (C7990m o : mVar.mo23121t0()) {
                if (!m27233o(o, i + 1)) {
                    return false;
                }
            }
            if (!m27225g(mVar.mo23117l0())) {
                return false;
            }
            return true;
        } else {
            C6763a aVar3 = f20943b;
            aVar3.mo20812j("non-positive totalFrames in screen trace " + mVar.mo23119r0());
            return false;
        }
    }

    /* renamed from: p */
    private boolean m27234p(C7990m mVar) {
        return mVar != null && mVar.mo23118n0() > 0;
    }

    /* renamed from: q */
    private boolean m27235q(String str) {
        if (str == null) {
            return false;
        }
        String trim = str.trim();
        if (trim.isEmpty() || trim.length() > 100) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo21243c() {
        if (!m27233o(this.f20944a, 0)) {
            C6763a aVar = f20943b;
            aVar.mo20812j("Invalid Trace:" + this.f20944a.mo23119r0());
            return false;
        } else if (!m27228j(this.f20944a) || m27226h(this.f20944a)) {
            return true;
        } else {
            C6763a aVar2 = f20943b;
            aVar2.mo20812j("Invalid Counters for Trace:" + this.f20944a.mo23119r0());
            return false;
        }
    }
}

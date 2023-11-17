package p585re;

import com.salesforce.marketingcloud.C11398b;
import com.threatmetrix.TrustDefender.C11877a1;
import com.threatmetrix.TrustDefender.C11888c1;
import com.threatmetrix.TrustDefender.C11897e0;
import com.threatmetrix.TrustDefender.C11898e1;
import com.threatmetrix.TrustDefender.C11901f0;
import com.threatmetrix.TrustDefender.C11902f1;
import com.threatmetrix.TrustDefender.C11909h0;
import com.threatmetrix.TrustDefender.C11910h1;
import com.threatmetrix.TrustDefender.C11912i0;
import com.threatmetrix.TrustDefender.C11913i1;
import com.threatmetrix.TrustDefender.C11920k;
import com.threatmetrix.TrustDefender.C11921k0;
import com.threatmetrix.TrustDefender.C11922k1;
import com.threatmetrix.TrustDefender.C11926l0;
import com.threatmetrix.TrustDefender.C11935m1;
import com.threatmetrix.TrustDefender.C11939n1;
import com.threatmetrix.TrustDefender.C11940o;
import com.threatmetrix.TrustDefender.C11945p1;
import com.threatmetrix.TrustDefender.C11962q;
import com.threatmetrix.TrustDefender.C11964q1;
import com.threatmetrix.TrustDefender.C11968r0;
import com.threatmetrix.TrustDefender.C11987s;
import com.threatmetrix.TrustDefender.C11988s0;
import com.threatmetrix.TrustDefender.C11989s1;
import com.threatmetrix.TrustDefender.C11990t;
import com.threatmetrix.TrustDefender.C11994t1;
import com.threatmetrix.TrustDefender.C11995u;
import com.threatmetrix.TrustDefender.C11998u1;
import com.threatmetrix.TrustDefender.C12006w1;
import com.threatmetrix.TrustDefender.C12007x;
import com.threatmetrix.TrustDefender.C12008x0;
import com.threatmetrix.TrustDefender.C12009x1;
import com.threatmetrix.TrustDefender.C12018z0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: re.n */
public class C17597n {

    /* renamed from: b */
    private static final C17597n f49304b = new C17597n();

    /* renamed from: c */
    private static final Lock f49305c = new ReentrantLock();

    /* renamed from: d */
    public static final List f49306d = new ArrayList();

    /* renamed from: a */
    public String f49307a;

    private C17597n() {
    }

    /* renamed from: b */
    private void m61200b(C11935m1 m1Var) {
        String f = m1Var.mo31989f();
        if (C11921k0.m43732o(f)) {
            this.f49307a += f;
        }
    }

    /* renamed from: d */
    public static C17597n m61201d() {
        return f49304b;
    }

    /* renamed from: e */
    private void m61202e(Map map) {
        if (C11921k0.m43732o(this.f49307a)) {
            map.put(C17590g.CRASH_LOG_STRING.mo45142a(), C11921k0.m43716A(this.f49307a, C11398b.f33141t));
        }
    }

    /* renamed from: a */
    public Map mo45166a(long j, boolean z) {
        try {
            f49305c.lock();
            HashMap hashMap = new HashMap();
            for (C11935m1 m1Var : f49306d) {
                if (m1Var != null) {
                    m1Var.mo31988c(j, hashMap, z);
                }
            }
            m61202e(hashMap);
            return hashMap;
        } finally {
            f49305c.unlock();
        }
    }

    /* renamed from: c */
    public void mo45167c(long j, C11994t1 t1Var, boolean z, boolean z2) {
        try {
            f49305c.lock();
            this.f49307a = "";
            for (C11935m1 m1Var : f49306d) {
                if (m1Var != null) {
                    m1Var.mo31986a(j, t1Var, z, z2);
                    m61200b(m1Var);
                }
            }
        } finally {
            f49305c.unlock();
        }
    }

    /* renamed from: f */
    public void mo45168f() {
        try {
            Lock lock = f49305c;
            lock.lock();
            List list = f49306d;
            list.clear();
            list.add(new C11926l0(0));
            list.add(new C12007x(8));
            list.add(new C12006w1(0));
            list.add(new C11913i1(16));
            list.add(new C11902f1(0));
            list.add(new C11968r0(2048));
            list.add(new C11998u1(0));
            list.add(new C11989s1(0));
            list.add(new C11909h0(32768));
            list.add(new C11987s(2251799813685248L));
            list.add(new C11962q(262144));
            list.add(new C11901f0(8388608, false, false));
            list.add(new C11877a1(536870912));
            list.add(new C11964q1(4294967296L));
            list.add(new C11988s0(1125899906842624L));
            list.add(new C12009x1(0));
            list.add(new C11888c1(0));
            list.add(new C11898e1(36028797018963968L));
            list.add(new C11945p1(0, false, false));
            C11940o oVar = new C11940o(67108864, false, false);
            oVar.mo31987b(new C12018z0(131072));
            oVar.mo31987b(new C11910h1(0));
            list.add(oVar);
            list.add(new C11897e0(33554432, false, false));
            list.add(new C11922k1(0, true, false));
            list.add(new C12008x0(4194304, true, false));
            list.add(new C11995u(0, true, false));
            list.add(new C11990t(16384, true, false));
            C11912i0 i0Var = new C11912i0(134217728, true, true);
            i0Var.mo31987b(new C11920k(0, true, true));
            i0Var.mo31987b(new C11939n1(2097152, true, true));
            list.add(i0Var);
            lock.unlock();
        } catch (Throwable th) {
            f49305c.unlock();
            throw th;
        }
    }
}

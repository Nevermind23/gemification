package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11927l1;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.f0 */
public class C11901f0 extends C11935m1 {

    /* renamed from: g */
    private C11927l1.C11929b f34828g;

    public C11901f0(long j, boolean z, boolean z2) {
        super(j, z, z2);
    }

    /* renamed from: i */
    private String m43591i() {
        boolean z;
        if (this.f34828g == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder("{");
        boolean z2 = false;
        if (this.f34828g.f34914c >= 0) {
            sb.append("\"mlc\":");
            sb.append(this.f34828g.f34914c);
            z = false;
        } else {
            z = true;
        }
        if (this.f34828g.f34915d >= 0) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append("\"mls\":");
            sb.append(this.f34828g.f34915d);
        }
        if (this.f34828g.f34912a >= 0) {
            if (z) {
                z = false;
            } else {
                sb.append(",");
            }
            sb.append("\"slc\":");
            sb.append(this.f34828g.f34912a);
        }
        if (this.f34828g.f34913b >= 0) {
            if (!z) {
                sb.append(",");
                z2 = z;
            }
            sb.append("\"sls\":");
            sb.append(this.f34828g.f34913b);
            z = z2;
        }
        C11927l1.C11929b bVar = this.f34828g;
        if (bVar.f34916e || bVar.f34914c >= 0 || bVar.f34915d >= 0) {
            if (!z) {
                sb.append(",");
            }
            sb.append("\"tda\":");
            sb.append(this.f34828g.f34916e);
        }
        sb.append("}");
        return sb.length() > 2 ? sb.toString() : "";
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_SHARED_LIB;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (this.f34828g == null) {
            this.f34828g = C11914j.m43696w();
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.SHARED_LIB_INFO.mo45142a(), m43591i());
        }
    }
}

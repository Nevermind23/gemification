package com.threatmetrix.TrustDefender;

import android.media.AudioManager;
import com.threatmetrix.TrustDefender.C11935m1;
import java.util.Map;
import p585re.C17590g;

/* renamed from: com.threatmetrix.TrustDefender.e1 */
public class C11898e1 extends C11935m1 {

    /* renamed from: g */
    public int f34825g;

    public C11898e1(long j) {
        super(j);
    }

    /* renamed from: d */
    public C11935m1.C11936a mo31918d() {
        return C11935m1.C11936a.COLLECTOR_TYPE_PHONE_CALL;
    }

    /* renamed from: g */
    public void mo31919g(C11994t1 t1Var, Map map) {
        if (t1Var.mo32051a() != null) {
            this.f34825g = 0;
            Object systemService = t1Var.mo32051a().f49314a.getSystemService("audio");
            if (systemService instanceof AudioManager) {
                int mode = ((AudioManager) systemService).getMode();
                if (mode == 2 || mode == 3) {
                    this.f34825g = 1;
                }
            }
        }
    }

    /* renamed from: h */
    public void mo31920h(Map map) {
        if (map != null) {
            map.put(C17590g.IN_CALL_STATUS.mo45142a(), String.valueOf(this.f34825g));
        }
    }
}

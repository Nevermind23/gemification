package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import com.threatmetrix.TrustDefender.lrrlrr;
import com.threatmetrix.TrustDefender.peppep;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.nio.charset.StandardCharsets;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.t0 */
public class C11991t0 implements peppep.C11957k {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static final String f35287d = C11907h.m43615j(C11991t0.class);
    /* access modifiers changed from: private */

    /* renamed from: a */
    public volatile String f35288a = null;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public volatile boolean f35289b = false;

    /* renamed from: c */
    private volatile String f35290c = null;

    /* renamed from: com.threatmetrix.TrustDefender.t0$b */
    public private class C11993b implements InvocationHandler {
        private C11993b() {
        }

        public Object invoke(Object obj, Method method, Object[] objArr) {
            lrrlrr.lrlrrr lrlrrr;
            if (!"onResult".equals(method.getName()) || (lrlrrr = lrrlrr.f34918b) == null || objArr == null || objArr.length <= 0) {
                return null;
            }
            if (lrrlrr.m43774b(objArr[0])) {
                Object a = C11879b0.m43529a(objArr[0], lrlrrr.f34942Q, new Object[0]);
                if (!(a instanceof String)) {
                    return null;
                }
                String unused = C11991t0.this.f35288a = (String) a;
                return null;
            }
            C11907h.C11908a.m43624b(C11991t0.f35287d, "Couldn't get SafetyNet result, should try next time");
            boolean unused2 = C11991t0.this.f35289b = false;
            return null;
        }
    }

    /* renamed from: a */
    public void mo32017a(C17603t tVar, String str) {
        if (tVar == null) {
            C11907h.m43622q(f35287d, "Null context");
        } else if (!this.f35289b) {
            byte[] bytes = str.getBytes(StandardCharsets.UTF_8);
            if (bytes.length >= 16) {
                lrrlrr.m43781i(tVar.f49314a, bytes, new C11993b());
                this.f35289b = true;
                this.f35290c = str;
                C11907h.C11908a.m43624b(f35287d, "Called SafetyNet API");
                return;
            }
            C11907h.m43607b(f35287d, "SafetyNet failure: Invalid nonce format");
        }
    }

    /* renamed from: b */
    public String mo32018b() {
        return this.f35288a;
    }

    /* renamed from: c */
    public String mo32019c() {
        return this.f35290c;
    }
}

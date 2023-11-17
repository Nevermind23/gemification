package com.threatmetrix.TrustDefender;

import com.threatmetrix.TrustDefender.C11907h;
import p585re.C17603t;

/* renamed from: com.threatmetrix.TrustDefender.d0 */
public class C11891d0 {

    /* renamed from: g */
    private static final String f34810g = C11907h.m43615j(C11891d0.class);

    /* renamed from: a */
    private final String f34811a;

    /* renamed from: b */
    private final String f34812b;

    /* renamed from: c */
    private final String f34813c;

    /* renamed from: d */
    private final String f34814d;

    /* renamed from: e */
    private final boolean f34815e;

    /* renamed from: f */
    private String f34816f;

    public C11891d0(C17603t tVar, String str, String str2, String str3, String str4, boolean z) {
        this.f34812b = str;
        this.f34811a = str2;
        str3 = !C11921k0.m43739v(str3) ? C11921k0.m43726i(str3.getBytes()) : str3;
        this.f34813c = str3;
        this.f34814d = !C11921k0.m43739v(str4) ? C11921k0.m43726i(str4.getBytes()) : str4;
        this.f34815e = z;
        String h = C11876a0.m43523h(tVar, str, str2);
        if (!C11921k0.m43739v(h)) {
            this.f34816f = h;
        } else if (C11921k0.m43732o(str3)) {
            C11876a0.m43520e(tVar, str, str2, str3);
            this.f34816f = str3;
        }
    }

    /* renamed from: a */
    public boolean mo31941a(C17603t tVar) {
        if (C11921k0.m43739v(this.f34816f)) {
            this.f34816f = C11876a0.m43523h(tVar, this.f34812b, this.f34811a);
        }
        String str = f34810g;
        C11907h.C11908a.m43624b(str, "saved id for key " + this.f34811a + " is " + this.f34816f + " the value retrieved before is " + this.f34813c);
        return C11921k0.m43739v(this.f34813c) ? (C11921k0.m43732o(this.f34814d) && this.f34815e) || C11921k0.m43732o(this.f34816f) : (!this.f34813c.equalsIgnoreCase(this.f34814d) && this.f34815e) || !this.f34813c.equalsIgnoreCase(this.f34816f);
    }
}

package com.salesforce.marketingcloud.registration;

import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.internal.C11505g;
import com.salesforce.marketingcloud.storage.C11803m;
import com.salesforce.marketingcloud.util.C11808c;

/* renamed from: com.salesforce.marketingcloud.registration.a */
public class C11714a extends C11505g {

    /* renamed from: b */
    private final C11803m f33965b;

    /* renamed from: c */
    private final C11808c f33966c;

    /* renamed from: d */
    private final Registration f33967d;

    /* renamed from: e */
    private final boolean f33968e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C11714a(C11803m mVar, C11808c cVar, Registration registration, boolean z) {
        super(z ? "update_registration" : "add_registration", new Object[0]);
        this.f33965b = mVar;
        this.f33966c = cVar;
        this.f33967d = registration;
        this.f33968e = z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo29760a() {
        try {
            if (this.f33968e) {
                this.f33965b.mo31580a(this.f33967d, this.f33966c);
            } else {
                this.f33965b.mo31581b(this.f33967d, this.f33966c);
            }
        } catch (Exception e) {
            String str = RegistrationManager.f33962a;
            Object[] objArr = new Object[1];
            objArr[0] = this.f33968e ? "update" : "add";
            C11461g.m41885b(str, e, "Unable to %s registration", objArr);
        }
    }
}

package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.media.C11587s;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.b */
public class C11555b implements C11562f {

    /* renamed from: g */
    private static final String f33538g = C11461g.m41875a("BatchRequestHandler");

    /* renamed from: a */
    private final AtomicInteger f33539a;

    /* renamed from: b */
    private final C11580o f33540b;

    /* renamed from: c */
    private final List<String> f33541c;

    /* renamed from: d */
    private C11556a f33542d;

    /* renamed from: e */
    private boolean f33543e;

    /* renamed from: f */
    private boolean f33544f;

    /* renamed from: com.salesforce.marketingcloud.media.b$a */
    public interface C11556a {
        /* renamed from: a */
        void mo30174a(boolean z);
    }

    public C11555b(C11580o oVar, List<String> list) {
        this.f33540b = oVar;
        this.f33541c = list;
        this.f33539a = new AtomicInteger(list.size());
    }

    /* renamed from: c */
    private void m42204c() {
        C11556a aVar;
        if (this.f33539a.decrementAndGet() <= 0 && (aVar = this.f33542d) != null && !this.f33543e) {
            aVar.mo30174a(!this.f33544f);
        }
    }

    /* renamed from: a */
    public void mo30170a() {
        m42204c();
    }

    /* renamed from: b */
    public void mo30173b() {
        this.f33543e = true;
    }

    /* renamed from: a */
    public void mo30171a(C11556a aVar) {
        this.f33542d = aVar;
        if (this.f33539a.get() != 0) {
            for (String b : this.f33541c) {
                this.f33540b.mo30239b(b).mo30262a(C11587s.C11589b.NO_MEMORY_CACHE, C11587s.C11589b.NO_MEMORY_STORE).mo30265a((C11562f) this);
            }
        } else if (aVar != null) {
            aVar.mo30174a(true);
        }
    }

    /* renamed from: a */
    public void mo30172a(Exception exc) {
        if (exc instanceof C11569k) {
            C11461g.m41885b(f33538g, exc, "Failed to pre-fetch image, but will be ignored since the url cannot be handled.", new Object[0]);
        } else {
            this.f33544f = true;
            C11461g.m41885b(f33538g, exc, "Failed to pre-fetch image.", new Object[0]);
        }
        m42204c();
    }
}

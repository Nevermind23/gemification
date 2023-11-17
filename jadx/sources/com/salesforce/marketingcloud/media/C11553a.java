package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.media.C11580o;
import com.salesforce.marketingcloud.media.C11591u;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.a */
public abstract class C11553a<T> {

    /* renamed from: a */
    final C11587s f33532a;

    /* renamed from: b */
    final WeakReference<T> f33533b;

    /* renamed from: c */
    final C11594v<T> f33534c;

    /* renamed from: d */
    private final C11580o f33535d;

    /* renamed from: e */
    private boolean f33536e;

    /* renamed from: com.salesforce.marketingcloud.media.a$a */
    static class C11554a<M> extends WeakReference<M> {

        /* renamed from: a */
        final C11553a f33537a;

        C11554a(C11553a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.f33537a = aVar;
        }
    }

    C11553a(C11580o oVar, C11594v<T> vVar, C11587s sVar) {
        this.f33535d = oVar;
        this.f33532a = sVar;
        if (vVar == null) {
            this.f33533b = null;
        } else {
            this.f33533b = new C11554a(this, vVar.f33661a, oVar.f33611h);
            vVar.f33661a = null;
        }
        this.f33534c = vVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo30161a() {
        this.f33536e = true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo30162a(C11591u.C11593b bVar);

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public abstract void mo30163a(Exception exc);

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C11580o mo30164b() {
        return this.f33535d;
    }

    /* renamed from: c */
    public String mo30165c() {
        return this.f33532a.f33629b;
    }

    /* renamed from: d */
    public C11580o.C11583c mo30166d() {
        return this.f33532a.f33630c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C11587s mo30167e() {
        return this.f33532a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public T mo30168f() {
        WeakReference<T> weakReference = this.f33533b;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: g */
    public boolean mo30169g() {
        return this.f33536e;
    }
}

package com.salesforce.marketingcloud.events.predicates;

import android.annotation.SuppressLint;
import com.salesforce.marketingcloud.C11461g;
import com.salesforce.marketingcloud.events.C11437g;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.events.predicates.h */
public abstract class C11456h<T> extends C11451f {

    /* renamed from: i */
    private static final String f33301i = C11461g.m41875a("ValuePredicate");

    /* renamed from: e */
    private final Object f33302e;

    /* renamed from: f */
    private final C11437g.C11438a f33303f;

    /* renamed from: g */
    private final Object f33304g;

    /* renamed from: h */
    private final String f33305h;

    C11456h(Object obj, C11437g.C11438a aVar, Object obj2) {
        this.f33302e = obj;
        this.f33303f = aVar;
        this.f33304g = obj2;
        this.f33305h = String.format("%s %s %s", new Object[]{obj, aVar, obj2});
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract T mo29946a(Object obj);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo29944a() {
        try {
            return mo29948a(mo29946a(this.f33302e), this.f33303f, mo29946a(this.f33304g));
        } catch (Exception e) {
            C11461g.m41885b(f33301i, e, "Unable to evaluate predicate.  Returning default value of 'false'", new Object[0]);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo29948a(T t, C11437g.C11438a aVar, T t2);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public String mo29945c() {
        return this.f33305h;
    }
}

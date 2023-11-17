package com.bumptech.glide;

import android.content.Context;
import androidx.collection.ArrayMap;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2387e;
import com.bumptech.glide.load.engine.C2457j;
import com.bumptech.glide.manager.C2561d;
import com.bumptech.glide.manager.C2563f;
import com.bumptech.glide.manager.C2578r;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p005a4.C0045a;
import p035c4.C2256h;
import p205p3.C7674b;
import p205p3.C7676d;
import p205p3.C7677e;
import p205p3.C7682i;
import p205p3.C7686k;
import p218q3.C7864a;
import p218q3.C7874f;
import p218q3.C7876g;
import p218q3.C7877h;
import p218q3.C7879i;
import p231r3.C8049a;

/* renamed from: com.bumptech.glide.c */
public final class C2381c {

    /* renamed from: a */
    private final Map f7548a = new ArrayMap();

    /* renamed from: b */
    private final C2387e.C2388a f7549b = new C2387e.C2388a();

    /* renamed from: c */
    private C2457j f7550c;

    /* renamed from: d */
    private C7676d f7551d;

    /* renamed from: e */
    private C7674b f7552e;

    /* renamed from: f */
    private C7877h f7553f;

    /* renamed from: g */
    private C8049a f7554g;

    /* renamed from: h */
    private C8049a f7555h;

    /* renamed from: i */
    private C7864a.C7865a f7556i;

    /* renamed from: j */
    private C7879i f7557j;

    /* renamed from: k */
    private C2561d f7558k;

    /* renamed from: l */
    private int f7559l = 4;

    /* renamed from: m */
    private C2379b.C2380a f7560m = new C2382a();

    /* renamed from: n */
    private C2578r.C2580b f7561n;

    /* renamed from: o */
    private C8049a f7562o;

    /* renamed from: p */
    private boolean f7563p;

    /* renamed from: q */
    private List f7564q;

    /* renamed from: com.bumptech.glide.c$a */
    class C2382a implements C2379b.C2380a {
        C2382a() {
        }

        /* renamed from: a */
        public C2256h mo7698a() {
            return new C2256h();
        }
    }

    /* renamed from: com.bumptech.glide.c$b */
    static final class C2383b {
    }

    /* renamed from: com.bumptech.glide.c$c */
    public static final class C2384c {
    }

    /* renamed from: com.bumptech.glide.c$d */
    public static final class C2385d {
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public C2379b mo7699a(Context context, List list, C0045a aVar) {
        Context context2 = context;
        if (this.f7554g == null) {
            this.f7554g = C8049a.m30552h();
        }
        if (this.f7555h == null) {
            this.f7555h = C8049a.m30550f();
        }
        if (this.f7562o == null) {
            this.f7562o = C8049a.m30548d();
        }
        if (this.f7557j == null) {
            this.f7557j = new C7879i.C7880a(context2).mo22851a();
        }
        if (this.f7558k == null) {
            this.f7558k = new C2563f();
        }
        if (this.f7551d == null) {
            int b = this.f7557j.mo22849b();
            if (b > 0) {
                this.f7551d = new C7686k((long) b);
            } else {
                this.f7551d = new C7677e();
            }
        }
        if (this.f7552e == null) {
            this.f7552e = new C7682i(this.f7557j.mo22848a());
        }
        if (this.f7553f == null) {
            this.f7553f = new C7876g((long) this.f7557j.mo22850d());
        }
        if (this.f7556i == null) {
            this.f7556i = new C7874f(context2);
        }
        if (this.f7550c == null) {
            this.f7550c = new C2457j(this.f7553f, this.f7556i, this.f7555h, this.f7554g, C8049a.m30553i(), this.f7562o, this.f7563p);
        }
        List list2 = this.f7564q;
        if (list2 == null) {
            this.f7564q = Collections.emptyList();
        } else {
            this.f7564q = Collections.unmodifiableList(list2);
        }
        C2387e b2 = this.f7549b.mo7711b();
        return new C2379b(context, this.f7550c, this.f7553f, this.f7551d, this.f7552e, new C2578r(this.f7561n, b2), this.f7558k, this.f7559l, this.f7560m, this.f7548a, this.f7564q, list, aVar, b2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo7700b(C2578r.C2580b bVar) {
        this.f7561n = bVar;
    }
}

package com.salesforce.marketingcloud.media;

import android.annotation.SuppressLint;
import android.net.Uri;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.media.C11580o;

@SuppressLint({"UnknownNullness"})
/* renamed from: com.salesforce.marketingcloud.media.s */
public class C11587s {

    /* renamed from: m */
    static final char f33627m = '\n';

    /* renamed from: a */
    public final Uri f33628a;

    /* renamed from: b */
    public final String f33629b = m42291a();

    /* renamed from: c */
    public final C11580o.C11583c f33630c;

    /* renamed from: d */
    public final int f33631d;

    /* renamed from: e */
    public final int f33632e;

    /* renamed from: f */
    public final int f33633f;

    /* renamed from: g */
    public final boolean f33634g;

    /* renamed from: h */
    public final boolean f33635h;

    /* renamed from: i */
    public final float f33636i;

    /* renamed from: j */
    public final float f33637j;

    /* renamed from: k */
    public final int f33638k;

    /* renamed from: l */
    public long f33639l;

    /* renamed from: com.salesforce.marketingcloud.media.s$a */
    public static class C11588a {

        /* renamed from: a */
        Uri f33640a;

        /* renamed from: b */
        C11580o.C11583c f33641b;

        /* renamed from: c */
        int f33642c;

        /* renamed from: d */
        int f33643d;

        /* renamed from: e */
        int f33644e;

        /* renamed from: f */
        boolean f33645f;

        /* renamed from: g */
        boolean f33646g;

        /* renamed from: h */
        float f33647h;

        /* renamed from: i */
        float f33648i;

        /* renamed from: j */
        int f33649j;

        public C11588a(Uri uri) {
            this.f33640a = uri;
        }

        /* renamed from: a */
        public C11588a mo30249a(float f, float f2, int i) {
            this.f33647h = f;
            this.f33648i = f2;
            this.f33649j = i;
            return this;
        }

        /* renamed from: b */
        public C11588a mo30254b() {
            this.f33645f = true;
            return this;
        }

        /* renamed from: c */
        public C11588a mo30255c() {
            this.f33646g = true;
            return this;
        }

        /* renamed from: d */
        public boolean mo30256d() {
            return this.f33641b != null;
        }

        /* renamed from: a */
        public C11588a mo30250a(int i, int i2) {
            this.f33643d = i;
            this.f33644e = i2;
            return this;
        }

        /* renamed from: a */
        public C11588a mo30251a(C11580o.C11583c cVar) {
            this.f33641b = cVar;
            return this;
        }

        /* renamed from: a */
        public C11588a mo30252a(C11589b bVar, C11589b... bVarArr) {
            if (bVar == null) {
                return this;
            }
            this.f33642c = bVar.f33654a | this.f33642c;
            if (bVarArr == null) {
                return this;
            }
            for (C11589b bVar2 : bVarArr) {
                this.f33642c = bVar2.f33654a | this.f33642c;
            }
            return this;
        }

        /* renamed from: a */
        public C11587s mo30253a() {
            if (this.f33641b == null) {
                this.f33641b = C11580o.C11583c.NORMAL;
            }
            return new C11587s(this);
        }
    }

    /* renamed from: com.salesforce.marketingcloud.media.s$b */
    public enum C11589b {
        NO_MEMORY_CACHE(1),
        NO_MEMORY_STORE(2),
        NO_DISK_STORE(4);
        

        /* renamed from: a */
        int f33654a;

        private C11589b(int i) {
            this.f33654a = i;
        }

        /* renamed from: b */
        public static boolean m42305b(int i) {
            return (i & NO_MEMORY_STORE.f33654a) == 0;
        }

        /* renamed from: c */
        public static boolean m42306c(int i) {
            return (i & NO_DISK_STORE.f33654a) == 0;
        }

        /* renamed from: a */
        public int mo30257a() {
            return this.f33654a;
        }

        /* renamed from: a */
        public static boolean m42304a(int i) {
            return (i & NO_MEMORY_CACHE.f33654a) == 0;
        }
    }

    C11587s(C11588a aVar) {
        this.f33628a = aVar.f33640a;
        this.f33630c = aVar.f33641b;
        this.f33631d = aVar.f33642c;
        this.f33632e = aVar.f33643d;
        this.f33633f = aVar.f33644e;
        this.f33634g = aVar.f33645f;
        this.f33635h = aVar.f33646g;
        this.f33636i = aVar.f33647h;
        this.f33637j = aVar.f33648i;
        this.f33638k = aVar.f33649j;
    }

    /* renamed from: a */
    private String m42291a() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f33628a.toString());
        sb.append(f33627m);
        if (mo30247d()) {
            sb.append("resize:");
            sb.append(this.f33632e);
            sb.append('x');
            sb.append(this.f33633f);
            sb.append(f33627m);
        }
        if (this.f33634g) {
            sb.append("centerCrop");
            sb.append(f33627m);
        }
        if (this.f33635h) {
            sb.append("centerInside");
            sb.append(f33627m);
        }
        if (mo30246c()) {
            sb.append("radius:");
            sb.append(this.f33636i);
            sb.append(",border:");
            sb.append(this.f33637j);
            sb.append(",color:");
            sb.append(this.f33638k);
        }
        return sb.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo30245b() {
        return String.valueOf(this.f33628a.getPath());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo30246c() {
        return (this.f33636i == Utils.FLOAT_EPSILON && this.f33637j == Utils.FLOAT_EPSILON) ? false : true;
    }

    /* renamed from: d */
    public boolean mo30247d() {
        return (this.f33632e == 0 && this.f33633f == 0) ? false : true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean mo30248e() {
        return mo30247d() || mo30246c();
    }
}

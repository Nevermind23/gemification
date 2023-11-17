package dg1;

import java.util.Arrays;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: dg1.u */
public final class C40701u {

    /* renamed from: h */
    public static final C40702a f96370h = new C40702a((DefaultConstructorMarker) null);

    /* renamed from: a */
    public final byte[] f96371a;

    /* renamed from: b */
    public int f96372b;

    /* renamed from: c */
    public int f96373c;

    /* renamed from: d */
    public boolean f96374d;

    /* renamed from: e */
    public boolean f96375e;

    /* renamed from: f */
    public C40701u f96376f;

    /* renamed from: g */
    public C40701u f96377g;

    /* renamed from: dg1.u$a */
    public static final class C40702a {
        private C40702a() {
        }

        public /* synthetic */ C40702a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C40701u() {
        this.f96371a = new byte[8192];
        this.f96375e = true;
        this.f96374d = false;
    }

    /* renamed from: a */
    public final void mo94860a() {
        boolean z;
        C40701u uVar = this.f96377g;
        int i = 0;
        if (uVar != this) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C41536l.m120486f(uVar);
            if (uVar.f96375e) {
                int i2 = this.f96373c - this.f96372b;
                C40701u uVar2 = this.f96377g;
                C41536l.m120486f(uVar2);
                int i3 = 8192 - uVar2.f96373c;
                C40701u uVar3 = this.f96377g;
                C41536l.m120486f(uVar3);
                if (!uVar3.f96374d) {
                    C40701u uVar4 = this.f96377g;
                    C41536l.m120486f(uVar4);
                    i = uVar4.f96372b;
                }
                if (i2 <= i3 + i) {
                    C40701u uVar5 = this.f96377g;
                    C41536l.m120486f(uVar5);
                    mo94866g(uVar5, i2);
                    mo94861b();
                    C40703v.m117851b(this);
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException("cannot compact".toString());
    }

    /* renamed from: b */
    public final C40701u mo94861b() {
        C40701u uVar = this.f96376f;
        if (uVar == this) {
            uVar = null;
        }
        C40701u uVar2 = this.f96377g;
        C41536l.m120486f(uVar2);
        uVar2.f96376f = this.f96376f;
        C40701u uVar3 = this.f96376f;
        C41536l.m120486f(uVar3);
        uVar3.f96377g = this.f96377g;
        this.f96376f = null;
        this.f96377g = null;
        return uVar;
    }

    /* renamed from: c */
    public final C40701u mo94862c(C40701u uVar) {
        C41536l.m120489i(uVar, "segment");
        uVar.f96377g = this;
        uVar.f96376f = this.f96376f;
        C40701u uVar2 = this.f96376f;
        C41536l.m120486f(uVar2);
        uVar2.f96377g = uVar;
        this.f96376f = uVar;
        return uVar;
    }

    /* renamed from: d */
    public final C40701u mo94863d() {
        this.f96374d = true;
        return new C40701u(this.f96371a, this.f96372b, this.f96373c, true, false);
    }

    /* renamed from: e */
    public final C40701u mo94864e(int i) {
        boolean z;
        C40701u uVar;
        if (i <= 0 || i > this.f96373c - this.f96372b) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            if (i >= 1024) {
                uVar = mo94863d();
            } else {
                uVar = C40703v.m117852c();
                byte[] bArr = this.f96371a;
                byte[] bArr2 = uVar.f96371a;
                int i2 = this.f96372b;
                byte[] unused = C41331l.m119762f(bArr, bArr2, 0, i2, i2 + i, 2, (Object) null);
            }
            uVar.f96373c = uVar.f96372b + i;
            this.f96372b += i;
            C40701u uVar2 = this.f96377g;
            C41536l.m120486f(uVar2);
            uVar2.mo94862c(uVar);
            return uVar;
        }
        throw new IllegalArgumentException("byteCount out of range".toString());
    }

    /* renamed from: f */
    public final C40701u mo94865f() {
        byte[] bArr = this.f96371a;
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        C41536l.m120488h(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C40701u(copyOf, this.f96372b, this.f96373c, false, true);
    }

    /* renamed from: g */
    public final void mo94866g(C40701u uVar, int i) {
        C41536l.m120489i(uVar, "sink");
        if (uVar.f96375e) {
            int i2 = uVar.f96373c;
            if (i2 + i > 8192) {
                if (!uVar.f96374d) {
                    int i3 = uVar.f96372b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = uVar.f96371a;
                        byte[] unused = C41331l.m119762f(bArr, bArr, 0, i3, i2, 2, (Object) null);
                        uVar.f96373c -= uVar.f96372b;
                        uVar.f96372b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f96371a;
            byte[] bArr3 = uVar.f96371a;
            int i4 = uVar.f96373c;
            int i5 = this.f96372b;
            byte[] unused2 = C41331l.m119760d(bArr2, bArr3, i4, i5, i5 + i);
            uVar.f96373c += i;
            this.f96372b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C40701u(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        C41536l.m120489i(bArr, "data");
        this.f96371a = bArr;
        this.f96372b = i;
        this.f96373c = i2;
        this.f96374d = z;
        this.f96375e = z2;
    }
}

package vf1;

import dg1.C40679d;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import of1.C41928u;

/* renamed from: vf1.a */
public final class C43157a {

    /* renamed from: c */
    public static final C43158a f100673c = new C43158a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C40679d f100674a;

    /* renamed from: b */
    private long f100675b = 262144;

    /* renamed from: vf1.a$a */
    public static final class C43158a {
        private C43158a() {
        }

        public /* synthetic */ C43158a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C43157a(C40679d dVar) {
        C41536l.m120489i(dVar, "source");
        this.f100674a = dVar;
    }

    /* renamed from: a */
    public final C41928u mo101723a() {
        boolean z;
        C41928u.C41929a aVar = new C41928u.C41929a();
        while (true) {
            String b = mo101724b();
            if (b.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return aVar.mo96941f();
            }
            aVar.mo96938c(b);
        }
    }

    /* renamed from: b */
    public final String mo101724b() {
        String W = this.f100674a.mo94721W(this.f100675b);
        this.f100675b -= (long) W.length();
        return W;
    }
}

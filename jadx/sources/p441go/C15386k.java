package p441go;

import ed1.C40762x;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p483jo.C16301a;

/* renamed from: go.k */
public final class C15386k {

    /* renamed from: b */
    public static final C15387a f43785b = new C15387a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C16301a f43786a;

    /* renamed from: go.k$a */
    public static final class C15387a {

        /* renamed from: go.k$a$a */
        public enum C15388a {
            RB("ACCT"),
            SOLO("SOLO");
            

            /* renamed from: d */
            private final String f43790d;

            private C15388a(String str) {
                this.f43790d = str;
            }

            /* renamed from: b */
            public final String mo42488b() {
                return this.f43790d;
            }
        }

        private C15387a() {
        }

        public /* synthetic */ C15387a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C15386k(C16301a aVar) {
        C41536l.m120489i(aVar, "repository");
        this.f43786a = aVar;
    }

    /* renamed from: b */
    public static /* synthetic */ C40762x m55854b(C15386k kVar, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        return kVar.mo42487a(str, z);
    }

    /* renamed from: a */
    public final C40762x mo42487a(String str, boolean z) {
        return this.f43786a.mo32958P2(str, z);
    }
}

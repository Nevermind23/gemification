package fh1;

import java.util.List;
import kh1.C41517b;
import kh1.C41518c;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import lh1.C41702a;
import qh1.C42354a;
import ue1.C43064a;

/* renamed from: fh1.b */
public final class C40952b {

    /* renamed from: b */
    public static final C40953a f96727b = new C40953a((DefaultConstructorMarker) null);

    /* renamed from: a */
    private final C40951a f96728a;

    /* renamed from: fh1.b$a */
    public static final class C40953a {
        private C40953a() {
        }

        public /* synthetic */ C40953a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C40952b mo95352a() {
            C40952b bVar = new C40952b((DefaultConstructorMarker) null);
            bVar.mo95349d();
            return bVar;
        }
    }

    /* renamed from: fh1.b$b */
    static final class C40954b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40952b f96729d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40954b(C40952b bVar) {
            super(0);
            this.f96729d = bVar;
        }

        public final void invoke() {
            this.f96729d.mo95348c().mo95343a();
        }
    }

    /* renamed from: fh1.b$c */
    static final class C40955c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C40952b f96730d;

        /* renamed from: e */
        final /* synthetic */ List f96731e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C40955c(C40952b bVar, List list) {
            super(0);
            this.f96730d = bVar;
            this.f96731e = list;
        }

        public final void invoke() {
            this.f96730d.m118743e(this.f96731e);
        }
    }

    private C40952b() {
        this.f96728a = new C40951a();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m118743e(List list) {
        C40951a.m118737e(this.f96728a, list, false, 2, (Object) null);
    }

    /* renamed from: b */
    public final C40952b mo95347b() {
        if (this.f96728a.mo95344b().mo96287f(C41517b.DEBUG)) {
            double a = C42354a.m122846a(new C40954b(this));
            C41518c b = this.f96728a.mo95344b();
            b.mo96284b("instances started in " + a + " ms");
        } else {
            this.f96728a.mo95343a();
        }
        return this;
    }

    /* renamed from: c */
    public final C40951a mo95348c() {
        return this.f96728a;
    }

    /* renamed from: d */
    public final void mo95349d() {
        this.f96728a.mo95345c().mo97158b();
        this.f96728a.mo95345c().mo97157a();
    }

    /* renamed from: f */
    public final C40952b mo95350f(List list) {
        C41536l.m120489i(list, "modules");
        if (this.f96728a.mo95344b().mo96287f(C41517b.INFO)) {
            double a = C42354a.m122846a(new C40955c(this, list));
            int l = this.f96728a.mo95345c().mo97163l();
            C41518c b = this.f96728a.mo95344b();
            b.mo96286e("loaded " + l + " definitions - " + a + " ms");
        } else {
            m118743e(list);
        }
        return this;
    }

    /* renamed from: g */
    public final C40952b mo95351g(C41702a... aVarArr) {
        C41536l.m120489i(aVarArr, "modules");
        return mo95350f(C41333m.m119788O(aVarArr));
    }

    public /* synthetic */ C40952b(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}

package k81;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p90.C27458w6;
import ue1.C43064a;

/* renamed from: k81.f */
public final class C36899f extends C36917q {

    /* renamed from: e */
    public static final C36900a f89008e = new C36900a((DefaultConstructorMarker) null);

    /* renamed from: b */
    private C27458w6 f89009b;

    /* renamed from: c */
    private C43064a f89010c;

    /* renamed from: d */
    private C43064a f89011d;

    /* renamed from: k81.f$a */
    public static final class C36900a {
        private C36900a() {
        }

        public /* synthetic */ C36900a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: h */
    private final void m109290h() {
    }

    /* renamed from: i */
    private final void m109291i(C27458w6 w6Var) {
        w6Var.f70178y.setOnClickListener(new C36895d(this));
        w6Var.f70179z.setOnClickListener(new C36897e(this));
        m109290h();
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m109292j(C36899f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C43064a aVar = fVar.f89010c;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public static final void m109293k(C36899f fVar, View view) {
        C41536l.m120489i(fVar, "this$0");
        C43064a aVar = fVar.f89011d;
        if (aVar != null) {
            aVar.invoke();
        }
        fVar.mo89859b();
    }

    /* renamed from: a */
    public View mo89824a(Context context, ViewGroup viewGroup) {
        C27458w6 B = C27458w6.m85139B(LayoutInflater.from(context), viewGroup, false);
        C41536l.m120488h(B, "inflate(LayoutInflater.f…(context), parent, false)");
        this.f89009b = B;
        C27458w6 w6Var = null;
        if (B == null) {
            C41536l.m120506z("binding");
            B = null;
        }
        m109291i(B);
        C27458w6 w6Var2 = this.f89009b;
        if (w6Var2 == null) {
            C41536l.m120506z("binding");
        } else {
            w6Var = w6Var2;
        }
        View b = w6Var.mo3946b();
        C41536l.m120488h(b, "binding.root");
        return b;
    }

    /* renamed from: f */
    public final void mo89835f(C43064a aVar) {
        this.f89010c = aVar;
    }

    /* renamed from: g */
    public final void mo89836g(C43064a aVar) {
        this.f89011d = aVar;
    }
}

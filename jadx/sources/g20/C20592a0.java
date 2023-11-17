package g20;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import h20.C24851a;
import i20.C25106f;
import iu0.C36546y;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p380ck.C10464h;
import p548oj.C17202a;
import tu0.C38796a;
import wu0.C39677a;

/* renamed from: g20.a0 */
public abstract class C20592a0 extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private C38796a.C38800d f55643d;

    /* renamed from: e */
    private final Handler f55644e = new Handler(Looper.getMainLooper());

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20592a0(C6201a aVar) {
        super(aVar.mo3946b());
        C41536l.m120489i(aVar, "binding");
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m66846m(C24851a aVar, C25106f fVar, View view) {
        C41536l.m120489i(aVar, "$listener");
        C41536l.m120489i(fVar, "$item");
        aVar.mo48824b(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m66847n(C24851a aVar, C25106f fVar) {
        C41536l.m120489i(aVar, "$listener");
        C41536l.m120489i(fVar, "$item");
        aVar.mo48823a(fVar);
    }

    /* access modifiers changed from: private */
    /* renamed from: q */
    public static final void m66848q(C20592a0 a0Var) {
        C41536l.m120489i(a0Var, "this$0");
        C38796a.C38800d dVar = a0Var.f55643d;
        if (dVar != null) {
            C36546y.m108282F().mo27137H("NBO", dVar.mo92502a(), dVar.mo92504c(), (Bundle) null, C10464h.C10465a.FACEBOOKANDFIREBASE);
        }
    }

    /* renamed from: k */
    public final void mo49135k(C25106f fVar, C24851a aVar) {
        C41536l.m120489i(fVar, "item");
        C41536l.m120489i(aVar, "listener");
        this.itemView.setOnClickListener(new C20642y(aVar, fVar));
        this.f55643d = fVar.mo63595c();
        mo49136l(fVar, new C20643z(aVar, fVar));
    }

    /* renamed from: l */
    public abstract void mo49136l(C25106f fVar, C17202a aVar);

    /* renamed from: o */
    public final void mo49137o() {
        this.f55644e.removeCallbacksAndMessages((Object) null);
    }

    /* renamed from: p */
    public final void mo49138p() {
        this.f55644e.postDelayed(new C20641x(this), C39677a.f94302a.mo93420a());
    }
}

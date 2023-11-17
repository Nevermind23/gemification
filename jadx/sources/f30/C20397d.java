package f30;

import a30.C19151a;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import androidx.core.content.C0767a;
import d30.C19878a;
import g60.C20742c;
import g91.C32289b0;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p366bk.C10320i;
import p90.C27269c5;
import ue1.C43075l;

/* renamed from: f30.d */
public final class C20397d extends C20742c {

    /* renamed from: d */
    private final C27269c5 f55332d;

    /* renamed from: e */
    private C43075l f55333e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20397d(C27269c5 c5Var) {
        super((C6201a) c5Var);
        C41536l.m120489i(c5Var, "binding");
        this.f55332d = c5Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66514j(C20397d dVar, C19151a aVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C41536l.m120489i(aVar, "$operation");
        C43075l lVar = dVar.f55333e;
        if (lVar != null) {
            lVar.invoke(aVar);
        }
    }

    /* renamed from: i */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        C19151a b = ((C19878a.C19884f) aVar).mo48209b();
        this.f55332d.f68482h.setText(b.mo47357c());
        if (b.mo47361f()) {
            this.f55332d.f68480f.setBackground((Drawable) null);
            this.f55332d.f68480f.setImageDrawable(C0767a.m2895e(this.itemView.getContext(), C10320i.ic_cash_opeation_full));
        } else {
            this.f55332d.f68480f.setBackground(C0767a.m2895e(this.itemView.getContext(), C10320i.bg_circle_bill_split_operation));
            ImageView imageView = this.f55332d.f68480f;
            String d = b.mo47358d();
            int i = C10320i.f28688dc;
            C32289b0.m95107s(imageView, d, Integer.valueOf(i), Integer.valueOf(i), true, b.mo47356b());
        }
        this.f55332d.f68479e.setText(C32343x.m95410Q(b.mo47355a(), "GEL", false, 2, (Object) null));
        this.f55332d.f68483i.setOnClickListener(new C20396c(this, b));
    }

    /* renamed from: k */
    public final void mo48879k(C43075l lVar) {
        this.f55333e = lVar;
    }
}

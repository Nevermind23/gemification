package fi0;

import android.net.Uri;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32289b0;
import hi0.C25032e;
import kotlin.jvm.internal.C41536l;
import oh0.C27009d;
import th0.C28427t0;

/* renamed from: fi0.e */
public final class C20493e extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C28427t0 f55495d;

    /* renamed from: e */
    private final C20491c f55496e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20493e(C28427t0 t0Var, C20491c cVar) {
        super(t0Var.mo3946b());
        C41536l.m120489i(t0Var, "binding");
        C41536l.m120489i(cVar, "phoneContactItemClickListener");
        this.f55495d = t0Var;
        this.f55496e = cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m66709j(C20493e eVar, C25032e eVar2, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(eVar2, "$this_with");
        eVar.f55496e.mo49033E(eVar2);
    }

    /* renamed from: i */
    public final void mo49035i(C25032e eVar) {
        C41536l.m120489i(eVar, "item");
        C28427t0 t0Var = this.f55495d;
        t0Var.f72211e.setTitle(eVar.mo63456a());
        t0Var.f72211e.setText(eVar.mo63458c());
        C32289b0.m95098j(t0Var.f72213g, Uri.parse(eVar.mo63459d()), Integer.valueOf(C27009d.f67790i), (Integer) null, true);
        t0Var.mo3946b().setOnClickListener(new C20492d(this, eVar));
    }
}

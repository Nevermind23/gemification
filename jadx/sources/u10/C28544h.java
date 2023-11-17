package u10;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p366bk.C10322k;
import t10.C28297b;
import ue1.C43079p;

/* renamed from: u10.h */
public final class C28544h extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final TextView f72458d;

    /* renamed from: e */
    private final TextView f72459e;

    /* renamed from: f */
    private final TextView f72460f;

    /* renamed from: g */
    private final View f72461g;

    /* renamed from: h */
    private C43079p f72462h;

    /* renamed from: i */
    private C43079p f72463i;

    /* renamed from: j */
    private C43079p f72464j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28544h(View view) {
        super(view);
        C41536l.m120489i(view, "itemView");
        this.f72458d = (TextView) view.findViewById(C10322k.contact_name_input);
        this.f72459e = (TextView) view.findViewById(C10322k.contact_nickname_input);
        this.f72460f = (TextView) view.findViewById(C10322k.contact_phone_input);
        this.f72461g = view.findViewById(C10322k.contact_phone_input_layout);
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m87478l(C28544h hVar, C28297b bVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(bVar, "$contactNameItem");
        C43079p pVar = hVar.f72462h;
        if (pVar != null) {
            String a = bVar.mo67933a();
            C41536l.m120488h(view, "it");
            pVar.invoke(a, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m87479m(C28544h hVar, C28297b bVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(bVar, "$contactNameItem");
        C43079p pVar = hVar.f72463i;
        if (pVar != null) {
            String b = bVar.mo67934b();
            C41536l.m120488h(view, "it");
            pVar.invoke(b, view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m87480n(C28544h hVar, C28297b bVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        C41536l.m120489i(bVar, "$contactNameItem");
        C43079p pVar = hVar.f72464j;
        if (pVar != null) {
            String c = bVar.mo67935c();
            C41536l.m120488h(view, "it");
            pVar.invoke(c, view);
        }
    }

    /* renamed from: k */
    public final void mo68277k(C28297b bVar) {
        C41536l.m120489i(bVar, "contactNameItem");
        this.f72458d.setText(bVar.mo67933a());
        this.f72459e.setText(bVar.mo67934b());
        this.f72460f.setText(bVar.mo67935c());
        View view = this.f72461g;
        C41536l.m120488h(view, "phoneNumberLayout");
        C32343x.m95483r1(view, bVar.mo67936d(), false, 2, (Object) null);
        this.f72458d.setOnClickListener(new C28541e(this, bVar));
        this.f72459e.setOnClickListener(new C28542f(this, bVar));
        this.f72460f.setOnClickListener(new C28543g(this, bVar));
    }

    /* renamed from: o */
    public final void mo68278o(C43079p pVar) {
        this.f72462h = pVar;
    }

    /* renamed from: p */
    public final void mo68279p(C43079p pVar) {
        this.f72463i = pVar;
    }

    /* renamed from: q */
    public final void mo68280q(C43079p pVar) {
        this.f72464j = pVar;
    }
}

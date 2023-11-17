package p71;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.graphics.drawable.C0836a;
import androidx.recyclerview.widget.C1819o;
import c71.C31281a;
import c71.C31283c;
import c71.C31287g;
import g71.C32121n;
import g91.C32343x;
import j71.C36753f;
import java.text.SimpleDateFormat;
import kotlin.jvm.internal.C41536l;
import o31.C37599g;
import o31.C37626z;
import p086g1.C6201a;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p642vh.C18368l;
import ue1.C43079p;

/* renamed from: p71.d */
public final class C37927d extends C1819o {

    /* renamed from: f */
    private final C43079p f91028f;

    /* renamed from: g */
    private final SimpleDateFormat f91029g = new SimpleDateFormat("dd.MM.yyyy");

    /* renamed from: h */
    private int f91030h = -1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C37927d(C43079p pVar) {
        super(C37599g.f90345a.mo90787d());
        C41536l.m120489i(pVar, "onPassSelected");
        this.f91028f = pVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m111470m(C37626z zVar, C37927d dVar, C36753f fVar, View view) {
        C41536l.m120489i(zVar, "$holder");
        C41536l.m120489i(dVar, "this$0");
        int bindingAdapterPosition = zVar.getBindingAdapterPosition();
        int i = dVar.f91030h;
        if (bindingAdapterPosition != i) {
            dVar.f91030h = zVar.getBindingAdapterPosition();
            if (i != -1) {
                dVar.notifyItemChanged(i);
            }
            dVar.notifyItemChanged(zVar.getBindingAdapterPosition());
            dVar.f91028f.invoke(fVar.mo89614a(), fVar.mo89617d());
        }
    }

    /* renamed from: l */
    public void onBindViewHolder(C37626z zVar, int i) {
        boolean z;
        C41536l.m120489i(zVar, "holder");
        C36753f fVar = (C36753f) mo6027g(i);
        C6201a h = zVar.mo90806h();
        if (h instanceof C32121n) {
            C32121n nVar = (C32121n) h;
            TextView textView = nVar.f79065i;
            C41536l.m120488h(textView, "tcPassDeviceTitle");
            C32343x.m95483r1(textView, !fVar.mo89618e(), false, 2, (Object) null);
            BogImageView bogImageView = nVar.f79063g;
            C41536l.m120488h(bogImageView, "tcPassDeviceIsSelectedIcon");
            if (i == this.f91030h) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(bogImageView, z, false, 2, (Object) null);
            if (fVar.mo89618e()) {
                Drawable drawable = nVar.mo3946b().getContext().getDrawable(C31283c.icons_16_card_debit_outline);
                C41536l.m120486f(drawable);
                Context context = nVar.mo3946b().getContext();
                C41536l.m120488h(context, "root.context");
                C0836a.m3152n(drawable, C18368l.m62755d(context, C31281a.f77690a));
                nVar.f79062f.setImageDrawable(drawable);
            } else {
                nVar.f79065i.setText(nVar.mo3946b().getContext().getString(C31287g.tc_added_to_wallet, new Object[]{this.f91029g.format(((C36753f) mo6027g(i)).mo89616c())}));
                nVar.f79064h.setText(fVar.mo89615b());
                nVar.f79062f.setImageDrawable(nVar.mo3946b().getContext().getDrawable(C31283c.ic_tc_device));
            }
            nVar.mo3946b().setOnClickListener(new C37926c(zVar, this, fVar));
        }
    }

    /* renamed from: n */
    public C37626z onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        return new C37626z(C32121n.m94619d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false));
    }

    /* renamed from: o */
    public final void mo91285o(int i) {
        this.f91030h = i;
    }
}

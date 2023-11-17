package p475jg;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.chat.presentation.holders.ComponentUi;
import p341ge.bog.designsystem.components.common.Image;
import p376cg.C10432k;
import p615tg.C17963d;
import p642vh.C18368l;
import p653wf.C18587p;
import ue1.C43075l;

/* renamed from: jg.c */
public final class C15767c extends C1819o {

    /* renamed from: jg.c$a */
    public final class C15768a extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C10432k f44726d;

        /* renamed from: e */
        final /* synthetic */ C15767c f44727e;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15768a(C15767c cVar, C10432k kVar) {
            super(kVar.mo3946b());
            C41536l.m120489i(kVar, "binding");
            this.f44727e = cVar;
            this.f44726d = kVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m56780j(C15768a aVar, boolean z, View view) {
            boolean z2;
            int i;
            int i2;
            C41536l.m120489i(aVar, "this$0");
            LinearLayout linearLayout = aVar.f44726d.f29699e;
            C41536l.m120488h(linearLayout, "binding.answerLayout");
            boolean z3 = true;
            int i3 = 0;
            if (linearLayout.getVisibility() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = !z2;
            View view2 = aVar.f44726d.f29702h;
            C41536l.m120488h(view2, "binding.divider");
            if (z4 || !z) {
                z3 = false;
            }
            if (z3) {
                i = 0;
            } else {
                i = 8;
            }
            view2.setVisibility(i);
            LinearLayout linearLayout2 = aVar.f44726d.f29699e;
            C41536l.m120488h(linearLayout2, "binding.answerLayout");
            if (!z4) {
                i3 = 8;
            }
            linearLayout2.setVisibility(i3);
            AppCompatImageView appCompatImageView = aVar.f44726d.f29703i;
            C41536l.m120488h(appCompatImageView, "binding.questionIcon");
            if (z4) {
                i2 = C18587p.f52145v;
            } else {
                i2 = C18587p.f52144u;
            }
            C18368l.m62746A(appCompatImageView, new Image.Resource(i2, (Boolean) null, 2, (DefaultConstructorMarker) null), (C43075l) null, 2, (Object) null);
        }

        /* renamed from: i */
        public final void mo43173i(ComponentUi.FAQItemUI fAQItemUI) {
            int i;
            C41536l.m120489i(fAQItemUI, "faqItemUI");
            boolean z = true;
            int i2 = 0;
            if (getAdapterPosition() >= this.f44727e.mo6026f().size() - 1) {
                z = false;
            }
            View view = this.f44726d.f29702h;
            C41536l.m120488h(view, "binding.divider");
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
            View view2 = this.f44726d.f29701g;
            C41536l.m120488h(view2, "binding.bottomDivider");
            if (!z) {
                i2 = 8;
            }
            view2.setVisibility(i2);
            this.f44726d.f29704j.setText(fAQItemUI.mo34359b());
            this.f44726d.f29700f.setText(fAQItemUI.mo34358a());
            this.f44726d.mo3946b().setOnClickListener(new C15766b(this, z));
        }
    }

    public C15767c() {
        super(C17963d.f51158a.mo45633d());
    }

    /* renamed from: k */
    public void onBindViewHolder(C15768a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        Object g = mo6027g(i);
        C41536l.m120488h(g, "getItem(position)");
        aVar.mo43173i((ComponentUi.FAQItemUI) g);
    }

    /* renamed from: l */
    public C15768a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C10432k d = C10432k.m37893d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C15768a(this, d);
    }
}

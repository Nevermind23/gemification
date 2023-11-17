package a91;

import android.content.Context;
import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import g91.C32303f;
import g91.C32343x;
import h91.C36162a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import l81.C37104a;
import l81.C37106c;
import l81.C37107d;
import p341ge.bog.mobilebank.model.DepLoanAgreement;
import p366bk.C10316e;
import p366bk.C10322k;
import p642vh.C18368l;
import p90.C27436u2;

/* renamed from: a91.f */
public final class C30884f extends C37106c {

    /* renamed from: d */
    private final ArrayList f76933d = new ArrayList();
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C37104a f76934e;

    /* renamed from: f */
    private boolean f76935f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f76936g = -1;

    /* renamed from: a91.f$a */
    public final class C30885a extends C37107d {

        /* renamed from: f */
        private final C27436u2 f76937f;

        /* renamed from: g */
        final /* synthetic */ C30884f f76938g;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C30885a(C30884f fVar, C27436u2 u2Var) {
            super(u2Var.mo3946b());
            C41536l.m120489i(u2Var, "binding");
            this.f76938g = fVar;
            this.f76937f = u2Var;
            this.f89287d.setOnClickListener(new C30883e(fVar, this));
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public static final void m92061j(C30884f fVar, C30885a aVar, View view) {
            C41536l.m120489i(fVar, "this$0");
            C41536l.m120489i(aVar, "this$1");
            C37104a j = fVar.f76934e;
            if (j != null) {
                j.mo48298Z0(aVar.getAdapterPosition());
            }
            fVar.mo71082q(aVar.getAdapterPosition());
        }

        /* renamed from: k */
        public final void mo71083k(DepLoanAgreement depLoanAgreement) {
            boolean z;
            C41536l.m120489i(depLoanAgreement, "deposit");
            int b = C36162a.m107561b(depLoanAgreement.getProdType());
            C27436u2 u2Var = this.f76937f;
            u2Var.f69915i.setText(depLoanAgreement.getName());
            u2Var.f69911e.setText(C32303f.m95203n(depLoanAgreement.getAgreeBalance(), depLoanAgreement.getCcy()));
            u2Var.f69913g.setText(C32303f.m95200k(depLoanAgreement.getIntAccrued(), depLoanAgreement.getCcy()));
            u2Var.f69912f.setImageResource(b);
            ImageView imageView = u2Var.f69912f;
            Context context = this.f76937f.mo3946b().getContext();
            C41536l.m120488h(context, "binding.root.context");
            ColorStateList valueOf = ColorStateList.valueOf(C18368l.m62755d(context, C10316e.f28613r));
            if (b != C36162a.f87350a.mo88918a()) {
                z = true;
            } else {
                z = false;
            }
            imageView.setImageTintList((ColorStateList) C32343x.m95409P0(valueOf, z));
        }

        /* renamed from: l */
        public final void mo71084l() {
            boolean z;
            View findViewById = this.f89287d.findViewById(C10322k.selectorView);
            C41536l.m120488h(findViewById, "itemView.findViewById<View>(R.id.selectorView)");
            if (this.f76938g.f76936g == getAdapterPosition()) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(findViewById, z, false, 2, (Object) null);
        }
    }

    public int getItemCount() {
        return this.f76933d.size();
    }

    /* renamed from: l */
    public final void mo71077l(List list) {
        C41536l.m120489i(list, "deposits");
        this.f76933d.clear();
        this.f76933d.addAll(list);
        notifyDataSetChanged();
    }

    /* renamed from: m */
    public void onBindViewHolder(C30885a aVar, int i) {
        C41536l.m120489i(aVar, "holder");
        super.mo65512i(aVar, i);
        if (this.f76935f) {
            aVar.f89287d.setScaleX(1.0f);
            aVar.f89287d.setScaleY(1.0f);
            aVar.f89287d.setAlpha(1.0f);
        }
        aVar.mo71084l();
        Object obj = this.f76933d.get(i);
        C41536l.m120488h(obj, "deposits[position]");
        aVar.mo71083k((DepLoanAgreement) obj);
    }

    /* renamed from: n */
    public C30885a onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        C27436u2 d = C27436u2.m85053d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d, "inflate(LayoutInflater.f….context), parent, false)");
        return new C30885a(this, d);
    }

    /* renamed from: o */
    public final void mo71080o(C37104a aVar) {
        C41536l.m120489i(aVar, "clickListener");
        this.f76934e = aVar;
    }

    /* renamed from: p */
    public final void mo71081p() {
        this.f76935f = true;
    }

    /* renamed from: q */
    public final void mo71082q(int i) {
        this.f76936g = i;
        notifyDataSetChanged();
    }
}

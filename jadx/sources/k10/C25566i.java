package k10;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import androidx.recyclerview.widget.C1796h;
import androidx.recyclerview.widget.C1819o;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p366bk.C10318g;
import p366bk.C10324m;
import p812kv.C25778a;
import p90.C27339j5;
import p90.C27349k5;

/* renamed from: k10.i */
public final class C25566i extends C1819o {

    /* renamed from: f */
    private final C25567a f65286f;

    /* renamed from: k10.i$a */
    public interface C25567a {
        /* renamed from: a */
        void mo53891a(C25778a aVar);
    }

    /* renamed from: k10.i$b */
    public static final class C25568b extends C1796h.C1802f {

        /* renamed from: a */
        public static final C25568b f65287a = new C25568b();

        private C25568b() {
        }

        /* renamed from: d */
        public boolean mo5976a(C25778a aVar, C25778a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            return C41536l.m120484d(aVar, aVar2);
        }

        /* renamed from: e */
        public boolean mo5977b(C25778a aVar, C25778a aVar2) {
            C41536l.m120489i(aVar, "oldItem");
            C41536l.m120489i(aVar2, "newItem");
            if (aVar.mo64374d() == aVar2.mo64374d()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: k10.i$c */
    public static final class C25569c extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27339j5 f65288d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25569c(C27339j5 j5Var) {
            super(j5Var.mo3946b());
            C41536l.m120489i(j5Var, "binding");
            this.f65288d = j5Var;
        }

        /* renamed from: h */
        public final void mo64139h(C25778a aVar) {
            boolean z;
            C41536l.m120489i(aVar, "request");
            this.f65288d.f69083h.setText(C32343x.m95410Q(aVar.mo64375e(), "₾", false, 2, (Object) null));
            this.f65288d.f69082g.setText(aVar.mo64371a());
            TextView textView = this.f65288d.f69082g;
            C41536l.m120488h(textView, "binding.requestDescriptionText");
            if (aVar.mo64371a() != null) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, z, false, 2, (Object) null);
        }
    }

    /* renamed from: k10.i$d */
    public static final class C25570d extends RecyclerView.C1734f0 {

        /* renamed from: d */
        private final C27349k5 f65289d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C25570d(C27349k5 k5Var) {
            super(k5Var.mo3946b());
            C41536l.m120489i(k5Var, "binding");
            this.f65289d = k5Var;
        }

        /* renamed from: h */
        public final void mo64140h(C25778a aVar) {
            boolean z;
            int i;
            C41536l.m120489i(aVar, "request");
            TextView textView = this.f65289d.f69169i;
            C41536l.m120488h(textView, "binding.receivedAmountText");
            boolean z2 = true;
            if (aVar.mo64377f() > Utils.DOUBLE_EPSILON) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95483r1(textView, z, false, 2, (Object) null);
            this.f65289d.f69169i.setText(C32343x.m95410Q(aVar.mo64377f(), "₾", false, 2, (Object) null));
            this.f65289d.f69171k.setText(C32343x.m95410Q(aVar.mo64375e(), "₾", false, 2, (Object) null));
            this.f65289d.f69168h.setProgress(aVar.mo64372b());
            TextView textView2 = this.f65289d.f69170j;
            C41536l.m120488h(textView2, "binding.requestDescriptionText");
            if (aVar.mo64371a() == null) {
                z2 = false;
            }
            C32343x.m95483r1(textView2, z2, false, 2, (Object) null);
            this.f65289d.f69170j.setText(aVar.mo64371a());
            if (aVar.mo64373c()) {
                i = C10318g.money_request_details_rejected_amount_color;
            } else {
                i = C10318g.money_request_details_transferred_amount_color;
            }
            this.f65289d.f69169i.setTextColor(C0767a.m2893c(this.itemView.getContext(), i));
            ImageView imageView = this.f65289d.f69165e;
            C41536l.m120488h(imageView, "binding.alertBadgeImage");
            C32343x.m95483r1(imageView, aVar.mo64373c(), false, 2, (Object) null);
        }
    }

    public C25566i(C25567a aVar) {
        super(C25568b.f65287a);
        this.f65286f = aVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m80793l(C25566i iVar, C25778a aVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        C25567a aVar2 = iVar.f65286f;
        if (aVar2 != null) {
            C41536l.m120488h(aVar, "request");
            aVar2.mo53891a(aVar);
        }
    }

    public int getItemViewType(int i) {
        if (((C25778a) mo6027g(i)).mo64378g()) {
            return C10324m.item_contact_details_money_request_from_contact;
        }
        return C10324m.item_contact_details_money_request_to_contact;
    }

    public void onBindViewHolder(RecyclerView.C1734f0 f0Var, int i) {
        C41536l.m120489i(f0Var, "holder");
        C25778a aVar = (C25778a) mo6027g(i);
        if (f0Var instanceof C25569c) {
            C41536l.m120488h(aVar, "request");
            ((C25569c) f0Var).mo64139h(aVar);
        } else if (f0Var instanceof C25570d) {
            C41536l.m120488h(aVar, "request");
            ((C25570d) f0Var).mo64140h(aVar);
        }
        f0Var.itemView.setOnClickListener(new C25565h(this, aVar));
    }

    public RecyclerView.C1734f0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        C41536l.m120489i(viewGroup, "parent");
        if (i == C10324m.item_contact_details_money_request_from_contact) {
            C27339j5 d = C27339j5.m84666d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
            C41536l.m120488h(d, "inflate(\n               …lse\n                    )");
            return new C25569c(d);
        }
        C27349k5 d2 = C27349k5.m84705d(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        C41536l.m120488h(d2, "inflate(\n               …lse\n                    )");
        return new C25570d(d2);
    }
}

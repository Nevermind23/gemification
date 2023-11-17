package qi0;

import android.view.View;
import g91.C32343x;
import java.util.List;
import kotlin.jvm.internal.C41536l;
import mj0.C26238b;
import oi0.C27017c;
import pi0.C27534a;
import th0.C28395d0;

/* renamed from: qi0.e */
public final class C27818e extends C26238b {

    /* renamed from: f */
    private final C27017c f70952f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27818e(C28395d0 d0Var, C27017c cVar) {
        super(d0Var);
        C41536l.m120489i(d0Var, "binding");
        C41536l.m120489i(cVar, "listener");
        this.f70952f = cVar;
        d0Var.f71999e.setTitle(C32343x.m95388F("giftcard.owner.details", new Object[0]));
        d0Var.f72009o.setTitle(C32343x.m95388F("giftcard.owner.info.title", new Object[0]));
        d0Var.f72009o.setDescription(C32343x.m95388F("giftcard.owner.info.description", new Object[0]));
        d0Var.f72000f.setTitle(C32343x.m95388F("giftcard.owner.details.sender", new Object[0]));
        d0Var.f72007m.setTitle(C32343x.m95388F("giftcard.owner.details.validity", new Object[0]));
        d0Var.f72003i.setText(C32343x.m95388F("giftcard.owner.partner.stores.button", new Object[0]));
        d0Var.f72002h.setTitle(C32343x.m95388F("giftcard.owner.details.company", new Object[0]));
        d0Var.f72006l.setText(C32343x.m95388F("giftcard.owner.details.conditions", new Object[0]));
        d0Var.f72005k.setOnClickListener(new C27816c(this));
        d0Var.f72008n.setOnClickListener(new C27817d(this, d0Var));
    }

    /* access modifiers changed from: private */
    /* renamed from: o */
    public static final void m85996o(C27818e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        if (eVar.getBindingAdapterPosition() != -1) {
            eVar.f70952f.mo61787C0();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: p */
    public static final void m85997p(C27818e eVar, C28395d0 d0Var, View view) {
        C41536l.m120489i(eVar, "this$0");
        C41536l.m120489i(d0Var, "$this_with");
        if (eVar.getBindingAdapterPosition() != -1) {
            d0Var.f72008n.setClickable(false);
            eVar.f70952f.mo61788J(((C27534a.C27536b) eVar.mo65242i()).mo66863d());
        }
    }

    /* renamed from: q */
    public void mo48397j(C27534a.C27536b bVar) {
        C41536l.m120489i(bVar, "item");
        C28395d0 d0Var = (C28395d0) mo65241h();
        super.mo48397j(bVar);
        d0Var.f72000f.setText(bVar.mo66864e());
        d0Var.f72007m.setText(bVar.mo66867g());
        d0Var.f72002h.setText(bVar.mo66866f());
        d0Var.f72008n.setClickable(bVar.mo66868h());
    }

    /* renamed from: r */
    public void mo65243k(C27534a.C27536b bVar, List list) {
        C41536l.m120489i(bVar, "item");
        C41536l.m120489i(list, "payloads");
        super.mo65243k(bVar, list);
        Object i0 = C41358y.m120019i0(list);
        C41536l.m120487g(i0, "null cannot be cast to non-null type kotlin.Boolean");
        ((C28395d0) mo65241h()).f72008n.setClickable(((Boolean) i0).booleanValue());
    }
}

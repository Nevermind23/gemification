package dj0;

import android.view.View;
import bj0.C19391a;
import cj0.C19762a;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import mj0.C26238b;
import th0.C28409k0;

/* renamed from: dj0.b */
public final class C20026b extends C26238b {

    /* renamed from: f */
    private final C19391a f54620f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20026b(C28409k0 k0Var, C19391a aVar) {
        super(k0Var);
        C41536l.m120489i(k0Var, "binding");
        C41536l.m120489i(aVar, "listener");
        this.f54620f = aVar;
        k0Var.f72098e.setTitle(C32343x.m95388F("giftcard.giver.details", new Object[0]));
        k0Var.f72100g.setTitle(C32343x.m95388F("giftcard.giver.details.recipient.number", new Object[0]));
        k0Var.f72106m.setTitle(C32343x.m95388F("giftcard.giver.details.validity", new Object[0]));
        k0Var.f72102i.setTitle(C32343x.m95388F("giftcard.giver.details.company", new Object[0]));
        k0Var.f72105l.setText(C32343x.m95388F("giftcard.giver.details.conditions", new Object[0]));
        k0Var.f72099f.setTitle(C32343x.m95388F("giftcard.giver.details.balance", new Object[0]));
        k0Var.f72107n.setOnClickListener(new C20025a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m65928n(C20026b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.f54620f.mo47610c3();
    }

    /* renamed from: o */
    public void mo48397j(C19762a aVar) {
        C41536l.m120489i(aVar, "item");
        C28409k0 k0Var = (C28409k0) mo65241h();
        super.mo48397j(aVar);
        k0Var.f72100g.setText(aVar.mo47986b());
        k0Var.f72106m.setText(aVar.mo47988d());
        k0Var.f72102i.setText(aVar.mo47987c());
        k0Var.f72099f.setText(aVar.mo47985a());
    }
}

package e30;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import d30.C19892c;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p366bk.C10320i;
import p90.C27260b6;
import ue1.C43075l;

/* renamed from: e30.d */
public final class C20134d extends RecyclerView.C1734f0 {

    /* renamed from: d */
    private final C27260b6 f54801d;

    /* renamed from: e */
    private C43075l f54802e;

    /* renamed from: f */
    private C43075l f54803f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20134d(C27260b6 b6Var) {
        super(b6Var.mo3946b());
        C41536l.m120489i(b6Var, "binding");
        this.f54801d = b6Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66118l(C20134d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C43075l lVar = dVar.f54802e;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m66119m(C20134d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C43075l lVar = dVar.f54802e;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m66120n(C20134d dVar, View view) {
        C41536l.m120489i(dVar, "this$0");
        C43075l lVar = dVar.f54803f;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* renamed from: k */
    public final void mo48563k(C19892c.C19895c cVar) {
        C41536l.m120489i(cVar, "item");
        if (cVar.mo48251b().mo48263a() != null) {
            TextInputEditText textInputEditText = this.f54801d.f68397h;
            AccountLov a = cVar.mo48251b().mo48263a();
            C41536l.m120486f(a);
            textInputEditText.setText(a.getAcctNo());
            AccountLov a2 = cVar.mo48251b().mo48263a();
            C41536l.m120486f(a2);
            if (a2.isDefault()) {
                this.f54801d.f68397h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C32343x.m95426Y(C10320i.ic_favorite_14dp, (Context) null, 1, (Object) null), (Drawable) null);
            } else {
                this.f54801d.f68397h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            this.f54801d.f68397h.setText("");
            this.f54801d.f68397h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f54801d.f68394e.setText(cVar.mo48251b().mo48265c());
        this.f54801d.f68395f.setOnClickListener(new C20131a(this));
        this.f54801d.f68397h.setOnClickListener(new C20132b(this));
        this.f54801d.f68394e.setOnClickListener(new C20133c(this));
    }

    /* renamed from: o */
    public final void mo48564o(C43075l lVar) {
        this.f54803f = lVar;
    }

    /* renamed from: p */
    public final void mo48565p(C43075l lVar) {
        this.f54802e = lVar;
    }
}

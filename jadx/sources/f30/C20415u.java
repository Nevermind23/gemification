package f30;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.material.textfield.TextInputEditText;
import d30.C19878a;
import g60.C20742c;
import g91.C32343x;
import kotlin.jvm.internal.C41536l;
import p086g1.C6201a;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p366bk.C10320i;
import p90.C27309g5;
import ue1.C43075l;

/* renamed from: f30.u */
public final class C20415u extends C20742c {

    /* renamed from: d */
    private final C27309g5 f55363d;

    /* renamed from: e */
    private C43075l f55364e;

    /* renamed from: f */
    private C43075l f55365f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20415u(C27309g5 g5Var) {
        super((C6201a) g5Var);
        C41536l.m120489i(g5Var, "binding");
        this.f55363d = g5Var;
    }

    /* access modifiers changed from: private */
    /* renamed from: l */
    public static final void m66556l(C20415u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        C43075l lVar = uVar.f55365f;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m */
    public static final void m66557m(C20415u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        C43075l lVar = uVar.f55365f;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public static final void m66558n(C20415u uVar, View view) {
        C41536l.m120489i(uVar, "this$0");
        C43075l lVar = uVar.f55364e;
        if (lVar != null) {
            C41536l.m120488h(view, "it");
            lVar.invoke(view);
        }
    }

    /* renamed from: k */
    public void onBind(C19878a aVar) {
        C41536l.m120489i(aVar, "data");
        C19878a.C19890l lVar = (C19878a.C19890l) aVar;
        if (lVar.mo48229b().mo48263a() != null) {
            TextInputEditText textInputEditText = this.f55363d.f68823h;
            AccountLov a = lVar.mo48229b().mo48263a();
            C41536l.m120486f(a);
            textInputEditText.setText(a.getAcctNo());
            AccountLov a2 = lVar.mo48229b().mo48263a();
            C41536l.m120486f(a2);
            if (a2.isDefault()) {
                this.f55363d.f68823h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, C32343x.m95426Y(C10320i.ic_favorite_14dp, (Context) null, 1, (Object) null), (Drawable) null);
            } else {
                this.f55363d.f68823h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            }
        } else {
            this.f55363d.f68823h.setText("");
            this.f55363d.f68823h.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        this.f55363d.f68820e.setText(lVar.mo48229b().mo48265c());
        this.f55363d.f68823h.setOnClickListener(new C20412r(this));
        this.f55363d.f68821f.setOnClickListener(new C20413s(this));
        this.f55363d.f68820e.setOnClickListener(new C20414t(this));
    }

    /* renamed from: o */
    public final void mo48910o(C43075l lVar) {
        this.f55365f = lVar;
    }

    /* renamed from: p */
    public final void mo48911p(C43075l lVar) {
        this.f55364e = lVar;
    }
}

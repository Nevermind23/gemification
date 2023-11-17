package q81;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p530nf.C16919b;

/* renamed from: q81.a */
public abstract class C38160a extends Dialog {

    /* renamed from: d */
    protected C41438c f91572d;

    /* renamed from: e */
    protected BankApi f91573e;

    /* renamed from: f */
    protected Client f91574f;

    /* renamed from: g */
    protected PreferencesApiManager f91575g;

    /* renamed from: q81.a$a */
    interface C38161a {
        /* renamed from: a */
        PreferencesApiManager mo32851a();

        /* renamed from: b */
        C41438c mo32852b();

        /* renamed from: c */
        Client mo32853c();

        /* renamed from: j */
        BankApi mo32871j();
    }

    public C38160a(Context context) {
        super(context);
        C38161a aVar = (C38161a) C16919b.m59518a(context.getApplicationContext(), C38161a.class);
        this.f91572d = aVar.mo32852b();
        this.f91575g = aVar.mo32851a();
        this.f91573e = aVar.mo32871j();
        this.f91574f = aVar.mo32853c();
        requestWindowFeature(1);
        if (mo91682b() > 0) {
            setContentView(mo91682b());
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo91681a() {
        getWindow().clearFlags(2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo91682b() {
        return -1;
    }
}

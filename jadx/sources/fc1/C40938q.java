package fc1;

import android.widget.CompoundButton;
import fc1.C40928o;
import p341ge.bog.sso_client.models.UserContact;

/* renamed from: fc1.q */
public final /* synthetic */ class C40938q implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C40928o f96699a;

    /* renamed from: b */
    public final /* synthetic */ UserContact f96700b;

    /* renamed from: c */
    public final /* synthetic */ C40928o.C40930b f96701c;

    /* renamed from: d */
    public final /* synthetic */ UserContact f96702d;

    /* renamed from: e */
    public final /* synthetic */ C40928o.C40930b.C40931a f96703e;

    public /* synthetic */ C40938q(C40928o oVar, UserContact userContact, C40928o.C40930b bVar, UserContact userContact2, C40928o.C40930b.C40931a aVar) {
        this.f96699a = oVar;
        this.f96700b = userContact;
        this.f96701c = bVar;
        this.f96702d = userContact2;
        this.f96703e = aVar;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C40928o.C40930b.C40931a.m118706m(this.f96699a, this.f96700b, this.f96701c, this.f96702d, this.f96703e, compoundButton, z);
    }
}

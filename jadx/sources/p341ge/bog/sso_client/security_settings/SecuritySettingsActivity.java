package p341ge.bog.sso_client.security_settings;

import ah1.C40313a;
import android.os.Bundle;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.lifecycle.C1613n0;
import ba1.C10211p;
import ba1.C10216u;
import ha1.C15454a;
import he1.C41217g;
import he1.C41222k;
import ic1.C41280g;
import ic1.C41286h;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p642vh.C18368l;
import ua1.C28639f;
import ue1.C43064a;
import yg1.C43399a;

/* renamed from: ge.bog.sso_client.security_settings.SecuritySettingsActivity */
public final class SecuritySettingsActivity extends C15454a {

    /* renamed from: s */
    private final C41217g f96979s = C41219i.m119470b(new C41078a(this));

    /* renamed from: t */
    private final C41217g f96980t = C41219i.m119469a(C41222k.NONE, new C41080c(this, (C41806a) null, (C43064a) null, new C41079b(this), (C43064a) null));

    /* renamed from: ge.bog.sso_client.security_settings.SecuritySettingsActivity$a */
    static final class C41078a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ SecuritySettingsActivity f96981d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C41078a(SecuritySettingsActivity securitySettingsActivity) {
            super(0);
            this.f96981d = securitySettingsActivity;
        }

        /* renamed from: b */
        public final C28639f invoke() {
            C28639f d = C28639f.m87657d(this.f96981d.getLayoutInflater());
            C41536l.m120488h(d, "inflate(layoutInflater)");
            return d;
        }
    }

    /* renamed from: ge.bog.sso_client.security_settings.SecuritySettingsActivity$b */
    public static final class C41079b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f96982d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41079b(ComponentActivity componentActivity) {
            super(0);
            this.f96982d = componentActivity;
        }

        /* renamed from: b */
        public final C43399a invoke() {
            C43399a.C43400a aVar = C43399a.f101246c;
            ComponentActivity componentActivity = this.f96982d;
            return aVar.mo102076a(componentActivity, componentActivity);
        }
    }

    /* renamed from: ge.bog.sso_client.security_settings.SecuritySettingsActivity$c */
    public static final class C41080c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentActivity f96983d;

        /* renamed from: e */
        final /* synthetic */ C41806a f96984e;

        /* renamed from: f */
        final /* synthetic */ C43064a f96985f;

        /* renamed from: g */
        final /* synthetic */ C43064a f96986g;

        /* renamed from: h */
        final /* synthetic */ C43064a f96987h;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C41080c(ComponentActivity componentActivity, C41806a aVar, C43064a aVar2, C43064a aVar3, C43064a aVar4) {
            super(0);
            this.f96983d = componentActivity;
            this.f96984e = aVar;
            this.f96985f = aVar2;
            this.f96986g = aVar3;
            this.f96987h = aVar4;
        }

        /* renamed from: b */
        public final C1613n0 invoke() {
            return C40313a.m116748a(this.f96983d, this.f96984e, this.f96985f, this.f96986g, C41520a0.m120436b(C41286h.class), this.f96987h);
        }
    }

    public SecuritySettingsActivity() {
        super(0, 1, (DefaultConstructorMarker) null);
    }

    /* renamed from: T0 */
    private final C28639f m119058T0() {
        return (C28639f) this.f96979s.getValue();
    }

    /* renamed from: U0 */
    private final C41286h m119059U0() {
        return (C41286h) this.f96980t.getValue();
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) m119058T0().mo3946b());
        getWindow().setStatusBarColor(C18368l.m62755d(this, C10211p.f28263a));
        C41280g a = C41280g.f97303m.mo95745a();
        mo42539S0(m119059U0().mo95769yw());
        getSupportFragmentManager().mo4428p().mo4639r(C10216u.f28301Q0, a).mo4515i();
    }
}

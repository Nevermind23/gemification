package ha1;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.C0218d;
import androidx.lifecycle.C1639v;
import androidx.lifecycle.C1645y;
import androidx.lifecycle.LiveData;
import ba1.C10146d0;
import ba1.C10199i;
import gb1.C32386q;
import gb1.C32392v;
import hd1.C41204a;
import he1.C41217g;
import he1.C41222k;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import nh1.C41806a;
import p341ge.bog.sso_client.models.C35947l;
import ue1.C43064a;
import wg1.C43241a;

/* renamed from: ha1.a */
public abstract class C15454a extends C0218d {

    /* renamed from: n */
    private final int f43861n;

    /* renamed from: o */
    private final C41217g f43862o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final C1639v f43863p;

    /* renamed from: q */
    private final C41204a f43864q;

    /* renamed from: r */
    private final C41217g f43865r;

    /* renamed from: ha1.a$a */
    static final class C15455a implements C1645y {

        /* renamed from: a */
        final /* synthetic */ C15454a f43866a;

        C15455a(C15454a aVar) {
            this.f43866a = aVar;
        }

        public final void onChanged(Object obj) {
            if (obj instanceof C35947l.C35949b) {
                this.f43866a.f43863p.mo4823o(((C35947l.C35949b) obj).mo88517a());
            }
        }
    }

    /* renamed from: ha1.a$b */
    public static final class C15456b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f43867d;

        /* renamed from: e */
        final /* synthetic */ C41806a f43868e;

        /* renamed from: f */
        final /* synthetic */ C43064a f43869f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15456b(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f43867d = componentCallbacks;
            this.f43868e = aVar;
            this.f43869f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f43867d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10199i.class), this.f43868e, this.f43869f);
        }
    }

    /* renamed from: ha1.a$c */
    public static final class C15457c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ ComponentCallbacks f43870d;

        /* renamed from: e */
        final /* synthetic */ C41806a f43871e;

        /* renamed from: f */
        final /* synthetic */ C43064a f43872f;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C15457c(ComponentCallbacks componentCallbacks, C41806a aVar, C43064a aVar2) {
            super(0);
            this.f43870d = componentCallbacks;
            this.f43871e = aVar;
            this.f43872f = aVar2;
        }

        public final Object invoke() {
            ComponentCallbacks componentCallbacks = this.f43870d;
            return C43241a.m124172a(componentCallbacks).mo95345c().mo97161i().mo97675g(C41520a0.m120436b(C10146d0.C10172e.class), this.f43871e, this.f43872f);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C15454a(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    /* renamed from: Q0 */
    private final C10146d0.C10172e m55932Q0() {
        return (C10146d0.C10172e) this.f43865r.getValue();
    }

    /* renamed from: P0 */
    public final C41204a mo42537P0() {
        return this.f43864q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: R0 */
    public final C10199i mo42538R0() {
        return (C10199i) this.f43862o.getValue();
    }

    /* renamed from: S0 */
    public final void mo42539S0(LiveData... liveDataArr) {
        C41536l.m120489i(liveDataArr, "liveData");
        for (LiveData s : liveDataArr) {
            this.f43863p.mo4956s(s, new C15455a(this));
        }
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C41536l.m120489i(context, "newBase");
        super.attachBaseContext(mo42538R0().mo26768b(context));
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        Integer num;
        super.onCreate(bundle);
        C43064a f = m55932Q0().mo26715f();
        if (f != null) {
            num = (Integer) f.invoke();
        } else {
            num = null;
        }
        if (num != null) {
            setTheme(num.intValue());
        }
        C32392v.m95651c(this.f43863p, this, this);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        this.f43863p.mo4825q(this);
        super.onDestroy();
    }

    public C15454a(int i) {
        super(i);
        this.f43861n = i;
        C41222k kVar = C41222k.SYNCHRONIZED;
        this.f43862o = C41219i.m119469a(kVar, new C15456b(this, (C41806a) null, (C43064a) null));
        this.f43863p = new C32386q();
        this.f43864q = new C41204a();
        this.f43865r = C41219i.m119469a(kVar, new C15457c(this, (C41806a) null, (C43064a) null));
    }
}

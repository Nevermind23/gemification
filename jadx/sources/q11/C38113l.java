package q11;

import android.content.Context;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import f10.C20329a;
import g11.C32040a;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.model.Client;
import ue1.C43064a;

/* renamed from: q11.l */
public final class C38113l {

    /* renamed from: a */
    private final Client f91527a;

    /* renamed from: b */
    private final Context f91528b;

    /* renamed from: c */
    private final C41217g f91529c = C41219i.m119470b(C38114a.f91530d);

    /* renamed from: q11.l$a */
    static final class C38114a extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C38114a f91530d = new C38114a();

        C38114a() {
            super(0);
        }

        /* renamed from: b */
        public final C20329a invoke() {
            return C20329a.f55281b.mo48813a();
        }
    }

    public C38113l(Client client, Context context) {
        C41536l.m120489i(client, "client");
        C41536l.m120489i(context, "context");
        this.f91527a = client;
        this.f91528b = context;
    }

    /* renamed from: a */
    private final C32040a m111972a(int i) {
        if (i == 0) {
            return C32040a.GEORGIAN;
        }
        return C32040a.ENGLISH;
    }

    /* renamed from: b */
    private final C20329a m111973b() {
        return (C20329a) this.f91529c.getValue();
    }

    /* renamed from: c */
    public final void mo91535c(int i) {
        C32040a a = m111972a(i);
        if (a.mo72533b() != m111973b().mo48811h()) {
            m111973b().mo48812k(this.f91528b, a.mo72533b());
            this.f91527a.changeDeviceLanguage();
            MedalliaDigital.setCustomParameter("language", a);
            this.f91527a.resetDataForLanguage();
        }
    }
}

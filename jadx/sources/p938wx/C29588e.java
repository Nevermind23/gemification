package p938wx;

import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import cf1.C40419j;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p349ah.C9860d;
import p90.C27263c;
import ue1.C43064a;

/* renamed from: wx.e */
public final class C29588e extends C9860d {

    /* renamed from: G */
    public static final C29589a f74739G = new C29589a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C27263c f74740B;

    /* renamed from: C */
    private final C41217g f74741C = C41219i.m119470b(new C29592d(this));

    /* renamed from: D */
    private final C41217g f74742D = C41219i.m119470b(new C29591c(this));

    /* renamed from: E */
    private final C41217g f74743E = C41219i.m119470b(new C29590b(this));

    /* renamed from: F */
    private String f74744F = C32343x.m95388F("online.inst.reversal.status.action.sheet.header", new Object[0]);

    /* renamed from: wx.e$a */
    public static final class C29589a {
        private C29589a() {
        }

        public /* synthetic */ C29589a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C29588e mo69482a(CharSequence charSequence, CharSequence charSequence2, String str) {
            C41536l.m120489i(charSequence, "title");
            C41536l.m120489i(charSequence2, "message");
            C29588e eVar = new C29588e();
            eVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_TITLE", charSequence), C41233s.m119492a("EXTRA_MESSAGE", charSequence2), C41233s.m119492a("EXTRA_MERCHANT_PHONE", str)));
            return eVar;
        }
    }

    /* renamed from: wx.e$b */
    static final class C29590b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29588e f74745d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29590b(C29588e eVar) {
            super(0);
            this.f74745d = eVar;
        }

        public final String invoke() {
            return this.f74745d.requireArguments().getString("EXTRA_MERCHANT_PHONE");
        }
    }

    /* renamed from: wx.e$c */
    static final class C29591c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29588e f74746d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29591c(C29588e eVar) {
            super(0);
            this.f74746d = eVar;
        }

        /* renamed from: b */
        public final CharSequence invoke() {
            return this.f74746d.requireArguments().getCharSequence("EXTRA_MESSAGE", "");
        }
    }

    /* renamed from: wx.e$d */
    static final class C29592d extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C29588e f74747d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C29592d(C29588e eVar) {
            super(0);
            this.f74747d = eVar;
        }

        /* renamed from: b */
        public final CharSequence invoke() {
            return this.f74747d.requireArguments().getCharSequence("EXTRA_TITLE", "");
        }
    }

    /* renamed from: e2 */
    private final void m89814e2() {
        try {
            String g2 = m89816g2();
            if (g2 != null) {
                String g = new C40419j("\\s").mo94490g(g2, "");
                if (g != null) {
                    Intent intent = new Intent("android.intent.action.DIAL");
                    intent.setData(Uri.parse("tel:" + g));
                    startActivity(intent);
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: f2 */
    private final C27263c m89815f2() {
        C27263c cVar = this.f74740B;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* renamed from: g2 */
    private final String m89816g2() {
        return (String) this.f74743E.getValue();
    }

    /* renamed from: h2 */
    private final CharSequence m89817h2() {
        Object value = this.f74742D.getValue();
        C41536l.m120488h(value, "<get-statusMessage>(...)");
        return (CharSequence) value;
    }

    /* renamed from: i2 */
    private final CharSequence m89818i2() {
        Object value = this.f74741C.getValue();
        C41536l.m120488h(value, "<get-statusTitle>(...)");
        return (CharSequence) value;
    }

    /* renamed from: j2 */
    private final void m89819j2() {
        boolean z;
        C27263c f2 = m89815f2();
        f2.f68418j.setText(m89818i2());
        f2.f68417i.setText(m89817h2());
        f2.f68415g.setText(m89816g2());
        f2.f68416h.setOnClickListener(new C29587d(this));
        String g2 = m89816g2();
        if (g2 == null || C40439w.m117118v(g2)) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            f2.f68416h.setVisibility(8);
            f2.f68413e.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m89820k2(C29588e eVar, View view) {
        C41536l.m120489i(eVar, "this$0");
        eVar.m89814e2();
    }

    /* renamed from: l2 */
    public static final C29588e m89821l2(CharSequence charSequence, CharSequence charSequence2, String str) {
        return f74739G.mo69482a(charSequence, charSequence2, str);
    }

    /* renamed from: Q1 */
    public String mo26364Q1() {
        return this.f74744F;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f74740B = C27263c.m84350d(layoutInflater, viewGroup, true);
        m89819j2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f74740B = null;
    }
}

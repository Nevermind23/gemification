package b00;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p90.C27429t4;
import ue1.C43064a;

/* renamed from: b00.h */
public final class C19300h extends C19297e {

    /* renamed from: M */
    public static final C19301a f53525M = new C19301a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C27429t4 f53526K;

    /* renamed from: L */
    private final C41217g f53527L = C41219i.m119470b(new C19302b(this));

    /* renamed from: b00.h$a */
    public static final class C19301a {
        private C19301a() {
        }

        public /* synthetic */ C19301a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C19300h mo47526a(String str) {
            C19300h hVar = new C19300h();
            hVar.setArguments(C0908e.m3336b(C41233s.m119492a("EXTRA_HEADER", str)));
            return hVar;
        }
    }

    /* renamed from: b00.h$b */
    static final class C19302b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19300h f53528d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19302b(C19300h hVar) {
            super(0);
            this.f53528d = hVar;
        }

        public final String invoke() {
            return this.f53528d.requireArguments().getString("EXTRA_HEADER");
        }
    }

    /* renamed from: f2 */
    private final C27429t4 m64762f2() {
        C27429t4 t4Var = this.f53526K;
        C41536l.m120486f(t4Var);
        return t4Var;
    }

    /* renamed from: g2 */
    private final String m64763g2() {
        return (String) this.f53527L.getValue();
    }

    /* renamed from: h2 */
    private final void m64764h2() {
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(C32343x.m95388F("offers.PL.action.sheet.merchants.list.URL", new Object[0])));
            startActivity(intent);
            mo4577k1();
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m64765i2(C19300h hVar, View view) {
        C41536l.m120489i(hVar, "this$0");
        hVar.m64764h2();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f53526K = C27429t4.m85026d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F(m64763g2(), new Object[0]));
        m64762f2().f69847g.setTitleText(C32343x.m95388F("offers.PL.action.sheet.info.text", new Object[0]));
        Button button = m64762f2().f69846f;
        button.setButtonText(C32343x.m95388F("offers.PL.action.sheet.see.merchants.list", new Object[0]));
        button.setOnClickListener(new C19299g(this));
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f53526K = null;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        C41536l.m120489i(dialogInterface, "dialog");
        C1533o.m5445b(this, "InstallmentActionSheet_REQUEST_KEY", C0908e.m3336b(C41233s.m119492a("InstallmentActionSheet_DISMISS_KEY", Boolean.TRUE)));
        super.onDismiss(dialogInterface);
    }
}

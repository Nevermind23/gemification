package gr0;

import android.os.Bundle;
import android.text.InputFilter;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import br0.C31175a;
import cf1.C40419j;
import g91.C32343x;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p603si.C17799b;
import p603si.C17809c;
import p725cr.C19788a;
import ue1.C43075l;

/* renamed from: gr0.c */
public final class C36051c extends C19788a {

    /* renamed from: I */
    public static final C36052a f87173I = new C36052a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C31175a f87174H;

    /* renamed from: gr0.c$a */
    public static final class C36052a {
        private C36052a() {
        }

        public /* synthetic */ C36052a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C36051c mo88775a() {
            return new C36051c();
        }
    }

    /* renamed from: gr0.c$b */
    static final class C36053b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C36051c f87175d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C36053b(C36051c cVar) {
            super(1);
            this.f87175d = cVar;
        }

        /* renamed from: a */
        public final void mo88776a(String str) {
            boolean z;
            C41536l.m120489i(str, "it");
            Button button = this.f87175d.m107275j2().f77441f;
            if (str.length() >= 5) {
                z = true;
            } else {
                z = false;
            }
            button.setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo88776a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: h2 */
    private final void m107273h2() {
        C32343x.m95457j(m107275j2().f77440e.getTextInput(), new C36053b(this));
        m107275j2().f77441f.setOnClickListener(new C36050b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m107274i2(C36051c cVar, View view) {
        C41536l.m120489i(cVar, "this$0");
        if (cVar.m107275j2().f77440e.mo35918a()) {
            C1533o.m5445b(cVar, "REQUEST_KEY_CHECK_CADASTRAL_CODE", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CADASTRAL_CODE", cVar.m107275j2().f77440e.getInputText())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C31175a m107275j2() {
        C31175a aVar = this.f87174H;
        C41536l.m120486f(aVar);
        return aVar;
    }

    /* renamed from: l2 */
    private final void m107276l2() {
        m107275j2().f77440e.setHintText((CharSequence) C32343x.m95388F("loan.page.cadastral.code.input.hint", new Object[0]));
        m107275j2().f77441f.setButtonText(C32343x.m95388F("loan.page.button.validate", new Object[0]));
        m107275j2().f77441f.setEnabled(false);
        Input input = m107275j2().f77440e;
        C41536l.m120488h(input, "binding.cadastralCodeInput");
        Input.m50261f(input, C17809c.m61562a(new C17799b.C17807h(new C40419j("[0-9]+(\\.([0-9]+))+[ა-ჰ]?$")), C32343x.m95388F("loan.page.incorrect.cadastral.code", new Object[0])), false, false, false, 14, (Object) null);
        m107275j2().f77440e.getTextInput().setInputType(524288);
        m107275j2().f77440e.getTextInput().setFilters(new InputFilter[]{new C36049a(), new InputFilter.LengthFilter(34)});
    }

    /* access modifiers changed from: private */
    /* renamed from: m2 */
    public static final CharSequence m107277m2(CharSequence charSequence, int i, int i2, Spanned spanned, int i3, int i4) {
        boolean z;
        C41536l.m120488h(charSequence, "source");
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i5 = 0; i5 < length; i5++) {
            char charAt = charSequence.charAt(i5);
            boolean z2 = true;
            if (!Character.isDigit(charAt) && charAt != '.') {
                if (4304 > charAt || charAt >= 4337) {
                    z = false;
                } else {
                    z = true;
                }
                if (!z) {
                    z2 = false;
                }
            }
            if (z2) {
                sb.append(charAt);
            }
        }
        return sb;
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f87174H = C31175a.m92706d(layoutInflater, viewGroup, true);
    }

    /* renamed from: k2 */
    public final void mo88773k2(boolean z) {
        m107275j2().f77441f.setLoading(z);
        m107275j2().f77440e.setEnabled(!z);
    }

    /* renamed from: n2 */
    public final void mo88774n2(Throwable th) {
        C41536l.m120489i(th, "t");
        handleError(th);
        mo88773k2(false);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f87174H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        mo26370a2(C32343x.m95388F("loan.page.button.add.real.estate", new Object[0]));
        super.onViewCreated(view, bundle);
        m107276l2();
        m107273h2();
    }
}

package p341ge.bog.mobilebank.bnpl.presentation.details;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41217g;
import he1.C41233s;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p536nl.C17049b;
import p659wl.C18635y;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.bnpl.presentation.details.i */
public final class C13870i extends C13876k {

    /* renamed from: M */
    public static final C13871a f41184M = new C13871a((DefaultConstructorMarker) null);

    /* renamed from: K */
    private C17049b f41185K;

    /* renamed from: L */
    private final C41217g f41186L = C41219i.m119470b(new C13872b(this));

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.i$a */
    public static final class C13871a {
        private C13871a() {
        }

        public /* synthetic */ C13871a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13870i mo38265a(String str) {
            C13870i iVar = new C13870i();
            iVar.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_OLD_NAME", str)));
            return iVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.i$b */
    static final class C13872b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C13870i f41187d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13872b(C13870i iVar) {
            super(0);
            this.f41187d = iVar;
        }

        public final String invoke() {
            Bundle arguments = this.f41187d.getArguments();
            if (arguments != null) {
                return arguments.getString("ARG_OLD_NAME");
            }
            return null;
        }
    }

    /* renamed from: ge.bog.mobilebank.bnpl.presentation.details.i$c */
    static final class C13873c extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C13870i f41188d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13873c(C13870i iVar) {
            super(1);
            this.f41188d = iVar;
        }

        /* renamed from: a */
        public final void mo38266a(String str) {
            boolean z;
            C41536l.m120489i(str, "it");
            Button button = this.f41188d.m51692h2().f47558e;
            boolean z2 = true;
            if (str.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || C41536l.m120484d(str, this.f41188d.m51693i2())) {
                z2 = false;
            }
            button.setEnabled(z2);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo38266a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public final C17049b m51692h2() {
        C17049b bVar = this.f41185K;
        C41536l.m120486f(bVar);
        return bVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public final String m51693i2() {
        return (String) this.f41186L.getValue();
    }

    /* renamed from: j2 */
    private final void m51694j2() {
        Button button = m51692h2().f47558e;
        button.setOnClickListener(new C18635y(this));
        button.setButtonText(C32343x.m95388F("text.bnpl.product.change.name.accept.button", new Object[0]));
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public static final void m51695k2(C13870i iVar, View view) {
        C41536l.m120489i(iVar, "this$0");
        C1533o.m5445b(iVar, "REQUEST_KEY_NEW_NAME", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_NAME", iVar.m51692h2().f47559f.getTextInput().getText().toString())));
        iVar.mo4577k1();
    }

    /* renamed from: l2 */
    private final void m51696l2() {
        m51692h2().f47559f.setHintText(C32343x.m95388F("text.bnpl.product.change.name.field.hint", new Object[0]));
        EditText textInput = m51692h2().f47559f.getTextInput();
        C32343x.m95457j(textInput, new C13873c(this));
        textInput.setText(m51693i2());
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f41185K = C17049b.m59897d(layoutInflater, viewGroup, true);
        mo26370a2(C32343x.m95388F("text.bnpl.product.change.name.header", new Object[0]));
        m51696l2();
        m51694j2();
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f41185K = null;
    }
}

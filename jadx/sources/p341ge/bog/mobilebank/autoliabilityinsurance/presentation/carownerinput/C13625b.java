package p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.C1533o;
import he1.C41238w;
import java.io.Serializable;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.actionsheet.ActionSheetTitle;
import p349ah.C9860d;
import p451hk.C15525c;
import p451hk.C15529g;
import p493kk.C16449c;
import p563pk.C17374d;
import p605sk.C17832l;
import p605sk.C17833m;

/* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.b */
public final class C13625b extends C9860d {

    /* renamed from: C */
    public static final C13626a f40741C = new C13626a((DefaultConstructorMarker) null);

    /* renamed from: B */
    private C16449c f40742B;

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.b$a */
    public static final class C13626a {
        private C13626a() {
        }

        public /* synthetic */ C13626a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C13625b mo37512a(C17374d dVar) {
            C41536l.m120489i(dVar, "gender");
            C13625b bVar = new C13625b();
            Bundle bundle = new Bundle();
            bundle.putSerializable("GENDER_ARG", dVar);
            bVar.setArguments(bundle);
            return bVar;
        }
    }

    /* renamed from: ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.b$b */
    public /* synthetic */ class C13627b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f40743a;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0010 */
        static {
            /*
                pk.d[] r0 = p563pk.C17374d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                pk.d r1 = p563pk.C17374d.FEMALE     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                pk.d r1 = p563pk.C17374d.MALE     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                f40743a = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.autoliabilityinsurance.presentation.carownerinput.C13625b.C13627b.<clinit>():void");
        }
    }

    /* renamed from: W1 */
    private final void m51063W1() {
        m51066f2().f46464e.setOnClickListener(new C17832l(this));
        m51066f2().f46465f.setOnClickListener(new C17833m(this));
    }

    /* renamed from: f2 */
    private final C16449c m51066f2() {
        C16449c cVar = this.f40742B;
        C41536l.m120486f(cVar);
        return cVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: g2 */
    public static final void m51067g2(C13625b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m51069i2(C17374d.FEMALE);
    }

    /* access modifiers changed from: private */
    /* renamed from: h2 */
    public static final void m51068h2(C13625b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.m51069i2(C17374d.MALE);
    }

    /* renamed from: i2 */
    private final void m51069i2(C17374d dVar) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("GENDER_ARG", dVar);
        C41238w wVar = C41238w.f97225a;
        C1533o.m5445b(this, "GENDER_SHEET_SELECTOR_KEY", bundle);
        mo4577k1();
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f40742B = C16449c.m58600d(layoutInflater, viewGroup, true);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f40742B = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        Serializable serializable;
        int i;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        mo26372b2(ActionSheetTitle.C13155a.BASIC);
        mo26370a2(getString(C15529g.car_owner_input_gender));
        Bundle arguments = getArguments();
        TextView textView = null;
        if (arguments != null) {
            serializable = arguments.getSerializable("GENDER_ARG");
        } else {
            serializable = null;
        }
        C17374d dVar = (C17374d) serializable;
        if (dVar == null) {
            i = -1;
        } else {
            i = C13627b.f40743a[dVar.ordinal()];
        }
        if (i == 1) {
            textView = m51066f2().f46464e;
        } else if (i == 2) {
            textView = m51066f2().f46465f;
        }
        if (textView != null) {
            textView.setCompoundDrawablesRelativeWithIntrinsicBounds(0, 0, C15525c.f44043c, 0);
        }
        m51063W1();
    }
}

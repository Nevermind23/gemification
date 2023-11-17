package p341ge.bog.mobilebank.deposits.presentation.actionsheet;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import p341ge.bog.designsystem.components.input.Input;
import p603si.C17799b;
import p725cr.C19788a;
import ue1.C43064a;
import ue1.C43075l;
import xb0.C29715e;

/* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet */
public final class DepositNameActionSheet extends C19788a {

    /* renamed from: K */
    public static final C23001a f60516K = new C23001a((DefaultConstructorMarker) null);

    /* renamed from: H */
    private C29715e f60517H;

    /* renamed from: I */
    private final C41217g f60518I = C41219i.m119470b(new C23003c(this));

    /* renamed from: J */
    private C17799b f60519J;

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet$NameData */
    private static final class NameData implements Parcelable {
        public static final Parcelable.Creator<NameData> CREATOR = new C23000a();

        /* renamed from: d */
        private final String f60520d;

        /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet$NameData$a */
        public static final class C23000a implements Parcelable.Creator {
            /* renamed from: a */
            public final NameData createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new NameData(parcel.readString());
            }

            /* renamed from: b */
            public final NameData[] newArray(int i) {
                return new NameData[i];
            }
        }

        public NameData(String str) {
            this.f60520d = str;
        }

        /* renamed from: a */
        public final String mo57665a() {
            return this.f60520d;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof NameData) && C41536l.m120484d(this.f60520d, ((NameData) obj).f60520d);
        }

        public int hashCode() {
            String str = this.f60520d;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public String toString() {
            String str = this.f60520d;
            return "NameData(name=" + str + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f60520d);
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet$a */
    public static final class C23001a {
        private C23001a() {
        }

        public /* synthetic */ C23001a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final DepositNameActionSheet mo57675a(String str) {
            DepositNameActionSheet depositNameActionSheet = new DepositNameActionSheet();
            depositNameActionSheet.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_DATA", new NameData(str))));
            return depositNameActionSheet;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet$b */
    static final class C23002b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ DepositNameActionSheet f60521d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23002b(DepositNameActionSheet depositNameActionSheet) {
            super(1);
            this.f60521d = depositNameActionSheet;
        }

        /* renamed from: a */
        public final void mo57676a(String str) {
            boolean z;
            C41536l.m120489i(str, "it");
            Button button = this.f60521d.m74595j2().f75005f;
            if (!this.f60521d.m74595j2().f75004e.mo35918a() || C41536l.m120484d(str, this.f60521d.m74596k2().mo57665a())) {
                z = false;
            } else {
                z = true;
            }
            button.setEnabled(z);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo57676a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: ge.bog.mobilebank.deposits.presentation.actionsheet.DepositNameActionSheet$c */
    static final class C23003c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ DepositNameActionSheet f60522d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C23003c(DepositNameActionSheet depositNameActionSheet) {
            super(0);
            this.f60522d = depositNameActionSheet;
        }

        /* renamed from: b */
        public final NameData invoke() {
            Bundle arguments = this.f60522d.getArguments();
            NameData nameData = arguments != null ? (NameData) arguments.getParcelable("ARG_DATA") : null;
            return nameData == null ? new NameData((String) null) : nameData;
        }
    }

    /* renamed from: h2 */
    private final void m74593h2() {
        C32343x.m95457j(m74595j2().f75004e.getTextInput(), new C23002b(this));
        Input input = m74595j2().f75004e;
        C41536l.m120488h(input, "binding.nameInput");
        Input.m50261f(input, this.f60519J, false, false, false, 14, (Object) null);
        m74595j2().f75005f.setOnClickListener(new C23013b(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: i2 */
    public static final void m74594i2(DepositNameActionSheet depositNameActionSheet, View view) {
        C41536l.m120489i(depositNameActionSheet, "this$0");
        if (depositNameActionSheet.m74595j2().f75004e.mo35918a()) {
            C1533o.m5445b(depositNameActionSheet, "REQUEST_KEY_NAME_SAVED", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_SAVED_NAME", depositNameActionSheet.m74595j2().f75004e.getInputText())));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j2 */
    public final C29715e m74595j2() {
        C29715e eVar = this.f60517H;
        C41536l.m120486f(eVar);
        return eVar;
    }

    /* access modifiers changed from: private */
    /* renamed from: k2 */
    public final NameData m74596k2() {
        return (NameData) this.f60518I.getValue();
    }

    /* renamed from: m2 */
    private final void m74597m2() {
        mo26370a2(C32343x.m95388F("deposits.details.name", new Object[0]));
        m74595j2().f75004e.setHintText((CharSequence) C32343x.m95388F("deposits.details.name", new Object[0]));
        m74595j2().f75005f.setEnabled(false);
        Input input = m74595j2().f75004e;
        String a = m74596k2().mo57665a();
        if (a == null) {
            a = "";
        }
        input.setInputText(a);
    }

    /* renamed from: T1 */
    public void mo26367T1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C41536l.m120489i(layoutInflater, "inflater");
        C41536l.m120489i(viewGroup, "container");
        this.f60517H = C29715e.m90226d(layoutInflater, viewGroup, true);
    }

    /* renamed from: l2 */
    public final void mo57664l2(boolean z) {
        m74595j2().f75004e.setEnabled(!z);
        m74595j2().f75005f.setEnabled(!z);
        if (!z) {
            m74595j2().f75005f.setEnabled(m74595j2().f75004e.mo35918a());
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f60517H = null;
    }

    public void onViewCreated(View view, Bundle bundle) {
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        m74597m2();
        m74593h2();
    }
}

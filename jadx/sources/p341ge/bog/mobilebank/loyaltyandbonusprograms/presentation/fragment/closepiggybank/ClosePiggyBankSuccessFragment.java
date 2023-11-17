package p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p016os.C0908e;
import androidx.fragment.app.C1533o;
import g91.C32343x;
import he1.C41233s;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import vs0.C39451j;

/* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankSuccessFragment */
public final class ClosePiggyBankSuccessFragment extends C35651n1 {

    /* renamed from: f */
    public static final C33051a f80942f = new C33051a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private C39451j f80943d;

    /* renamed from: e */
    private boolean f80944e;

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankSuccessFragment$SuccessState */
    private static final class SuccessState implements Parcelable {
        public static final Parcelable.Creator<SuccessState> CREATOR = new C33050a();

        /* renamed from: d */
        private final String f80945d;

        /* renamed from: e */
        private final boolean f80946e;

        /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankSuccessFragment$SuccessState$a */
        public static final class C33050a implements Parcelable.Creator {
            /* renamed from: a */
            public final SuccessState createFromParcel(Parcel parcel) {
                C41536l.m120489i(parcel, "parcel");
                return new SuccessState(parcel.readString(), parcel.readInt() != 0);
            }

            /* renamed from: b */
            public final SuccessState[] newArray(int i) {
                return new SuccessState[i];
            }
        }

        public SuccessState(String str, boolean z) {
            C41536l.m120489i(str, "text");
            this.f80945d = str;
            this.f80946e = z;
        }

        /* renamed from: a */
        public final String mo74940a() {
            return this.f80945d;
        }

        /* renamed from: b */
        public final boolean mo74941b() {
            return this.f80946e;
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SuccessState)) {
                return false;
            }
            SuccessState successState = (SuccessState) obj;
            return C41536l.m120484d(this.f80945d, successState.f80945d) && this.f80946e == successState.f80946e;
        }

        public int hashCode() {
            int hashCode = this.f80945d.hashCode() * 31;
            boolean z = this.f80946e;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public String toString() {
            String str = this.f80945d;
            boolean z = this.f80946e;
            return "SuccessState(text=" + str + ", isError=" + z + ")";
        }

        public void writeToParcel(Parcel parcel, int i) {
            C41536l.m120489i(parcel, "out");
            parcel.writeString(this.f80945d);
            parcel.writeInt(this.f80946e ? 1 : 0);
        }
    }

    /* renamed from: ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankSuccessFragment$a */
    public static final class C33051a {
        private C33051a() {
        }

        public /* synthetic */ C33051a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final ClosePiggyBankSuccessFragment mo74951a(String str, boolean z) {
            C41536l.m120489i(str, "text");
            ClosePiggyBankSuccessFragment closePiggyBankSuccessFragment = new ClosePiggyBankSuccessFragment();
            closePiggyBankSuccessFragment.setArguments(C0908e.m3336b(C41233s.m119492a("ARG_SUCCESS_STATE", new SuccessState(str, z))));
            return closePiggyBankSuccessFragment;
        }
    }

    /* renamed from: j1 */
    private final C39451j m97437j1() {
        C39451j jVar = this.f80943d;
        C41536l.m120486f(jVar);
        return jVar;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [ge.bog.designsystem.components.pagestate.PageStateType] */
    /* JADX WARNING: type inference failed for: r9v1, types: [ge.bog.designsystem.components.pagestate.PageStateType$Success] */
    /* JADX WARNING: type inference failed for: r1v3, types: [ge.bog.designsystem.components.pagestate.PageStateType$Error] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: k1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m97438k1(java.lang.String r17, boolean r18) {
        /*
            r16 = this;
            vs0.j r0 = r16.m97437j1()
            ge.bog.designsystem.components.pagestate.PageState r0 = r0.f93793j
            r1 = r17
            r0.setTitleText(r1)
            vs0.j r0 = r16.m97437j1()
            ge.bog.designsystem.components.pagestate.PageState r0 = r0.f93793j
            if (r18 == 0) goto L_0x0021
            ge.bog.designsystem.components.pagestate.PageStateType$Error r8 = new ge.bog.designsystem.components.pagestate.PageStateType$Error
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 15
            r7 = 0
            r1 = r8
            r1.<init>(r2, r3, r4, r5, r6, r7)
            goto L_0x002e
        L_0x0021:
            ge.bog.designsystem.components.pagestate.PageStateType$Success r8 = new ge.bog.designsystem.components.pagestate.PageStateType$Success
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 15
            r15 = 0
            r9 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15)
        L_0x002e:
            r0.setPageStateType(r8)
            r0 = r18 ^ 1
            r1 = r16
            r1.f80944e = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.loyaltyandbonusprograms.presentation.fragment.closepiggybank.ClosePiggyBankSuccessFragment.m97438k1(java.lang.String, boolean):void");
    }

    /* renamed from: l1 */
    private final void m97439l1() {
        SuccessState successState;
        m97437j1().f93788e.setButtonText(C32343x.m95388F("cas.deactivate.success.button", new Object[0]));
        m97437j1().f93788e.setOnClickListener(new C33065j(this));
        Bundle arguments = getArguments();
        if (arguments != null && (successState = (SuccessState) arguments.getParcelable("ARG_SUCCESS_STATE")) != null) {
            m97438k1(successState.mo74940a(), successState.mo74941b());
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m97440m1(ClosePiggyBankSuccessFragment closePiggyBankSuccessFragment, View view) {
        C41536l.m120489i(closePiggyBankSuccessFragment, "this$0");
        C1533o.m5445b(closePiggyBankSuccessFragment, "REQUEST_KEY_CLOSE_PIGGY_BANK_SUCCESS_FRAGMENT", C0908e.m3336b(C41233s.m119492a("RESULT_KEY_CLOSE_PIGGY_BANK_FINISH", Boolean.valueOf(closePiggyBankSuccessFragment.f80944e))));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C41536l.m120489i(layoutInflater, "inflater");
        C39451j d = C39451j.m114660d(layoutInflater, viewGroup, false);
        this.f80943d = d;
        m97439l1();
        ConstraintLayout c = d.mo3946b();
        C41536l.m120488h(c, "inflate(inflater, contai…        it.root\n        }");
        return c;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f80943d = null;
    }
}

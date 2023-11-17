package p341ge.bog.mobilebank.cleanarch.consumerloandetails.presentation;

import androidx.fragment.app.C1493e0;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.C1645y;
import g91.C32343x;
import he1.C41212c;
import kotlin.jvm.internal.C41532h;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p060e1.C5917g0;
import p341ge.bog.mobilebank.p975ui.fragments.importantterm.LoanImportantTermFragment;
import s81.C38461d;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.b */
public abstract class C20932b {

    /* renamed from: ge.bog.mobilebank.cleanarch.consumerloandetails.presentation.b$a */
    static final class C20933a implements C1645y, C41532h {

        /* renamed from: a */
        private final /* synthetic */ C43075l f56261a;

        C20933a(C43075l lVar) {
            C41536l.m120489i(lVar, "function");
            this.f56261a = lVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C1645y) || !(obj instanceof C41532h)) {
                return false;
            }
            return C41536l.m120484d(getFunctionDelegate(), ((C41532h) obj).getFunctionDelegate());
        }

        public final C41212c getFunctionDelegate() {
            return this.f56261a;
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f56261a.invoke(obj);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final boolean m67744b(int i) {
        return i != -1;
    }

    /* renamed from: c */
    public static final LoanImportantTermFragment m67745c(FragmentManager fragmentManager, LoanImportantTermFragment loanImportantTermFragment, int i, String str, double d, double d2, double d3) {
        LoanImportantTermFragment loanImportantTermFragment2;
        FragmentManager fragmentManager2 = fragmentManager;
        C41536l.m120489i(fragmentManager, "supportFragmentManager");
        String str2 = str;
        C41536l.m120489i(str, "ccy");
        if (loanImportantTermFragment == null) {
            String str3 = str;
            loanImportantTermFragment2 = LoanImportantTermFragment.f86123f.mo86704a(new LoanImportantTermFragment.AmountTextData(C32343x.m95410Q(d, str3, false, 2, (Object) null), C32343x.m95410Q(d2, str3, false, 2, (Object) null), C32343x.m95410Q(d3, str, false, 2, (Object) null), (C38461d) null, 8, (DefaultConstructorMarker) null));
        } else {
            loanImportantTermFragment2 = loanImportantTermFragment;
        }
        C1493e0 p = fragmentManager.mo4428p();
        int i2 = i;
        p.mo4639r(i, loanImportantTermFragment2);
        loanImportantTermFragment2.setEnterTransition(new C5917g0(80));
        loanImportantTermFragment2.setExitTransition(new C5917g0(48));
        p.mo4636g("terms");
        p.mo4515i();
        return loanImportantTermFragment2;
    }
}

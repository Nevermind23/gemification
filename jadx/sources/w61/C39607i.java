package w61;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import c91.C31355y;
import he1.C41238w;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p341ge.bog.mobilebank.transfers.model.TransferContact;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import ue1.C43075l;

/* renamed from: w61.i */
public final class C39607i extends C31355y {

    /* renamed from: x */
    public static final C39608a f94115x = new C39608a((DefaultConstructorMarker) null);
    /* access modifiers changed from: private */

    /* renamed from: v */
    public C43075l f94116v;

    /* renamed from: w */
    private C39597b f94117w;

    /* renamed from: w61.i$a */
    public static final class C39608a {
        private C39608a() {
        }

        public /* synthetic */ C39608a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C39607i mo93269a(TransferContact transferContact, String str) {
            C41536l.m120489i(transferContact, "contact");
            C41536l.m120489i(str, "selectedAccountNumber");
            C39607i iVar = new C39607i();
            iVar.mo71717U1(str);
            Bundle r1 = iVar.mo71733r1();
            r1.putParcelable("CONTACT_PARAM", transferContact);
            r1.putString("SELECTED_ACCOUNT_PARAM", str);
            return iVar;
        }
    }

    /* renamed from: w61.i$b */
    static final class C39609b extends C41537m implements C43075l {

        /* renamed from: d */
        final /* synthetic */ C39607i f94118d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C39609b(C39607i iVar) {
            super(1);
            this.f94118d = iVar;
        }

        /* renamed from: a */
        public final void mo93270a(String str) {
            C41536l.m120489i(str, "it");
            this.f94118d.mo93268l2(str);
            this.f94118d.f77883f.mo87965p3(true);
            C43075l g2 = this.f94118d.f94116v;
            if (g2 != null) {
                g2.invoke(str);
            }
            this.f94118d.mo71717U1(str);
        }

        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            mo93270a((String) obj);
            return C41238w.f97225a;
        }
    }

    /* renamed from: h2 */
    private final TransferContact m115085h2() {
        Parcelable parcelable = mo71733r1().getParcelable("CONTACT_PARAM");
        C41536l.m120486f(parcelable);
        return (TransferContact) parcelable;
    }

    /* renamed from: j2 */
    public static final C39607i m115086j2(TransferContact transferContact, String str) {
        return f94115x.mo93269a(transferContact, str);
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return true;
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return false;
    }

    /* renamed from: i2 */
    public final String mo93266i2() {
        return mo71733r1().getString("SELECTED_ACCOUNT_PARAM");
    }

    /* renamed from: k2 */
    public final void mo93267k2(C43075l lVar) {
        C41536l.m120489i(lVar, "listener");
        this.f94116v = lVar;
    }

    /* renamed from: l2 */
    public final void mo93268l2(String str) {
        mo71733r1().putString("SELECTED_ACCOUNT_PARAM", str);
    }

    /* access modifiers changed from: protected */
    public int layoutId() {
        return C10324m.fragment_select_account_wizard;
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z = false;
        mo71711N1(false);
        super.onActivityCreated(bundle);
        C35862c cVar = this.f77883f;
        if (mo93266i2() != null) {
            z = true;
        }
        cVar.mo87965p3(z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        int i;
        C41536l.m120489i(view, "view");
        super.onViewCreated(view, bundle);
        TextView textView = (TextView) view.findViewById(C10322k.f28721Dx);
        if (m115085h2().isBudgetContact()) {
            i = C10328q.select_contact_treasury_code_wizard_title;
        } else {
            i = C10328q.select_contact_account_wizard_title;
        }
        textView.setText(i);
        this.f77889l.setLayoutManager(new LinearLayoutManager(getContext()));
        C39597b bVar = new C39597b();
        this.f94117w = bVar;
        this.f77889l.setAdapter(bVar);
        C39597b bVar2 = this.f94117w;
        C39597b bVar3 = null;
        if (bVar2 == null) {
            C41536l.m120506z("adapter");
            bVar2 = null;
        }
        bVar2.mo93262j(mo93266i2());
        C39597b bVar4 = this.f94117w;
        if (bVar4 == null) {
            C41536l.m120506z("adapter");
            bVar4 = null;
        }
        bVar4.mo93261i(m115085h2().getAccounts(), m115085h2().isBudgetContact());
        C39597b bVar5 = this.f94117w;
        if (bVar5 == null) {
            C41536l.m120506z("adapter");
        } else {
            bVar3 = bVar5;
        }
        bVar3.mo93260h(new C39609b(this));
    }
}

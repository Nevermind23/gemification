package p341ge.bog.mobilebank.transfers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.C0430g1;
import ba1.C10146d0;
import com.github.mikephil.charting.utils.Utils;
import g91.C32297d;
import g91.C32306g0;
import g91.C32319m;
import g91.C32343x;
import g91.C32359z0;
import hc1.C41185v;
import hd1.C41205b;
import iu0.C36546y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.wizard.activities.BankTransferWizardActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.SaveStoBetweenBankParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.SaveStosBetweenGeorgiaParams;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10328q;
import p380ck.C10478k;
import p745er.C20288a;
import q31.C38125h;
import r90.C27950a;
import x61.C39794a;
import x61.C39796b;
import x61.C39798c;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;

/* renamed from: ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity */
public class OtherSTODetailsActivity extends C34879a {

    /* renamed from: p1 */
    protected ArrayList f84132p1;
    /* access modifiers changed from: private */

    /* renamed from: q1 */
    public DDSTO f84133q1;

    /* renamed from: r1 */
    protected C29742a f84134r1;

    /* renamed from: s1 */
    protected BankApi f84135s1;

    /* renamed from: t1 */
    protected Client f84136t1;

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity$a */
    class C34848a implements C0430g1.C0433c {
        C34848a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!menuItem.getTitle().toString().equals(OtherSTODetailsActivity.this.getResources().getString(C10328q.settings_menu_text_delete))) {
                return true;
            }
            OtherSTODetailsActivity otherSTODetailsActivity = OtherSTODetailsActivity.this;
            otherSTODetailsActivity.mo85334x3(otherSTODetailsActivity.f84133q1.productCode);
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity$b */
    class C34849b extends RestCallback {
        C34849b() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherSTODetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherSTODetailsActivity.this.mo85321a3();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            int i;
            OtherSTODetailsActivity otherSTODetailsActivity;
            super.onResponse(bankApiResponse);
            OtherSTODetailsActivity.this.mo85321a3();
            if (bankApiResponse.isSuccess()) {
                if (OtherSTODetailsActivity.this.mo85263c5()) {
                    otherSTODetailsActivity = OtherSTODetailsActivity.this;
                    i = C10328q.transfer_title_type_budget;
                } else {
                    otherSTODetailsActivity = OtherSTODetailsActivity.this;
                    i = C10328q.transfer_title_type_within_georgia;
                }
                new C10478k.C10482d(otherSTODetailsActivity.getString(i)).mo27184b(C36546y.m108282F());
                OtherSTODetailsActivity.this.f84136t1.forceUpdateData();
                OtherSTODetailsActivity.this.f84136t1.requestDDSTO(true);
                C32306g0.m95220a("sto_created");
                OtherSTODetailsActivity otherSTODetailsActivity2 = OtherSTODetailsActivity.this;
                C32297d.m95160h(otherSTODetailsActivity2, otherSTODetailsActivity2.getString(C10328q.f28956f2));
                OtherSTODetailsActivity.this.m102361M5();
                return;
            }
            C32297d.m95154b(OtherSTODetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity$c */
    class C34850c extends RestCallback {
        C34850c() {
        }

        public void onEnqueue(C41205b bVar) {
            OtherSTODetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OtherSTODetailsActivity.this.mo85321a3();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            int i;
            OtherSTODetailsActivity otherSTODetailsActivity;
            super.onResponse(bankApiResponse);
            OtherSTODetailsActivity.this.mo85321a3();
            if (bankApiResponse.isSuccess()) {
                if (OtherSTODetailsActivity.this.mo85263c5()) {
                    otherSTODetailsActivity = OtherSTODetailsActivity.this;
                    i = C10328q.transfer_title_type_budget;
                } else {
                    otherSTODetailsActivity = OtherSTODetailsActivity.this;
                    i = C10328q.transfer_title_type_within_georgia;
                }
                new C10478k.C10482d(otherSTODetailsActivity.getString(i)).mo27184b(C36546y.m108282F());
                OtherSTODetailsActivity.this.f84136t1.forceUpdateData();
                OtherSTODetailsActivity.this.f84136t1.requestDDSTO(true);
                C32306g0.m95220a("sto_created");
                OtherSTODetailsActivity otherSTODetailsActivity2 = OtherSTODetailsActivity.this;
                C32297d.m95160h(otherSTODetailsActivity2, otherSTODetailsActivity2.getString(C10328q.f28956f2));
                OtherSTODetailsActivity.this.m102361M5();
                return;
            }
            C32297d.m95154b(OtherSTODetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: L5 */
    private void m102360L5() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", this, new C39794a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M5 */
    public void m102361M5() {
        mo86438k1(C32343x.m95465l1(this.f84134r1.mo47470a(C29991a.C29994c.C30002h.f75814e)).mo95070I(new C39796b(this), new C39798c(this)));
    }

    /* renamed from: N5 */
    private String m102362N5() {
        String valueOf = String.valueOf(C32319m.m95286F(this.f84297e0.getValueText()));
        if (valueOf.equals("null")) {
            return "";
        }
        return valueOf;
    }

    /* renamed from: O5 */
    private String m102363O5() {
        DDSTO ddsto = this.f84133q1;
        if (ddsto != null) {
            return String.valueOf(ddsto.paymentId);
        }
        return "";
    }

    /* renamed from: P5 */
    private String m102364P5() {
        ArrayList arrayList = this.f84132p1;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                STOPeriodType sTOPeriodType = (STOPeriodType) it.next();
                if (C27950a.m86284a(sTOPeriodType.dictionaryKey).equals(this.f84295c0.getValueText())) {
                    return sTOPeriodType.periodType;
                }
            }
        }
        return "";
    }

    /* renamed from: R5 */
    private SaveStoBetweenBankParams m102365R5(String str, String str2, String str3) {
        return new SaveStoBetweenBankParams(m102363O5(), String.valueOf(this.f84316x0.getId()), this.f84316x0.getCcy(), mo85320Z2(this.f84283Q.getValueText()), this.f84284R.getValueText(), this.f84286T.getValueText(), mo85259S4(), mo85319Y2(), this.f84316x0.getCcy(), this.f84293a0.getValueText(), this.f84280N.getValueText(), m102364P5(), String.valueOf(C32319m.m95286F(this.f84296d0.getValueText())), m102362N5(), C10146d0.C10177h.m37232a(), BankApi.SERVICE_DEBITS_PAYMENT_WITHIN_BANK, str, str2, str3);
    }

    /* renamed from: S5 */
    private SaveStosBetweenGeorgiaParams m102366S5(String str, String str2, String str3) {
        return new SaveStosBetweenGeorgiaParams(m102363O5(), String.valueOf(this.f84316x0.getId()), this.f84316x0.getCcy(), mo85320Z2(this.f84283Q.getValueText()), this.f84284R.getValueText(), this.f84286T.getValueText(), mo85259S4(), mo85319Y2(), this.f84316x0.getCcy(), this.f84293a0.getValueText(), this.f84280N.getValueText(), m102364P5(), String.valueOf(C32319m.m95286F(this.f84296d0.getValueText())), m102362N5(), mo85253I4(), C10146d0.C10177h.m37232a(), BankApi.SERVICE_DEBITS_PAYMENT_WITHIN_GEORGIA, str, str2, str3);
    }

    /* renamed from: T4 */
    private C41185v m102367T4() {
        return C20288a.m66329d(getSupportFragmentManager());
    }

    /* access modifiers changed from: private */
    /* renamed from: T5 */
    public /* synthetic */ void m102368T5(String str, Bundle bundle) {
        if (bundle.getBoolean("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", true)) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: U5 */
    public /* synthetic */ void m102369U5(C30003b bVar) {
        if (bVar.mo70300c()) {
            m102372X5(bVar);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new C34913i(this), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: V5 */
    public /* synthetic */ void m102370V5(Throwable th) {
        new Handler(Looper.getMainLooper()).postDelayed(new C34913i(this), 2000);
    }

    /* renamed from: W5 */
    private void m102371W5(String str, String str2, String str3) {
        mo85311I3();
        if (this.f84151I0) {
            this.f84135s1.useOtpForAction(this.f84179k1.mo66809a(m102365R5(str, str2, str3)), new C34849b());
        } else {
            this.f84135s1.useOtpForAction(this.f84179k1.mo66809a(m102366S5(str, str2, str3)), new C34850c());
        }
    }

    /* renamed from: X5 */
    private void m102372X5(C30003b bVar) {
        C38125h.m112238c(this).mo91620o(bVar).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: x5 */
    private void m102373x5(String str, HashMap hashMap) {
        C41185v.m119403r2(str, hashMap).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N4 */
    public ArrayList mo85235N4() {
        AccountLov accountLov;
        ArrayList N4 = super.mo85235N4();
        N4.add(0);
        N4.add(23);
        if (!this.f84151I0 && ((accountLov = this.f84316x0) == null || "GEL".equals(accountLov.getCcy()))) {
            N4.remove(new Integer(16));
        }
        return N4;
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        C41185v T4 = m102367T4();
        if (T4 != null) {
            T4.mo4577k1();
        }
        m102371W5(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        this.f84181m1 = Boolean.TRUE;
        if (getIntent().hasExtra("TRANSFER_STO_PERIOD_TYPES")) {
            this.f84132p1 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_STO_PERIOD_TYPES"));
        }
        if (getIntent().hasExtra("STO_ITEM")) {
            this.f84133q1 = (DDSTO) C42035e.m122119a(getIntent().getParcelableExtra("STO_ITEM"));
        }
        super.mo37451O1(bundle);
        this.f84276J.f68595L.f70281e.setVisibility(0);
        m102360L5();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo85236P2() {
        boolean z;
        boolean z2 = false;
        if (mo85315S2() <= Utils.DOUBLE_EPSILON) {
            z = false;
        } else {
            z = true;
        }
        Iterator it = mo85235N4().iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(((Integer) it.next()).intValue()))) {
                z = false;
            }
        }
        if (mo85323e3()) {
            z = false;
        }
        if (!this.f84318z0) {
            z = false;
        }
        if (mo85264e5()) {
            z2 = z;
        }
        this.f84276J.f68595L.f70288l.setOrange(z2, z2, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q5 */
    public String mo85237Q5(String str) {
        try {
            return C27950a.m86284a(((STOPeriodType) this.f84132p1.get(Integer.valueOf(str).intValue())).dictionaryKey);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: R */
    public void mo37616R(String str, String str2) {
        C32297d.m95154b(this, str);
    }

    /* renamed from: S */
    public void mo37617S(boolean z) {
        if (z) {
            mo85311I3();
        } else {
            mo85321a3();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: W2 */
    public long mo85238W2() {
        DDSTO ddsto = this.f84133q1;
        if (ddsto != null) {
            return ddsto.paymentId;
        }
        return -1;
    }

    public void onClick(View view) {
        int i;
        HashMap hashMap;
        String str;
        BogButton bogButton = this.f84276J.f68595L.f70288l;
        if (view != bogButton) {
            Intent a5 = mo85262a5(view);
            a5.putExtra("TRANSFER_IS_NEW_STO", "CREATE".equals(this.f84310r0));
            a5.putExtra("TRANSFER_IS_EDIT_STO", !"CREATE".equals(this.f84310r0));
            a5.putExtra("TRANSFER_WIZARD_STO_PERIOD_TYPES", C42035e.m122121c(this.f84132p1));
            DDSTO ddsto = this.f84133q1;
            if (ddsto != null) {
                a5.putExtra("STO_ITEM", C42035e.m122121c(ddsto));
            }
            BankTransferWizardActivity.m106404z5(this, a5, 10009);
        } else if (bogButton.isOrange()) {
            if (mo85263c5()) {
                i = C10328q.transfer_title_type_budget;
            } else {
                i = C10328q.transfer_title_type_within_georgia;
            }
            new C10478k.C10481c(getString(i)).mo27184b(C36546y.m108282F());
            new HashMap();
            if (this.f84151I0) {
                hashMap = this.f84179k1.mo66809a(m102365R5((String) null, (String) null, (String) null));
                str = BankApi.SERVICE_DEBITS_PAYMENT_WITHIN_BANK;
            } else {
                hashMap = this.f84179k1.mo66809a(m102366S5((String) null, (String) null, (String) null));
                str = BankApi.SERVICE_DEBITS_PAYMENT_WITHIN_GEORGIA;
            }
            m102373x5(str, hashMap);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003b A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005b  */
    /* renamed from: s3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85240s3(boolean r4) {
        /*
            r3 = this;
            super.mo85240s3(r4)
            java.lang.String r4 = r3.f84310r0
            int r0 = r4.hashCode()
            r1 = 2123274(0x20660a, float:2.97534E-39)
            r2 = 1
            if (r0 == r1) goto L_0x002e
            r1 = 2634405(0x2832a5, float:3.691588E-39)
            if (r0 == r1) goto L_0x0024
            r1 = 1996002556(0x76f894fc, float:2.5209207E33)
            if (r0 == r1) goto L_0x001a
            goto L_0x0038
        L_0x001a:
            java.lang.String r0 = "CREATE"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0038
            r4 = 2
            goto L_0x0039
        L_0x0024:
            java.lang.String r0 = "VIEW"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0038
            r4 = 0
            goto L_0x0039
        L_0x002e:
            java.lang.String r0 = "EDIT"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0038
            r4 = r2
            goto L_0x0039
        L_0x0038:
            r4 = -1
        L_0x0039:
            if (r4 == 0) goto L_0x003e
            if (r4 == r2) goto L_0x003e
            goto L_0x006e
        L_0x003e:
            r3.mo85335z3(r2)
            r3.mo85310H3(r2)
            boolean r4 = r3.mo85263c5()
            if (r4 == 0) goto L_0x004d
            int r4 = p366bk.C10320i.ic_transfer_rs
            goto L_0x004f
        L_0x004d:
            int r4 = p366bk.C10320i.ic_transfer_domestic
        L_0x004f:
            r3.mo85304B3(r2, r4, r2)
            boolean r4 = r3.mo85263c5()
            if (r4 == 0) goto L_0x005b
            int r4 = p366bk.C10328q.transfer_title_type_budget
            goto L_0x005d
        L_0x005b:
            int r4 = p366bk.C10328q.transfer_title_type_within_georgia
        L_0x005d:
            java.lang.String r4 = r3.getString(r4)
            r3.mo85309G3(r2, r4)
            int r4 = p366bk.C10325n.sto_delete_menu
            ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity$a r0 = new ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity$a
            r0.<init>()
            r3.mo85326n3(r4, r0)
        L_0x006e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity.mo85240s3(boolean):void");
    }

    /* renamed from: t3 */
    public void mo85241t3() {
        mo85331q3();
        mo85269v5();
        String str = this.f84310r0;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case 2123274:
                if (str.equals(TransferForm.OPERATION_EDIT)) {
                    c = 0;
                    break;
                }
                break;
            case 2634405:
                if (str.equals(TransferForm.OPERATION_VIEW)) {
                    c = 1;
                    break;
                }
                break;
            case 1996002556:
                if (str.equals("CREATE")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
                this.f84276J.f68595L.f70288l.setText(getString(C10328q.button_text_save_remember));
                return;
            case 2:
                this.f84276J.f68595L.f70288l.setText(getString(C10328q.button_text_save));
                return;
            default:
                return;
        }
    }

    /* renamed from: v3 */
    public void mo85242v3(boolean z) {
        super.mo85242v3(z);
        this.f84280N.setTitleText(getString(C10328q.sto_title_name));
        this.f84280N.setValueTextIgnoringEmpty((String) this.f84311s0.get(0));
        this.f84295c0.setValueTextIgnoringEmpty(mo85237Q5((String) this.f84311s0.get(23)));
        String str = (String) this.f84311s0.get(24);
        String str2 = (String) this.f84311s0.get(25);
        if (C32359z0.m95571h0(str, str2)) {
            str2 = "";
        }
        this.f84296d0.setValueTextIgnoringEmpty(str);
        this.f84297e0.setValueTextIgnoringEmpty(str2);
    }

    /* renamed from: y3 */
    public void mo85243y3() {
        super.mo85243y3();
        this.f84276J.f68640w.addView(this.f84280N);
        this.f84276J.f68590G.addView(this.f84295c0);
        this.f84276J.f68592I.addView(this.f84296d0);
        this.f84276J.f68588E.addView(this.f84297e0);
        if (!this.f84151I0) {
            AccountLov accountLov = this.f84316x0;
            if (accountLov == null || "GEL".equals(accountLov.getCcy())) {
                this.f84276J.f68620g0.removeView(this.f84291Y);
            }
        }
    }
}

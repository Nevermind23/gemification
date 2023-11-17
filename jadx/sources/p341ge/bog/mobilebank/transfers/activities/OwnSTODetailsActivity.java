package p341ge.bog.mobilebank.transfers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.C0430g1;
import com.github.mikephil.charting.utils.Utils;
import f91.C31972b;
import g91.C32297d;
import g91.C32306g0;
import g91.C32307h;
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
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.account.AccountLoveDebit;
import p341ge.bog.mobilebank.model.account.ProductProperties;
import p341ge.bog.mobilebank.model.ddsto.DDSTO;
import p341ge.bog.mobilebank.model.ddsto.STOPeriodType;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.DomesticTransferWizardActivity;
import p341ge.bog.mobilebank.rest.BankApi;
import p341ge.bog.mobilebank.rest.model.RestCallback;
import p341ge.bog.mobilebank.rest.model.otpparameter.SaveCreditMinPaymentParams;
import p341ge.bog.mobilebank.rest.model.otpparameter.SaveDomesticTransferSTOParams;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10328q;
import p380ck.C10478k;
import p745er.C20288a;
import pc0.C27494a;
import q31.C38125h;
import r90.C27950a;
import x61.C39814q;
import x61.C39815r;
import x61.C39816s;
import xd0.C29742a;
import yd0.C29991a;
import yd0.C30003b;
import z90.C30268c;

/* renamed from: ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity */
public class OwnSTODetailsActivity extends C34901d implements C41185v.C41186a {

    /* renamed from: X0 */
    protected ArrayList f84209X0;
    /* access modifiers changed from: private */

    /* renamed from: Y0 */
    public DDSTO f84210Y0;

    /* renamed from: Z0 */
    private long[] f84211Z0;

    /* renamed from: a1 */
    protected C30268c f84212a1;

    /* renamed from: b1 */
    protected C29742a f84213b1;

    /* renamed from: c1 */
    protected Client f84214c1;

    /* renamed from: d1 */
    protected BankApi f84215d1;

    /* renamed from: e1 */
    protected C27494a f84216e1;

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity$a */
    class C34868a implements C0430g1.C0433c {
        C34868a() {
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            if (!menuItem.getTitle().toString().equals(OwnSTODetailsActivity.this.getResources().getString(C10328q.settings_menu_text_delete)) || OwnSTODetailsActivity.this.f84210Y0 == null) {
                return true;
            }
            OwnSTODetailsActivity ownSTODetailsActivity = OwnSTODetailsActivity.this;
            ownSTODetailsActivity.mo85334x3(ownSTODetailsActivity.f84210Y0.productCode);
            return true;
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity$b */
    class C34869b extends RestCallback {
        C34869b() {
        }

        public void onEnqueue(C41205b bVar) {
            OwnSTODetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OwnSTODetailsActivity.this.mo85321a3();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OwnSTODetailsActivity.this.mo85321a3();
            if (bankApiResponse.isSuccess()) {
                OwnSTODetailsActivity.this.f84212a1.mo70587a();
                OwnSTODetailsActivity.this.setResult(-1, new Intent());
                new C10478k.C10482d(OwnSTODetailsActivity.this.getString(C10328q.transfer_title_type_between_accs)).mo27184b(C36546y.m108282F());
                OwnSTODetailsActivity.this.f84214c1.forceUpdateData();
                OwnSTODetailsActivity.this.f84214c1.requestDDSTO(true);
                OwnSTODetailsActivity ownSTODetailsActivity = OwnSTODetailsActivity.this;
                C32297d.m95160h(ownSTODetailsActivity, ownSTODetailsActivity.getString(C10328q.f28956f2));
                OwnSTODetailsActivity.this.m102547j4();
                return;
            }
            C32297d.m95154b(OwnSTODetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity$c */
    class C34870c extends RestCallback {
        C34870c() {
        }

        public void onEnqueue(C41205b bVar) {
            OwnSTODetailsActivity.this.mo86438k1(bVar);
        }

        public void onFailure(Throwable th) {
            super.onFailure(th);
            OwnSTODetailsActivity.this.mo85321a3();
        }

        public void onResponse(BankApiResponse bankApiResponse) {
            super.onResponse(bankApiResponse);
            OwnSTODetailsActivity.this.mo85321a3();
            if (bankApiResponse.isSuccess()) {
                OwnSTODetailsActivity.this.f84212a1.mo70587a();
                OwnSTODetailsActivity.this.setResult(-1, new Intent());
                new C10478k.C10482d(OwnSTODetailsActivity.this.getString(C10328q.transfer_title_type_between_accs)).mo27184b(C36546y.m108282F());
                OwnSTODetailsActivity.this.f84214c1.forceUpdateData();
                OwnSTODetailsActivity.this.f84214c1.requestDDSTO(true);
                OwnSTODetailsActivity ownSTODetailsActivity = OwnSTODetailsActivity.this;
                C32297d.m95160h(ownSTODetailsActivity, ownSTODetailsActivity.getString(C10328q.f28956f2));
                C32306g0.m95220a("sto_created");
                OwnSTODetailsActivity.this.m102547j4();
                return;
            }
            C32297d.m95154b(OwnSTODetailsActivity.this, C27950a.m86284a(bankApiResponse.getKey()));
        }
    }

    /* renamed from: h4 */
    private void m102545h4() {
        getSupportFragmentManager().mo4367F1("REQUEST_KEY_END_YEAR_CAMPAIGN_POPUP", this, new C39814q(this));
    }

    /* renamed from: i4 */
    private boolean m102546i4() {
        AccountLov accountLov;
        AccountLov accountLov2;
        if (this.f84210Y0 != null || (accountLov = this.f84315w0) == null || !accountLov.isForCreditSTO() || (accountLov2 = this.f84313u0) == null || !accountLov2.isCreditCard()) {
            return false;
        }
        long[] jArr = this.f84211Z0;
        if (jArr == null) {
            return true;
        }
        for (long j : jArr) {
            if (this.f84313u0.getId() == j) {
                return false;
            }
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: j4 */
    public void m102547j4() {
        mo86438k1(C32343x.m95465l1(this.f84213b1.mo47470a(C29991a.C29994c.C30002h.f75814e)).mo95070I(new C39815r(this), new C39816s(this)));
    }

    /* renamed from: k4 */
    private SaveCreditMinPaymentParams m102548k4(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        String str9;
        String[] split;
        AccountLovEvent accountLovEvent;
        String valueText = this.f84294b0.getValueText();
        if (!TextUtils.isEmpty(valueText)) {
            int i = C10328q.mobile_number_prefix;
            if (!valueText.startsWith(getString(i))) {
                valueText = getString(i) + valueText;
            }
        }
        String str10 = valueText;
        DDSTO ddsto = this.f84210Y0;
        String str11 = "";
        if (ddsto != null) {
            str4 = String.valueOf(ddsto.paymentId);
        } else {
            str4 = str11;
        }
        try {
            str5 = String.valueOf(this.f84316x0.getId());
        } catch (Exception unused) {
            str5 = str11;
        }
        String valueOf = String.valueOf(C32319m.m95286F(this.f84297e0.getValueText()));
        if (valueOf.equals("null")) {
            str6 = str11;
        } else {
            str6 = valueOf;
        }
        if (this.f84276J.f68586C.getVisibility() != 0 || TextUtils.isEmpty((CharSequence) this.f84311s0.get(2)) || (split = ((String) this.f84311s0.get(2)).split("_")) == null || (accountLovEvent = this.f84307o0) == null || accountLovEvent.getAccountDebitLoveWrapper() == null) {
            str9 = str5;
            str8 = str11;
            str7 = str8;
        } else {
            ArrayList<AccountLoveDebit> arrayList = this.f84307o0.getAccountDebitLoveWrapper().cardDebits;
            str7 = str11;
            for (int i2 = 0; i2 < split.length; i2++) {
                if (!TextUtils.isEmpty(split[i2])) {
                    Iterator<AccountLoveDebit> it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AccountLoveDebit next = it.next();
                        if (next.acctKey == Long.valueOf(split[i2]).longValue()) {
                            if (i2 == 0) {
                                str5 = String.valueOf(next.acctKey);
                            } else if (i2 == 1) {
                                str11 = String.valueOf(next.acctKey);
                            } else if (i2 == 2) {
                                str7 = String.valueOf(next.acctKey);
                            }
                        }
                    }
                }
            }
            str9 = str5;
            str8 = str11;
        }
        return new SaveCreditMinPaymentParams(String.valueOf(this.f84313u0.getId()), str4, str9, str8, str7, str10, str6, this.f84280N.getValueText(), BankApi.DEBITS_CREATE_AGREEMENT, str, str2, str3);
    }

    /* renamed from: l4 */
    private String m102549l4(String str) {
        try {
            return getString(C32307h.f79723e[Integer.valueOf(str).intValue()]);
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: m4 */
    private SaveDomesticTransferSTOParams m102550m4(String str, String str2, String str3) {
        String str4;
        String str5;
        String valueOf = String.valueOf(C32319m.m95286F(this.f84297e0.getValueText()));
        String str6 = "";
        if (valueOf.equals("null")) {
            str4 = str6;
        } else {
            str4 = valueOf;
        }
        ArrayList arrayList = this.f84209X0;
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                STOPeriodType sTOPeriodType = (STOPeriodType) it.next();
                if (C27950a.m86284a(sTOPeriodType.dictionaryKey).equals(this.f84295c0.getValueText())) {
                    str5 = sTOPeriodType.periodType;
                    break;
                }
            }
        }
        str5 = str6;
        DDSTO ddsto = this.f84210Y0;
        if (ddsto != null) {
            str6 = String.valueOf(ddsto.paymentId);
        }
        return new SaveDomesticTransferSTOParams(str6, String.valueOf(this.f84316x0.getId()), this.f84316x0.getCcy(), String.valueOf(this.f84314v0.getId()), String.valueOf(mo85319Y2()), this.f84316x0.getCcy(), this.f84293a0.getValueText(), this.f84280N.getValueText(), str5, String.valueOf(C32319m.m95286F(this.f84296d0.getValueText())), str4, BankApi.DEBITS_BETWEEM_OWN_ACCOUNTS, str, str2, str3);
    }

    /* renamed from: o4 */
    private C41185v m102551o4() {
        return C20288a.m66329d(getSupportFragmentManager());
    }

    /* renamed from: p4 */
    private boolean m102552p4() {
        DDSTO ddsto = this.f84210Y0;
        if (ddsto != null && "BILL".equals(ddsto.productCode)) {
            return true;
        }
        if (this.f84276J.f68625j.getChildCount() <= 0 || !getString(C32307h.f79723e[0]).equals(this.f84288V.getValueText())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: q4 */
    public /* synthetic */ void m102553q4(String str, Bundle bundle) {
        if (bundle.getBoolean("RESULT_KEY_END_YEAR_CAMPAIGN_POPUP_CLOSED", true)) {
            finish();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: r4 */
    public /* synthetic */ void m102554r4(C30003b bVar) {
        if (bVar.mo70300c()) {
            m102557u4(bVar);
        } else {
            new Handler(Looper.getMainLooper()).postDelayed(new C34927w(this), 2000);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: s4 */
    public /* synthetic */ void m102555s4(Throwable th) {
        new Handler(Looper.getMainLooper()).postDelayed(new C34927w(this), 2000);
    }

    /* renamed from: t4 */
    private void m102556t4(String str, String str2, String str3) {
        mo85311I3();
        if (m102552p4()) {
            this.f84215d1.useOtpForAction(this.f84216e1.mo66809a(m102548k4(str, str2, str3)), new C34869b());
        } else {
            this.f84215d1.useOtpForAction(this.f84216e1.mo66809a(m102550m4(str, str2, str3)), new C34870c());
        }
    }

    /* renamed from: u4 */
    private void m102557u4(C30003b bVar) {
        C38125h.m112238c(this).mo91620o(bVar).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: v4 */
    private void m102558v4(String str, HashMap hashMap) {
        C41185v.m119403r2(str, hashMap).mo4576A1(getSupportFragmentManager(), (String) null);
    }

    /* renamed from: O */
    public void mo37615O(String str, String str2, String str3, String str4) {
        if (m102551o4() != null) {
            m102551o4().mo4577k1();
        }
        m102556t4(str, str2, str3);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        if (getIntent().hasExtra("TRANSFER_STO_PERIOD_TYPES")) {
            this.f84209X0 = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_STO_PERIOD_TYPES"));
        }
        if (getIntent().hasExtra("TRANSFER_STO_EXISTING_CREDIT_BILL_ACCS")) {
            this.f84211Z0 = getIntent().getLongArrayExtra("TRANSFER_STO_EXISTING_CREDIT_BILL_ACCS");
        }
        if (getIntent().hasExtra("STO_ITEM")) {
            this.f84210Y0 = (DDSTO) C42035e.m122119a(getIntent().getParcelableExtra("STO_ITEM"));
        }
        super.mo37451O1(bundle);
        if (this.f84210Y0 != null && m102552p4()) {
            this.f84311s0.set(1, "");
        }
        this.f84276J.f68595L.f70281e.setVisibility(0);
        this.f84276J.f68587D.setText(C27950a.m86284a("text.sto.create.conversion.description"));
        m102545h4();
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public void mo85236P2() {
        boolean z;
        boolean z2 = false;
        if (mo85315S2() > Utils.DOUBLE_EPSILON || m102552p4()) {
            z = true;
        } else {
            z = false;
        }
        Iterator it = mo85283V3().iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty((CharSequence) this.f84311s0.get(((Integer) it.next()).intValue()))) {
                z = false;
            }
        }
        if (mo85323e3()) {
            z = false;
        }
        if (this.f84318z0) {
            z2 = z;
        }
        this.f84276J.f68595L.f70288l.setOrange(z2, z2, true);
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
    /* renamed from: V3 */
    public ArrayList mo85283V3() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(0);
        arrayList.add(3);
        if (m102546i4()) {
            arrayList.add(14);
        }
        if (this.f84276J.f68586C.getVisibility() == 0) {
            arrayList.add(2);
        } else {
            arrayList.add(1);
        }
        if (!m102552p4()) {
            arrayList.add(15);
            arrayList.add(23);
            arrayList.add(24);
        }
        return arrayList;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W2 */
    public long mo85238W2() {
        DDSTO ddsto = this.f84210Y0;
        if (ddsto != null) {
            return ddsto.paymentId;
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public boolean mo85284d3() {
        if (m102552p4()) {
            return false;
        }
        return super.mo85284d3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: n4 */
    public String mo85285n4(String str) {
        try {
            return C27950a.m86284a(((STOPeriodType) this.f84209X0.get(Integer.valueOf(str).intValue())).dictionaryKey);
        } catch (Exception unused) {
            return "";
        }
    }

    public void onClick(View view) {
        String str;
        HashMap hashMap;
        BogButton bogButton = this.f84276J.f68595L.f70288l;
        if (view != bogButton) {
            Intent X3 = mo85292X3(view);
            if (view == this.f84276J.f68586C) {
                X3.putExtra("WIZARD_PAGE_INDEX", 2);
            }
            X3.putExtra("STO_EXISTING_CREDIT_BILL_ACCT_KEYS", this.f84211Z0);
            X3.putExtra("TRANSFER_IS_NEW_STO", "CREATE".equals(this.f84310r0));
            X3.putExtra("TRANSFER_IS_EDIT_STO", !"CREATE".equals(this.f84310r0));
            X3.putExtra("TRANSFER_WIZARD_STO_PERIOD_TYPES", C42035e.m122121c(this.f84209X0));
            DDSTO ddsto = this.f84210Y0;
            if (ddsto != null) {
                X3.putExtra("STO_ITEM", C42035e.m122121c(ddsto));
            }
            DomesticTransferWizardActivity.m106485w4(this, X3, 10008);
        } else if (bogButton.isOrange()) {
            new C10478k.C10481c(getString(C10328q.transfer_title_type_between_accs)).mo27184b(C36546y.m108282F());
            if (m102552p4()) {
                str = BankApi.DEBITS_CREATE_AGREEMENT;
            } else {
                str = BankApi.DEBITS_BETWEEM_OWN_ACCOUNTS;
            }
            if (m102552p4()) {
                hashMap = this.f84216e1.mo66809a(m102548k4((String) null, (String) null, (String) null));
            } else {
                hashMap = this.f84216e1.mo66809a(m102550m4((String) null, (String) null, (String) null));
            }
            m102558v4(str, hashMap);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0052  */
    /* renamed from: s3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85240s3(boolean r5) {
        /*
            r4 = this;
            super.mo85240s3(r5)
            java.lang.String r5 = r4.f84310r0
            int r0 = r5.hashCode()
            r1 = 2123274(0x20660a, float:2.97534E-39)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x002f
            r1 = 2634405(0x2832a5, float:3.691588E-39)
            if (r0 == r1) goto L_0x0025
            r1 = 1996002556(0x76f894fc, float:2.5209207E33)
            if (r0 == r1) goto L_0x001b
            goto L_0x0039
        L_0x001b:
            java.lang.String r0 = "CREATE"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0039
            r5 = 2
            goto L_0x003a
        L_0x0025:
            java.lang.String r0 = "VIEW"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0039
            r5 = r2
            goto L_0x003a
        L_0x002f:
            java.lang.String r0 = "EDIT"
            boolean r5 = r5.equals(r0)
            if (r5 == 0) goto L_0x0039
            r5 = r3
            goto L_0x003a
        L_0x0039:
            r5 = -1
        L_0x003a:
            if (r5 == 0) goto L_0x003f
            if (r5 == r3) goto L_0x003f
            goto L_0x0068
        L_0x003f:
            r4.mo85335z3(r3)
            int r5 = p366bk.C10320i.ic_transfer_between_accs
            r4.mo85304B3(r3, r5, r3)
            boolean r5 = r4.m102552p4()
            if (r5 == 0) goto L_0x0052
            int[] r5 = g91.C32307h.f79723e
            r5 = r5[r2]
            goto L_0x0054
        L_0x0052:
            int r5 = p366bk.C10328q.transfer_title_type_between_accs
        L_0x0054:
            java.lang.String r5 = r4.getString(r5)
            r4.mo85309G3(r3, r5)
            r4.mo85310H3(r3)
            int r5 = p366bk.C10325n.sto_delete_menu
            ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity$a r0 = new ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity$a
            r0.<init>()
            r4.mo85326n3(r5, r0)
        L_0x0068:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity.mo85240s3(boolean):void");
    }

    /* renamed from: t3 */
    public void mo85241t3() {
        mo85331q3();
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
        AccountLovEvent accountLovEvent;
        super.mo85242v3(z);
        this.f84280N.setTitleText(getString(C10328q.sto_title_name));
        int i = 0;
        this.f84280N.setValueTextIgnoringEmpty((String) this.f84311s0.get(0));
        this.f84288V.setValueTextIgnoringEmpty(m102549l4((String) this.f84311s0.get(14)));
        AccountLov accountLov = null;
        if (getString(C10328q.mobile_number_prefix).equals(this.f84311s0.get(21))) {
            this.f84294b0.setValueTextIgnoringEmpty((String) null);
        } else {
            this.f84294b0.setValueTextIgnoringEmpty((String) this.f84311s0.get(21));
        }
        this.f84295c0.setValueTextIgnoringEmpty(mo85285n4((String) this.f84311s0.get(23)));
        String str = (String) this.f84311s0.get(24);
        String str2 = (String) this.f84311s0.get(25);
        String str3 = "";
        if (C32359z0.m95571h0(str, str2)) {
            str2 = str3;
        }
        this.f84296d0.setValueTextIgnoringEmpty(str);
        this.f84297e0.setValueTextIgnoringEmpty(str2);
        if (!TextUtils.isEmpty((CharSequence) this.f84311s0.get(2))) {
            String[] split = ((String) this.f84311s0.get(2)).split("_");
            if (!(split == null || (accountLovEvent = this.f84307o0) == null || accountLovEvent.getAccountDebitLoveWrapper() == null)) {
                ArrayList<AccountLoveDebit> arrayList = this.f84307o0.getAccountDebitLoveWrapper().cardDebits;
                for (int i2 = 0; i2 < split.length; i2++) {
                    if (!TextUtils.isEmpty(split[i2])) {
                        Iterator<AccountLoveDebit> it = arrayList.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            AccountLoveDebit next = it.next();
                            if (next.acctKey == Long.valueOf(split[i2]).longValue()) {
                                str3 = (str3 + C31972b.m94377b(this.f84307o0.getAccountDebitLoveWrapper(), next.acctKey)) + ", ";
                                break;
                            }
                        }
                    }
                }
            }
            if (str3.length() > 1) {
                str3 = str3.substring(0, str3.length() - 2);
            }
            try {
                Iterator<AccountLov> it2 = this.f84307o0.getAccountLovContainer().getDomestic().src.iterator();
                while (it2.hasNext()) {
                    AccountLov next2 = it2.next();
                    Iterator<AccountLov> it3 = next2.getSubAccounts().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            if (it3.next().getId() == Long.valueOf(split[0]).longValue()) {
                                accountLov = next2;
                                continue;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    if (accountLov != null) {
                        break;
                    }
                }
                ProductProperties properties = ProductProperties.getProperties(accountLov, this.f84214c1, false);
                this.f84276J.f68615e.setLeft(properties.getBackgroundImageId(), false, str3, (String) null, false);
                this.f84276J.f68615e.setTextColorIds(properties.getTitleColorId(), true);
                this.f84276J.f68615e.setLeftFrameState(11);
                this.f84276J.f68615e.setEllipsize(TextUtils.TruncateAt.END, true);
            } catch (Exception unused) {
                this.f84276J.f68615e.resetLeft();
            }
            this.f84276J.f68589F.setText(str3);
        } else {
            this.f84276J.f68589F.setText(str3);
            if (this.f84210Y0 != null && m102552p4()) {
                this.f84276J.f68615e.resetLeft();
            }
        }
        BogTextView bogTextView = this.f84276J.f68587D;
        if (!mo85284d3()) {
            i = 8;
        }
        bogTextView.setVisibility(i);
    }

    /* renamed from: y3 */
    public void mo85243y3() {
        super.mo85243y3();
        this.f84276J.f68640w.addView(this.f84280N);
        this.f84276J.f68588E.addView(this.f84297e0);
        if (m102546i4()) {
            this.f84276J.f68625j.addView(this.f84288V);
        }
        if (m102552p4()) {
            this.f84276J.f68616e0.removeAllViews();
            this.f84276J.f68596M.removeAllViews();
            this.f84276J.f68591H.addView(this.f84294b0);
            if (this.f84210Y0 != null) {
                this.f84276J.f68586C.setVisibility(0);
                this.f84276J.f68604U.removeAllViews();
                return;
            }
            return;
        }
        this.f84276J.f68590G.addView(this.f84295c0);
        this.f84276J.f68592I.addView(this.f84296d0);
    }
}

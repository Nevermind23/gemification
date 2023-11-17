package p341ge.bog.mobilebank.transfers.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import jg1.C41438c;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.rest.manager.RootBankApiManager;
import p366bk.C10328q;
import p90.C27296f2;
import x61.C39799c0;
import y61.C40026b;

/* renamed from: ge.bog.mobilebank.transfers.activities.TransferLoaderActivity */
public class TransferLoaderActivity extends C34911h {

    /* renamed from: G */
    protected RootBankApiManager f84252G;

    /* renamed from: H */
    protected Client f84253H;

    /* renamed from: I */
    protected C41438c f84254I;

    /* renamed from: J */
    protected PreferencesApiManager f84255J;

    /* renamed from: K */
    private C27296f2 f84256K;

    /* renamed from: L */
    protected C40026b f84257L;

    /* renamed from: M */
    private String f84258M;

    /* renamed from: N */
    private int f84259N;

    /* renamed from: O */
    private long f84260O;

    /* renamed from: P */
    private long f84261P;

    /* access modifiers changed from: private */
    /* renamed from: C2 */
    public /* synthetic */ void m102618C2(View view) {
        m102620G2();
    }

    /* renamed from: G2 */
    private void m102620G2() {
        this.f84257L.mo93877b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: F2 */
    public void mo85299F2() {
        this.f84256K.f68698e.setVisibility(8);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006c, code lost:
        if (r5.equals(p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFER_FORM_FOREIGN) == false) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00af, code lost:
        if (r5.equals(p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFER_FORM_OTHER) == false) goto L_0x00a0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00ed, code lost:
        if (r5.equals(p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFER_FORM_OTHER) == false) goto L_0x00de;
     */
    /* renamed from: H2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo85300H2(java.lang.String r17, java.lang.String r18, java.lang.String r19, boolean r20, boolean r21, p341ge.bog.mobilebank.transfers.model.TransferForm.TRANSFERTYPE r22, java.util.ArrayList r23, p341ge.bog.mobilebank.eventbus.events.AccountLovEvent r24, p341ge.bog.mobilebank.eventbus.events.STOPeriodTypesEvent r25, p341ge.bog.mobilebank.model.template.TemplateBasketItem r26, p341ge.bog.mobilebank.model.ddsto.DDSTO r27, p341ge.bog.mobilebank.model.PMIHistoryItem r28, long[] r29) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r25
            r3 = r29
            java.lang.String r4 = "OWN"
            if (r18 != 0) goto L_0x000e
            r5 = r4
            goto L_0x0010
        L_0x000e:
            r5 = r18
        L_0x0010:
            r17.hashCode()
            int r6 = r17.hashCode()
            r7 = 2
            r8 = 1
            r9 = -1
            r10 = 0
            switch(r6) {
                case -538919814: goto L_0x0036;
                case 82446: goto L_0x002b;
                case 2063509483: goto L_0x0020;
                default: goto L_0x001e;
            }
        L_0x001e:
            r6 = r9
            goto L_0x0040
        L_0x0020:
            java.lang.String r6 = "TRANSFER"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0029
            goto L_0x001e
        L_0x0029:
            r6 = r7
            goto L_0x0040
        L_0x002b:
            java.lang.String r6 = "STO"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x0034
            goto L_0x001e
        L_0x0034:
            r6 = r8
            goto L_0x0040
        L_0x0036:
            java.lang.String r6 = "TEMPLATE"
            boolean r6 = r1.equals(r6)
            if (r6 != 0) goto L_0x003f
            goto L_0x001e
        L_0x003f:
            r6 = r10
        L_0x0040:
            java.lang.String r11 = "BUDGET"
            r12 = 3
            java.lang.String r13 = "OTHER"
            java.lang.String r14 = "FOREIGN"
            r15 = 0
            switch(r6) {
                case 0: goto L_0x00d7;
                case 1: goto L_0x0099;
                case 2: goto L_0x004d;
                default: goto L_0x004b;
            }
        L_0x004b:
            goto L_0x0114
        L_0x004d:
            int r6 = r5.hashCode()
            switch(r6) {
                case -1766641386: goto L_0x0078;
                case 78694: goto L_0x006f;
                case 40307892: goto L_0x0068;
                case 75532016: goto L_0x005f;
                case 1970119493: goto L_0x0056;
                default: goto L_0x0054;
            }
        L_0x0054:
            r7 = r9
            goto L_0x0082
        L_0x0056:
            boolean r4 = r5.equals(r11)
            if (r4 != 0) goto L_0x005d
            goto L_0x0054
        L_0x005d:
            r7 = 4
            goto L_0x0082
        L_0x005f:
            boolean r4 = r5.equals(r13)
            if (r4 != 0) goto L_0x0066
            goto L_0x0054
        L_0x0066:
            r7 = r12
            goto L_0x0082
        L_0x0068:
            boolean r4 = r5.equals(r14)
            if (r4 != 0) goto L_0x0082
            goto L_0x0054
        L_0x006f:
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0076
            goto L_0x0054
        L_0x0076:
            r7 = r8
            goto L_0x0082
        L_0x0078:
            java.lang.String r4 = "CONVERSION"
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0081
            goto L_0x0054
        L_0x0081:
            r7 = r10
        L_0x0082:
            switch(r7) {
                case 0: goto L_0x0090;
                case 1: goto L_0x0090;
                case 2: goto L_0x0087;
                case 3: goto L_0x0087;
                case 4: goto L_0x0087;
                default: goto L_0x0085;
            }
        L_0x0085:
            goto L_0x0114
        L_0x0087:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity> r4 = p341ge.bog.mobilebank.transfers.activities.OtherTransferDetailsActivity.class
            r15.<init>(r0, r4)
            goto L_0x0114
        L_0x0090:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity> r4 = p341ge.bog.mobilebank.transfers.activities.OwnTransferDetailsActivity.class
            r15.<init>(r0, r4)
            goto L_0x0114
        L_0x0099:
            int r6 = r5.hashCode()
            switch(r6) {
                case 78694: goto L_0x00bb;
                case 40307892: goto L_0x00b2;
                case 75532016: goto L_0x00ab;
                case 1970119493: goto L_0x00a2;
                default: goto L_0x00a0;
            }
        L_0x00a0:
            r7 = r9
            goto L_0x00c3
        L_0x00a2:
            boolean r4 = r5.equals(r11)
            if (r4 != 0) goto L_0x00a9
            goto L_0x00a0
        L_0x00a9:
            r7 = r12
            goto L_0x00c3
        L_0x00ab:
            boolean r4 = r5.equals(r13)
            if (r4 != 0) goto L_0x00c3
            goto L_0x00a0
        L_0x00b2:
            boolean r4 = r5.equals(r14)
            if (r4 != 0) goto L_0x00b9
            goto L_0x00a0
        L_0x00b9:
            r7 = r8
            goto L_0x00c3
        L_0x00bb:
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x00c2
            goto L_0x00a0
        L_0x00c2:
            r7 = r10
        L_0x00c3:
            switch(r7) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00c7;
                case 2: goto L_0x00c7;
                case 3: goto L_0x00c7;
                default: goto L_0x00c6;
            }
        L_0x00c6:
            goto L_0x0114
        L_0x00c7:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity> r4 = p341ge.bog.mobilebank.transfers.activities.OtherSTODetailsActivity.class
            r15.<init>(r0, r4)
            goto L_0x0114
        L_0x00cf:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity> r4 = p341ge.bog.mobilebank.transfers.activities.OwnSTODetailsActivity.class
            r15.<init>(r0, r4)
            goto L_0x0114
        L_0x00d7:
            int r6 = r5.hashCode()
            switch(r6) {
                case 78694: goto L_0x00f9;
                case 40307892: goto L_0x00f0;
                case 75532016: goto L_0x00e9;
                case 1970119493: goto L_0x00e0;
                default: goto L_0x00de;
            }
        L_0x00de:
            r7 = r9
            goto L_0x0101
        L_0x00e0:
            boolean r4 = r5.equals(r11)
            if (r4 != 0) goto L_0x00e7
            goto L_0x00de
        L_0x00e7:
            r7 = r12
            goto L_0x0101
        L_0x00e9:
            boolean r4 = r5.equals(r13)
            if (r4 != 0) goto L_0x0101
            goto L_0x00de
        L_0x00f0:
            boolean r4 = r5.equals(r14)
            if (r4 != 0) goto L_0x00f7
            goto L_0x00de
        L_0x00f7:
            r7 = r8
            goto L_0x0101
        L_0x00f9:
            boolean r4 = r5.equals(r4)
            if (r4 != 0) goto L_0x0100
            goto L_0x00de
        L_0x0100:
            r7 = r10
        L_0x0101:
            switch(r7) {
                case 0: goto L_0x010d;
                case 1: goto L_0x0105;
                case 2: goto L_0x0105;
                case 3: goto L_0x0105;
                default: goto L_0x0104;
            }
        L_0x0104:
            goto L_0x0114
        L_0x0105:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.transfers.activities.OtherTemplateDetailsActivity> r4 = p341ge.bog.mobilebank.transfers.activities.OtherTemplateDetailsActivity.class
            r15.<init>(r0, r4)
            goto L_0x0114
        L_0x010d:
            android.content.Intent r15 = new android.content.Intent
            java.lang.Class<ge.bog.mobilebank.transfers.activities.OwnTemplateDetailsActivity> r4 = p341ge.bog.mobilebank.transfers.activities.OwnTemplateDetailsActivity.class
            r15.<init>(r0, r4)
        L_0x0114:
            if (r15 == 0) goto L_0x01b4
            android.content.Intent r4 = r16.getIntent()
            r15.putExtras(r4)
            y61.b r4 = r0.f84257L
            if (r4 == 0) goto L_0x0124
            r4.mo93878c()
        L_0x0124:
            java.lang.String r4 = "TRANSFER_CONTACT_ID"
            long r6 = r0.f84260O
            r15.putExtra(r4, r6)
            java.lang.String r4 = "TRANSFER_MONEY_REQUEST_ID"
            long r6 = r0.f84261P
            r15.putExtra(r4, r6)
            java.lang.String r4 = "TRANSFER_MODULE"
            r15.putExtra(r4, r1)
            java.lang.String r1 = "OPERATION_TYPE"
            r4 = r19
            r15.putExtra(r1, r4)
            java.lang.String r1 = "TRANSFER_FORM"
            r15.putExtra(r1, r5)
            java.lang.String r1 = "TRANSFER_WITHIN_BANK"
            r4 = r20
            r15.putExtra(r1, r4)
            java.lang.String r1 = "IS_REAL_ESTATE"
            r4 = r21
            r15.putExtra(r1, r4)
            java.lang.String r1 = "TRANSFER_TYPE"
            r4 = r22
            r15.putExtra(r1, r4)
            android.content.Intent r1 = r16.getIntent()
            java.lang.String r4 = "TRANSFER_AUTOMATICALLY_OPEN_WIZARD"
            boolean r1 = r1.getBooleanExtra(r4, r10)
            r15.putExtra(r4, r1)
            java.lang.String r1 = "COLLECTED_VALUES"
            android.os.Parcelable r4 = org.parceler.C42035e.m122121c(r23)
            r15.putExtra(r1, r4)
            g91.C32340v0.m95377c(r24)
            if (r2 == 0) goto L_0x017e
            java.util.ArrayList<ge.bog.mobilebank.model.ddsto.STOPeriodType> r1 = r2.stoPeriodTypes
            android.os.Parcelable r1 = org.parceler.C42035e.m122121c(r1)
            java.lang.String r2 = "TRANSFER_STO_PERIOD_TYPES"
            r15.putExtra(r2, r1)
        L_0x017e:
            if (r3 == 0) goto L_0x0185
            java.lang.String r1 = "TRANSFER_STO_EXISTING_CREDIT_BILL_ACCS"
            r15.putExtra(r1, r3)
        L_0x0185:
            if (r26 == 0) goto L_0x0190
            java.lang.String r1 = "TEMPLATE_ITEM"
            android.os.Parcelable r2 = org.parceler.C42035e.m122121c(r26)
            r15.putExtra(r1, r2)
        L_0x0190:
            if (r27 == 0) goto L_0x019b
            java.lang.String r1 = "STO_ITEM"
            android.os.Parcelable r2 = org.parceler.C42035e.m122121c(r27)
            r15.putExtra(r1, r2)
        L_0x019b:
            if (r28 == 0) goto L_0x01a6
            java.lang.String r1 = "PMI_HISTORY_ITEM"
            android.os.Parcelable r2 = org.parceler.C42035e.m122121c(r28)
            r15.putExtra(r1, r2)
        L_0x01a6:
            int r1 = r0.f84259N
            if (r1 <= 0) goto L_0x01ae
            r0.startActivityForResult(r15, r1)
            goto L_0x01b4
        L_0x01ae:
            r0.startActivity(r15)
            r16.finish()
        L_0x01b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.TransferLoaderActivity.mo85300H2(java.lang.String, java.lang.String, java.lang.String, boolean, boolean, ge.bog.mobilebank.transfers.model.TransferForm$TRANSFERTYPE, java.util.ArrayList, ge.bog.mobilebank.eventbus.events.AccountLovEvent, ge.bog.mobilebank.eventbus.events.STOPeriodTypesEvent, ge.bog.mobilebank.model.template.TemplateBasketItem, ge.bog.mobilebank.model.ddsto.DDSTO, ge.bog.mobilebank.model.PMIHistoryItem, long[]):void");
    }

    /* renamed from: I2 */
    public void mo85301I2(int i) {
        if (i == 10) {
            mo86441o2();
            mo85299F2();
        } else if (i == 20) {
            mo85299F2();
        } else if (i == 30 || i == 40) {
            mo86425J1();
            mo85302J2();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: J2 */
    public void mo85302J2() {
        this.f84256K.f68698e.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27296f2 d = C27296f2.m84487d(getLayoutInflater());
        this.f84256K = d;
        super.mo70996D2(bundle, d);
        this.f84256K.f68700g.f68328f.mo3946b().setOnClickListener(new C39799c0(this));
        this.f84257L = new C40026b(this, this.f84253H, this.f84254I, getIntent(), this.f84255J.getLanguage());
        this.f84258M = getIntent().getStringExtra("TRANSFER_MODULE");
        this.f84260O = getIntent().getLongExtra("TRANSFER_CONTACT_ID", -1);
        this.f84261P = getIntent().getLongExtra("TRANSFER_MONEY_REQUEST_ID", -1);
        this.f84259N = getIntent().getIntExtra("TRANSFER_REQUEST_CODE", -1);
        this.f84252G.getCcyRates(true);
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        setResult(i2);
        finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        C40026b bVar = this.f84257L;
        if (bVar != null) {
            bVar.mo93876a();
            this.f84257L = null;
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C40026b bVar = this.f84257L;
        if (bVar != null) {
            bVar.mo93877b();
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C40026b bVar = this.f84257L;
        if (bVar != null) {
            bVar.mo93878c();
        }
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        if ("STO".equals(this.f84258M)) {
            return getString(C10328q.header_text_automatics);
        }
        return getString(C10328q.header_text_transfers);
    }
}

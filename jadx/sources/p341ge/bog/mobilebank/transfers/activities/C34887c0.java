package p341ge.bog.mobilebank.transfers.activities;

import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.appcompat.widget.C0430g1;
import com.github.mikephil.charting.utils.Utils;
import f91.C31972b;
import g91.C32289b0;
import g91.C32297d;
import g91.C32300e0;
import g91.C32303f;
import g91.C32340v0;
import g91.C32343x;
import g91.C32355x0;
import g91.C32359z0;
import java.math.BigDecimal;
import java.util.ArrayList;
import jg1.C41438c;
import jg1.C41452l;
import org.parceler.C42035e;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.dialog.C13310d;
import p341ge.bog.mobilebank.eventbus.events.AccountLovEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTransferTemplateEvent;
import p341ge.bog.mobilebank.eventbus.events.TerminateDDSTOEvent;
import p341ge.bog.mobilebank.eventbus.events.TransferDeleteTemplateEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.account.AccountLov;
import p341ge.bog.mobilebank.model.template.TemplateBasketItem;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.TextTypeView;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p90.C27286e2;
import r90.C27950a;
import x61.C39795a0;
import x61.C39797b0;
import x61.C39820w;
import x61.C39821x;
import x61.C39822y;
import x61.C39823z;

/* renamed from: ge.bog.mobilebank.transfers.activities.c0 */
public abstract class C34887c0 extends C34909g implements View.OnClickListener {

    /* renamed from: A0 */
    protected boolean f84268A0 = false;

    /* renamed from: B0 */
    protected boolean f84269B0;

    /* renamed from: C0 */
    protected boolean f84270C0 = true;

    /* renamed from: D0 */
    protected boolean f84271D0;

    /* renamed from: E0 */
    protected boolean f84272E0;

    /* renamed from: G */
    protected Client f84273G;

    /* renamed from: H */
    protected C41438c f84274H;

    /* renamed from: I */
    protected PreferencesApiManager f84275I;

    /* renamed from: J */
    protected C27286e2 f84276J;
    /* access modifiers changed from: private */

    /* renamed from: K */
    public View f84277K;
    /* access modifiers changed from: private */

    /* renamed from: L */
    public PopupWindow f84278L;

    /* renamed from: M */
    protected TextTypeView f84279M;

    /* renamed from: N */
    protected TextTypeView f84280N;

    /* renamed from: O */
    protected TextTypeView f84281O;

    /* renamed from: P */
    protected TextTypeView f84282P;

    /* renamed from: Q */
    protected TextTypeView f84283Q;

    /* renamed from: R */
    protected TextTypeView f84284R;

    /* renamed from: S */
    protected TextTypeView f84285S;

    /* renamed from: T */
    protected TextTypeView f84286T;

    /* renamed from: U */
    protected TextTypeView f84287U;

    /* renamed from: V */
    protected TextTypeView f84288V;

    /* renamed from: W */
    protected TextTypeView f84289W;

    /* renamed from: X */
    protected TextTypeView f84290X;

    /* renamed from: Y */
    protected TextTypeView f84291Y;

    /* renamed from: Z */
    protected TextTypeView f84292Z;

    /* renamed from: a0 */
    protected TextTypeView f84293a0;

    /* renamed from: b0 */
    protected TextTypeView f84294b0;

    /* renamed from: c0 */
    protected TextTypeView f84295c0;

    /* renamed from: d0 */
    protected TextTypeView f84296d0;

    /* renamed from: e0 */
    protected TextTypeView f84297e0;

    /* renamed from: f0 */
    protected TextTypeView f84298f0;

    /* renamed from: g0 */
    protected TextTypeView f84299g0;

    /* renamed from: h0 */
    protected TextTypeView f84300h0;

    /* renamed from: i0 */
    protected TextTypeView f84301i0;

    /* renamed from: j0 */
    protected TextTypeView f84302j0;

    /* renamed from: k0 */
    protected TextTypeView f84303k0;

    /* renamed from: l0 */
    protected TextTypeView f84304l0;

    /* renamed from: m0 */
    protected TextTypeView f84305m0;

    /* renamed from: n0 */
    protected TextTypeView f84306n0;

    /* renamed from: o0 */
    protected AccountLovEvent f84307o0;

    /* renamed from: p0 */
    protected String f84308p0;

    /* renamed from: q0 */
    protected String f84309q0;

    /* renamed from: r0 */
    protected String f84310r0;

    /* renamed from: s0 */
    protected ArrayList f84311s0;

    /* renamed from: t0 */
    protected double f84312t0;

    /* renamed from: u0 */
    protected AccountLov f84313u0;

    /* renamed from: v0 */
    protected AccountLov f84314v0;

    /* renamed from: w0 */
    protected AccountLov f84315w0;

    /* renamed from: x0 */
    protected AccountLov f84316x0;

    /* renamed from: y0 */
    protected TransferForm.TRANSFERTYPE f84317y0;

    /* renamed from: z0 */
    protected boolean f84318z0 = true;

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$a */
    class C34888a implements View.OnClickListener {
        C34888a() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84292Z.getViewSelector());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$b */
    class C34889b implements View.OnClickListener {
        C34889b() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84293a0.getViewSelector());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$c */
    class C34890c implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ int f84321d;

        /* renamed from: e */
        final /* synthetic */ C0430g1.C0433c f84322e;

        C34890c(int i, C0430g1.C0433c cVar) {
            this.f84321d = i;
            this.f84322e = cVar;
        }

        public void onClick(View view) {
            C0430g1 g1Var = new C0430g1(C34887c0.this, view);
            g1Var.mo2097b().inflate(this.f84321d, g1Var.mo2096a());
            g1Var.mo2099d(this.f84322e);
            g1Var.mo2100e();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$d */
    class C34891d implements View.OnClickListener {
        C34891d() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            boolean z = !c0Var.f84268A0;
            c0Var.f84268A0 = z;
            if (z) {
                c0Var.f84276J.f68595L.f70286j.setImageResource(C10320i.ic_checkbox_selected_color);
            } else {
                c0Var.f84276J.f68595L.f70286j.setImageResource(C10320i.ic_checkbox_unselected_color);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$e */
    class C34892e implements View.OnClickListener {

        /* renamed from: ge.bog.mobilebank.transfers.activities.c0$e$a */
        class C34893a implements View.OnTouchListener {
            C34893a() {
            }

            public boolean onTouch(View view, MotionEvent motionEvent) {
                C34887c0.this.f84278L.dismiss();
                return false;
            }
        }

        C34892e() {
        }

        public void onClick(View view) {
            int i;
            C34887c0 c0Var;
            if (C34887c0.this.f84278L == null) {
                C34887c0 c0Var2 = C34887c0.this;
                c0Var2.f84277K = LayoutInflater.from(c0Var2).inflate(C10324m.layout_transfer_veryfy_contact_info_popup, (ViewGroup) null);
                C34887c0.this.f84278L = new PopupWindow(C34887c0.this.f84277K, -1, -2);
                TextView textView = (TextView) C34887c0.this.f84277K.findViewById(C10322k.hint_tv);
                if (C34887c0.this.f84273G.getUserInfo().isSolo()) {
                    c0Var = C34887c0.this;
                    i = C10328q.transfer_verify_contact_hint_solo;
                } else {
                    c0Var = C34887c0.this;
                    i = C10328q.transfer_verify_contact_hint_retail;
                }
                textView.setText(c0Var.getString(i));
                C34887c0.this.f84278L.setBackgroundDrawable(new ColorDrawable());
                C34887c0.this.f84278L.setOutsideTouchable(true);
                C34887c0.this.f84278L.setTouchInterceptor(new C34893a());
            }
            C34887c0.this.f84277K.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
            int height = C34887c0.this.f84276J.f68595L.f70290n.getHeight();
            PopupWindow J2 = C34887c0.this.f84278L;
            C34887c0 c0Var3 = C34887c0.this;
            J2.showAsDropDown(c0Var3.f84276J.f68595L.f70290n, 0, -(height + (height / 2) + c0Var3.f84277K.getMeasuredHeight()), 8388613);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$f */
    class C34894f implements View.OnClickListener {
        C34894f() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            boolean z = !c0Var.f84318z0;
            c0Var.f84318z0 = z;
            if (z) {
                c0Var.f84276J.f68595L.f70283g.setImageResource(C10320i.ic_checkbox_selected_color);
            } else {
                c0Var.f84276J.f68595L.f70283g.setImageResource(C10320i.ic_checkbox_unselected_color);
            }
            C34887c0.this.mo85236P2();
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$g */
    class C34895g implements View.OnClickListener {
        C34895g() {
        }

        public void onClick(View view) {
            C32303f.m95182B(C34887c0.this);
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$h */
    class C34896h implements View.OnClickListener {
        C34896h() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84283Q.getViewSelector());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$i */
    class C34897i implements View.OnClickListener {
        C34897i() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84286T.getViewSelector());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$j */
    class C34898j implements View.OnClickListener {
        C34898j() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84287U.getViewSelector());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$k */
    class C34899k implements View.OnClickListener {
        C34899k() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84289W.getViewSelector());
        }
    }

    /* renamed from: ge.bog.mobilebank.transfers.activities.c0$l */
    class C34900l implements View.OnClickListener {
        C34900l() {
        }

        public void onClick(View view) {
            C34887c0 c0Var = C34887c0.this;
            c0Var.onClick(c0Var.f84290X.getViewSelector());
        }
    }

    /* renamed from: b3 */
    private TextTypeView m102648b3(int i, int i2) {
        TextTypeView textTypeView = (TextTypeView) View.inflate(this, C10324m.transfer_domestic_default_text_type_view, (ViewGroup) null);
        textTypeView.setTitleText(getString(i));
        textTypeView.setDefaultUnderLineColor();
        textTypeView.setPosition(i2);
        textTypeView.setOnClickListener(this);
        return textTypeView;
    }

    /* access modifiers changed from: private */
    /* renamed from: g3 */
    public /* synthetic */ void m102649g3(View view) {
        onClick(this.f84281O.getViewSelector());
    }

    /* access modifiers changed from: private */
    /* renamed from: h3 */
    public /* synthetic */ void m102650h3(View view) {
        onClick(this.f84298f0.getViewSelector());
    }

    /* access modifiers changed from: private */
    /* renamed from: i3 */
    public /* synthetic */ void m102651i3(View view) {
        onClick(this.f84282P.getViewSelector());
    }

    /* access modifiers changed from: private */
    /* renamed from: j3 */
    public /* synthetic */ void m102652j3(String str, C13310d dVar, Button button) {
        if (TextUtils.isEmpty(str)) {
            this.f84273G.deleteTransferTemplate(true, mo85238W2());
            dVar.mo4577k1();
        } else if ("BILL".equals(str)) {
            this.f84273G.terminateBill(mo85238W2(), "BILL");
            dVar.mo4577k1();
        } else if ("STO".equals(str)) {
            this.f84273G.terminateSTO(mo85238W2(), "STO");
            dVar.mo4577k1();
        }
    }

    /* renamed from: w3 */
    private void m102654w3() {
        this.f84299g0 = m102648b3(C10328q.recipient_country, 6);
        this.f84300h0 = m102648b3(C10328q.recipient_city, 7);
        this.f84301i0 = m102648b3(C10328q.recipient_address, 8);
        this.f84302j0 = m102648b3(C10328q.common_text_operation_type, 13);
        this.f84305m0 = m102648b3(C10328q.additional_info, 20);
        this.f84303k0 = m102648b3(C10328q.intermidiary_bank, 11);
        this.f84304l0 = m102648b3(C10328q.beneficiary_bank, 12);
        TextTypeView b3 = m102648b3(C10328q.invoice, 17);
        this.f84306n0 = b3;
        b3.getBogInputLayout().setRightDrawable(C10320i.ic_file_icon);
    }

    /* access modifiers changed from: protected */
    /* renamed from: A3 */
    public void mo85303A3(boolean z) {
        mo85304B3(z, -1, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: B3 */
    public void mo85304B3(boolean z, int i, boolean z2) {
        int i2;
        ImageView imageView = this.f84276J.f68599P;
        if (z) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        imageView.setVisibility(i2);
        if (i > 0) {
            C32289b0.m95096h(this.f84276J.f68599P, Integer.valueOf(i), z2);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: C3 */
    public void mo85305C3(boolean z, String str) {
        int i;
        ImageView imageView = this.f84276J.f68599P;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
        C32289b0.m95097i(this.f84276J.f68599P, C32289b0.m95093e(str));
    }

    /* access modifiers changed from: protected */
    /* renamed from: D3 */
    public void mo85306D3(boolean z) {
        mo85307E3(z, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: E3 */
    public void mo85307E3(boolean z, String str) {
        int i;
        BogTextView bogTextView = this.f84276J.f68605V;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        bogTextView.setVisibility(i);
        if (str != null) {
            this.f84276J.f68605V.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: F3 */
    public void mo85308F3(boolean z) {
        mo85309G3(z, (String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: G3 */
    public void mo85309G3(boolean z, String str) {
        int i;
        BogTextView bogTextView = this.f84276J.f68601R;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        bogTextView.setVisibility(i);
        if (str != null) {
            this.f84276J.f68601R.setText(str);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: H3 */
    public void mo85310H3(boolean z) {
        this.f84276J.f68602S.setVisibility(z ? 0 : 8);
    }

    /* renamed from: I3 */
    public void mo85311I3() {
        this.f84276J.f68611b0.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return C10324m.activity_transfer;
    }

    /* access modifiers changed from: protected */
    /* renamed from: N2 */
    public void mo85257N2() {
        mo85313Q2();
        mo85267p3();
        mo85242v3(false);
        mo85243y3();
        mo85321a3();
        mo85236P2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27286e2 d = C27286e2.m84446d(getLayoutInflater());
        this.f84276J = d;
        super.mo70996D2(bundle, d);
        this.f84308p0 = getIntent().getStringExtra("TRANSFER_MODULE");
        this.f84310r0 = getIntent().getStringExtra("OPERATION_TYPE");
        this.f84309q0 = getIntent().getStringExtra("TRANSFER_FORM");
        this.f84317y0 = (TransferForm.TRANSFERTYPE) getIntent().getSerializableExtra("TRANSFER_TYPE");
        this.f84269B0 = getIntent().getBooleanExtra("IS_REAL_ESTATE", false);
        if (this.f84317y0 == null) {
            this.f84317y0 = TransferForm.TRANSFERTYPE.ACCOUNT;
        }
        if (getIntent().hasExtra("COLLECTED_VALUES")) {
            ArrayList arrayList = (ArrayList) C42035e.m122119a(getIntent().getParcelableExtra("COLLECTED_VALUES"));
            this.f84311s0 = arrayList;
            if (TextUtils.isEmpty((CharSequence) arrayList.get(9)) && this.f84273G.getUserInfo() != null) {
                this.f84311s0.set(9, this.f84273G.getUserInfo().getClient().getName(this.f84275I.getLanguage()));
            }
        }
        this.f84307o0 = C32340v0.m95376b();
        this.f84276J.f68595L.f70288l.setOnClickListener(this);
        this.f84276J.f68595L.f70283g.setImageResource(C10320i.ic_checkbox_selected_color);
        this.f84276J.f68595L.f70286j.setImageResource(C10320i.ic_checkbox_unselected_color);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O2 */
    public boolean mo85312O2(int i) {
        try {
            BigDecimal f = C31972b.m94381f(this.f84307o0.getAccountLovContainer(), i);
            if (!mo85324f3(mo85316T2(), BigDecimal.valueOf(mo85315S2()), f)) {
                C32297d.m95154b(this, String.format(getString(C10328q.transfer_error_transfer_limit), new Object[]{f}));
                return false;
            }
        } catch (Exception unused) {
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: P2 */
    public abstract void mo85236P2();

    /* renamed from: Q2 */
    public void mo85313Q2() {
        this.f84276J.f68617f.setVisibility(0);
        this.f84276J.f68584A.removeAllViews();
        this.f84276J.f68640w.removeAllViews();
        this.f84276J.f68604U.removeAllViews();
        this.f84276J.f68627k.removeAllViews();
        this.f84276J.f68642y.removeAllViews();
        this.f84276J.f68641x.removeAllViews();
        this.f84276J.f68643z.removeAllViews();
        this.f84276J.f68609Z.removeAllViews();
        this.f84276J.f68610a0.removeAllViews();
        this.f84276J.f68625j.removeAllViews();
        this.f84276J.f68621h.removeAllViews();
        this.f84276J.f68596M.removeAllViews();
        this.f84276J.f68597N.removeAllViews();
        this.f84276J.f68620g0.removeAllViews();
        this.f84276J.f68608Y.removeAllViews();
        this.f84276J.f68616e0.removeAllViews();
        this.f84276J.f68591H.removeAllViews();
        this.f84276J.f68590G.removeAllViews();
        this.f84276J.f68592I.removeAllViews();
        this.f84276J.f68588E.removeAllViews();
        this.f84276J.f68637t.removeAllViews();
        this.f84276J.f68636s.removeAllViews();
        this.f84276J.f68635r.removeAllViews();
        this.f84276J.f68638u.removeAllViews();
        this.f84276J.f68633p.removeAllViews();
        this.f84276J.f68632o.removeAllViews();
        this.f84276J.f68634q.removeAllViews();
        this.f84276J.f68631n.removeAllViews();
        this.f84276J.f68598O.setVisibility(8);
        this.f84276J.f68628k0.setVisibility(8);
        this.f84276J.f68586C.setVisibility(8);
        this.f84276J.f68603T.setVisibility(8);
        this.f84276J.f68618f0.setVisibility(8);
        this.f84276J.f68607X.setVisibility(8);
        this.f84276J.f68614d0.setVisibility(8);
        this.f84276J.f68612c0.setVisibility(8);
        this.f84276J.f68587D.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: R2 */
    public void mo85314R2() {
        setResult(-1, new Intent());
        finish();
    }

    /* access modifiers changed from: protected */
    /* renamed from: S2 */
    public double mo85315S2() {
        try {
            return Double.parseDouble((String) this.f84311s0.get(15));
        } catch (Exception unused) {
            return Utils.DOUBLE_EPSILON;
        }
    }

    /* renamed from: T2 */
    public String mo85316T2() {
        AccountLov accountLov = this.f84316x0;
        if (accountLov != null) {
            return accountLov.getCcy();
        }
        return "GEL";
    }

    /* access modifiers changed from: protected */
    /* renamed from: U2 */
    public String mo85317U2(double d, String str) {
        return C32359z0.m95542M(String.valueOf(d * 100.0d)) + C32303f.m95198i(str, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: V2 */
    public long mo85318V2(TemplateBasketItem templateBasketItem, String str) {
        if (templateBasketItem != null) {
            return templateBasketItem.getIdForTemplateParam(str);
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: W2 */
    public long mo85238W2() {
        return -1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X2 */
    public abstract void mo85261X2();

    /* access modifiers changed from: protected */
    /* renamed from: Y2 */
    public String mo85319Y2() {
        String valueOf = String.valueOf(mo85315S2());
        if (valueOf.startsWith(".")) {
            valueOf = BankApiResponse.SUCCESSFUL_RESPONSE_CODE + valueOf;
        }
        try {
            if (!valueOf.contains(".") || valueOf.split("\\.")[1].length() != 1) {
                return valueOf;
            }
            return valueOf + BankApiResponse.SUCCESSFUL_RESPONSE_CODE;
        } catch (Exception unused) {
            return valueOf;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z2 */
    public String mo85320Z2(String str) {
        if (str == null) {
            return null;
        }
        return str.replace("-", "").replace(" ", "");
    }

    /* renamed from: a3 */
    public void mo85321a3() {
        this.f84276J.f68611b0.setVisibility(8);
    }

    /* renamed from: c3 */
    public void mo85322c3() {
        this.f84276J.f68615e.setLeftFrameState(13);
        this.f84276J.f68615e.setRightFrameState(13);
        int i = C10324m.transfer_domestic_default_text_type_view;
        TextTypeView textTypeView = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84279M = textTypeView;
        textTypeView.setTitleText(getString(C10328q.transfers_details_title_edit_photo));
        this.f84279M.setDefaultUnderLineColor();
        TextTypeView textTypeView2 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84280N = textTypeView2;
        textTypeView2.setTitleText(getString(C10328q.common_text_template_name));
        this.f84280N.setDefaultUnderLineColor();
        this.f84280N.setPosition(0);
        this.f84280N.setOnClickListener(this);
        TextTypeView textTypeView3 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84281O = textTypeView3;
        textTypeView3.getBogInputLayout().getEditText().getLayoutParams().width = -2;
        this.f84281O.getBogInputLayout().getEditText().setCompoundDrawablePadding(C32355x0.m95513d(this, 4));
        this.f84281O.setTitleText(getString(C10328q.common_text_from));
        this.f84281O.setDefaultUnderLineColor();
        this.f84281O.setPosition(1);
        this.f84281O.setOnClickListener(new C39820w(this));
        TextTypeView textTypeView4 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84298f0 = textTypeView4;
        textTypeView4.setTitleText(getString(C10328q.cadastral_code));
        this.f84298f0.setDefaultUnderLineColor();
        this.f84298f0.setPosition(22);
        this.f84298f0.setOnClickListener(new C39821x(this));
        TextTypeView textTypeView5 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84282P = textTypeView5;
        textTypeView5.setTitleText(getString(C10328q.common_text_where));
        this.f84282P.setDefaultUnderLineColor();
        this.f84282P.setPosition(3);
        this.f84282P.setOnClickListener(new C39822y(this));
        TextTypeView textTypeView6 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84283Q = textTypeView6;
        int i2 = C10328q.transfers_title_receiver_account;
        textTypeView6.setTitleText(getString(i2));
        this.f84283Q.setDefaultUnderLineColor();
        this.f84283Q.setPosition(3);
        this.f84283Q.setOnClickListener(new C34896h());
        TextTypeView textTypeView7 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84284R = textTypeView7;
        textTypeView7.setTitleText(getString(C10328q.transfers_title_receiver_name));
        this.f84284R.setDefaultUnderLineColor();
        this.f84284R.setPosition(5);
        this.f84284R.setOnClickListener(this);
        TextTypeView textTypeView8 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84285S = textTypeView8;
        textTypeView8.setTitleText(getString(i2));
        this.f84285S.setDefaultUnderLineColor();
        this.f84285S.setOnClickListener(this);
        this.f84285S.setPosition(4);
        TextTypeView textTypeView9 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84288V = textTypeView9;
        textTypeView9.setTitleText(getString(C10328q.sto_title_transfer_type));
        this.f84288V.setDefaultUnderLineColor();
        this.f84288V.setOnClickListener(this);
        this.f84288V.setPosition(14);
        TextTypeView textTypeView10 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84286T = textTypeView10;
        textTypeView10.setTitleText(getString(C10328q.transfer_details_title_sender_name));
        this.f84286T.setDefaultUnderLineColor();
        this.f84286T.setPosition(9);
        this.f84286T.setOnClickListener(new C34897i());
        TextTypeView textTypeView11 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84287U = textTypeView11;
        textTypeView11.setTitleText(getString(C10328q.transfer_details_title_sender_pin));
        this.f84287U.setDefaultUnderLineColor();
        this.f84287U.setPosition(10);
        this.f84287U.setOnClickListener(new C34898j());
        TextTypeView textTypeView12 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84289W = textTypeView12;
        textTypeView12.setTitleText(getString(C10328q.common_text_amount));
        this.f84289W.setDefaultUnderLineColor();
        this.f84289W.setPosition(15);
        this.f84289W.setOnClickListener(new C34899k());
        TextTypeView textTypeView13 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84290X = textTypeView13;
        textTypeView13.setTitleText(getString(C10328q.transfers_title_to_earn));
        this.f84290X.setDefaultUnderLineColor();
        this.f84290X.setPosition(15);
        this.f84290X.setOnClickListener(new C34900l());
        TextTypeView textTypeView14 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84291Y = textTypeView14;
        textTypeView14.setTitleText(getString(C10328q.transfers_transfer_type));
        this.f84291Y.setDefaultUnderLineColor();
        this.f84291Y.setOnClickListener(this);
        this.f84291Y.setPosition(16);
        TextTypeView textTypeView15 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84292Z = textTypeView15;
        int i3 = C10328q.transfers_title_subject;
        textTypeView15.setTitleText(getString(i3));
        this.f84292Z.setDefaultUnderLineColor();
        this.f84292Z.setPosition(18);
        this.f84292Z.setOnClickListener(new C34888a());
        TextTypeView textTypeView16 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84293a0 = textTypeView16;
        textTypeView16.setTitleText(getString(i3));
        this.f84293a0.setDefaultUnderLineColor();
        this.f84293a0.setPosition(19);
        this.f84293a0.setOnClickListener(new C34889b());
        TextTypeView textTypeView17 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84294b0 = textTypeView17;
        textTypeView17.setTitleText(getString(C10328q.sto_title_mobile_number));
        this.f84294b0.setDefaultUnderLineColor();
        this.f84294b0.setOnClickListener(this);
        this.f84294b0.setPosition(21);
        TextTypeView textTypeView18 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84295c0 = textTypeView18;
        textTypeView18.setTitleText(getString(C10328q.sto_title_period));
        this.f84295c0.setDefaultUnderLineColor();
        this.f84295c0.setOnClickListener(this);
        this.f84295c0.setPosition(23);
        TextTypeView textTypeView19 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84296d0 = textTypeView19;
        textTypeView19.setTitleText(getString(C10328q.sto_title_start_date));
        this.f84296d0.setDefaultUnderLineColor();
        this.f84296d0.setOnClickListener(this);
        this.f84296d0.setPosition(24);
        TextTypeView textTypeView20 = (TextTypeView) View.inflate(this, i, (ViewGroup) null);
        this.f84297e0 = textTypeView20;
        textTypeView20.setTitleText(getString(C10328q.sto_title_service_end));
        this.f84297e0.setDefaultUnderLineColor();
        this.f84297e0.setOnClickListener(this);
        this.f84297e0.setPosition(25);
        this.f84276J.f68586C.setOnClickListener(this);
        m102654w3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public boolean mo85284d3() {
        try {
            return !this.f84316x0.getCcy().equals(this.f84314v0.getCcy());
        } catch (Exception unused) {
            return false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public boolean mo85323e3() {
        return this.f84272E0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|(3:5|6|(1:(2:8|(3:19|10|11)(1:12))(0)))(0)|13|14|15|(1:17)(1:21)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0030 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* renamed from: f3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean mo85324f3(java.lang.String r7, java.math.BigDecimal r8, java.math.BigDecimal r9) {
        /*
            r6 = this;
            java.lang.String r0 = "GEL"
            boolean r0 = r0.equals(r7)     // Catch:{ Exception -> 0x003d }
            r1 = 0
            if (r0 != 0) goto L_0x0030
            ge.bog.mobilebank.rest.manager.PreferencesApiManager r0 = r6.f84275I     // Catch:{ Exception -> 0x0030 }
            ge.bog.mobilebank.model.CcyRatesWrapper r0 = r0.getCcyRates()     // Catch:{ Exception -> 0x0030 }
            ge.bog.mobilebank.model.CcyRate[] r0 = r0.getList()     // Catch:{ Exception -> 0x0030 }
            int r2 = r0.length     // Catch:{ Exception -> 0x0030 }
            r3 = r1
        L_0x0015:
            if (r3 >= r2) goto L_0x0030
            r4 = r0[r3]     // Catch:{ Exception -> 0x0030 }
            java.lang.String r5 = r4.getCcy()     // Catch:{ Exception -> 0x0030 }
            boolean r5 = r5.equals(r7)     // Catch:{ Exception -> 0x0030 }
            if (r5 == 0) goto L_0x002d
            java.math.BigDecimal r7 = r4.getCurrentRate()     // Catch:{ Exception -> 0x0030 }
            java.math.BigDecimal r7 = r8.multiply(r7)     // Catch:{ Exception -> 0x0030 }
            r8 = r7
            goto L_0x0030
        L_0x002d:
            int r3 = r3 + 1
            goto L_0x0015
        L_0x0030:
            long r7 = r8.longValue()     // Catch:{ Exception -> 0x003d }
            long r2 = r9.longValue()     // Catch:{ Exception -> 0x003d }
            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x003d
            return r1
        L_0x003d:
            r7 = 1
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.mobilebank.transfers.activities.C34887c0.mo85324f3(java.lang.String, java.math.BigDecimal, java.math.BigDecimal):boolean");
    }

    /* access modifiers changed from: protected */
    /* renamed from: l3 */
    public void mo85246l3(boolean z) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m3 */
    public void mo85325m3() {
        if (this.f84271D0) {
            mo85311I3();
        } else {
            mo85321a3();
        }
    }

    /* renamed from: n3 */
    public void mo85326n3(int i, C0430g1.C0433c cVar) {
        this.f84276J.f68602S.setOnClickListener(new C34890c(i, cVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: o3 */
    public void mo85327o3() {
        int i;
        if (mo85284d3() || TransferForm.TRANSFER_FORM_CONVERSION.equals(this.f84309q0)) {
            i = C10328q.transfer_details_exchange_button_format_text;
        } else {
            i = C10328q.transfer_details_transfer_button_format_text;
        }
        String string = getString(i);
        this.f84276J.f68595L.f70288l.setText(String.format(string, new Object[]{mo85317U2(mo85315S2(), mo85316T2())}));
    }

    public abstract void onClick(View view);

    @C41452l
    public void onDDSTOTerminateEvent(TerminateDDSTOEvent terminateDDSTOEvent) {
        if (terminateDDSTOEvent.itemId == mo85238W2()) {
            int state = terminateDDSTOEvent.getState();
            if (state == 10) {
                mo85311I3();
            } else if (state == 20) {
                this.f84273G.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
                C32297d.m95161i(this, getString(C10328q.f28956f2), C32297d.f79706b, new C39823z(this));
            } else if (state == 30) {
                mo85321a3();
                this.f84273G.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
            } else if (state == 40) {
                mo85321a3();
                C32297d.m95154b(this, C27950a.m86284a(terminateDDSTOEvent.getErrorKey()));
                this.f84273G.setTerminateDDSTOEvent((TerminateDDSTOEvent) null);
            }
        }
    }

    @C41452l
    public void onDeleteTemplateEvent(TransferDeleteTemplateEvent transferDeleteTemplateEvent) {
        if (mo85238W2() == transferDeleteTemplateEvent.getTemplateId()) {
            int state = transferDeleteTemplateEvent.getState();
            if (state == 10) {
                mo85311I3();
            } else if (state == 20) {
                this.f84273G.setDeleteTransferTemplateEvent((TransferDeleteTemplateEvent) null);
                C32297d.m95161i(this, getString(C10328q.f28956f2), C32297d.f79706b, new C39823z(this));
            } else if (state == 30) {
                this.f84273G.setDeleteTransferTemplateEvent((TransferDeleteTemplateEvent) null);
                mo85321a3();
                C32297d.m95153a(this);
            } else if (state == 40) {
                this.f84273G.setDeleteTransferTemplateEvent((TransferDeleteTemplateEvent) null);
                mo85321a3();
                C32297d.m95154b(this, C27950a.m86284a(transferDeleteTemplateEvent.getErrorKey()));
            }
        }
    }

    @C41452l
    public void onModifyTemplateResponse(ModifyTransferTemplateEvent modifyTransferTemplateEvent) {
        if ((modifyTransferTemplateEvent.template.getId() == null && mo85238W2() == -1) || (modifyTransferTemplateEvent.template.getId() != null && modifyTransferTemplateEvent.template.getId().equals(Long.valueOf(mo85238W2())))) {
            int state = modifyTransferTemplateEvent.getState();
            if (state == 10) {
                mo85311I3();
            } else if (state == 20) {
                this.f84273G.setModifyTransferTemplateEvent((ModifyTransferTemplateEvent) null);
                C32297d.m95161i(this, getString(C10328q.transfer_template_saved_successfully), C32297d.f79706b, new C39823z(this));
            } else if (state == 30) {
                this.f84273G.setModifyTransferTemplateEvent((ModifyTransferTemplateEvent) null);
                mo85321a3();
                C32297d.m95153a(this);
            } else if (state == 40) {
                this.f84273G.setModifyTransferTemplateEvent((ModifyTransferTemplateEvent) null);
                mo85321a3();
                C32297d.m95154b(this, C27950a.m86284a(modifyTransferTemplateEvent.getErrorKey()));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f84274H, this);
        this.f84273G.requestModifyTransferTemplateEvent();
        this.f84273G.requestDeleteTransferTemplateEvent();
        this.f84273G.requestTerminateDDSTOEvent();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f84274H, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p3 */
    public abstract void mo85267p3();

    /* access modifiers changed from: protected */
    /* renamed from: q3 */
    public void mo85331q3() {
        String str;
        if (this.f84312t0 > Utils.DOUBLE_EPSILON) {
            StringBuilder sb = new StringBuilder();
            sb.append(C32303f.m95204o(this.f84312t0));
            AccountLov accountLov = this.f84316x0;
            if (accountLov != null) {
                str = C32303f.m95198i(accountLov.getCcy(), true);
            } else {
                str = "";
            }
            sb.append(str);
            String sb2 = sb.toString();
            BogTextView bogTextView = this.f84276J.f68595L.f70287k;
            bogTextView.setText(getString(C10328q.common_text_commission) + ": " + sb2);
            this.f84276J.f68595L.f70287k.setVisibility(0);
            return;
        }
        this.f84276J.f68595L.f70287k.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: r3 */
    public void mo85332r3(String str) {
        if (str != null) {
            this.f84276J.f68623i.setVisibility(0);
            this.f84276J.f68623i.setTitleText(C27950a.m86284a(str));
            this.f84276J.f68623i.setFeedbackImage(C32300e0.m95169g(C10320i.f28685ab));
            return;
        }
        this.f84276J.f68623i.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: s3 */
    public abstract void mo85240s3(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public abstract void mo85241t3();

    /* renamed from: u3 */
    public void mo85333u3(boolean z) {
        mo85246l3(!z);
        mo85313Q2();
        mo85322c3();
        mo85240s3(z);
        mo85267p3();
        mo85242v3(z);
        mo85243y3();
        mo85241t3();
        mo85261X2();
        this.f84276J.f68595L.f70293q.setOnClickListener(new C34891d());
        this.f84276J.f68595L.f70290n.setOnClickListener(new C34892e());
        this.f84276J.f68595L.f70281e.setOnClickListener(new C34894f());
        this.f84276J.f68595L.f70285i.setOnClickListener(new C34895g());
    }

    /* access modifiers changed from: protected */
    /* renamed from: v3 */
    public abstract void mo85242v3(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: x3 */
    public void mo85334x3(String str) {
        C13310d dVar = new C13310d();
        dVar.mo35648c2(getResources().getString(C10328q.f28931K0));
        dVar.mo35647a2(C13310d.C13312b.TITLE_TWO_BUTTON);
        dVar.mo35639Q1(getResources().getString(C10328q.f28923E1));
        dVar.mo35646Z1(getResources().getString(C10328q.f28924F0));
        dVar.mo35645Y1(new C39795a0(this, str, dVar));
        dVar.mo35642U1(getResources().getString(C10328q.f28932M0));
        dVar.mo35641T1(new C39797b0(dVar));
        dVar.mo4576A1(getSupportFragmentManager(), "Alert");
    }

    /* access modifiers changed from: protected */
    /* renamed from: y3 */
    public abstract void mo85243y3();

    /* renamed from: z1 */
    public String mo38120z1() {
        if ("STO".equals(this.f84308p0)) {
            return getString(C10328q.header_text_automatics);
        }
        return getString(C10328q.header_text_transfers);
    }

    /* access modifiers changed from: protected */
    /* renamed from: z3 */
    public void mo85335z3(boolean z) {
        this.f84276J.f68606W.setVisibility(z ? 0 : 8);
    }
}

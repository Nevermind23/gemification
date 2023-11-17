package p341ge.bog.mobilebank.p975ui.activities;

import a81.C30531ac;
import a81.C30786tb;
import a81.C30799ub;
import a81.C30812vb;
import a81.C30825wb;
import a81.C30838xb;
import a81.C30851yb;
import a81.C30864zb;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.activity.result.C0173b;
import com.airbnb.lottie.LottieAnimationView;
import com.google.gson.C5490d;
import com.google.gson.Gson;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import de1.C40640a;
import g91.C32289b0;
import g91.C32297d;
import g91.C32298d0;
import g91.C32299e;
import g91.C32303f;
import g91.C32335t0;
import g91.C32343x;
import g91.C32359z0;
import gd1.C40992a;
import id0.C25179a;
import id0.C25180b;
import java.io.File;
import java.net.URLEncoder;
import jd0.C25383a;
import jg1.C41438c;
import jg1.C41452l;
import l81.C37112h;
import org.parceler.C42035e;
import p189o0.C7357a;
import p341ge.bog.mobilebank.cleanarch.moremenu.presentation.PackageType;
import p341ge.bog.mobilebank.eventbus.events.FeatureFeedBackEvent;
import p341ge.bog.mobilebank.eventbus.events.ModifyTransferTemplateEvent;
import p341ge.bog.mobilebank.model.Client;
import p341ge.bog.mobilebank.model.TransferHistoryItem;
import p341ge.bog.mobilebank.model.TransferTemplateObject;
import p341ge.bog.mobilebank.p975ui.views.widgets.SpecialAlignedTitleValueView;
import p341ge.bog.mobilebank.transfers.model.TransferForm;
import p366bk.C10319h;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10327p;
import p366bk.C10328q;
import p90.C27306g2;
import q31.C38125h;
import q81.C38194r;
import r90.C27950a;

/* renamed from: ge.bog.mobilebank.ui.activities.TransferResultActivity */
public class TransferResultActivity extends C35477q0 {

    /* renamed from: o0 */
    static int f85557o0;

    /* renamed from: G */
    private C27306g2 f85558G;

    /* renamed from: H */
    private int f85559H;

    /* renamed from: I */
    String f85560I;

    /* renamed from: J */
    String f85561J;

    /* renamed from: K */
    String f85562K;

    /* renamed from: L */
    String f85563L;

    /* renamed from: M */
    String f85564M;

    /* renamed from: N */
    String f85565N;

    /* renamed from: O */
    String f85566O;

    /* renamed from: P */
    String f85567P;

    /* renamed from: Q */
    String f85568Q;

    /* renamed from: R */
    String f85569R;

    /* renamed from: S */
    String f85570S;

    /* renamed from: T */
    String f85571T;

    /* renamed from: U */
    long f85572U;

    /* renamed from: V */
    String f85573V;

    /* renamed from: W */
    TransferTemplateObject f85574W;

    /* renamed from: X */
    TransferHistoryItem f85575X;

    /* renamed from: Y */
    C37112h f85576Y;

    /* renamed from: Z */
    private String f85577Z;

    /* renamed from: a0 */
    private String f85578a0;

    /* renamed from: b0 */
    private String f85579b0;

    /* renamed from: c0 */
    private String f85580c0;

    /* renamed from: d0 */
    private String f85581d0;

    /* renamed from: e0 */
    private String f85582e0;

    /* renamed from: f0 */
    private String f85583f0;

    /* renamed from: g0 */
    private Boolean f85584g0;

    /* renamed from: h0 */
    private Handler f85585h0 = new Handler();

    /* renamed from: i0 */
    protected Client f85586i0;

    /* renamed from: j0 */
    protected C41438c f85587j0;

    /* renamed from: k0 */
    private Runnable f85588k0 = new C30786tb(this);

    /* renamed from: l0 */
    C25180b f85589l0;

    /* renamed from: m0 */
    C25179a f85590m0;

    /* renamed from: n0 */
    int[] f85591n0 = {C10327p.ui_success, C10327p.ui_success_1, C10327p.ui_success_2, C10327p.ui_success_3};

    /* renamed from: L2 */
    private void m104892L2() {
        this.f85558G.f68800r.setVisibility(0);
        this.f85558G.f68796n.setVisibility(8);
        this.f85558G.f68806x.setVisibility(8);
        this.f85558G.f68782C.setVisibility(8);
        this.f85558G.f68800r.setText(C32303f.m95197h(this.f85563L));
    }

    /* renamed from: M2 */
    private void m104893M2() {
        this.f85558G.f68788f.setVisibility(8);
        this.f85590m0.mo63717a();
    }

    /* renamed from: N2 */
    private void m104894N2() {
        if (this.f85589l0 != null && this.f85590m0 != null) {
            this.f85558G.f68788f.setCloseButtonClickListener(new C30838xb(this));
            this.f85558G.f68788f.setOnClickListener(new C30851yb(this));
            mo86438k1(this.f85589l0.mo63718a().mo95072K(C40640a.m117458b()).mo95063B(C40992a.m118827a()).mo95070I(new C30864zb(this), new C30531ac(this)));
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: O2 */
    public /* synthetic */ void m104895O2(View view) {
        m104893M2();
    }

    /* access modifiers changed from: private */
    /* renamed from: P2 */
    public /* synthetic */ void m104896P2(View view) {
        m104904X2();
    }

    /* access modifiers changed from: private */
    /* renamed from: Q2 */
    public /* synthetic */ void m104897Q2(C25383a aVar) {
        if (aVar.mo63973d()) {
            this.f85558G.f68788f.setInfoText(C27950a.m86284a(aVar.mo63971b()));
            this.f85558G.f68788f.setShowMoreText(C27950a.m86284a(aVar.mo63970a()));
            this.f85558G.f68788f.setBannerImage(C32298d0.m95162a(aVar.mo63972c()));
            this.f85558G.f68788f.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: R2 */
    public /* synthetic */ void m104898R2() {
        this.f85586i0.requestFeatureFeedback(false);
    }

    /* access modifiers changed from: private */
    /* renamed from: S2 */
    public /* synthetic */ void m104899S2() {
        this.f85576Y.mo90044b(this.f85591n0[f85557o0]);
        int i = f85557o0 + 1;
        f85557o0 = i;
        if (i == 3) {
            f85557o0 = 0;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: T2 */
    public /* synthetic */ void m104900T2(View view) {
        m104903W2();
    }

    /* access modifiers changed from: private */
    /* renamed from: U2 */
    public /* synthetic */ void m104901U2(View view) {
        m104902V2();
    }

    /* renamed from: V2 */
    private void m104902V2() {
        if (this.f85572U >= 0 && this.f85575X != null) {
            try {
                Gson b = new C5490d().mo18204c().mo18203b();
                C32303f.m95195f(C32303f.m95192c(false, this.f85572U + "") + "&transferEntity=" + URLEncoder.encode(b.mo18181w(this.f85575X), "UTF-8"), this, getString(C10328q.f28968x1) + ".pdf", "application/pdf");
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: W2 */
    private void m104903W2() {
        TransferForm.startWith((Activity) this, "STO", "CREATE").setItemKey(this.f85572U).setPrintFormType("OUT_TRANSFER").start();
    }

    /* renamed from: X2 */
    private void m104904X2() {
        C38125h.m112238c(this).mo91616m((PackageType) null, false, (String) null, this, (C0173b) null);
    }

    /* renamed from: Y2 */
    private void m104905Y2() {
        this.f85586i0.modifyTransferTemplate(true, this.f85574W, (File) null, (String) null);
    }

    /* renamed from: Z2 */
    private void m104906Z2() {
        this.f85558G.f68784E.setOnClickListener(new C30812vb(this));
        this.f85558G.f68785F.setOnClickListener(new C30825wb(this));
    }

    /* renamed from: a3 */
    private void m104907a3() {
        boolean z;
        if (this.f85584g0.booleanValue()) {
            this.f85558G.f68789g.setImageResource(C10320i.ic_result_process);
            this.f85558G.f68790h.setTextColor(C32335t0.m95358c(this));
        } else {
            m104894N2();
        }
        int i = this.f85559H;
        if (i == 0) {
            m104892L2();
        } else if (i == 1) {
            this.f85558G.f68782C.setVisibility(8);
        } else if (i == 3) {
            m104892L2();
            this.f85558G.f68797o.setVisibility(0);
            this.f85558G.f68797o.setTitleText(getString(C10328q.total_income_amount));
            this.f85558G.f68797o.setValueText(this.f85569R);
            if (this.f85571T == null) {
                this.f85558G.f68790h.setText(getString(C10328q.conversion_success));
            }
            this.f85558G.f68798p.setVisibility(0);
            this.f85558G.f68798p.setTitleText(getString(C10328q.conversion_rate));
            this.f85558G.f68798p.setValueText(this.f85570S);
            this.f85558G.f68780A.setVisibility(8);
        } else if (i == 4) {
            if (this.f85578a0 != null) {
                this.f85558G.f68801s.setVisibility(0);
                this.f85558G.f68801s.setTitleText(getString(C10328q.intermidiary_bank));
                this.f85558G.f68801s.setValueText(this.f85578a0);
            }
            if (this.f85579b0 != null) {
                this.f85558G.f68792j.setVisibility(0);
                this.f85558G.f68792j.setTitleText(getString(C10328q.additional_info));
                this.f85558G.f68792j.setValueText(this.f85579b0);
            }
            this.f85558G.f68794l.setVisibility(8);
        }
        String str = this.f85577Z;
        if (str != null && str.length() > 0) {
            this.f85558G.f68787e.setVisibility(0);
            this.f85558G.f68787e.setTitleText(getString(C10328q.cadastral_code));
            this.f85558G.f68787e.setValueText(this.f85577Z);
        }
        this.f85558G.f68795m.setTitleText(getString(C10328q.transfer_details_bank));
        if (this.f85559H == 4) {
            this.f85558G.f68795m.setValueText(this.f85565N);
        } else {
            this.f85558G.f68795m.setValueText(C32299e.m95165c(this.f85565N));
        }
        String str2 = this.f85565N;
        if (str2 != null) {
            int a = C32299e.m95163a(str2);
            C32289b0.m95095g(this.f85558G.f68794l, Integer.valueOf(a));
            ImageView imageView = this.f85558G.f68794l;
            if (a != -1) {
                z = true;
            } else {
                z = false;
            }
            C32343x.m95477p1(imageView, z);
        }
        SpecialAlignedTitleValueView specialAlignedTitleValueView = this.f85558G.f68799q;
        int i2 = C10328q.transfers_title_account;
        specialAlignedTitleValueView.setTitleText(getString(i2));
        this.f85558G.f68799q.setValueText(this.f85562K);
        this.f85558G.f68806x.setTitleText(getString(C10328q.transfers_title_receiver));
        this.f85558G.f68806x.setValueText(this.f85564M);
        this.f85558G.f68807y.setTitleText(getString(i2));
        this.f85558G.f68807y.setValueText(this.f85560I);
        this.f85558G.f68808z.setText(C32303f.m95197h(this.f85561J));
        this.f85558G.f68782C.setTitleText(getString(C10328q.transfers_transfer_type));
        this.f85558G.f68782C.setValueText(this.f85566O);
        this.f85558G.f68781B.setTitleText(getString(C10328q.transfers_title_subject));
        this.f85558G.f68781B.setValueText(this.f85567P);
        this.f85558G.f68793k.setText(this.f85568Q + C32303f.m95198i(this.f85561J, true));
        this.f85558G.f68780A.setTitleText(getString(C10328q.common_text_commission));
        String str3 = this.f85573V;
        if (str3 != null) {
            this.f85558G.f68780A.setValueText(str3);
        } else {
            this.f85558G.f68780A.setVisibility(8);
        }
        if (!TextUtils.isEmpty(this.f85580c0)) {
            this.f85558G.f68805w.setVisibility(0);
            this.f85558G.f68805w.setTitleText(getString(C10328q.recipient_country));
            this.f85558G.f68805w.setValueText(this.f85580c0);
        }
        if (!TextUtils.isEmpty(this.f85581d0)) {
            this.f85558G.f68804v.setVisibility(0);
            this.f85558G.f68804v.setTitleText(getString(C10328q.recipient_city));
            this.f85558G.f68804v.setValueText(this.f85581d0);
        }
        if (!TextUtils.isEmpty(this.f85582e0)) {
            this.f85558G.f68803u.setVisibility(0);
            this.f85558G.f68803u.setTitleText(getString(C10328q.recipient_address));
            this.f85558G.f68803u.setValueText(this.f85582e0);
        }
        if (this.f85559H == 4 && !TextUtils.isEmpty(this.f85583f0)) {
            this.f85558G.f68802t.setVisibility(0);
            this.f85558G.f68802t.setTitleText(getString(C10328q.common_text_operation_type));
            this.f85558G.f68802t.setValueText(this.f85583f0);
        }
    }

    /* renamed from: b3 */
    private void m104908b3() {
        this.f85585h0.postDelayed(this.f85588k0, 1000);
    }

    /* renamed from: c3 */
    public static void m104909c3(Context context, int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, TransferTemplateObject transferTemplateObject, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, TransferHistoryItem transferHistoryItem, Boolean bool) {
        m104910d3(context, i, l, str, str2, str3, str4, str5, str6, str7, str8, str9, str10, transferTemplateObject, str11, str12, str13, str14, str15, str16, str17, str18, str19, transferHistoryItem, "", bool);
    }

    /* renamed from: d3 */
    public static void m104910d3(Context context, int i, Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, TransferTemplateObject transferTemplateObject, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, TransferHistoryItem transferHistoryItem, String str20, Boolean bool) {
        Context context2 = context;
        Intent intent = new Intent(context, TransferResultActivity.class);
        int i2 = i;
        intent.putExtra("TRANSFER_TYPE", i);
        intent.putExtra("DOCUMENT_KEY", l == null ? -1L : l);
        String str21 = str;
        intent.putExtra("SOURCE_ACCOUNT_NAME", str);
        String str22 = str2;
        intent.putExtra("SOURCE_ACCOUNT_CCY", str2);
        String str23 = str3;
        intent.putExtra("DESTINATION_ACCOUNT", str3);
        String str24 = str4;
        intent.putExtra("DESTINATION_CCY", str4);
        String str25 = str5;
        intent.putExtra("DESTINATION_OWNER", str5);
        String str26 = str6;
        intent.putExtra("DESTINATION_BANK_CODE", str6);
        String str27 = str7;
        intent.putExtra("BANK_TRANSFER_TYPE", str7);
        String str28 = str8;
        intent.putExtra("TRANSFER_SUBJECT", str8);
        intent.putExtra("CONVERSION_RATE", str13);
        String str29 = str9;
        intent.putExtra("TRANSFER_AMOUNT", str9);
        intent.putExtra("TRANSFER_TEMPLATE_OBJ", C42035e.m122121c(transferTemplateObject));
        if (transferHistoryItem != null) {
            intent.putExtra("TRANSFER_ENTITY", C42035e.m122121c(transferHistoryItem));
        }
        intent.putExtra("TRANSFER_COMMISSION", str10);
        intent.putExtra("DICT_KEY", str11);
        intent.putExtra("RECEIVE_AMOUNT", str12);
        intent.putExtra("INTERMIDIARY_BANK", str14);
        intent.putExtra("ADDITIONAL_INFO", str15);
        intent.putExtra("BENEFICIARY_COUNTRY", str16);
        intent.putExtra("BENEFICIARY_CITY", str17);
        intent.putExtra("BENEFICIARY_ADDRESS", str18);
        intent.putExtra("cadastre_code", str20);
        intent.putExtra("IS_WARNING", bool);
        context.startActivity(intent);
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        C27306g2 d = C27306g2.m84530d(getLayoutInflater());
        this.f85558G = d;
        super.mo70996D2(bundle, d);
        C37112h hVar = new C37112h();
        this.f85576Y = hVar;
        hVar.mo90043a(this, this.f85591n0);
        this.f85559H = getIntent().getIntExtra("TRANSFER_TYPE", 0);
        this.f85572U = getIntent().getLongExtra("DOCUMENT_KEY", 0);
        this.f85560I = getIntent().getStringExtra("SOURCE_ACCOUNT_NAME");
        this.f85561J = getIntent().getStringExtra("SOURCE_ACCOUNT_CCY");
        this.f85562K = getIntent().getStringExtra("DESTINATION_ACCOUNT");
        this.f85563L = getIntent().getStringExtra("DESTINATION_CCY");
        this.f85564M = getIntent().getStringExtra("DESTINATION_OWNER");
        this.f85565N = getIntent().getStringExtra("DESTINATION_BANK_CODE");
        this.f85566O = getIntent().getStringExtra("BANK_TRANSFER_TYPE");
        this.f85567P = getIntent().getStringExtra("TRANSFER_SUBJECT");
        this.f85568Q = getIntent().getStringExtra("TRANSFER_AMOUNT");
        this.f85574W = (TransferTemplateObject) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_TEMPLATE_OBJ"));
        this.f85575X = (TransferHistoryItem) C42035e.m122119a(getIntent().getParcelableExtra("TRANSFER_ENTITY"));
        this.f85573V = getIntent().getStringExtra("TRANSFER_COMMISSION");
        this.f85571T = getIntent().getStringExtra("DICT_KEY");
        this.f85569R = getIntent().getStringExtra("RECEIVE_AMOUNT");
        this.f85570S = getIntent().getStringExtra("CONVERSION_RATE");
        this.f85577Z = getIntent().getStringExtra("cadastre_code");
        this.f85578a0 = getIntent().getStringExtra("INTERMIDIARY_BANK");
        this.f85579b0 = getIntent().getStringExtra("ADDITIONAL_INFO");
        this.f85580c0 = getIntent().getStringExtra("BENEFICIARY_COUNTRY");
        this.f85581d0 = getIntent().getStringExtra("BENEFICIARY_CITY");
        this.f85582e0 = getIntent().getStringExtra("BENEFICIARY_ADDRESS");
        this.f85583f0 = getIntent().getStringExtra("FOREIGN_TRANSFER_OPERATION_TYPE");
        this.f85584g0 = Boolean.valueOf(getIntent().getBooleanExtra("IS_WARNING", false));
        m104906Z2();
        String str = this.f85571T;
        if (str != null) {
            this.f85558G.f68790h.setText(C27950a.m86284a(str));
        }
        if (this.f85572U < 0) {
            this.f85558G.f68785F.setAlpha(0.5f);
        }
        C7357a.m28044b(this).mo21731d(new Intent("ge.bog.mobilebank.products.presentation.products.refresh_products"));
        this.f85586i0.forceUpdateData();
        m104907a3();
        if (C32359z0.m95569g0()) {
            new Handler().postDelayed(new C30799ub(this), 500);
        }
        LottieAnimationView lottieAnimationView = (LottieAnimationView) findViewById(C10322k.payment_result_image);
        if (lottieAnimationView == null) {
            return;
        }
        if (C32303f.m95187G()) {
            lottieAnimationView.setImageResource(C10320i.ic_success_football);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) lottieAnimationView.getLayoutParams();
            layoutParams.height = getResources().getDimensionPixelSize(C10319h.transfer_payment_success_icon_size);
            lottieAnimationView.setLayoutParams(layoutParams);
        } else if (C32303f.m95186F()) {
            lottieAnimationView.setImageResource(C10320i.ic_basketball_success);
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) lottieAnimationView.getLayoutParams();
            layoutParams2.height = getResources().getDimensionPixelSize(C10319h.transfer_payment_success_icon_size);
            lottieAnimationView.setLayoutParams(layoutParams2);
        } else {
            lottieAnimationView.setAnimation(C10327p.anim_state_success);
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10001 && i2 == -1 && intent.getBooleanExtra("WIZARD_NEXT_BTN_CLICKED", false)) {
            this.f85574W.setTemplateName(intent.getStringArrayListExtra("WIZARD_COLLECTED_VALUES").get(0));
            m104905Y2();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        this.f85585h0.removeCallbacks(this.f85588k0);
    }

    @C41452l
    public void onFeatureFeedbackResponse(FeatureFeedBackEvent featureFeedBackEvent) {
        if (featureFeedBackEvent.getState() == 20) {
            C38194r.m112360A(this, featureFeedBackEvent, FeatureFeedBackEvent.Location.TRANSFERS);
        }
    }

    @C41452l
    public void onModifyTemplateResponse(ModifyTransferTemplateEvent modifyTransferTemplateEvent) {
        int state = modifyTransferTemplateEvent.getState();
        if (state == 10) {
            this.f85558G.f68783D.setVisibility(0);
        } else if (state == 20) {
            this.f85558G.f68783D.setVisibility(8);
            this.f85586i0.setModifyTransferTemplateEvent((ModifyTransferTemplateEvent) null);
            C32297d.m95160h(this, getString(C10328q.transfer_template_saved_successfully));
        } else if (state == 30) {
            this.f85586i0.setModifyTransferTemplateEvent((ModifyTransferTemplateEvent) null);
            this.f85558G.f68783D.setVisibility(8);
        } else if (state == 40) {
            this.f85586i0.setModifyTransferTemplateEvent((ModifyTransferTemplateEvent) null);
            this.f85558G.f68783D.setVisibility(8);
            C32297d.m95154b(this, C27950a.m86284a(modifyTransferTemplateEvent.getErrorKey()));
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i == 10016 && C32303f.m95190a(iArr)) {
            m104902V2();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.enableIntercept();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        C32343x.m95423W0(this.f85587j0, this);
        m104908b3();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        C32343x.m95489t1(this.f85587j0, this);
    }

    /* renamed from: z1 */
    public String mo38120z1() {
        return getString(C10328q.header_text_transfers);
    }
}

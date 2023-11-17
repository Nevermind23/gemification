package p341ge.bog.mobilebank.p975ui.wizard.activities;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.fragment.app.C1493e0;
import androidx.fragment.app.FragmentManager;
import c91.C31355y;
import com.github.mikephil.charting.utils.Utils;
import com.medallia.digital.mobilesdk.MedalliaDigital;
import g91.C32290b1;
import g91.C32355x0;
import g91.C32359z0;
import iu0.C36546y;
import java.util.ArrayList;
import nf1.C41795b;
import nf1.C41798c;
import p341ge.bog.mobilebank.p975ui.activities.C35388f2;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.views.widgets.ArrowLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.rest.manager.PreferencesApiManager;
import p341ge.bog.mobilebank.transfers.model.TransferContact;
import p366bk.C10313b;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10323l;
import p366bk.C10324m;
import p366bk.C10329r;

/* renamed from: ge.bog.mobilebank.ui.wizard.activities.c */
public abstract class C35862c extends C35388f2 implements View.OnClickListener, ViewTreeObserver.OnGlobalLayoutListener {
    /* access modifiers changed from: protected */

    /* renamed from: F */
    public BogButton f86752F;

    /* renamed from: G */
    protected BogButton f86753G;

    /* renamed from: H */
    protected BogButton f86754H;

    /* renamed from: I */
    protected FrameLayout f86755I;

    /* renamed from: J */
    protected LinearLayout f86756J;

    /* renamed from: K */
    protected FrameLayout f86757K;

    /* renamed from: L */
    protected ArrowLayout f86758L;

    /* renamed from: M */
    protected BogButton f86759M;

    /* renamed from: N */
    protected FrameLayout f86760N;

    /* renamed from: O */
    protected View f86761O;

    /* renamed from: P */
    protected View f86762P;

    /* renamed from: Q */
    protected BogProgressBar f86763Q;

    /* renamed from: R */
    protected View f86764R;

    /* renamed from: S */
    protected BogTextView f86765S;

    /* renamed from: T */
    protected ViewGroup f86766T;

    /* renamed from: U */
    protected int f86767U;

    /* renamed from: V */
    protected View f86768V;

    /* renamed from: W */
    protected boolean f86769W;
    /* access modifiers changed from: private */

    /* renamed from: X */
    public boolean f86770X;
    /* access modifiers changed from: private */

    /* renamed from: Y */
    public boolean f86771Y;
    /* access modifiers changed from: private */

    /* renamed from: Z */
    public boolean f86772Z;
    /* access modifiers changed from: private */

    /* renamed from: a0 */
    public boolean f86773a0;

    /* renamed from: b0 */
    private ArrayList f86774b0;

    /* renamed from: c0 */
    protected int f86775c0;

    /* renamed from: d0 */
    protected C35866d f86776d0;

    /* renamed from: e0 */
    protected boolean f86777e0;

    /* renamed from: f0 */
    protected boolean f86778f0;

    /* renamed from: g0 */
    protected View f86779g0;

    /* renamed from: h0 */
    protected BogInputLayout f86780h0;

    /* renamed from: i0 */
    private Handler f86781i0;

    /* renamed from: j0 */
    private int f86782j0;

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.c$a */
    class C35863a implements ViewTreeObserver.OnGlobalLayoutListener {
        C35863a() {
        }

        public void onGlobalLayout() {
            FrameLayout frameLayout = C35862c.this.f86760N;
            C32290b1.m95124n(frameLayout, frameLayout.getHeight());
            C32355x0.m95523n(C35862c.this.f86760N, this);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.c$b */
    class C35864b implements C41798c {
        C35864b() {
        }

        /* renamed from: a */
        public void mo87974a(boolean z) {
            C35862c.this.f86773a0 = z;
            if (C35862c.this.f86771Y) {
                if (C35862c.this.f86770X && !z) {
                    C35862c.this.f86770X = false;
                    C35862c.this.f86771Y = false;
                    C35862c.this.mo87963n3(0, true);
                }
            } else if (C35862c.this.f86770X && !z) {
                C35862c.this.f86770X = false;
                C35862c cVar = C35862c.this;
                cVar.mo87963n3(cVar.mo87856P2(), true);
            } else if (C35862c.this.f86772Z && !z) {
                C35862c.this.f86772Z = false;
                C35862c cVar2 = C35862c.this;
                cVar2.mo87963n3(cVar2.mo87858Q2(), true);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.c$c */
    class C35865c implements Runnable {

        /* renamed from: d */
        final /* synthetic */ int f86785d;

        C35865c(int i) {
            this.f86785d = i;
        }

        public void run() {
            C35862c.this.mo87953I2(this.f86785d);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.wizard.activities.c$d */
    public class C35866d {

        /* renamed from: a */
        private int f86787a;

        /* renamed from: b */
        private C31355y f86788b;
        /* access modifiers changed from: private */

        /* renamed from: c */
        public ArrayList f86789c;

        /* renamed from: d */
        private FragmentManager f86790d;

        /* renamed from: e */
        private int f86791e;

        C35866d(FragmentManager fragmentManager, int i) {
            this.f86790d = fragmentManager;
            this.f86791e = i;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public int m106702f() {
            int i = this.f86787a;
            do {
                i++;
                if (i >= this.f86789c.size() || !((C31355y) this.f86789c.get(i)).mo71728l1()) {
                    return i;
                }
                i++;
                break;
            } while (!((C31355y) this.f86789c.get(i)).mo71728l1());
            return i;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public C31355y mo87976c() {
            return this.f86788b;
        }

        /* renamed from: d */
        public int mo87977d() {
            return this.f86787a;
        }

        /* renamed from: e */
        public ArrayList mo87978e() {
            return this.f86789c;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: g */
        public void mo87979g(int i) {
            this.f86787a = i;
            C1493e0 p = this.f86790d.mo4428p();
            C31355y yVar = (C31355y) this.f86789c.get(i);
            this.f86788b = yVar;
            yVar.mo71667i1(this.f86789c);
            p.mo4639r(this.f86791e, this.f86788b);
            p.mo4516j();
        }

        /* renamed from: h */
        public void mo87980h(ArrayList arrayList) {
            this.f86789c = arrayList;
        }
    }

    /* renamed from: K2 */
    private View m106650K2(Activity activity) {
        return ((ViewGroup) activity.findViewById(16908290)).getChildAt(0);
    }

    /* renamed from: M2 */
    private TransferContact m106651M2() {
        if (m106654W2()) {
            return ((BankTransferWizardActivity) this).mo87882y4();
        }
        return null;
    }

    /* renamed from: T2 */
    private void m106652T2() {
        this.f86760N.setAlpha(Utils.FLOAT_EPSILON);
        this.f86765S.setAlpha(Utils.FLOAT_EPSILON);
    }

    /* renamed from: U2 */
    private boolean m106653U2(int i) {
        if (i >= this.f86774b0.size() || !((C31355y) this.f86774b0.get(i)).mo71549G1()) {
            return false;
        }
        C32290b1.m95112b(this.f86762P);
        return true;
    }

    /* renamed from: W2 */
    private boolean m106654W2() {
        return (this instanceof BankTransferWizardActivity) && ((BankTransferWizardActivity) this).mo87851D4();
    }

    /* renamed from: Y2 */
    private void m106655Y2(String str) {
        if (m106654W2() && m106651M2() != null) {
            C36546y.m108282F().mo27156w("transfers", str, "wizard_close", m106651M2().getConnectionType().mo67882b());
        } else if ((this instanceof BankTransferWizardActivity) || (this instanceof DomesticTransferWizardActivity)) {
            C36546y.m108282F().mo27152s("transfers", str, "wizard_close");
        }
    }

    /* renamed from: Z2 */
    private void m106656Z2(int i) {
        this.f86781i0.postDelayed(new C35865c(i), 200);
    }

    /* renamed from: o3 */
    private void m106657o3() {
        C41795b.m121161c(this, new C35864b());
    }

    /* renamed from: r3 */
    private void m106658r3() {
        this.f86763Q = (BogProgressBar) findViewById(C10322k.base_wizard_next_progressbar);
        this.f86780h0 = (BogInputLayout) findViewById(C10322k.input_type_preserver_layout);
        this.f86762P = findViewById(C10322k.base_wizard_background_dim_down);
        this.f86761O = findViewById(C10322k.base_wizard_background_dim_upper);
        this.f86760N = (FrameLayout) findViewById(C10322k.base_wizard_fragment_container);
        this.f86759M = (BogButton) findViewById(C10322k.base_wizard_abc_button);
        this.f86755I = (FrameLayout) findViewById(C10322k.base_wizard_prev_button_layout);
        this.f86753G = (BogButton) findViewById(C10322k.base_wizard_prev_button);
        this.f86752F = (BogButton) findViewById(C10322k.base_wizard_next_button);
        this.f86764R = findViewById(C10322k.base_wizard_close_button);
        this.f86765S = (BogTextView) findViewById(C10322k.base_wizard_title_tv);
        this.f86757K = (FrameLayout) findViewById(C10322k.base_wizard_arrow_layout_holder);
        this.f86758L = (ArrowLayout) findViewById(C10322k.base_wizard_arrow_layout);
        this.f86756J = (LinearLayout) findViewById(C10322k.base_wizard_fragment_content_holder);
        this.f86779g0 = m106650K2(this);
        this.f86768V = findViewById(C10322k.base_wizard_bottom_spring_gap);
        this.f86766T = (ViewGroup) findViewById(C10322k.base_wizard_toolbar);
        this.f86754H = (BogButton) findViewById(C10322k.base_wizard_save_button);
        this.f86752F.setOnClickListener(this);
        this.f86753G.setOnClickListener(this);
        this.f86764R.setOnClickListener(this);
        this.f86759M.setOnClickListener(this);
        this.f86754H.setOnClickListener(this);
        this.f86779g0.getViewTreeObserver().addOnGlobalLayoutListener(this);
        this.f86781i0 = new Handler();
    }

    /* renamed from: w3 */
    private void m106659w3(boolean z) {
        if (z) {
            this.f86760N.animate().alpha(1.0f);
            this.f86765S.animate().alpha(1.0f);
            return;
        }
        this.f86760N.setAlpha(1.0f);
        this.f86765S.setAlpha(1.0f);
    }

    /* renamed from: A3 */
    public void mo87848A3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: I2 */
    public void mo87953I2(int i) {
        C35866d dVar = this.f86776d0;
        if (dVar != null && dVar.mo87978e() != null && this.f86776d0.mo87978e().size() > i) {
            this.f86776d0.mo87979g(i);
            setTitle(((C31355y) this.f86774b0.get(i)).mo71706B1());
            m106659w3(((C31355y) this.f86774b0.get(i)).mo71725d2());
            if (((C31355y) this.f86774b0.get(i)).mo71549G1()) {
                ((C31355y) this.f86774b0.get(i)).mo71710M1(true);
            }
        }
    }

    /* renamed from: J2 */
    public void mo87954J2() {
        this.f86778f0 = true;
    }

    /* renamed from: L2 */
    public ArrowLayout mo87955L2() {
        return this.f86758L;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M1 */
    public int mo49479M1() {
        return super.mo49479M1();
    }

    /* renamed from: N2 */
    public int mo87922N2() {
        return this.f86776d0.mo87977d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: O1 */
    public void mo37451O1(Bundle bundle) {
        overridePendingTransition(0, 0);
        setContentView(C10324m.activity_wizard_base);
        m106658r3();
        this.f86767U = C32355x0.m95516g(C10319h.payment_wizard_input_layout_height);
        this.f86776d0 = new C35866d(getSupportFragmentManager(), C10322k.base_wizard_fragment_container);
        this.f86775c0 = getIntent().getIntExtra("WIZARD_PAGE_INDEX", 0);
        this.f86760N.getViewTreeObserver().addOnGlobalLayoutListener(new C35863a());
        m106657o3();
    }

    /* renamed from: O2 */
    public String mo87956O2() {
        int N2 = mo87922N2();
        if (N2 < 0 || N2 >= this.f86774b0.size()) {
            return null;
        }
        return ((C31355y) this.f86774b0.get(N2)).mo71705A1();
    }

    /* renamed from: P2 */
    public int mo87856P2() {
        return this.f86776d0.m106702f();
    }

    /* renamed from: Q */
    public void mo87857Q(int i) {
        mo87900k3(i);
        if (this.f86774b0.size() <= i) {
            return;
        }
        if (((C31355y) this.f86774b0.get(i)).mo71549G1()) {
            C32290b1.m95112b(this.f86752F);
        } else if (((C31355y) this.f86774b0.get(i)).mo67196J1() && ((C31355y) this.f86774b0.get(i)).mo71607t1() != null) {
            C32290b1.m95115e(((C31355y) this.f86774b0.get(i)).mo71607t1().getEditText());
        }
    }

    /* renamed from: Q2 */
    public int mo87858Q2() {
        return this.f86776d0.mo87977d() - 1;
    }

    /* renamed from: R2 */
    public void mo87957R2() {
        if (!this.f86773a0) {
            mo87963n3(0, true);
        } else if (m106653U2(0) || !this.f86773a0) {
            this.f86771Y = true;
            this.f86770X = true;
        } else {
            mo87963n3(0, true);
        }
    }

    /* renamed from: S2 */
    public void mo87860S2() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: U1 */
    public int mo53709U1() {
        if (PreferencesApiManager.getInstance().getThemeType() == 1) {
            return C10329r.TransparentActivityStyleSolo;
        }
        if (PreferencesApiManager.getInstance().getThemeType() == 2) {
            return C10329r.TransparentActivityStyleWealth;
        }
        return C10329r.TransparentActivityStyle;
    }

    /* renamed from: V2 */
    public void mo87958V2() {
        if (this.f86752F.isOrange()) {
            this.f86752F.setTextColor(-1);
        } else {
            this.f86752F.setTextColor(-16777216);
        }
        this.f86763Q.setVisibility(8);
        this.f86752F.setAlpha(1.0f);
    }

    /* renamed from: X2 */
    public void mo87861X2() {
    }

    /* renamed from: a3 */
    public void mo87864a3() {
    }

    /* renamed from: b3 */
    public void mo87959b3() {
        if (!this.f86773a0) {
            mo87963n3(mo87856P2(), true);
        } else if (m106653U2(mo87856P2()) || !this.f86773a0) {
            this.f86770X = true;
        } else {
            mo87963n3(mo87856P2(), true);
        }
    }

    /* renamed from: c3 */
    public void mo87960c3() {
        if (this.f86776d0.mo87977d() < this.f86774b0.size() - 1) {
            m106653U2(mo87856P2());
            mo87963n3(mo87856P2(), true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public boolean mo87866d3() {
        this.f86776d0.mo87977d();
        this.f86776d0.f86789c.size();
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo87867e3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo53121f3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public void mo87868g3() {
        mo53121f3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: h3 */
    public void mo87843h3() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: i3 */
    public void mo53122i3() {
        if (this.f86752F.isOrange()) {
            mo87861X2();
            if (mo87878t3()) {
                m106655Y2("next");
                mo87868g3();
            } else if (this.f86776d0.mo87977d() < this.f86776d0.f86789c.size() - 1) {
                mo87960c3();
            } else if (mo87879u3()) {
                mo87957R2();
            } else if (mo87866d3()) {
                mo87959b3();
            } else {
                m106655Y2("next");
                mo87868g3();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j3 */
    public void mo87844j3() {
        mo87961l3();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k3 */
    public void mo87900k3(int i) {
    }

    /* renamed from: l3 */
    public void mo87961l3() {
        if (this.f86776d0.mo87977d() <= 0) {
            return;
        }
        if (!this.f86773a0) {
            mo87963n3(mo87858Q2(), true);
        } else if (!m106653U2(mo87858Q2())) {
            mo87963n3(mo87858Q2(), true);
        } else {
            this.f86772Z = true;
        }
    }

    /* renamed from: m3 */
    public void mo87962m3() {
        m106652T2();
        m106656Z2(this.f86782j0);
    }

    /* renamed from: n3 */
    public void mo87963n3(int i, boolean z) {
        if (!m106653U2(i) && this.f86782j0 < this.f86774b0.size() && ((C31355y) this.f86774b0.get(this.f86782j0)).mo71707D1() != null) {
            this.f86780h0.setInputType(((C31355y) this.f86774b0.get(this.f86782j0)).mo71707D1().getInputType());
            C32290b1.m95115e(this.f86780h0.getEditText());
        }
        this.f86782j0 = i;
        mo87857Q(i);
        if (!z) {
            mo87953I2(i);
        } else if (this.f86776d0.mo87976c().mo71549G1()) {
            this.f86776d0.mo87976c().mo71727k1(Utils.FLOAT_EPSILON);
        } else {
            m106652T2();
            m106656Z2(i);
        }
    }

    public void onClick(View view) {
        if (view == this.f86764R) {
            m106655Y2("close");
            mo53121f3();
        } else if (view == this.f86752F) {
            mo53122i3();
        } else if (view == this.f86753G) {
            mo87844j3();
        } else if (view == this.f86759M) {
            mo87867e3();
        } else if (view == this.f86754H) {
            m106655Y2("save");
            mo53121f3();
        }
    }

    public void onGlobalLayout() {
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        overridePendingTransition(0, C10313b.slide_out_up);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        MedalliaDigital.disableIntercept();
    }

    /* renamed from: p3 */
    public void mo87965p3(boolean z) {
        this.f86752F.setOrange(z);
    }

    /* renamed from: q3 */
    public void mo87966q3(String str) {
        this.f86752F.setText(str);
    }

    /* renamed from: s3 */
    public void mo87967s3(ArrayList arrayList, boolean z) {
        this.f86774b0 = arrayList;
        if (this.f86775c0 < arrayList.size()) {
            ((C31355y) arrayList.get(this.f86775c0)).getArguments().putInt("WIZARD_INPUT_Y_POSITION", getIntent().getIntExtra("WIZARD_INPUT_Y_POSITION", 0));
        }
        this.f86776d0.mo87980h(arrayList);
        mo87843h3();
    }

    public void setTitle(CharSequence charSequence) {
        this.f86765S.setText(charSequence);
    }

    /* access modifiers changed from: protected */
    /* renamed from: t3 */
    public boolean mo87878t3() {
        int b = this.f86776d0.m106702f();
        if (b < 0 || b >= this.f86776d0.f86789c.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: u3 */
    public boolean mo87879u3() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v3 */
    public void mo87969v3() {
        if (this.f86757K.getVisibility() == 8) {
            this.f86757K.setVisibility(0);
            C32290b1.m95124n(this.f86761O, C32355x0.m95516g(C10319h.base_wizard_top_dim_height) + C32355x0.m95516g(C10319h.arrow_layout_height) + C32355x0.m95516g(C10319h.arrow_layout_margin_top) + C32355x0.m95516g(C10319h.arrow_layout_margin_bottom));
        }
    }

    /* renamed from: x3 */
    public void mo87970x3(boolean z) {
        if (z) {
            if (this.f86759M.getVisibility() != 0) {
                this.f86759M.setVisibility(0);
            }
        } else if (this.f86759M.getVisibility() == 0) {
            this.f86759M.setVisibility(4);
        }
    }

    /* renamed from: y3 */
    public void mo87971y3() {
        this.f86752F.setTextColor(0);
        this.f86763Q.setVisibility(0);
        this.f86752F.setAlpha(C32359z0.m95537H(C10323l.next_button_dim_alpha, this));
    }

    /* renamed from: z3 */
    public void mo87972z3(boolean z) {
        if (z) {
            if (this.f86768V.getVisibility() == 0) {
                this.f86768V.setVisibility(8);
                this.f86754H.setVisibility(0);
            }
        } else if (this.f86768V.getVisibility() == 8) {
            this.f86768V.setVisibility(0);
            this.f86754H.setVisibility(8);
        }
    }
}

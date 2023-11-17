package c91;

import android.animation.Animator;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32290b1;
import g91.C32355x0;
import g91.C32359z0;
import java.util.ArrayList;
import java.util.List;
import org.parceler.C42035e;
import p341ge.bog.mobilebank.p975ui.fragments.C35651n1;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogInputLayout;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.wizard.activities.C35862c;
import p341ge.bog.mobilebank.p975ui.wizard.model.WizardObject;
import p366bk.C10319h;
import p366bk.C10322k;

/* renamed from: c91.y */
public class C31355y extends C35651n1 {

    /* renamed from: d */
    private boolean f77881d;

    /* renamed from: e */
    public BogInputLayout f77882e;
    /* access modifiers changed from: protected */

    /* renamed from: f */
    public C35862c f77883f;

    /* renamed from: g */
    protected boolean f77884g;

    /* renamed from: h */
    protected LinearLayout f77885h;

    /* renamed from: i */
    protected ViewGroup f77886i;

    /* renamed from: j */
    protected boolean f77887j;

    /* renamed from: k */
    protected String f77888k;

    /* renamed from: l */
    protected RecyclerView f77889l;

    /* renamed from: m */
    protected FrameLayout f77890m;

    /* renamed from: n */
    protected BogTextView f77891n;

    /* renamed from: o */
    protected LinearLayout f77892o;

    /* renamed from: p */
    private boolean f77893p = true;

    /* renamed from: q */
    protected boolean f77894q = false;

    /* renamed from: r */
    private boolean f77895r = false;

    /* renamed from: s */
    private boolean f77896s = true;

    /* renamed from: t */
    boolean f77897t;

    /* renamed from: u */
    Animator.AnimatorListener f77898u = new C31358c();

    /* renamed from: c91.y$a */
    class C31356a implements Runnable {
        C31356a() {
        }

        public void run() {
            C31355y.this.f77883f.mo87962m3();
        }
    }

    /* renamed from: c91.y$b */
    class C31357b implements Animation.AnimationListener {
        C31357b() {
        }

        public void onAnimationEnd(Animation animation) {
            C31355y.this.mo71592K1();
        }

        public void onAnimationRepeat(Animation animation) {
        }

        public void onAnimationStart(Animation animation) {
        }
    }

    /* renamed from: c91.y$c */
    class C31358c implements Animator.AnimatorListener {
        C31358c() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            C31355y yVar = C31355y.this;
            yVar.f77897t = true;
            yVar.f77884g = false;
            yVar.f77883f.mo87954J2();
            C31355y.this.mo71558o1();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* renamed from: A1 */
    public String mo71705A1() {
        return mo71733r1().getString("WIZARD_PAGE_ID", "");
    }

    /* renamed from: B1 */
    public String mo71706B1() {
        if (mo71707D1() == null || TextUtils.isEmpty(mo71707D1().getPageTitle())) {
            return mo71733r1().getString("WIZARD_PAGE_TITLE", "");
        }
        return mo71707D1().getPageTitle();
    }

    /* renamed from: C1 */
    public List mo71621C1() {
        if (mo71707D1() == null || mo71707D1().getSelectorOptionPreviews() == null) {
            return mo71733r1().getStringArrayList("WIZARD_SELECTOR_OPTIONS");
        }
        return mo71707D1().getSelectorOptionPreviews();
    }

    /* renamed from: D1 */
    public WizardObject mo71707D1() {
        return (WizardObject) C42035e.m122119a(mo71733r1().getParcelable("WIZARD_OBJECT"));
    }

    /* access modifiers changed from: protected */
    /* renamed from: E1 */
    public boolean mo71586E1() {
        return this.f77895r;
    }

    /* renamed from: F1 */
    public boolean mo71625F1() {
        return false;
    }

    /* renamed from: G1 */
    public boolean mo71549G1() {
        return false;
    }

    /* renamed from: H1 */
    public boolean mo67195H1() {
        return mo71733r1().getBoolean("TRANSFER_WIZARD_IS_SKIPABLE", false);
    }

    /* renamed from: I1 */
    public boolean mo71708I1() {
        return mo71733r1().getBoolean("SKIP_PAGE_IF_IS_FILLED", false);
    }

    /* renamed from: J1 */
    public boolean mo67196J1() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: K1 */
    public void mo71592K1() {
    }

    /* renamed from: L1 */
    public void mo71709L1(WizardObject wizardObject) {
        mo71718V1(wizardObject.isSkippable());
        mo71723a2(Boolean.valueOf(wizardObject.isSkippableIfFilled()));
        mo71733r1().putParcelable("WIZARD_OBJECT", C42035e.m122121c(wizardObject));
    }

    /* renamed from: M1 */
    public void mo71710M1(boolean z) {
        this.f77881d = z;
    }

    /* renamed from: N1 */
    public void mo71711N1(boolean z) {
        this.f77896s = z;
    }

    /* renamed from: O1 */
    public void mo71712O1(boolean z) {
        this.f77895r = z;
    }

    /* renamed from: P1 */
    public void mo71713P1(int i) {
        mo71733r1().putInt("WIZARD_FRAGMENT_INDEX", i);
    }

    /* renamed from: Q1 */
    public void mo71714Q1(int i) {
        mo71733r1().putInt("WIZARD_INPUT_STYLE", i);
    }

    /* renamed from: R1 */
    public void mo71715R1(int i) {
        mo71733r1().putInt("WIZARD_INPUT_LIMIT", i);
    }

    /* renamed from: S1 */
    public void mo71716S1(String str) {
        mo71733r1().putString("WIZARD_INPUT_TITLE", str);
    }

    /* renamed from: T1 */
    public void mo71600T1(int i) {
        mo71733r1().putInt("WIZARD_INPUT_TYPE", i);
    }

    /* renamed from: U1 */
    public void mo71717U1(String str) {
        WizardObject D1 = mo71707D1();
        if (D1 != null) {
            D1.setValue(str);
        }
        mo71733r1().putString("WIZARD_INPUT_VALUE", str);
    }

    /* renamed from: V1 */
    public void mo71718V1(boolean z) {
        mo71733r1().putBoolean("TRANSFER_WIZARD_IS_SKIPABLE", z);
    }

    /* renamed from: W1 */
    public void mo71719W1(String str) {
        this.f77888k = str;
    }

    /* renamed from: X1 */
    public void mo71720X1(String str) {
        mo71733r1().putString("WIZARD_PAGE_ID", str);
    }

    /* renamed from: Y1 */
    public void mo71721Y1(String str) {
        mo71733r1().putString("WIZARD_PAGE_TITLE", str);
    }

    /* renamed from: Z1 */
    public void mo71722Z1(List list) {
        mo71733r1().putStringArrayList("WIZARD_SELECTOR_OPTIONS", new ArrayList(list));
    }

    /* renamed from: a2 */
    public void mo71723a2(Boolean bool) {
        mo71733r1().putBoolean("SKIP_PAGE_IF_IS_FILLED", bool.booleanValue());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b2 */
    public void mo71661b2(View view) {
        this.f77882e = (BogInputLayout) view.findViewById(C10322k.wizard_input_layout);
        this.f77886i = (ViewGroup) view.findViewById(C10322k.wizard_input_container);
        this.f77885h = (LinearLayout) view.findViewById(C10322k.wizard_selector_recycler_layout);
        this.f77889l = (RecyclerView) view.findViewById(C10322k.wizard_selector_recycler);
        this.f77892o = (LinearLayout) view.findViewById(C10322k.wizard_selector_recycler_padding_layout);
        this.f77890m = (FrameLayout) view.findViewById(C10322k.wizard_selector_title_layout);
        this.f77891n = (BogTextView) view.findViewById(C10322k.wizard_selector_title);
        if (!this.f77884g && mo71607t1() != null && mo71607t1().getEditText() != null && mo67196J1()) {
            C32290b1.m95115e(mo71607t1().getEditText());
        }
    }

    /* renamed from: c2 */
    public void mo71724c2() {
        if (mo67196J1() || mo71625F1()) {
            mo71607t1().setHintText(mo71737x1());
            mo71607t1().setInputType(mo71610y1());
            int v1 = mo71736v1();
            if (v1 > 0) {
                C32359z0.m95573i0(mo71607t1().getEditText(), v1);
            }
        }
    }

    /* renamed from: d2 */
    public boolean mo71725d2() {
        return this.f77893p;
    }

    /* renamed from: e2 */
    public void mo71726e2() {
        C32290b1.m95115e(mo71607t1().getEditText());
    }

    /* renamed from: i1 */
    public void mo71667i1(ArrayList arrayList) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j1 */
    public void mo67194j1() {
        int i = (((getArguments().getInt("WIZARD_INPUT_Y_POSITION") - C32355x0.m95516g(C10319h.payment_wizard_close_width_height)) - C32355x0.m95516g(C10319h.payment_wizard_close_margin)) - C32355x0.m95522m(getContext())) - (this.f77886i.getHeight() / 2);
        if (i > 0) {
            this.f77886i.setY((float) i);
        }
        this.f77886i.animate().y(Utils.FLOAT_EPSILON).setListener(this.f77898u);
        if (!mo71549G1()) {
            this.f77882e.collapseHint();
        } else {
            this.f77885h.setVisibility(8);
        }
    }

    /* renamed from: k1 */
    public void mo71727k1(float f) {
        this.f77885h.setVisibility(0);
        this.f77885h.setScaleY(1.0f - f);
        this.f77885h.setPivotY(Utils.FLOAT_EPSILON);
        ViewPropertyAnimator scaleY = this.f77885h.animate().scaleY(f);
        scaleY.setDuration(200);
        if (f < 1.0f) {
            scaleY.withEndAction(new C31356a());
        }
    }

    /* renamed from: l1 */
    public boolean mo71728l1() {
        if (mo67195H1() || (mo71708I1() && !TextUtils.isEmpty(mo71611z1()))) {
            return true;
        }
        return false;
    }

    /* renamed from: m1 */
    public void mo71729m1() {
        C32290b1.m95112b(mo71607t1().getEditText());
    }

    /* access modifiers changed from: protected */
    /* renamed from: n1 */
    public void mo71730n1() {
        boolean z = this.f77884g;
        this.f77897t = !z;
        if (z) {
            mo67194j1();
            getArguments().putBoolean("WIZARD_FIELD_SHOULD_ANIMATE", false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o1 */
    public void mo71558o1() {
        if (mo71549G1()) {
            mo71727k1(1.0f);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        boolean z;
        super.onActivityCreated(bundle);
        C35862c cVar = (C35862c) getActivity();
        this.f77883f = cVar;
        if (this.f77896s) {
            if (!TextUtils.isEmpty(mo71611z1()) || mo71586E1() || (mo71707D1() != null && "DD_END_DATE_ID".equals(mo71707D1().getId()))) {
                z = true;
            } else {
                z = false;
            }
            cVar.mo87965p3(z);
        }
        if (!this.f77884g && this.f77881d && mo71549G1()) {
            mo71727k1(1.0f);
        }
    }

    public Animation onCreateAnimation(int i, boolean z, int i2) {
        if (i2 != 0) {
            this.f77887j = true;
            Animation loadAnimation = AnimationUtils.loadAnimation(getActivity(), i2);
            loadAnimation.setDuration(200);
            loadAnimation.setAnimationListener(new C31357b());
            return loadAnimation;
        }
        this.f77887j = false;
        return super.onCreateAnimation(i, z, i2);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (mo71707D1() != null) {
            this.f77894q = mo71707D1().getAllowEmptyValue();
        }
        this.f77884g = getArguments().getBoolean("WIZARD_FIELD_SHOULD_ANIMATE", false);
        mo71661b2(view);
        mo71724c2();
    }

    /* access modifiers changed from: protected */
    /* renamed from: p1 */
    public void mo71731p1() {
        mo71732q1(this.f77882e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q1 */
    public void mo71732q1(BogInputLayout bogInputLayout) {
        bogInputLayout.getEditText().formatWithNonSelectable();
    }

    /* renamed from: r1 */
    public Bundle mo71733r1() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        Bundle bundle = new Bundle();
        setArguments(bundle);
        return bundle;
    }

    /* renamed from: s1 */
    public int mo71734s1() {
        return mo71733r1().getInt("WIZARD_FRAGMENT_INDEX", 0);
    }

    /* renamed from: t1 */
    public BogInputLayout mo71607t1() {
        return this.f77882e;
    }

    /* renamed from: u1 */
    public int mo71735u1() {
        return mo71733r1().getInt("WIZARD_INPUT_STYLE");
    }

    /* renamed from: v1 */
    public int mo71736v1() {
        if (mo71707D1() != null) {
            return mo71707D1().getTextLimit();
        }
        return mo71733r1().getInt("WIZARD_INPUT_LIMIT", -1);
    }

    /* renamed from: x1 */
    public String mo71737x1() {
        if (mo71707D1() == null || mo71707D1().getInputTitle() == null) {
            return mo71733r1().getString("WIZARD_INPUT_TITLE", "");
        }
        return mo71707D1().getInputTitle();
    }

    /* renamed from: y1 */
    public int mo71610y1() {
        if (mo71707D1() != null) {
            return mo71707D1().getInputType();
        }
        return mo71733r1().getInt("WIZARD_INPUT_TYPE");
    }

    /* renamed from: z1 */
    public String mo71611z1() {
        String string = mo71733r1().getString("WIZARD_INPUT_VALUE", "");
        if (!TextUtils.isEmpty(string) || mo71707D1() == null) {
            return string;
        }
        return mo71707D1().getValue();
    }
}

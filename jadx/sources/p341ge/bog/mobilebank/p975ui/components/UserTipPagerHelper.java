package p341ge.bog.mobilebank.p975ui.components;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.style.UnderlineSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.viewpager.widget.ViewPager;
import g81.C32261m0;
import g91.C32303f;
import g91.C32355x0;
import iu0.C36546y;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogViewPager;
import p366bk.C10316e;
import p366bk.C10318g;
import p366bk.C10320i;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10328q;
import p642vh.C18368l;

/* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper */
public class UserTipPagerHelper extends LinearLayout implements ViewPager.C1902j {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public BogViewPager f85895d;

    /* renamed from: e */
    private C32261m0 f85896e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public View.OnClickListener f85897f;

    /* renamed from: g */
    private LinearLayout f85898g;

    /* renamed from: h */
    private int f85899h;

    /* renamed from: i */
    private Button f85900i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public Button f85901j;

    /* renamed from: k */
    private int f85902k;
    /* access modifiers changed from: private */

    /* renamed from: l */
    public int[] f85903l;

    /* renamed from: m */
    private View f85904m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public ImageView f85905n;

    /* renamed from: o */
    private BogTextView f85906o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public BogTextView f85907p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public BogTextView f85908q;

    /* renamed from: r */
    private BogTextView f85909r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f85910s = true;

    /* renamed from: t */
    private View.OnClickListener f85911t = new C35550a();
    /* access modifiers changed from: private */

    /* renamed from: u */
    public View.OnClickListener f85912u;

    /* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper$a */
    class C35550a implements View.OnClickListener {
        C35550a() {
        }

        public void onClick(View view) {
            int i;
            UserTipPagerHelper userTipPagerHelper = UserTipPagerHelper.this;
            userTipPagerHelper.f85910s = !userTipPagerHelper.f85910s;
            ImageView b = UserTipPagerHelper.this.f85905n;
            if (UserTipPagerHelper.this.f85910s) {
                i = C10320i.ic_checkbox_selected_color;
            } else {
                i = C10320i.ic_checkbox_unselected_color;
            }
            b.setImageResource(i);
            UserTipPagerHelper.this.f85901j.setEnabled(UserTipPagerHelper.this.f85910s);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper$b */
    class C35551b implements View.OnClickListener {
        C35551b() {
        }

        public void onClick(View view) {
            C32303f.m95182B(UserTipPagerHelper.this.getContext());
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper$c */
    class C35552c implements View.OnClickListener {
        C35552c() {
        }

        public void onClick(View view) {
            if (UserTipPagerHelper.this.f85903l != null && UserTipPagerHelper.this.f85895d.getCurrentItem() < UserTipPagerHelper.this.f85903l.length - 1) {
                UserTipPagerHelper.this.f85895d.setCurrentItem(UserTipPagerHelper.this.f85895d.getCurrentItem() + 1);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper$d */
    class C35553d implements View.OnClickListener {
        C35553d() {
        }

        public void onClick(View view) {
            if (UserTipPagerHelper.this.f85910s && UserTipPagerHelper.this.f85912u != null) {
                UserTipPagerHelper.this.f85912u.onClick(UserTipPagerHelper.this.f85907p);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper$e */
    class C35554e implements View.OnClickListener {
        C35554e() {
        }

        public void onClick(View view) {
            if (UserTipPagerHelper.this.f85897f != null) {
                UserTipPagerHelper.this.f85897f.onClick(UserTipPagerHelper.this.f85908q);
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.components.UserTipPagerHelper$f */
    class C35555f implements View.OnClickListener {
        C35555f() {
        }

        public void onClick(View view) {
            C32303f.m95183C(UserTipPagerHelper.this.getContext());
        }
    }

    public UserTipPagerHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setUpViews(context);
    }

    /* renamed from: k */
    private void m105569k() {
        this.f85899h = this.f85903l.length;
        for (int i = 0; i < this.f85898g.getChildCount(); i++) {
            View childAt = this.f85898g.getChildAt(i);
            if (i < this.f85899h) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, getContext()));
                childAt.setBackground(gradientDrawable);
                childAt.setVisibility(0);
            } else {
                childAt.setVisibility(8);
            }
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(C18368l.m62755d(getContext(), C10316e.f28613r));
        this.f85898g.getChildAt(0).setBackground(gradientDrawable2);
    }

    private void setUpViews(Context context) {
        View.inflate(context, C10324m.user_tips_wrapper, this);
        this.f85895d = (BogViewPager) findViewById(C10322k.tip_view_pager);
        this.f85898g = (LinearLayout) findViewById(C10322k.dot_wrapper);
        this.f85900i = (Button) findViewById(C10322k.f28781Pm);
        this.f85901j = (Button) findViewById(C10322k.accept_button);
        this.f85905n = (ImageView) findViewById(C10322k.accept_image);
        this.f85906o = (BogTextView) findViewById(C10322k.accept_text);
        this.f85907p = (BogTextView) findViewById(C10322k.accept_text_terms);
        this.f85904m = findViewById(C10322k.accept_container);
        this.f85908q = (BogTextView) findViewById(C10322k.language_switcher);
        this.f85900i.setEnabled(true);
        this.f85901j.setEnabled(true);
        this.f85906o.setOnClickListener(this.f85911t);
        this.f85905n.setOnClickListener(this.f85911t);
        this.f85907p.setOnClickListener(new C35551b());
        this.f85900i.setOnClickListener(new C35552c());
        this.f85901j.setOnClickListener(new C35553d());
        this.f85908q.setOnClickListener(new C35554e());
        BogTextView bogTextView = (BogTextView) findViewById(C10322k.accept_privacy_policy);
        this.f85909r = bogTextView;
        bogTextView.setPaintFlags(bogTextView.getPaintFlags() | 8);
        this.f85909r.setOnClickListener(new C35555f());
    }

    /* renamed from: L */
    public void mo6548L(int i, float f, int i2) {
    }

    /* renamed from: Q */
    public void mo6549Q(int i) {
        this.f85902k = i;
        for (int i2 = 0; i2 < this.f85898g.getChildCount(); i2++) {
            View childAt = this.f85898g.getChildAt(i2);
            if (i2 < this.f85899h) {
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setShape(1);
                gradientDrawable.setColor(C32355x0.m95514e(C10318g.bog_circular_image_container_grey_color, getContext()));
                childAt.setBackground(gradientDrawable);
                childAt.setVisibility(0);
            }
        }
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setShape(1);
        gradientDrawable2.setColor(C18368l.m62755d(getContext(), C10316e.f28613r));
        this.f85898g.getChildAt(i).setBackground(gradientDrawable2);
        int[] iArr = this.f85903l;
        if (iArr == null) {
            return;
        }
        if (i == iArr.length - 1) {
            this.f85900i.setVisibility(8);
            this.f85904m.setVisibility(0);
            return;
        }
        this.f85900i.setVisibility(0);
        this.f85904m.setVisibility(8);
    }

    /* renamed from: l */
    public void mo86523l(int[] iArr, int[] iArr2, String[] strArr, String[] strArr2, int[] iArr3, View.OnClickListener onClickListener) {
        this.f85903l = iArr;
        C32261m0 m0Var = new C32261m0(getContext(), iArr, iArr2, strArr, strArr2, iArr3);
        this.f85896e = m0Var;
        this.f85895d.setAdapter(m0Var);
        this.f85895d.addOnPageChangeListener(this);
        this.f85897f = onClickListener;
        this.f85900i.setButtonText(C36546y.m108285N().getString(C10328q.f28935P0));
        this.f85908q.setText(C36546y.m108285N().getString(C10328q.launcher_switch_language));
        this.f85906o.setText(C36546y.m108285N().getString(C10328q.button_text_agree_to));
        try {
            SpannableString spannableString = new SpannableString(C36546y.m108285N().getString(C10328q.common_text_to_conditions_underline));
            spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 0);
            this.f85907p.setText(spannableString);
        } catch (Exception unused) {
            this.f85907p.setText(C36546y.m108285N().getString(C10328q.common_text_to_conditions_underline));
        }
        this.f85901j.setButtonText(C36546y.m108285N().getString(C10328q.button_text_agree_to));
        this.f85909r.setText(getContext().getString(C10328q.common_text_privacy_policy));
        m105569k();
        this.f85895d.setCurrentItem(this.f85902k);
        if (iArr == null || iArr.length == 1) {
            this.f85898g.setVisibility(8);
            this.f85900i.setVisibility(8);
            this.f85904m.setVisibility(0);
        }
    }

    /* renamed from: l0 */
    public void mo6550l0(int i) {
    }

    public void setFinalClickListener(View.OnClickListener onClickListener) {
        this.f85912u = onClickListener;
    }
}

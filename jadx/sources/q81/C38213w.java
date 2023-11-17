package q81;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Outline;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import android.view.animation.AccelerateDecelerateInterpolator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.mikephil.charting.utils.Utils;
import g91.C32355x0;
import l81.C37104a;
import l81.C37107d;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10319h;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: q81.w */
public class C38213w extends C38160a {
    /* access modifiers changed from: private */

    /* renamed from: h */
    public RecyclerView f91683h;

    /* renamed from: i */
    protected int f91684i;

    /* renamed from: j */
    protected String[] f91685j;

    /* renamed from: k */
    private int f91686k;

    /* renamed from: l */
    private int f91687l;

    /* renamed from: m */
    private int f91688m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C37104a f91689n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C38218e f91690o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f91691p;

    /* renamed from: q */
    private int f91692q;

    /* renamed from: r */
    private boolean f91693r;

    /* renamed from: s */
    private boolean f91694s;

    /* renamed from: t */
    private boolean f91695t;
    /* access modifiers changed from: private */

    /* renamed from: u */
    public boolean f91696u;

    /* renamed from: q81.w$a */
    class C38214a implements ValueAnimator.AnimatorUpdateListener {
        C38214a() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C38213w.this.f91683h.setElevation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: q81.w$b */
    class C38215b implements ValueAnimator.AnimatorUpdateListener {
        C38215b() {
        }

        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            C38213w.this.f91683h.setElevation(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: q81.w$c */
    class C38216c implements Runnable {
        C38216c() {
        }

        public void run() {
            C38213w.this.f91696u = false;
            if (C38213w.this.f91690o != null) {
                C38213w.this.f91690o.mo86274a();
            }
            C38213w.super.dismiss();
        }
    }

    /* renamed from: q81.w$d */
    private class C38217d extends ViewOutlineProvider {
        public void getOutline(View view, Outline outline) {
            Outline outline2 = outline;
            outline2.setRoundRect(C32355x0.m95516g(C10319h.container_box_shadow_left_inset), C32355x0.m95516g(C10319h.container_box_shadow_top_inset), view.getWidth() - C32355x0.m95516g(C10319h.container_box_shadow_right_inset), view.getHeight() - C32355x0.m95516g(C10319h.container_box_shadow_bottom_inset), (float) C38213w.this.getContext().getResources().getDimensionPixelSize(C10319h.currency_box_corner_radius));
        }

        private C38217d() {
        }
    }

    /* renamed from: q81.w$e */
    public interface C38218e {
        /* renamed from: a */
        void mo86274a();
    }

    /* renamed from: q81.w$f */
    private class C38219f extends RecyclerView.C1736h {
        /* renamed from: f */
        public void onBindViewHolder(C38220g gVar, int i) {
            if (i == getItemCount() - 1) {
                gVar.f91703g.setVisibility(4);
            } else {
                gVar.f91703g.setVisibility(0);
            }
            gVar.f91702f.setText(C38213w.this.f91685j[i]);
        }

        /* renamed from: g */
        public C38220g onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new C38220g(LayoutInflater.from(C38213w.this.getContext()).inflate(C10324m.item_currency, viewGroup, false));
        }

        public int getItemCount() {
            return C38213w.this.f91685j.length;
        }

        private C38219f() {
        }
    }

    /* renamed from: q81.w$g */
    private class C38220g extends C37107d implements View.OnClickListener {

        /* renamed from: f */
        BogTextView f91702f = ((BogTextView) mo90036h(C10322k.item_currency_title));

        /* renamed from: g */
        View f91703g = mo90036h(C10322k.item_currency_divider);

        public C38220g(View view) {
            super(view);
            view.setOnClickListener(this);
        }

        public void onClick(View view) {
            C38213w.this.f91691p = false;
            C38213w.this.f91689n.mo48298Z0(getAdapterPosition());
            C38213w.this.f91684i = getAdapterPosition();
            C38213w.this.dismiss();
        }
    }

    public C38213w(Context context, int i, int i2, int i3) {
        super(context);
        this.f91691p = true;
        this.f91692q = -10;
        m112411o(i, i2, i3);
    }

    /* renamed from: i */
    private void m112410i() {
        this.f91683h = (RecyclerView) findViewById(C10322k.picker_recycler);
        m112413q();
        m112412p();
    }

    /* renamed from: o */
    private void m112411o(int i, int i2, int i3) {
        this.f91684i = i;
        this.f91687l = i3;
        if (i2 > 0) {
            this.f91686k = i2;
        }
        mo91681a();
        if (this.f91685j != null) {
            m112410i();
        }
    }

    /* renamed from: p */
    private void m112412p() {
        WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.gravity = 51;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(C10319h.currency_picker_item_height);
        String[] strArr = this.f91685j;
        int i = 7;
        if (strArr.length < 7) {
            i = strArr.length;
        }
        this.f91688m = (i * dimensionPixelSize) + C32355x0.m95511b(9.0f, getContext());
        int i2 = this.f91692q;
        if (i2 == -10) {
            if (mo91709r()) {
                i2 = -2;
            } else {
                i2 = C32355x0.m95521l(getContext()) / 2;
            }
        }
        getWindow().setLayout(i2, this.f91688m);
        getWindow().setAttributes(attributes);
        int length = (this.f91687l - ((this.f91685j.length / 2) * dimensionPixelSize)) - (dimensionPixelSize / 2);
        if (length <= 0) {
            this.f91693r = true;
            length = 0;
        } else if (length > C32355x0.m95519j(getContext()) - this.f91688m) {
            this.f91694s = true;
        }
        attributes.y = length;
        int i3 = this.f91686k;
        if (i3 <= 0) {
            i3 = getContext().getResources().getDimensionPixelSize(C10319h.exchange_side_margin);
        }
        attributes.x = i3;
    }

    /* renamed from: q */
    private void m112413q() {
        this.f91683h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f91683h.setAdapter(mo91707j());
        this.f91683h.setOutlineProvider(new C38217d());
        this.f91683h.setClipToOutline(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo91682b() {
        return C10324m.dialog_currency_picker;
    }

    public void dismiss() {
        if (!this.f91696u) {
            this.f91696u = true;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) C32355x0.m95516g(C10319h.default_elevation), 0.0f});
            ofFloat.addUpdateListener(new C38215b());
            ofFloat.start();
            this.f91683h.animate().scaleX(Utils.FLOAT_EPSILON).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator());
            this.f91683h.animate().scaleY(Utils.FLOAT_EPSILON).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(100).withEndAction(new C38216c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public RecyclerView.C1736h mo91707j() {
        return new C38219f();
    }

    /* renamed from: k */
    public boolean mo91744k() {
        return this.f91691p;
    }

    /* renamed from: l */
    public void mo91745l(boolean z) {
        this.f91695t = z;
    }

    /* renamed from: m */
    public void mo91708m(C37104a aVar) {
        this.f91689n = aVar;
    }

    /* renamed from: n */
    public void mo91746n(String[] strArr) {
        this.f91685j = strArr;
        m112410i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public boolean mo91709r() {
        return false;
    }

    /* renamed from: s */
    public void mo91747s(C38218e eVar) {
        this.f91690o = eVar;
        show();
    }

    public void show() {
        super.show();
        this.f91683h.setScaleY(Utils.FLOAT_EPSILON);
        this.f91683h.setScaleX(Utils.FLOAT_EPSILON);
        if (this.f91695t) {
            this.f91683h.setPivotX((float) this.f91686k);
        } else {
            this.f91683h.setPivotX((float) getContext().getResources().getDimensionPixelSize(C10319h.exchange_side_margin));
        }
        int b = (this.f91688m / 2) + C32355x0.m95511b(10.0f, getContext());
        if (this.f91693r) {
            b = this.f91687l;
        } else if (this.f91694s) {
            b = this.f91688m;
        }
        this.f91683h.setPivotY((float) b);
        int i = 0;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, (float) C32355x0.m95516g(C10319h.default_elevation)});
        ofFloat.addUpdateListener(new C38214a());
        ofFloat.start();
        this.f91683h.animate().scaleX(1.0f).setInterpolator(new AccelerateDecelerateInterpolator()).setDuration(200);
        this.f91683h.animate().scaleY(1.0f).setDuration(200).setInterpolator(new AccelerateDecelerateInterpolator()).setStartDelay(100);
        int i2 = this.f91684i - 3;
        if (i2 >= 0) {
            i = i2;
        }
        this.f91683h.getLayoutManager().mo5197J1(i);
    }

    public C38213w(Context context, String[] strArr, int i, int i2, int i3) {
        this(context, strArr, i, i2, i3, -10);
    }

    public C38213w(Context context, String[] strArr, int i, int i2, int i3, int i4) {
        super(context);
        this.f91691p = true;
        this.f91685j = strArr;
        this.f91692q = i4;
        m112411o(i, i3, i2);
    }
}

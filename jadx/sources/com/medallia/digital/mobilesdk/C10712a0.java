package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.C10992m1;
import com.medallia.digital.mobilesdk.C11221y3;

/* renamed from: com.medallia.digital.mobilesdk.a0 */
class C10712a0 extends C10771d0 {

    /* renamed from: k */
    private static final float f30607k = 1.0f;

    /* renamed from: l */
    private static final float f30608l = 4.0f;

    /* renamed from: m */
    private static final int f30609m = 15;

    /* renamed from: n */
    private static final int f30610n = 10;

    /* renamed from: o */
    private static final int f30611o = 600;

    /* renamed from: p */
    private static final double f30612p = 0.2d;

    /* renamed from: q */
    private static final float f30613q = 0.7f;

    /* renamed from: g */
    private TextView f30614g;

    /* renamed from: h */
    private ImageView f30615h;

    /* renamed from: i */
    private C11052p4 f30616i;

    /* renamed from: j */
    private View f30617j;

    /* renamed from: com.medallia.digital.mobilesdk.a0$a */
    class C10713a implements View.OnTouchListener {
        C10713a() {
        }

        public boolean onTouch(View view, MotionEvent motionEvent) {
            C10712a0 a0Var = C10712a0.this;
            C10731b0 b0Var = a0Var.f30850a;
            if (b0Var != null && b0Var.f30673f) {
                a0Var.f30854e = motionEvent.getAction() == 0;
            }
            return false;
        }
    }

    C10712a0(C10731b0 b0Var, Context context, String str) {
        super(b0Var, context, str);
    }

    /* renamed from: a */
    private int m39003a(int i) {
        return (i * getResources().getDisplayMetrics().densityDpi) / 160;
    }

    /* renamed from: g */
    private void m39009g() {
        View view = this.f30617j;
        if (view != null) {
            view.setOnTouchListener(new C10713a());
        }
    }

    /* renamed from: h */
    private String m39010h() {
        ConfigurationContract a = C11208y0.m41106c().mo29204a();
        C11238z3 localization = a != null ? a.getLocalization() : null;
        return C11221y3.m41127d().mo29210a((localization == null || localization.mo29251f() == null) ? "" : localization.mo29251f().getLocalUrl(), this.f30855f, C11221y3.C11224c.ALERT, (C11221y3.C11222a) null);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public RelativeLayout mo28056b(Context context) {
        View inflate = LayoutInflater.from(context).inflate(C10706R.layout.view_banner, (ViewGroup) this.f30851b, false);
        C11052p4 p4Var = new C11052p4(getContext(), (AttributeSet) null, 0, C10706R.style.MedalliaDefaultShadowStyle);
        this.f30616i = p4Var;
        p4Var.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.f30853d.removeAllViews();
        this.f30853d.addView(this.f30616i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -1);
        if (this.f30850a.f30672e == C10992m1.C10995c.TOP) {
            layoutParams.setMargins(0, 0, 0, m39003a(10));
        } else {
            layoutParams.setMargins(0, m39003a(10), 0, 0);
        }
        this.f30852c.setLayoutParams(layoutParams);
        this.f30616i.addView(this.f30852c);
        RelativeLayout relativeLayout = (RelativeLayout) inflate.findViewById(C10706R.C10708id.medallia_banner_root_view);
        this.f30617j = inflate.findViewById(C10706R.C10708id.text_container);
        m39009g();
        TextView textView = (TextView) inflate.findViewById(C10706R.C10708id.medallia_banner_title_text_view);
        TextView textView2 = (TextView) inflate.findViewById(C10706R.C10708id.medallia_banner_message_text_view);
        this.f30614g = (TextView) inflate.findViewById(C10706R.C10708id.medallia_positive_view);
        this.f30615h = (ImageView) inflate.findViewById(C10706R.C10708id.medallia_negative_view);
        String str = this.f30850a.f30668a;
        if (str != null) {
            textView2.setText(str);
            textView2.setAlpha(f30613q);
            m39008a(textView2, this.f30850a.f30680m, 0);
        }
        String str2 = this.f30850a.f30669b;
        if (str2 != null) {
            textView.setText(str2);
            setContentDescription(String.format("%s %s ", new Object[]{m39010h(), this.f30850a.f30669b}));
            m39008a(textView, this.f30850a.f30680m, 1);
        }
        if (!TextUtils.isEmpty(this.f30850a.f30670c)) {
            try {
                relativeLayout.setBackgroundColor(Color.parseColor(this.f30850a.f30670c));
            } catch (Exception unused) {
                C10735b4.m39114f("Error on set banner background color");
            }
        }
        if (!TextUtils.isEmpty(this.f30850a.f30671d)) {
            try {
                textView.setTextColor(Color.parseColor(this.f30850a.f30671d));
                textView2.setTextColor(Color.parseColor(this.f30850a.f30671d));
            } catch (Exception unused2) {
                C10735b4.m39114f("Error on set banner background color");
            }
        }
        if (this.f30850a.f30673f) {
            this.f30614g.setVisibility(0);
            try {
                m39008a(this.f30614g, this.f30850a.f30680m, 1);
                if (!TextUtils.isEmpty(this.f30850a.f30676i)) {
                    this.f30614g.setBackgroundColor(Color.parseColor(this.f30850a.f30676i));
                }
                if (!TextUtils.isEmpty(this.f30850a.f30675h)) {
                    this.f30614g.setTextColor(Color.parseColor(this.f30850a.f30675h));
                }
                if (!TextUtils.isEmpty(this.f30850a.f30674g)) {
                    this.f30614g.setText(this.f30850a.f30674g);
                }
            } catch (Exception unused3) {
                C10735b4.m39114f("Error on set banner action button");
            }
            this.f30615h.setVisibility(0);
            try {
                Drawable drawable = getResources().getDrawable(C10706R.C10707drawable.md_close_banner);
                if (drawable != null && !TextUtils.isEmpty(this.f30850a.f30677j)) {
                    drawable.setColorFilter(Color.parseColor(this.f30850a.f30677j), PorterDuff.Mode.MULTIPLY);
                    this.f30615h.setImageDrawable(drawable);
                }
            } catch (Exception unused4) {
                C10735b4.m39111c("Error on set banner close button color");
            }
        } else {
            this.f30614g.setVisibility(8);
            this.f30615h.setVisibility(8);
        }
        if (this.f30850a.f30679l) {
            if (getResources().getConfiguration().smallestScreenWidthDp < f30611o || C10884i4.m39721c().mo28483b().getResources().getConfiguration().orientation != 2) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f30852c.getLayoutParams();
                layoutParams2.setMargins(m39003a(10), m39003a(10), m39003a(10), m39003a(10));
                this.f30852c.setLayoutParams(layoutParams2);
            } else {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) C10884i4.m39721c().mo28484d().getBaseContext()).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                int i = (int) (((double) displayMetrics.widthPixels) * f30612p);
                FrameLayout.LayoutParams layoutParams3 = (FrameLayout.LayoutParams) this.f30852c.getLayoutParams();
                layoutParams3.setMargins(i, m39003a(10), i, m39003a(10));
                this.f30852c.setLayoutParams(layoutParams3);
            }
        }
        mo28055a();
        return relativeLayout;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean mo28058c() {
        return this.f30850a.f30678k;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean mo28059d() {
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public View mo28060e() {
        return this.f30615h;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public View mo28061f() {
        return this.f30614g;
    }

    /* renamed from: a */
    private GradientDrawable m39004a(int i, int i2) {
        return m39006a(Integer.valueOf(i), (float[]) null, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public boolean mo28057b() {
        return this.f30850a.f30673f;
    }

    /* renamed from: a */
    private GradientDrawable m39005a(int i, String str) {
        float f = (float) i;
        return m39007a(new float[]{0.0f, 0.0f, 0.0f, 0.0f, f, f, f, f}, Color.parseColor(str));
    }

    /* renamed from: a */
    private GradientDrawable m39006a(Integer num, float[] fArr, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        if (fArr != null) {
            gradientDrawable.setCornerRadii(fArr);
        }
        if (num != null) {
            gradientDrawable.setCornerRadius((float) num.intValue());
        }
        return gradientDrawable;
    }

    /* renamed from: a */
    private GradientDrawable m39007a(float[] fArr, int i) {
        return m39006a((Integer) null, fArr, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public void mo28055a() {
        float f = getResources().getDisplayMetrics().density;
        this.f30616i.mo28893b(true);
        this.f30616i.mo28892b(1.0f * f);
        this.f30616i.mo28889a(f * f30608l);
    }

    /* renamed from: a */
    private void m39008a(TextView textView, String str, int i) {
        if (str != null && textView != null) {
            try {
                textView.setTypeface(Typeface.create(str, i));
            } catch (Exception unused) {
                C10735b4.m39111c("Failed on setting font: " + str);
            }
        }
    }
}

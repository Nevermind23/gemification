package com.medallia.digital.mobilesdk;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.text.Html;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.URLSpan;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.medallia.digital.mobilesdk.Broadcasts;
import java.io.File;

/* renamed from: com.medallia.digital.mobilesdk.h7 */
class C10864h7 extends Dialog {

    /* renamed from: t */
    private static final int f31152t = 10;

    /* renamed from: u */
    private static final int f31153u = 25;

    /* renamed from: v */
    private static final String f31154v = "#004ccb";

    /* renamed from: a */
    private TextView f31155a;

    /* renamed from: b */
    private ImageView f31156b;

    /* renamed from: c */
    private ImageView f31157c;

    /* renamed from: d */
    private TextView f31158d;

    /* renamed from: e */
    private TextView f31159e;

    /* renamed from: f */
    private ThanksButton f31160f;

    /* renamed from: g */
    private TextView f31161g;

    /* renamed from: h */
    private ImageView f31162h;

    /* renamed from: i */
    private View f31163i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public final C11013n2 f31164j;

    /* renamed from: k */
    private final C10841g7 f31165k;

    /* renamed from: l */
    private final RelativeLayout f31166l;

    /* renamed from: m */
    private LinearLayout f31167m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public C10869e f31168n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public C10868d f31169o;

    /* renamed from: p */
    private boolean f31170p = false;

    /* renamed from: q */
    private C10984l5 f31171q;

    /* renamed from: r */
    private C10984l5 f31172r;

    /* renamed from: s */
    private MDAppearanceMode f31173s;

    /* renamed from: com.medallia.digital.mobilesdk.h7$a */
    class C10865a implements View.OnClickListener {
        C10865a() {
        }

        public void onClick(View view) {
            C10735b4.m39113e("Thank You Prompt was closed by close button");
            C10864h7.this.f31168n.close();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h7$b */
    class C10866b implements View.OnClickListener {
        C10866b() {
        }

        public void onClick(View view) {
            C10735b4.m39113e("Thank You Prompt was closed by x button");
            C10864h7.this.f31168n.close();
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h7$c */
    class C10867c extends ClickableSpan {

        /* renamed from: a */
        final /* synthetic */ URLSpan f31176a;

        C10867c(URLSpan uRLSpan) {
            this.f31176a = uRLSpan;
        }

        public void onClick(View view) {
            if (!C10864h7.this.f31169o.mo28429a(this.f31176a.getURL())) {
                try {
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(this.f31176a.getURL()));
                    intent.setFlags(268435456);
                    C10884i4.m39721c().mo28484d().startActivity(intent);
                    C10864h7.this.f31168n.close();
                } catch (Exception e) {
                    C10735b4.m39111c(e.getMessage());
                }
            } else {
                Broadcasts.C10688d.m38944a(Broadcasts.C10688d.C10689a.formBlockedUrl, C10864h7.this.f31164j.getFormId(), C10864h7.this.f31164j.getFormType(), this.f31176a.getURL());
            }
        }

        public void updateDrawState(TextPaint textPaint) {
            super.updateDrawState(textPaint);
            textPaint.setUnderlineText(false);
        }
    }

    /* renamed from: com.medallia.digital.mobilesdk.h7$d */
    interface C10868d {
        /* renamed from: a */
        boolean mo28429a(String str);
    }

    /* renamed from: com.medallia.digital.mobilesdk.h7$e */
    interface C10869e {
        void close();
    }

    C10864h7(Context context, C11013n2 n2Var, boolean z, C10984l5 l5Var, C10984l5 l5Var2, MDAppearanceMode mDAppearanceMode) {
        super(context, C10706R.style.MedalliaTYPDialog);
        Window window = getWindow();
        if (window != null) {
            window.setGravity(17);
        }
        setContentView(C10706R.layout.medallia_thank_you_promt_dialog);
        this.f31166l = (RelativeLayout) findViewById(C10706R.C10708id.medallia_thank_you_prompt_root_view);
        this.f31164j = n2Var;
        this.f31165k = n2Var.mo28819i();
        m39655d();
        m39650a(z, l5Var, l5Var2, mDAppearanceMode);
        m39657f();
        m39648a();
        m39652b();
        m39656e();
        m39654c();
    }

    /* renamed from: a */
    private int m39645a(int i) {
        return (i * C10884i4.m39721c().mo28483b().getResources().getDisplayMetrics().densityDpi) / 160;
    }

    /* renamed from: d */
    private void m39655d() {
        this.f31157c = (ImageView) findViewById(C10706R.C10708id.medallia_logo_image);
        this.f31158d = (TextView) findViewById(C10706R.C10708id.thank_you_title);
        this.f31159e = (TextView) findViewById(C10706R.C10708id.thank_you_subtitle);
        this.f31160f = (ThanksButton) findViewById(C10706R.C10708id.thank_you_button);
        this.f31161g = (TextView) findViewById(C10706R.C10708id.thank_you_power_by);
        this.f31155a = (TextView) findViewById(C10706R.C10708id.medallia_typ_form_title);
        this.f31156b = (ImageView) findViewById(C10706R.C10708id.medallia_modal_close_button);
        this.f31162h = (ImageView) findViewById(C10706R.C10708id.powerBy_logo);
        this.f31167m = (LinearLayout) findViewById(C10706R.C10708id.poweredby_container);
        this.f31163i = findViewById(C10706R.C10708id.medallia_delimiter);
    }

    /* renamed from: e */
    private void m39656e() {
        MDAppearanceMode mDAppearanceMode;
        C10984l5 l5Var;
        C10841g7 g7Var = this.f31165k;
        if (g7Var != null) {
            String n = g7Var.mo28373n();
            String l = this.f31165k.mo28371l();
            String e = this.f31165k.mo28362e();
            String a = this.f31165k.mo28358a();
            try {
                if (this.f31170p && (l5Var = this.f31171q) != null) {
                    e = l5Var.mo28699c().mo29236c();
                    a = this.f31171q.mo28698b().mo28239a();
                }
            } catch (Exception unused) {
                C10735b4.m39114f("Error on set thank you prompt content text and background dark mode color");
            }
            if (!this.f31164j.isPoweredByVisible()) {
                this.f31161g.setVisibility(8);
                this.f31162h.setVisibility(8);
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f31167m.getLayoutParams();
                layoutParams.setMargins(0, 0, 0, m39645a(25));
                this.f31167m.setLayoutParams(layoutParams);
            } else if (this.f31170p && (mDAppearanceMode = this.f31173s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                this.f31162h.setImageResource(C10706R.C10707drawable.md_dark_logo_power_by);
                this.f31161g.setTextColor(-1);
            }
            if (!TextUtils.isEmpty(n)) {
                mo28422b(this.f31158d, "<html>" + n + "</html>");
                m39649a(this.f31158d, this.f31165k.mo28365g());
            } else {
                this.f31158d.setVisibility(8);
            }
            if (!TextUtils.isEmpty(l)) {
                mo28422b(this.f31159e, "<html>" + l + "</html>");
                m39649a(this.f31159e, this.f31165k.mo28365g());
            } else {
                this.f31159e.setVisibility(8);
            }
            if (!TextUtils.isEmpty(e)) {
                try {
                    this.f31158d.setTextColor(Color.parseColor(e));
                    this.f31159e.setTextColor(Color.parseColor(e));
                } catch (Exception unused2) {
                    C10735b4.m39114f("Error on set thank you prompt content color");
                }
            }
            if (!TextUtils.isEmpty(a)) {
                try {
                    this.f31166l.setBackgroundColor(Color.parseColor(a));
                } catch (Exception unused3) {
                    C10735b4.m39114f("Error on set thank you content background color");
                }
            }
        }
    }

    /* renamed from: f */
    private void m39657f() {
        C10984l5 l5Var;
        String title = this.f31164j.getTitle();
        String titleTextColor = this.f31164j.getTitleTextColor();
        String titleBackgroundColor = this.f31164j.getTitleBackgroundColor();
        try {
            if (this.f31170p && (l5Var = this.f31172r) != null) {
                titleTextColor = l5Var.mo28699c().mo29235b();
                titleBackgroundColor = this.f31172r.mo28698b().mo28240b();
                this.f31163i.setBackgroundColor(Color.parseColor(titleBackgroundColor));
            }
        } catch (Exception unused) {
            C10735b4.m39114f("Error on set prompt title text and background dark mode color");
        }
        if (!TextUtils.isEmpty(title)) {
            this.f31155a.setText(title);
        }
        if (!TextUtils.isEmpty(titleTextColor)) {
            try {
                this.f31155a.setTextColor(Color.parseColor(titleTextColor));
                this.f31156b.setColorFilter(Color.parseColor(titleTextColor), PorterDuff.Mode.SRC_IN);
                C10841g7 g7Var = this.f31165k;
                if (g7Var != null && !TextUtils.isEmpty(g7Var.mo28374o())) {
                    this.f31156b.setContentDescription(this.f31165k.mo28374o());
                }
            } catch (Exception unused2) {
                C10735b4.m39114f("Error on set prompt title text color");
            }
        }
        if (!TextUtils.isEmpty(titleBackgroundColor)) {
            try {
                this.f31155a.setBackgroundColor(Color.parseColor(titleBackgroundColor));
            } catch (Exception unused3) {
                C10735b4.m39114f("Error on set prompt title background color");
            }
        }
    }

    public void dismiss() {
        super.dismiss();
        this.f31160f = null;
    }

    public void onDetachedFromWindow() {
        dismiss();
    }

    /* renamed from: b */
    private void m39652b() {
        MDAppearanceMode mDAppearanceMode;
        C10841g7 g7Var = this.f31165k;
        if (g7Var != null) {
            String h = g7Var.mo28366h();
            String i = this.f31165k.mo28368i();
            MDGifView mDGifView = (MDGifView) findViewById(C10706R.C10708id.GifImageView);
            if (this.f31165k.mo28376q()) {
                this.f31157c.setVisibility(0);
                if (this.f31170p && (mDAppearanceMode = this.f31173s) != null && mDAppearanceMode.equals(MDAppearanceMode.dark)) {
                    this.f31157c.setImageResource(C10706R.C10707drawable.md_place_dark_holder_image);
                    i = this.f31165k.mo28364f();
                }
                if (!TextUtils.isEmpty(i)) {
                    File d = C10930k2.m39984d(i);
                    if (d.exists()) {
                        if (i.endsWith(".gif")) {
                            mDGifView.setGifImageUri(Uri.fromFile(d));
                            if (!TextUtils.isEmpty(h)) {
                                mDGifView.setContentDescription(h);
                            }
                            mDGifView.setVisibility(0);
                            mDGifView.play();
                            this.f31157c.setVisibility(8);
                        } else {
                            this.f31157c.setImageBitmap(BitmapFactory.decodeFile(d.getAbsolutePath()));
                            mDGifView.setVisibility(8);
                        }
                    }
                }
                if (!TextUtils.isEmpty(h)) {
                    this.f31157c.setContentDescription(h);
                    return;
                }
                return;
            }
            this.f31157c.setVisibility(8);
        }
    }

    /* renamed from: c */
    private void m39654c() {
        this.f31160f.setOnClickListener(new C10865a());
        this.f31156b.setOnClickListener(new C10866b());
    }

    /* renamed from: a */
    private String m39647a(String str) {
        return str.replace("&lt", "<").replace("&gt&lt/", "</").replace("&gt", ">");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo28422b(TextView textView, String str) {
        Spannable spannable = (Spannable) Html.fromHtml(m39647a(str));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(spannable);
        for (URLSpan a : (URLSpan[]) spannableStringBuilder.getSpans(0, spannable.length(), URLSpan.class)) {
            mo28419a(spannableStringBuilder, a);
        }
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    /* renamed from: a */
    private void m39648a() {
        C10984l5 l5Var;
        C10841g7 g7Var = this.f31165k;
        if (g7Var != null) {
            String c = g7Var.mo28360c();
            String d = this.f31165k.mo28361d();
            String b = this.f31165k.mo28359b();
            try {
                if (this.f31170p && (l5Var = this.f31171q) != null) {
                    d = l5Var.mo28699c().mo29234a();
                    b = this.f31171q.mo28697a().mo28236a();
                }
            } catch (Exception unused) {
                C10735b4.m39114f("Error on set thank you close button text and background dark mode color");
            }
            if (this.f31165k.mo28375p()) {
                if (!TextUtils.isEmpty(c)) {
                    this.f31160f.setText(c.toUpperCase());
                }
                if (!TextUtils.isEmpty(d)) {
                    try {
                        this.f31160f.setTextColor(Color.parseColor(d));
                    } catch (Exception unused2) {
                        C10735b4.m39114f("Error on set thank you close button text color");
                    }
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                if (!TextUtils.isEmpty(b)) {
                    try {
                        gradientDrawable.setColor(Color.parseColor(b));
                    } catch (Exception unused3) {
                        C10735b4.m39114f("Error on set thank you close button background color");
                    }
                } else {
                    gradientDrawable.setColor(Color.parseColor(f31154v));
                }
                gradientDrawable.setCornerRadius(10.0f);
                this.f31160f.requestFocus();
                this.f31160f.setBackground(gradientDrawable);
                return;
            }
            this.f31160f.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28419a(SpannableStringBuilder spannableStringBuilder, URLSpan uRLSpan) {
        spannableStringBuilder.setSpan(new C10867c(uRLSpan), spannableStringBuilder.getSpanStart(uRLSpan), spannableStringBuilder.getSpanEnd(uRLSpan), spannableStringBuilder.getSpanFlags(uRLSpan));
        spannableStringBuilder.removeSpan(uRLSpan);
    }

    /* renamed from: a */
    private void m39649a(TextView textView, String str) {
        if (str != null && textView != null) {
            try {
                textView.setTypeface(Typeface.create(str, 0));
            } catch (Exception unused) {
                C10735b4.m39111c("Failed on setting font: " + str);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28420a(C10868d dVar) {
        this.f31169o = dVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo28421a(C10869e eVar) {
        this.f31168n = eVar;
    }

    /* renamed from: a */
    private void m39650a(boolean z, C10984l5 l5Var, C10984l5 l5Var2, MDAppearanceMode mDAppearanceMode) {
        C11013n2 n2Var;
        if (this.f31165k != null && (n2Var = this.f31164j) != null && n2Var.isDarkModeEnabled()) {
            this.f31170p = this.f31164j.isDarkModeEnabled();
            if (z) {
                this.f31171q = l5Var;
                this.f31172r = l5Var2;
                this.f31173s = mDAppearanceMode;
                return;
            }
            this.f31173s = C10986l7.m40219c().mo28703a();
            this.f31171q = C10986l7.m40219c().mo28704a(this.f31165k.mo28372m());
            this.f31172r = C10986l7.m40219c().mo28704a(this.f31164j.getHeaderThemeName());
        }
    }
}

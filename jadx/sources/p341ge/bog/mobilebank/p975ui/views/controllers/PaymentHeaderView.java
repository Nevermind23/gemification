package p341ge.bog.mobilebank.p975ui.views.controllers;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.C0430g1;
import androidx.core.content.C0767a;
import g91.C32289b0;
import p341ge.bog.mobilebank.p975ui.components.BogProgressBar;
import p341ge.bog.mobilebank.p975ui.views.widgets.CarNumberView;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;

/* renamed from: ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView */
public class PaymentHeaderView extends FrameLayout {

    /* renamed from: d */
    private TextView f86305d;

    /* renamed from: e */
    private TextView f86306e;

    /* renamed from: f */
    private TextView f86307f;

    /* renamed from: g */
    private TextView f86308g;

    /* renamed from: h */
    private ImageView f86309h;

    /* renamed from: i */
    private CarNumberView f86310i;

    /* renamed from: j */
    private ImageButton f86311j;

    /* renamed from: k */
    private Button f86312k;

    /* renamed from: l */
    private View f86313l;

    /* renamed from: m */
    private View f86314m;

    /* renamed from: n */
    private BogProgressBar f86315n;

    /* renamed from: ge.bog.mobilebank.ui.views.controllers.PaymentHeaderView$a */
    class C35699a implements View.OnClickListener {

        /* renamed from: d */
        final /* synthetic */ int f86316d;

        /* renamed from: e */
        final /* synthetic */ C0430g1.C0433c f86317e;

        C35699a(int i, C0430g1.C0433c cVar) {
            this.f86316d = i;
            this.f86317e = cVar;
        }

        public void onClick(View view) {
            PaymentHeaderView.this.mo86907h(view, this.f86316d, this.f86317e);
        }
    }

    public PaymentHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), C10324m.payment_template_header, this);
        m106012f();
    }

    /* renamed from: f */
    private void m106012f() {
        int i;
        this.f86305d = (TextView) findViewById(C10322k.header_main_text);
        this.f86306e = (TextView) findViewById(C10322k.left_image_text);
        this.f86307f = (TextView) findViewById(C10322k.right_image_text);
        this.f86309h = (ImageView) findViewById(C10322k.left_image_icon);
        this.f86310i = (CarNumberView) findViewById(C10322k.card_number_view);
        this.f86311j = (ImageButton) findViewById(C10322k.settings_btn);
        this.f86312k = (Button) findViewById(C10322k.notification_with_text);
        this.f86308g = (TextView) findViewById(C10322k.header_sub_text);
        this.f86313l = findViewById(C10322k.left_image_group);
        this.f86315n = (BogProgressBar) findViewById(C10322k.f28719Dq);
        this.f86314m = findViewById(C10322k.divider_line);
        mo86902g(true);
        TextView textView = this.f86308g;
        if (textView.getText().toString() == null || this.f86308g.getText().toString().equals("")) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C0767a.m2893c(getContext(), C10318g.f28646j1));
        this.f86313l.setBackground(gradientDrawable);
    }

    /* renamed from: a */
    public void mo86897a(String str, int i) {
        mo86898b(str, i, C10318g.f28646j1);
    }

    /* renamed from: b */
    public void mo86898b(String str, int i, int i2) {
        this.f86310i.setVisibility(4);
        setImageColor(i2);
        this.f86309h.setVisibility(0);
        this.f86306e.setVisibility(8);
        this.f86307f.setVisibility(8);
        C32289b0.m95107s(this.f86309h, str, Integer.valueOf(i), Integer.valueOf(i), true, false);
    }

    /* renamed from: c */
    public void mo86899c(int i, int i2) {
        this.f86310i.setVisibility(4);
        setImageColor(i2);
        this.f86309h.setImageResource(i);
    }

    /* renamed from: d */
    public void mo86900d(String str, String str2) {
        this.f86310i.setVisibility(4);
        this.f86309h.setVisibility(4);
        this.f86306e.setVisibility(0);
        this.f86307f.setVisibility(0);
        this.f86306e.setText(str);
        this.f86307f.setText(str2);
    }

    /* renamed from: e */
    public void mo86901e(int i, C0430g1.C0433c cVar) {
        this.f86311j.setOnClickListener(new C35699a(i, cVar));
    }

    /* renamed from: g */
    public void mo86902g(boolean z) {
        this.f86314m.setVisibility(z ? 0 : 8);
    }

    public String getImageText() {
        return this.f86306e.getText().toString();
    }

    public String getMainText() {
        return this.f86305d.getText().toString();
    }

    public ImageButton getSettingsButton() {
        return this.f86311j;
    }

    public String getSubText() {
        return this.f86308g.getText().toString();
    }

    /* renamed from: h */
    public void mo86907h(View view, int i, C0430g1.C0433c cVar) {
        C0430g1 g1Var = new C0430g1(getContext(), view);
        g1Var.mo2097b().inflate(i, g1Var.mo2096a());
        g1Var.mo2099d(cVar);
        g1Var.mo2100e();
    }

    public void setCarNumber(String str) {
        this.f86309h.setVisibility(4);
        this.f86306e.setVisibility(4);
        this.f86307f.setVisibility(4);
        this.f86310i.setVisibility(0);
        this.f86310i.setCardNumber(str);
    }

    public void setImageColor(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(1);
        gradientDrawable.setColor(C0767a.m2893c(getContext(), i));
        this.f86313l.setBackground(gradientDrawable);
    }

    public void setImageIconResource(int i) {
        mo86899c(i, C10318g.f28646j1);
    }

    public void setImageText(String str) {
        mo86900d(str, "");
    }

    public void setImageTextColor(int i) {
        this.f86306e.setTextColor(C0767a.m2893c(getContext(), i));
        this.f86307f.setTextColor(C0767a.m2893c(getContext(), i));
    }

    public void setMainText(String str) {
        this.f86305d.setText(str);
    }

    public void setNotificationText(String str) {
        setNotificationVisible(true);
        this.f86312k.setText(str);
    }

    public void setNotificationVisible(boolean z) {
        this.f86312k.setVisibility(z ? 0 : 4);
    }

    public void setSubText(String str) {
        int i;
        this.f86308g.setText(str);
        TextView textView = this.f86308g;
        if (textView.getText().toString() == null || this.f86308g.getText().toString().equals("")) {
            i = 8;
        } else {
            i = 0;
        }
        textView.setVisibility(i);
    }
}

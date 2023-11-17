package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C0767a;
import com.medallia.digital.mobilesdk.C10749b8;
import g91.C32290b1;
import g91.C32335t0;
import p366bk.C10318g;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import v81.C39259a;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.OtpButton */
public class OtpButton extends FrameLayout {
    public static final int OTP_TYPE_EMAIL = 1;
    public static final int OTP_TYPE_SMS = 0;
    /* access modifiers changed from: private */
    public ValueAnimator anim;
    /* access modifiers changed from: private */
    public long[] lastOtpRequestTimes = {-1, -1};
    /* access modifiers changed from: private */
    public C39259a otpButtonClickListener;
    /* access modifiers changed from: private */
    public int otpType;
    /* access modifiers changed from: private */
    public TextView sendAgainDisabled;
    /* access modifiers changed from: private */
    public View sendAgainLayout;
    /* access modifiers changed from: private */
    public TextView sendAgainTV;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OtpButton$a */
    class C35748a implements View.OnClickListener {
        C35748a() {
        }

        public void onClick(View view) {
            if (OtpButton.this.lastOtpRequestTimes[OtpButton.this.otpType] == -1) {
                OtpButton.this.notifyOtpClicked();
            } else if (System.currentTimeMillis() - OtpButton.this.lastOtpRequestTimes[OtpButton.this.otpType] > C10749b8.C10751b.f30743b) {
                OtpButton.this.notifyOtpClicked();
            } else if (OtpButton.this.otpButtonClickListener != null) {
                OtpButton.this.otpButtonClickListener.mo86491b();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OtpButton$b */
    class C35749b implements View.OnClickListener {
        C35749b() {
        }

        public void onClick(View view) {
            if (OtpButton.this.otpButtonClickListener != null) {
                OtpButton.this.otpButtonClickListener.mo86491b();
            }
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OtpButton$c */
    class C35750c implements Runnable {

        /* renamed from: ge.bog.mobilebank.ui.views.widgets.OtpButton$c$a */
        class C35751a implements ValueAnimator.AnimatorUpdateListener {
            C35751a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                C32290b1.m95126p(OtpButton.this.sendAgainLayout, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        C35750c() {
        }

        public void run() {
            long currentTimeMillis = System.currentTimeMillis() - OtpButton.this.lastOtpRequestTimes[OtpButton.this.otpType];
            if (currentTimeMillis < C10749b8.C10751b.f30743b) {
                int width = OtpButton.this.sendAgainDisabled.getWidth();
                C32290b1.m95126p(OtpButton.this.sendAgainTV, width);
                long j = C10749b8.C10751b.f30743b - currentTimeMillis;
                OtpButton.this.sendAgainLayout.setVisibility(0);
                OtpButton.this.anim = ValueAnimator.ofInt(new int[]{(int) ((((float) currentTimeMillis) / 60000.0f) * ((float) width)), width});
                OtpButton.this.anim.setInterpolator(new LinearInterpolator());
                OtpButton.this.anim.addUpdateListener(new C35751a());
                OtpButton.this.anim.setDuration(j);
                OtpButton.this.anim.start();
                return;
            }
            OtpButton.this.enableSendAgainButton();
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.OtpButton$d */
    class C35752d implements Runnable {
        C35752d() {
        }

        public void run() {
            C32290b1.m95126p(OtpButton.this.sendAgainTV, OtpButton.this.sendAgainDisabled.getWidth());
            C32290b1.m95126p(OtpButton.this.sendAgainLayout, OtpButton.this.sendAgainDisabled.getWidth());
            OtpButton.this.sendAgainLayout.setVisibility(0);
        }
    }

    public OtpButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(context, C10324m.layout_otp_button, this);
        this.sendAgainTV = (TextView) findViewById(C10322k.otp_wizard_recover_send_again);
        this.sendAgainDisabled = (TextView) findViewById(C10322k.otp_wizard_recover_send_again_disabled);
        View findViewById = findViewById(C10322k.try_again_container);
        this.sendAgainLayout = findViewById;
        findViewById.setOnClickListener(new C35748a());
        this.sendAgainDisabled.setOnClickListener(new C35749b());
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29164S5);
        if (obtainStyledAttributes != null) {
            String string = obtainStyledAttributes.getString(C10330s.f29174T5);
            if (string != null) {
                this.sendAgainDisabled.setText(string);
                this.sendAgainTV.setText(string);
            }
            obtainStyledAttributes.getColor(C10330s.f29194V5, C32335t0.m95366k(context));
            this.sendAgainTV.setTextColor(C32335t0.m95358c(getContext()));
            this.sendAgainDisabled.setTextColor(obtainStyledAttributes.getColor(C10330s.f29184U5, C0767a.m2893c(context, C10318g.dark_text_color)));
            obtainStyledAttributes.recycle();
        }
    }

    private void disableSendAgainButton() {
        C32290b1.m95126p(this.sendAgainLayout, 0);
        this.sendAgainLayout.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public void enableSendAgainButton() {
        stopAnimation();
        this.sendAgainDisabled.post(new C35752d());
    }

    /* access modifiers changed from: private */
    public void notifyOtpClicked() {
        disableSendAgainButton();
        C39259a aVar = this.otpButtonClickListener;
        if (aVar != null) {
            aVar.mo86490a();
        }
    }

    private void stopAnimation() {
        ValueAnimator valueAnimator = this.anim;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.anim = null;
        }
    }

    public void animateSendAgainButton() {
        stopAnimation();
        if (getVisibility() == 0 && this.lastOtpRequestTimes[this.otpType] != -1) {
            this.sendAgainDisabled.post(new C35750c());
        }
    }

    public void continueSendAgainButtonAnimation() {
        if (System.currentTimeMillis() - this.lastOtpRequestTimes[this.otpType] < C10749b8.C10751b.f30743b) {
            animateSendAgainButton();
        } else {
            enableSendAgainButton();
        }
    }

    public void onOtpRequestFailure() {
        this.lastOtpRequestTimes[this.otpType] = -1;
        enableSendAgainButton();
    }

    public void onOtpRequestOk() {
        this.lastOtpRequestTimes[this.otpType] = System.currentTimeMillis();
        animateSendAgainButton();
    }

    /* access modifiers changed from: protected */
    public void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 8) {
            stopAnimation();
        } else if (i == 0) {
            animateSendAgainButton();
        }
    }

    public void resetAndHide() {
        stopAnimation();
        long[] jArr = this.lastOtpRequestTimes;
        jArr[0] = -1;
        jArr[1] = -1;
        disableSendAgainButton();
        setVisibility(8);
    }

    public void setOtpButtonClickListener(C39259a aVar) {
        this.otpButtonClickListener = aVar;
    }

    public void setOtpType(int i) {
        this.otpType = i;
    }

    public void setTextColor(int i, int i2) {
        this.sendAgainTV.setTextColor(i);
        this.sendAgainDisabled.setTextColor(i2);
    }
}

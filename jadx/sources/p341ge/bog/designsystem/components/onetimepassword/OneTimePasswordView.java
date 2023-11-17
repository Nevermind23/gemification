package p341ge.bog.designsystem.components.onetimepassword;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.CountDownTimer;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.text.C0969e;
import com.github.mikephil.charting.utils.Utils;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C41524c0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.Input;
import p352ak.C9936i4;
import p601sg.C17782g;
import p601sg.C17785j;
import p601sg.C17787l;
import p670xi.C18764a;
import p670xi.C18765b;
import p670xi.C18766c;
import p670xi.C18767d;
import p670xi.C18768e;
import p670xi.C18769f;
import p670xi.C18770g;

/* renamed from: ge.bog.designsystem.components.onetimepassword.OneTimePasswordView */
public final class OneTimePasswordView extends LinearLayout {

    /* renamed from: d */
    private final C9936i4 f39901d;

    /* renamed from: e */
    private C18767d f39902e;

    /* renamed from: f */
    private C18767d f39903f;

    /* renamed from: g */
    private C18766c f39904g;

    /* renamed from: h */
    private RadioGroup.OnCheckedChangeListener f39905h;

    /* renamed from: i */
    private View.OnClickListener f39906i;

    /* renamed from: j */
    private C18765b f39907j;
    /* access modifiers changed from: private */

    /* renamed from: k */
    public C18764a f39908k;

    /* renamed from: l */
    private String f39909l;

    /* renamed from: m */
    private String f39910m;

    /* renamed from: n */
    private boolean f39911n;

    /* renamed from: o */
    private long f39912o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public long f39913p;

    /* renamed from: q */
    private long f39914q;

    /* renamed from: r */
    private CountDownTimer f39915r;
    /* access modifiers changed from: private */

    /* renamed from: s */
    public boolean f39916s;

    /* renamed from: t */
    private String f39917t;

    /* renamed from: u */
    private String f39918u;

    /* renamed from: ge.bog.designsystem.components.onetimepassword.OneTimePasswordView$a */
    public /* synthetic */ class C13408a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f39919a;

        /* renamed from: b */
        public static final /* synthetic */ int[] f39920b;

        /* JADX WARNING: Can't wrap try/catch for region: R(24:0|(2:1|2)|3|(2:5|6)|7|(2:9|10)|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Can't wrap try/catch for region: R(26:0|1|2|3|(2:5|6)|7|9|10|11|13|14|15|16|17|18|19|21|22|23|24|25|26|27|28|29|31) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x002b */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0034 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x004e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0056 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x005e */
        static {
            /*
                xi.d[] r0 = p670xi.C18767d.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                r1 = 1
                xi.d r2 = p670xi.C18767d.DIGIPASS     // Catch:{ NoSuchFieldError -> 0x0010 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0010 }
                r0[r2] = r1     // Catch:{ NoSuchFieldError -> 0x0010 }
            L_0x0010:
                r2 = 2
                xi.d r3 = p670xi.C18767d.HARD_DIGIPASS     // Catch:{ NoSuchFieldError -> 0x0019 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0019 }
                r0[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0019 }
            L_0x0019:
                r3 = 3
                xi.d r4 = p670xi.C18767d.PHONE     // Catch:{ NoSuchFieldError -> 0x0022 }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x0022 }
                r0[r4] = r3     // Catch:{ NoSuchFieldError -> 0x0022 }
            L_0x0022:
                r4 = 4
                xi.d r5 = p670xi.C18767d.PHONE_ONLY     // Catch:{ NoSuchFieldError -> 0x002b }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x002b }
                r0[r5] = r4     // Catch:{ NoSuchFieldError -> 0x002b }
            L_0x002b:
                xi.d r5 = p670xi.C18767d.EMAIL     // Catch:{ NoSuchFieldError -> 0x0034 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0034 }
                r6 = 5
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x0034 }
            L_0x0034:
                xi.d r5 = p670xi.C18767d.EMAIL_ONLY     // Catch:{ NoSuchFieldError -> 0x003d }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x003d }
                r6 = 6
                r0[r5] = r6     // Catch:{ NoSuchFieldError -> 0x003d }
            L_0x003d:
                f39919a = r0
                xi.c[] r0 = p670xi.C18766c.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                xi.c r5 = p670xi.C18766c.NORMAL     // Catch:{ NoSuchFieldError -> 0x004e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004e }
                r0[r5] = r1     // Catch:{ NoSuchFieldError -> 0x004e }
            L_0x004e:
                xi.c r1 = p670xi.C18766c.WAITING     // Catch:{ NoSuchFieldError -> 0x0056 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0056 }
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0056 }
            L_0x0056:
                xi.c r1 = p670xi.C18766c.RESEND     // Catch:{ NoSuchFieldError -> 0x005e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x005e }
                r0[r1] = r3     // Catch:{ NoSuchFieldError -> 0x005e }
            L_0x005e:
                xi.c r1 = p670xi.C18766c.INCORRECT     // Catch:{ NoSuchFieldError -> 0x0066 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0066 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0066 }
            L_0x0066:
                f39920b = r0
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.onetimepassword.OneTimePasswordView.C13408a.<clinit>():void");
        }
    }

    /* renamed from: ge.bog.designsystem.components.onetimepassword.OneTimePasswordView$b */
    public static final class C13409b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ OneTimePasswordView f39921d;

        public C13409b(OneTimePasswordView oneTimePasswordView) {
            this.f39921d = oneTimePasswordView;
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            if (this.f39921d.getOtpState() == C18766c.INCORRECT) {
                this.f39921d.mo36275p();
            }
        }
    }

    /* renamed from: ge.bog.designsystem.components.onetimepassword.OneTimePasswordView$c */
    public static final class C13410c extends CountDownTimer {

        /* renamed from: a */
        final /* synthetic */ OneTimePasswordView f39922a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C13410c(OneTimePasswordView oneTimePasswordView, long j, long j2) {
            super(j, j2);
            this.f39922a = oneTimePasswordView;
        }

        public void onFinish() {
            this.f39922a.mo36275p();
            C18764a e = this.f39922a.f39908k;
            if (e != null) {
                e.invoke();
            }
            this.f39922a.f39916s = true;
        }

        public void onTick(long j) {
            this.f39922a.f39913p = j;
            this.f39922a.m50385w();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public OneTimePasswordView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m50374c(OneTimePasswordView oneTimePasswordView, View view) {
        C41536l.m120489i(oneTimePasswordView, "this$0");
        View.OnClickListener onClickListener = oneTimePasswordView.f39906i;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        C18767d dVar = oneTimePasswordView.f39902e;
        oneTimePasswordView.f39903f = dVar;
        int i = C13408a.f39919a[dVar.ordinal()];
        if (i == 1) {
            oneTimePasswordView.mo36277s();
        } else if (i != 2) {
            oneTimePasswordView.mo36273o();
            oneTimePasswordView.m50386x();
        } else {
            oneTimePasswordView.mo36290u();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m50375d(OneTimePasswordView oneTimePasswordView, RadioGroup radioGroup, int i) {
        C41536l.m120489i(oneTimePasswordView, "this$0");
        if (i == C17782g.email_radio) {
            oneTimePasswordView.f39902e = C18767d.EMAIL;
        } else if (i == C17782g.sms_radio) {
            oneTimePasswordView.f39902e = C18767d.PHONE;
        }
        C18767d dVar = oneTimePasswordView.f39902e;
        C18767d dVar2 = C18767d.EMAIL;
        if (dVar != dVar2 || !oneTimePasswordView.f39911n) {
            boolean z = oneTimePasswordView.f39916s;
            if (!z && dVar != oneTimePasswordView.f39903f) {
                oneTimePasswordView.mo36276r();
            } else if (z || dVar != oneTimePasswordView.f39903f) {
                oneTimePasswordView.m50380i();
            } else {
                oneTimePasswordView.mo36273o();
            }
        } else {
            oneTimePasswordView.f39911n = false;
            oneTimePasswordView.m50386x();
            oneTimePasswordView.f39903f = dVar2;
            oneTimePasswordView.mo36273o();
            C18765b bVar = oneTimePasswordView.f39907j;
            if (bVar != null) {
                bVar.mo46551n();
            }
        }
        RadioGroup.OnCheckedChangeListener onCheckedChangeListener = oneTimePasswordView.f39905h;
        if (onCheckedChangeListener != null) {
            onCheckedChangeListener.onCheckedChanged(radioGroup, i);
        }
    }

    private final Spanned getResendText() {
        int i = C13408a.f39919a[this.f39902e.ordinal()];
        if (i == 3 || i == 4) {
            Spanned a = C0969e.m3470a(getContext().getString(C17785j.ds_otp_resend_text, new Object[]{getContext().getString(C17785j.ds_otp_on_phone), m50383l(this.f39909l)}), 0);
            C41536l.m120488h(a, "fromHtml(\n              …_LEGACY\n                )");
            return a;
        } else if (i == 5 || i == 6) {
            Spanned a2 = C0969e.m3470a(getContext().getString(C17785j.ds_otp_resend_text, new Object[]{getContext().getString(C17785j.ds_otp_on_email), m50383l(this.f39910m)}), 0);
            C41536l.m120488h(a2, "fromHtml(\n              …_LEGACY\n                )");
            return a2;
        } else {
            Spanned a3 = C0969e.m3470a("", 0);
            C41536l.m120488h(a3, "fromHtml(\"\", HtmlCompat.FROM_HTML_MODE_LEGACY)");
            return a3;
        }
    }

    private final Spanned getTimerText() {
        int i = C13408a.f39919a[this.f39902e.ordinal()];
        if (i == 3 || i == 4) {
            Spanned a = C0969e.m3470a(getContext().getString(C17785j.ds_otp_timer_text, new Object[]{getContext().getString(C17785j.ds_otp_on_phone), m50383l(this.f39909l)}), 0);
            C41536l.m120488h(a, "fromHtml(\n              …_LEGACY\n                )");
            return a;
        }
        Spanned a2 = C0969e.m3470a(getContext().getString(C17785j.ds_otp_timer_text, new Object[]{getContext().getString(C17785j.ds_otp_on_email), m50383l(this.f39910m)}), 0);
        C41536l.m120488h(a2, "fromHtml(\n              …_LEGACY\n                )");
        return a2;
    }

    /* renamed from: i */
    private final void m50380i() {
        int i = C13408a.f39920b[this.f39904g.ordinal()];
        if (i == 1) {
            mo36273o();
        } else if (i == 2) {
            mo36276r();
        } else if (i == 3) {
            mo36275p();
        } else if (i == 4) {
            mo36272n();
        }
    }

    /* renamed from: j */
    private final void m50381j(View view, int i) {
        if (!(i == 4 || view.getVisibility() == i)) {
            float f = 1.0f;
            float f2 = Utils.FLOAT_EPSILON;
            if (i != 8) {
                f2 = 1.0f;
                f = 0.0f;
            }
            view.setAlpha(f);
            view.animate().alpha(f2);
        }
        view.setVisibility(i);
    }

    /* renamed from: k */
    private final Spanned m50382k(String str) {
        if (C13408a.f39919a[this.f39902e.ordinal()] == 3) {
            Spanned a = C0969e.m3470a(getContext().getString(C17785j.ds_otp_waiting_timer_text, new Object[]{getContext().getString(C17785j.ds_otp_on_mobile), m50383l(str)}), 0);
            C41536l.m120488h(a, "fromHtml(\n              …_LEGACY\n                )");
            return a;
        }
        Spanned a2 = C0969e.m3470a(getContext().getString(C17785j.ds_otp_waiting_timer_text, new Object[]{getContext().getString(C17785j.ds_otp_on_email), m50383l(str)}), 0);
        C41536l.m120488h(a2, "fromHtml(\n              …_LEGACY\n                )");
        return a2;
    }

    /* renamed from: l */
    private final String m50383l(String str) {
        return C40439w.m117103B("<b>" + str + "</b>", " ", "&nbsp;", false, 4, (Object) null);
    }

    /* renamed from: q */
    private final void m50384q() {
        AppCompatTextView appCompatTextView = this.f39901d.f27111i;
        C41536l.m120488h(appCompatTextView, "binding.otpInfoText");
        m50381j(appCompatTextView, this.f39904g.mo46553c());
        Input input = this.f39901d.f27107e;
        C41536l.m120488h(input, "binding.codeInput");
        m50381j(input, this.f39904g.mo46552b());
        Button button = this.f39901d.f27114l;
        C41536l.m120488h(button, "binding.resendButton");
        m50381j(button, this.f39904g.mo46555f());
        this.f39901d.f27114l.setEnabled(this.f39904g.mo46554e());
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m50385w() {
        int i = C13408a.f39920b[this.f39904g.ordinal()];
        if (i == 1) {
            this.f39901d.f27111i.setText(getTimerText());
        } else if (i == 2) {
            C41524c0 c0Var = C41524c0.f97701a;
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            String format = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(timeUnit.toMinutes(this.f39913p)), Long.valueOf(timeUnit.toSeconds(this.f39913p))}, 2));
            C41536l.m120488h(format, "format(format, *args)");
            this.f39901d.f27111i.setText(m50382k(format));
        } else {
            C18766c cVar = this.f39904g;
            throw new Exception("otp state " + cVar + " is not allowed here");
        }
    }

    /* renamed from: x */
    private final void m50386x() {
        CountDownTimer countDownTimer = this.f39915r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C13410c cVar = new C13410c(this, this.f39912o, this.f39914q);
        this.f39915r = cVar;
        cVar.start();
        this.f39916s = false;
    }

    public final C9936i4 getBinding() {
        return this.f39901d;
    }

    public final String getCodeText() {
        return this.f39901d.f27107e.getTextInput().getText().toString();
    }

    public final String getDigipassParam1() {
        return this.f39917t;
    }

    public final String getDigipassParam2() {
        return this.f39918u;
    }

    public final C18767d getOtpSentType() {
        return this.f39903f;
    }

    public final C18766c getOtpState() {
        return this.f39904g;
    }

    public final C18767d getOtpType() {
        return this.f39902e;
    }

    /* renamed from: m */
    public final void mo36271m() {
        m50386x();
    }

    /* renamed from: n */
    public final void mo36272n() {
        this.f39901d.f27107e.setInfoText(getContext().getString(C17785j.ds_otp_invalid_code));
        this.f39901d.f27107e.mo35920c();
        this.f39904g = C18766c.INCORRECT;
        CountDownTimer countDownTimer = this.f39915r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f39916s = true;
        C18767d dVar = this.f39902e;
        if (dVar != C18767d.DIGIPASS && dVar != C18767d.HARD_DIGIPASS) {
            m50384q();
        }
    }

    /* renamed from: o */
    public final void mo36273o() {
        this.f39901d.f27107e.getTextInput().getText().clear();
        this.f39901d.f27107e.setInfoText((CharSequence) null);
        this.f39901d.f27107e.mo35919b();
        this.f39904g = C18766c.NORMAL;
        m50385w();
        m50384q();
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        CountDownTimer countDownTimer = this.f39915r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }

    /* renamed from: p */
    public final void mo36275p() {
        this.f39901d.f27111i.setText(getResendText());
        this.f39901d.f27107e.setInfoText((CharSequence) null);
        this.f39901d.f27107e.mo35919b();
        this.f39904g = C18766c.RESEND;
        CountDownTimer countDownTimer = this.f39915r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        C18767d dVar = this.f39902e;
        if (dVar != C18767d.DIGIPASS && dVar != C18767d.HARD_DIGIPASS) {
            m50384q();
        }
    }

    /* renamed from: r */
    public final void mo36276r() {
        this.f39901d.f27107e.setInfoText((CharSequence) null);
        this.f39901d.f27107e.mo35919b();
        this.f39904g = C18766c.WAITING;
        m50385w();
        m50384q();
    }

    /* renamed from: s */
    public final void mo36277s() {
        this.f39902e = C18767d.DIGIPASS;
        this.f39904g = C18766c.NORMAL;
        CountDownTimer countDownTimer = this.f39915r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f39901d.f27113k.setVisibility(8);
        this.f39901d.f27111i.setVisibility(8);
        this.f39901d.f27114l.setVisibility(8);
        this.f39901d.f27112j.setVisibility(8);
        Input input = this.f39901d.f27107e;
        String string = getContext().getString(C17785j.ds_otp_hint_digipass_code);
        C41536l.m120488h(string, "context.getString(R.stri…s_otp_hint_digipass_code)");
        input.setHintText(string);
        this.f39901d.f27107e.getTextInput().getText().clear();
        this.f39901d.f27107e.setInfoText((CharSequence) null);
        this.f39901d.f27107e.mo35919b();
    }

    public final void setCodeText(String str) {
        C41536l.m120489i(str, "code");
        this.f39901d.f27107e.setInputText(str);
    }

    public final void setCountDownTimeInMilliseconds(long j) {
        this.f39912o = j;
        m50386x();
    }

    public final void setEmail(String str) {
        C41536l.m120489i(str, "email");
        this.f39910m = C18770g.m63517a(str);
        m50380i();
    }

    public final void setEmailEnabled(boolean z) {
        this.f39901d.f27108f.setEnabled(z);
    }

    public final void setEmailFirstSelect(boolean z) {
        this.f39911n = z;
    }

    public final void setOneTimePasswordListener(C18765b bVar) {
        C41536l.m120489i(bVar, "oneTimePasswordListener");
        this.f39907j = bVar;
    }

    public final void setOtpTimerFinishedListener(C18764a aVar) {
        this.f39908k = aVar;
    }

    public final void setPhoneEnabled(boolean z) {
        this.f39901d.f27115m.setEnabled(z);
        if (!z) {
            this.f39901d.f27108f.setChecked(true);
            this.f39902e = C18767d.EMAIL;
        }
    }

    public final void setPhoneNumber(String str) {
        C41536l.m120489i(str, "phone");
        this.f39909l = C18770g.m63518b(str);
        m50380i();
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "onResendClicked");
        this.f39906i = onClickListener;
    }

    public final void setTypeCheckChangedListener(RadioGroup.OnCheckedChangeListener onCheckedChangeListener) {
        C41536l.m120489i(onCheckedChangeListener, "onTypeChanged");
        this.f39905h = onCheckedChangeListener;
    }

    /* renamed from: t */
    public final void mo36289t() {
        this.f39902e = C18767d.EMAIL_ONLY;
        this.f39904g = C18766c.NORMAL;
        this.f39901d.f27113k.setVisibility(8);
        this.f39901d.f27112j.setVisibility(8);
        Input input = this.f39901d.f27107e;
        String string = getContext().getString(C17785j.ds_otp_hint_code);
        C41536l.m120488h(string, "context.getString(R.string.ds_otp_hint_code)");
        input.setHintText(string);
        this.f39901d.f27114l.setButtonText(getContext().getString(C17785j.ds_otp_button_resend));
        mo36273o();
    }

    /* renamed from: u */
    public final void mo36290u() {
        this.f39902e = C18767d.HARD_DIGIPASS;
        this.f39904g = C18766c.NORMAL;
        CountDownTimer countDownTimer = this.f39915r;
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
        this.f39901d.f27113k.setVisibility(8);
        this.f39901d.f27111i.setVisibility(8);
        this.f39901d.f27114l.setVisibility(8);
        this.f39901d.f27112j.setVisibility(0);
        Input input = this.f39901d.f27107e;
        String string = getContext().getString(C17785j.ds_otp_hint_digipass_code);
        C41536l.m120488h(string, "context.getString(R.stri…s_otp_hint_digipass_code)");
        input.setHintText(string);
        this.f39901d.f27107e.getTextInput().getText().clear();
        this.f39901d.f27107e.setInfoText((CharSequence) null);
        this.f39901d.f27107e.mo35919b();
    }

    /* renamed from: v */
    public final void mo36291v() {
        this.f39902e = C18767d.PHONE_ONLY;
        this.f39904g = C18766c.NORMAL;
        this.f39901d.f27113k.setVisibility(8);
        this.f39901d.f27112j.setVisibility(8);
        Input input = this.f39901d.f27107e;
        String string = getContext().getString(C17785j.ds_otp_hint_code);
        C41536l.m120488h(string, "context.getString(R.string.ds_otp_hint_code)");
        input.setHintText(string);
        this.f39901d.f27114l.setButtonText(getContext().getString(C17785j.ds_otp_button_resend));
        mo36273o();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OneTimePasswordView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OneTimePasswordView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9936i4 c = C9936i4.m36446c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39901d = c;
        C18767d dVar = C18767d.PHONE;
        this.f39902e = dVar;
        this.f39903f = dVar;
        this.f39904g = C18766c.NORMAL;
        this.f39909l = "";
        this.f39910m = "";
        this.f39911n = true;
        this.f39912o = 30000;
        this.f39914q = 1000;
        this.f39916s = true;
        this.f39917t = "";
        this.f39918u = "";
        setOrientation(1);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50320f9);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…able.OneTimePasswordView)");
            setPhoneEnabled(obtainStyledAttributes.getBoolean(C17787l.f50384j9, true));
            setEmailEnabled(obtainStyledAttributes.getBoolean(C17787l.f50352h9, true));
            if (obtainStyledAttributes.getBoolean(C17787l.f50336g9, false)) {
                this.f39902e = C18767d.DIGIPASS;
            } else if (obtainStyledAttributes.getBoolean(C17787l.f50368i9, false)) {
                this.f39902e = C18767d.HARD_DIGIPASS;
            }
            obtainStyledAttributes.recycle();
        }
        c.f27107e.getTextInput().setInputType(2);
        c.f27114l.setOnClickListener(new C18768e(this));
        c.f27113k.setOnCheckedChangeListener(new C18769f(this));
        c.f27107e.getTextInput().addTextChangedListener(new C13409b(this));
        mo36273o();
        m50386x();
        C18767d dVar2 = this.f39902e;
        if (dVar2 == C18767d.DIGIPASS) {
            mo36277s();
        } else if (dVar2 == C18767d.HARD_DIGIPASS) {
            mo36290u();
        }
    }
}

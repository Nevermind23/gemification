package p341ge.bog.designsystem.components.cardinput;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.C0630d;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.C41550z;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.input.BogEditText;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;
import p352ak.C9870a2;
import p532nh.C16934a;
import p532nh.C16935b;
import p532nh.C16936c;
import p532nh.C16937d;
import p532nh.C16938e;
import p532nh.C16939f;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18368l;
import p669xh.C18763a;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.cardinput.CardInput */
public final class CardInput extends RelativeLayout {

    /* renamed from: k */
    public static final C13207a f38963k = new C13207a((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f38964l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public static final int[] f38965m = {4, 8, 12};
    /* access modifiers changed from: private */

    /* renamed from: n */
    public static final int[] f38966n = {4, 10};
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9870a2 f38967d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C18763a f38968e;

    /* renamed from: f */
    private List f38969f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public C13209c f38970g;

    /* renamed from: h */
    private final C18355e0 f38971h;

    /* renamed from: i */
    private final C18355e0 f38972i;

    /* renamed from: j */
    private long f38973j;

    /* renamed from: ge.bog.designsystem.components.cardinput.CardInput$a */
    public static final class C13207a {
        private C13207a() {
        }

        public /* synthetic */ C13207a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.cardinput.CardInput$b */
    public interface C13208b {
    }

    /* renamed from: ge.bog.designsystem.components.cardinput.CardInput$c */
    public interface C13209c {
        /* renamed from: a */
        void mo35055a(String str, String str2, String str3);
    }

    /* renamed from: ge.bog.designsystem.components.cardinput.CardInput$d */
    public static final class C13210d implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CardInput f38974d;

        /* renamed from: e */
        final /* synthetic */ C41550z f38975e;

        public C13210d(CardInput cardInput, C41550z zVar) {
            this.f38974d = cardInput;
            this.f38975e = zVar;
        }

        /* JADX WARNING: Removed duplicated region for block: B:12:0x0026  */
        /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void afterTextChanged(android.text.Editable r8) {
            /*
                r7 = this;
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                ak.a2 r1 = r0.f38967d
                ge.bog.designsystem.components.input.BogEditText r1 = r1.f26753q
                boolean r1 = r1.isFocused()
                r2 = 1
                r3 = 0
                if (r1 != 0) goto L_0x0020
                if (r8 == 0) goto L_0x001b
                int r1 = r8.length()
                if (r1 != 0) goto L_0x0019
                goto L_0x001b
            L_0x0019:
                r1 = r3
                goto L_0x001c
            L_0x001b:
                r1 = r2
            L_0x001c:
                if (r1 == 0) goto L_0x0020
                r1 = r2
                goto L_0x0021
            L_0x0020:
                r1 = r3
            L_0x0021:
                r0.m49650D(r1)
                if (r8 == 0) goto L_0x0119
                int r0 = r8.length()
                r1 = 0
                r4 = 4
                if (r0 >= r4) goto L_0x0044
                ge.bog.designsystem.components.cardinput.CardInput r8 = r7.f38974d
                r8.f38968e = r1
                ge.bog.designsystem.components.cardinput.CardInput r8 = r7.f38974d
                r8.m49687z()
                ge.bog.designsystem.components.cardinput.CardInput r8 = r7.f38974d
                r8.m49648B()
                ge.bog.designsystem.components.cardinput.CardInput r8 = r7.f38974d
                r8.m49660N()
                goto L_0x00fc
            L_0x0044:
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                java.lang.String r5 = r8.toString()
                java.lang.String r4 = r5.substring(r3, r4)
                java.lang.String r5 = "this as java.lang.String…ing(startIndex, endIndex)"
                kotlin.jvm.internal.C41536l.m120488h(r4, r5)
                xh.a r4 = r0.m49685x(r4)
                r0.f38968e = r4
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                xh.a r0 = r0.f38968e
                xh.a r4 = p669xh.C18763a.AMERICAN_EXPRESS
                r5 = 15
                r6 = 16
                if (r0 != r4) goto L_0x007d
                android.text.InputFilter[] r0 = new android.text.InputFilter[r2]
                android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
                r2.<init>(r5)
                r0[r3] = r2
                r8.setFilters(r0)
                kotlin.jvm.internal.z r0 = r7.f38975e
                int[] r2 = p341ge.bog.designsystem.components.cardinput.CardInput.f38966n
                r0.f97717d = r2
                goto L_0x0091
            L_0x007d:
                android.text.InputFilter[] r0 = new android.text.InputFilter[r2]
                android.text.InputFilter$LengthFilter r2 = new android.text.InputFilter$LengthFilter
                r2.<init>(r6)
                r0[r3] = r2
                r8.setFilters(r0)
                kotlin.jvm.internal.z r0 = r7.f38975e
                int[] r2 = p341ge.bog.designsystem.components.cardinput.CardInput.f38965m
                r0.f97717d = r2
            L_0x0091:
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                xh.a r0 = r0.f38968e
                if (r0 == 0) goto L_0x00a0
                ge.bog.designsystem.components.cardinput.CardInput r1 = r7.f38974d
                r1.m49659M(r0)
                he1.w r1 = he1.C41238w.f97225a
            L_0x00a0:
                if (r1 != 0) goto L_0x00a7
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                r0.m49687z()
            L_0x00a7:
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                r0.m49647A()
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                xh.a r1 = r0.f38968e
                r0.m49661O(r1)
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                java.util.List r0 = r0.getCreditCards()
                ge.bog.designsystem.components.cardinput.CardInput r1 = r7.f38974d
                xh.a r1 = r1.f38968e
                boolean r0 = ie1.C41358y.m119999O(r0, r1)
                if (r0 == 0) goto L_0x00f1
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                xh.a r0 = r0.f38968e
                if (r0 != r4) goto L_0x00d5
                int r0 = r8.length()
                if (r0 == r5) goto L_0x00db
            L_0x00d5:
                int r0 = r8.length()
                if (r0 != r6) goto L_0x00f1
            L_0x00db:
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                ak.a2 r0 = r0.f38967d
                ge.bog.designsystem.components.input.BogEditText r0 = r0.f26753q
                r0.clearFocus()
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                ak.a2 r0 = r0.f38967d
                ge.bog.designsystem.components.input.BogEditText r0 = r0.f26748l
                r0.requestFocus()
            L_0x00f1:
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                kotlin.jvm.internal.z r1 = r7.f38975e
                java.lang.Object r1 = r1.f97717d
                int[] r1 = (int[]) r1
                r0.m49684w(r8, r1)
            L_0x00fc:
                ge.bog.designsystem.components.cardinput.CardInput r8 = r7.f38974d
                ge.bog.designsystem.components.cardinput.CardInput$c r8 = r8.f38970g
                if (r8 == 0) goto L_0x0119
                ge.bog.designsystem.components.cardinput.CardInput r0 = r7.f38974d
                java.lang.String r0 = r0.getCardNumber()
                ge.bog.designsystem.components.cardinput.CardInput r1 = r7.f38974d
                java.lang.String r1 = r1.getExpireDate()
                ge.bog.designsystem.components.cardinput.CardInput r2 = r7.f38974d
                java.lang.String r2 = r2.getCvv()
                r8.mo35055a(r0, r1, r2)
            L_0x0119:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.cardinput.CardInput.C13210d.afterTextChanged(android.text.Editable):void");
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.designsystem.components.cardinput.CardInput$e */
    public static final class C13211e implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CardInput f38976d;

        public C13211e(CardInput cardInput) {
            this.f38976d = cardInput;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            if (editable != null) {
                if (editable.length() > 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z && Character.getNumericValue(C40445z.m117191V0(editable.toString())) > 1) {
                    editable.insert(0, BankApiResponse.SUCCESSFUL_RESPONSE_CODE);
                    this.f38976d.f38967d.f26748l.setSelection(editable.length());
                }
                if (editable.length() == 4) {
                    this.f38976d.f38967d.f26748l.clearFocus();
                    this.f38976d.f38967d.f26745i.requestFocus();
                }
                this.f38976d.m49683v(editable);
            }
            C13209c l = this.f38976d.f38970g;
            if (l != null) {
                l.mo35055a(this.f38976d.getCardNumber(), this.f38976d.getExpireDate(), this.f38976d.getCvv());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.designsystem.components.cardinput.CardInput$f */
    public static final class C13212f implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ CardInput f38977d;

        public C13212f(CardInput cardInput) {
            this.f38977d = cardInput;
        }

        public void afterTextChanged(Editable editable) {
            C13209c l = this.f38977d.f38970g;
            if (l != null) {
                l.mo35055a(this.f38977d.getCardNumber(), this.f38977d.getExpireDate(), this.f38977d.getCvv());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    static {
        Class<CardInput> cls = CardInput.class;
        f38964l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "expireTitle", "getExpireTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "cvvTitle", "getCvvTitle()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public CardInput(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: A */
    public final void m49647A() {
        this.f38967d.f26743g.setVisibility(8);
    }

    /* access modifiers changed from: private */
    /* renamed from: B */
    public final void m49648B() {
        this.f38967d.f26744h.setVisibility(8);
    }

    /* renamed from: C */
    private final void m49649C(Editable editable) {
        C16939f[] fVarArr = (C16939f[]) editable.getSpans(0, editable.length(), C16939f.class);
        C41536l.m120488h(fVarArr, "toRemoveSpans");
        for (C16939f removeSpan : fVarArr) {
            editable.removeSpan(removeSpan);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: D */
    public final void m49650D(boolean z) {
        float f;
        float f2;
        TextView textView = this.f38967d.f26752p;
        if (textView.getMeasuredHeight() == 0 || textView.getMeasuredWidth() == 0) {
            this.f38967d.f26752p.measure(0, 0);
        }
        if (z) {
            f = 1.0f;
        } else {
            f = 0.8f;
        }
        float f3 = Utils.FLOAT_EPSILON;
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = getHintLateralTranslation();
        }
        if (!z) {
            f3 = getHintLongitudinalTranslation();
        }
        this.f38967d.f26752p.animate().scaleX(f).scaleY(f).translationX(f2).translationY(f3).setDuration(this.f38973j).start();
    }

    /* renamed from: E */
    private final void m49651E() {
        this.f38967d.f26753q.setOnFocusChangeListener(new C16934a(this));
        this.f38967d.f26748l.setOnFocusChangeListener(new C16935b(this));
        this.f38967d.f26745i.setOnFocusChangeListener(new C16936c(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: F */
    public static final void m49652F(CardInput cardInput, View view, boolean z) {
        boolean z2;
        C41536l.m120489i(cardInput, "this$0");
        cardInput.f38967d.mo3946b().setActivated(z);
        if (z) {
            BogEditText bogEditText = cardInput.f38967d.f26753q;
            C41536l.m120488h(bogEditText, "binding.numberInput");
            C18368l.m62749D(bogEditText);
        }
        boolean z3 = false;
        if (!z) {
            Editable text = cardInput.f38967d.f26753q.getText();
            if (text == null || text.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                z3 = true;
            }
        }
        cardInput.m49650D(z3);
    }

    /* access modifiers changed from: private */
    /* renamed from: G */
    public static final void m49653G(CardInput cardInput, View view, boolean z) {
        C41536l.m120489i(cardInput, "this$0");
        cardInput.f38967d.mo3946b().setActivated(z);
    }

    /* access modifiers changed from: private */
    /* renamed from: H */
    public static final void m49654H(CardInput cardInput, View view, boolean z) {
        C41536l.m120489i(cardInput, "this$0");
        cardInput.f38967d.mo3946b().setActivated(z);
    }

    /* renamed from: I */
    private final void m49655I() {
        this.f38967d.f26748l.setOnKeyListener(new C16937d(this));
        this.f38967d.f26745i.setOnKeyListener(new C16938e(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: J */
    public static final boolean m49656J(CardInput cardInput, View view, int i, KeyEvent keyEvent) {
        boolean z;
        C41536l.m120489i(cardInput, "this$0");
        if (i == 67) {
            Editable text = cardInput.f38967d.f26748l.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cardInput.f38967d.f26748l.clearFocus();
                cardInput.f38967d.f26753q.requestFocus();
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: K */
    public static final boolean m49657K(CardInput cardInput, View view, int i, KeyEvent keyEvent) {
        boolean z;
        C41536l.m120489i(cardInput, "this$0");
        if (i == 67) {
            Editable text = cardInput.f38967d.f26745i.getText();
            if (text == null || text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                cardInput.f38967d.f26745i.clearFocus();
                cardInput.f38967d.f26748l.requestFocus();
                return true;
            }
        }
        return false;
    }

    /* renamed from: L */
    private final void m49658L() {
        C41550z zVar = new C41550z();
        BogEditText bogEditText = this.f38967d.f26753q;
        C41536l.m120488h(bogEditText, "binding.numberInput");
        bogEditText.addTextChangedListener(new C13210d(this, zVar));
        BogEditText bogEditText2 = this.f38967d.f26748l;
        C41536l.m120488h(bogEditText2, "binding.expInput");
        bogEditText2.addTextChangedListener(new C13211e(this));
        BogEditText bogEditText3 = this.f38967d.f26745i;
        C41536l.m120488h(bogEditText3, "binding.cvvInput");
        bogEditText3.addTextChangedListener(new C13212f(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: M */
    public final void m49659M(C18763a aVar) {
        C0630d dVar = new C0630d();
        dVar.mo2942h(this.f38967d.f26741e);
        dVar.mo2950y(this.f38967d.f26742f.getId(), 6, (int) (((float) C18368l.m62762k(16)) + (((float) this.f38967d.f26752p.getMeasuredWidth()) * 0.8f) + ((float) C18368l.m62762k(8))));
        dVar.mo2937c(this.f38967d.f26741e);
        this.f38967d.f26742f.setVisibility(0);
        this.f38967d.f26742f.setCards((List<? extends C18763a>) C41339p.m119900e(aVar));
    }

    /* access modifiers changed from: private */
    /* renamed from: N */
    public final void m49660N() {
        this.f38967d.f26743g.setVisibility(0);
    }

    /* access modifiers changed from: private */
    /* renamed from: O */
    public final void m49661O(C18763a aVar) {
        if (aVar == C18763a.AMERICAN_EXPRESS) {
            this.f38967d.f26745i.setHint("- - - -");
            this.f38967d.f26745i.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        } else {
            this.f38967d.f26745i.setHint("- - -");
            this.f38967d.f26745i.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            if (String.valueOf(this.f38967d.f26745i.getText()).length() > 3) {
                BogEditText bogEditText = this.f38967d.f26745i;
                String substring = String.valueOf(bogEditText.getText()).substring(0, 3);
                C41536l.m120488h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                bogEditText.setText(substring);
            }
        }
        this.f38967d.f26748l.setHint("- - / - -");
        this.f38967d.f26748l.setFilters(new InputFilter[]{new InputFilter.LengthFilter(4)});
        this.f38967d.f26744h.setVisibility(0);
    }

    private final float getHintLateralTranslation() {
        float measuredWidth = (float) this.f38967d.f26752p.getMeasuredWidth();
        return -((measuredWidth - (0.8f * measuredWidth)) * 0.5f);
    }

    private final float getHintLongitudinalTranslation() {
        return -(((float) (C18368l.m62762k(44) - this.f38967d.f26752p.getMeasuredHeight())) * 0.5f);
    }

    /* access modifiers changed from: private */
    /* renamed from: v */
    public final void m49683v(Editable editable) {
        m49649C(editable);
        if (editable.length() >= 2) {
            editable.setSpan(new C16939f(C11110u2.f31950c), 1, 2, 33);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public final void m49684w(Editable editable, int[] iArr) {
        m49649C(editable);
        for (int i : iArr) {
            if (i <= editable.length()) {
                editable.setSpan(new C16939f(" "), i - 1, i, 33);
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: x */
    public final C18763a m49685x(String str) {
        if (Pattern.matches("^4[0-9]{3}$", str)) {
            List list = this.f38969f;
            C18763a aVar = C18763a.VISA;
            if (list.contains(aVar)) {
                return aVar;
            }
        }
        if (Pattern.matches("^(?:5[1-5][0-9]{2}|222[1-9]|22[3-9][0-9]|2[3-6][0-9]{2}|27[01][0-9]|2720)$", str)) {
            List list2 = this.f38969f;
            C18763a aVar2 = C18763a.MASTER_CARD;
            if (list2.contains(aVar2)) {
                return aVar2;
            }
        }
        if (Pattern.matches("^3[47][0-9]{2}$", str)) {
            List list3 = this.f38969f;
            C18763a aVar3 = C18763a.AMERICAN_EXPRESS;
            if (list3.contains(aVar3)) {
                return aVar3;
            }
        }
        return null;
    }

    /* renamed from: y */
    private final String m49686y(String str) {
        StringBuilder sb = new StringBuilder(C40439w.m117105D(str, C11110u2.f31950c, "", false, 4, (Object) null));
        if (sb.length() > 1) {
            sb.insert(2, C11110u2.f31950c);
        }
        String sb2 = sb.toString();
        C41536l.m120488h(sb2, "expDateSB.toString()");
        return sb2;
    }

    /* access modifiers changed from: private */
    /* renamed from: z */
    public final void m49687z() {
        this.f38967d.f26742f.setVisibility(4);
    }

    public final String getCardNumber() {
        return String.valueOf(this.f38967d.f26753q.getText());
    }

    public final List<C18763a> getCreditCards() {
        return this.f38969f;
    }

    public final String getCvv() {
        return String.valueOf(this.f38967d.f26745i.getText());
    }

    public final CharSequence getCvvTitle() {
        return this.f38972i.getValue(this, f38964l[1]);
    }

    public final String getExpireDate() {
        return m49686y(String.valueOf(this.f38967d.f26748l.getText()));
    }

    public final CharSequence getExpireTitle() {
        return this.f38971h.getValue(this, f38964l[0]);
    }

    public final CharSequence getHintText() {
        return this.f38967d.f26752p.getText().toString();
    }

    public final CharSequence getInformationText() {
        return this.f38967d.f26750n.getText();
    }

    public boolean hasFocus() {
        return this.f38967d.f26753q.hasFocus() || this.f38967d.f26748l.hasFocus() || this.f38967d.f26745i.hasFocus();
    }

    public final void setCardNumber(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f38967d.f26753q.setText(str);
        this.f38967d.f26753q.setSelection(str.length());
    }

    public final void setCreditCards(List<? extends C18763a> list) {
        C41536l.m120489i(list, C11755a.C11756a.f34100b);
        this.f38969f = list;
        this.f38967d.f26743g.setCards(list);
    }

    public final void setCvv(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f38967d.f26745i.setText(str);
        this.f38967d.f26745i.setSelection(str.length());
    }

    public final void setCvvTitle(CharSequence charSequence) {
        this.f38972i.setValue(this, f38964l[1], charSequence);
    }

    public final void setEditable(boolean z) {
        BogEditText bogEditText = this.f38967d.f26753q;
        C41536l.m120488h(bogEditText, "binding.numberInput");
        C18368l.m62776y(bogEditText, z);
        BogEditText bogEditText2 = this.f38967d.f26748l;
        C41536l.m120488h(bogEditText2, "binding.expInput");
        C18368l.m62776y(bogEditText2, z);
        BogEditText bogEditText3 = this.f38967d.f26745i;
        C41536l.m120488h(bogEditText3, "binding.cvvInput");
        C18368l.m62776y(bogEditText3, z);
    }

    public final void setExpireDate(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f38967d.f26748l.setText(str);
        this.f38967d.f26748l.setSelection(str.length());
    }

    public final void setExpireTitle(CharSequence charSequence) {
        this.f38971h.setValue(this, f38964l[0], charSequence);
    }

    public final void setHintText(CharSequence charSequence) {
        this.f38967d.f26752p.setText(charSequence);
    }

    public final void setInformationText(CharSequence charSequence) {
        int i;
        AppCompatTextView appCompatTextView = this.f38967d.f26750n;
        appCompatTextView.setText(charSequence);
        if (charSequence == null) {
            i = 8;
        } else {
            i = 0;
        }
        appCompatTextView.setVisibility(i);
    }

    public final void setOnFocusChangeListener(C13208b bVar) {
    }

    public final void setOnTextChangeListener(C13209c cVar) {
        this.f38970g = cVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardInput(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardInput(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9870a2 c = C9870a2.m36205c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f38967d = c;
        this.f38969f = C41341q.m119907j();
        TextView textView = c.f26749m;
        C41536l.m120488h(textView, "binding.expTitle");
        this.f38971h = new C18355e0(textView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        TextView textView2 = c.f26746j;
        C41536l.m120488h(textView2, "binding.cvvTitle");
        this.f38972i = new C18355e0(textView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        int[] iArr = C17787l.f50217Z1;
        C41536l.m120488h(iArr, "CardInput");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        CharSequence text = obtainStyledAttributes.getText(C17787l.f50265c2);
        if (text != null) {
            C41536l.m120488h(text, "getText(R.styleable.Card…ut_card_information_text)");
            setInformationText(text);
        }
        CharSequence text2 = obtainStyledAttributes.getText(C17787l.f50281d2);
        if (text2 != null) {
            C41536l.m120488h(text2, "getText(R.styleable.CardInput_card_number_hint)");
            setHintText(text2);
        }
        CharSequence text3 = obtainStyledAttributes.getText(C17787l.f50249b2);
        if (text3 != null) {
            C41536l.m120488h(text3, "getText(R.styleable.Card…ut_card_expiration_title)");
            setExpireTitle(text3);
        }
        CharSequence text4 = obtainStyledAttributes.getText(C17787l.f50233a2);
        if (text4 != null) {
            C41536l.m120488h(text4, "getText(R.styleable.CardInput_card_cvv_title)");
            setCvvTitle(text4);
        }
        obtainStyledAttributes.recycle();
        m49651E();
        m49658L();
        m49655I();
        this.f38973j = 150;
    }
}

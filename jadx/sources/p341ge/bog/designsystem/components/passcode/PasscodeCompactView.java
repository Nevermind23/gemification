package p341ge.bog.designsystem.components.passcode;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.view.C1152f3;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p351aj.C9864a;
import p351aj.C9865b;
import p352ak.C9984o4;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18355e0;
import p642vh.C18365j0;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView */
public final class PasscodeCompactView extends LinearLayout {

    /* renamed from: l */
    public static final C13432a f40015l = new C13432a((DefaultConstructorMarker) null);

    /* renamed from: m */
    static final /* synthetic */ C40303i[] f40016m;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final C9984o4 f40017d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C13436d f40018e;

    /* renamed from: f */
    private C13433b f40019f;

    /* renamed from: g */
    private C13437e f40020g;

    /* renamed from: h */
    private final C18355e0 f40021h;

    /* renamed from: i */
    private boolean f40022i;

    /* renamed from: j */
    private final C18365j0 f40023j;

    /* renamed from: k */
    private C13434c f40024k;

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$a */
    public static final class C13432a {
        private C13432a() {
        }

        public /* synthetic */ C13432a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$b */
    public interface C13433b {
        /* renamed from: a */
        void mo36440a();
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$c */
    public enum C13434c {
        TEXT(1),
        NUMBER(2);
        

        /* renamed from: e */
        public static final C13435a f40025e = null;

        /* renamed from: d */
        private final int f40029d;

        /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$c$a */
        public static final class C13435a {
            private C13435a() {
            }

            public /* synthetic */ C13435a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            /* renamed from: a */
            public final C13434c mo36442a(int i) {
                for (C13434c cVar : C13434c.values()) {
                    if (cVar.ordinal() == i) {
                        return cVar;
                    }
                }
                return null;
            }
        }

        static {
            f40025e = new C13435a((DefaultConstructorMarker) null);
        }

        private C13434c(int i) {
            this.f40029d = i;
        }

        /* renamed from: b */
        public final int mo36441b() {
            return this.f40029d;
        }
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$d */
    public interface C13436d {
        /* renamed from: a */
        void mo36443a(String str);
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$e */
    private enum C13437e {
        NORMAL,
        ERROR
    }

    /* renamed from: ge.bog.designsystem.components.passcode.PasscodeCompactView$f */
    public static final class C13438f implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ PasscodeCompactView f40033d;

        public C13438f(PasscodeCompactView passcodeCompactView) {
            this.f40033d = passcodeCompactView;
        }

        public void afterTextChanged(Editable editable) {
            int i;
            String str;
            boolean z;
            if (editable != null) {
                i = editable.length() - 1;
            } else {
                i = -1;
            }
            LinearLayout linearLayout = this.f40033d.f40017d.f27370g;
            C41536l.m120488h(linearLayout, "binding.passcodeProgress");
            int i2 = 0;
            for (Object next : C1152f3.m4215b(linearLayout)) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    C41341q.m119917t();
                }
                View view = (View) next;
                if (i2 <= i) {
                    z = true;
                } else {
                    z = false;
                }
                view.setActivated(z);
                i2 = i3;
            }
            C13436d f = this.f40033d.f40018e;
            if (f != null) {
                if (editable == null || (str = editable.toString()) == null) {
                    str = "";
                }
                f.mo36443a(str);
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    static {
        Class<PasscodeCompactView> cls = PasscodeCompactView.class;
        f40016m = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "showForgotButton", "getShowForgotButton()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PasscodeCompactView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public static final void m50461c(PasscodeCompactView passcodeCompactView, View view) {
        C41536l.m120489i(passcodeCompactView, "this$0");
        if (passcodeCompactView.f40020g == C13437e.ERROR) {
            passcodeCompactView.mo36430h();
        }
        if (passcodeCompactView.f40022i) {
            passcodeCompactView.f40017d.f27369f.requestFocus();
            passcodeCompactView.m50465j();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m50462d(PasscodeCompactView passcodeCompactView, View view) {
        C41536l.m120489i(passcodeCompactView, "this$0");
        C13433b bVar = passcodeCompactView.f40019f;
        if (bVar != null) {
            bVar.mo36440a();
        }
    }

    /* renamed from: j */
    private final void m50465j() {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            inputMethodManager.toggleSoftInput(2, 1);
        }
    }

    /* renamed from: g */
    public final void mo36423g(String str) {
        C41536l.m120489i(str, "character");
        if (this.f40020g != C13437e.ERROR) {
            this.f40017d.f27369f.append(str);
        }
    }

    public final CharSequence getForgotPasscodeText() {
        return this.f40017d.f27368e.getButtonText();
    }

    public final C13434c getInputFormat() {
        return this.f40024k;
    }

    public final boolean getShowForgotButton() {
        return this.f40023j.getValue(this, f40016m[1]).booleanValue();
    }

    public final CharSequence getTitle() {
        return this.f40021h.getValue(this, f40016m[0]);
    }

    public final boolean getUseSystemKeyboard() {
        return this.f40022i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
        r0 = r0.toString();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String getValue() {
        /*
            r1 = this;
            ak.o4 r0 = r1.f40017d
            android.widget.EditText r0 = r0.f27369f
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0010
            java.lang.String r0 = r0.toString()
            if (r0 != 0) goto L_0x0012
        L_0x0010:
            java.lang.String r0 = ""
        L_0x0012:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p341ge.bog.designsystem.components.passcode.PasscodeCompactView.getValue():java.lang.String");
    }

    /* renamed from: h */
    public final void mo36430h() {
        LinearLayout linearLayout = this.f40017d.f27370g;
        C41536l.m120488h(linearLayout, "binding.passcodeProgress");
        int childCount = linearLayout.getChildCount();
        if (childCount > 0) {
            int i = 0;
            while (true) {
                int i2 = i + 1;
                View childAt = linearLayout.getChildAt(i);
                C41536l.m120488h(childAt, "getChildAt(index)");
                childAt.setEnabled(true);
                childAt.setActivated(false);
                if (i2 >= childCount) {
                    break;
                }
                i = i2;
            }
        }
        this.f40017d.f27369f.getText().clear();
        this.f40020g = C13437e.NORMAL;
    }

    /* renamed from: i */
    public final void mo36431i() {
        boolean z;
        if (this.f40020g != C13437e.ERROR) {
            Editable text = this.f40017d.f27369f.getText();
            C41536l.m120488h(text, "currentInput");
            if (text.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                this.f40017d.f27369f.setText(C40445z.m117189T0(text, 1));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(getResources().getDimensionPixelSize(C17779d.passcode_compact_width), 1073741824), i2);
    }

    public final void setForgotPasscodeText(CharSequence charSequence) {
        this.f40017d.f27368e.setButtonText(charSequence);
    }

    public final void setForgotPasswordClickListener(C13433b bVar) {
        this.f40019f = bVar;
    }

    public final void setInputFormat(C13434c cVar) {
        C41536l.m120489i(cVar, C11755a.C11756a.f34100b);
        this.f40024k = cVar;
        this.f40017d.f27369f.setInputType(cVar.mo36441b());
    }

    public final void setInputListener(C13436d dVar) {
        this.f40018e = dVar;
    }

    public final void setShowForgotButton(boolean z) {
        this.f40023j.mo46151c(this, f40016m[1], z);
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40021h.setValue(this, f40016m[0], charSequence);
    }

    public final void setUseSystemKeyboard(boolean z) {
        this.f40022i = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PasscodeCompactView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PasscodeCompactView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9984o4 c = C9984o4.m36619c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(\n        LayoutI…from(context), this\n    )");
        this.f40017d = c;
        this.f40020g = C13437e.NORMAL;
        AppCompatTextView appCompatTextView = c.f27371h;
        C41536l.m120488h(appCompatTextView, "binding.titleText");
        this.f40021h = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f40022i = true;
        Button button = c.f27368e;
        C41536l.m120488h(button, "binding.forgotPasscodeButton");
        this.f40023j = new C18365j0(button, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        C13434c cVar = C13434c.TEXT;
        this.f40024k = cVar;
        setOrientation(1);
        setGravity(1);
        setPadding(0, 0, 0, getResources().getDimensionPixelSize(C17779d.f49642K1));
        int[] iArr = C17787l.f49940G9;
        C41536l.m120488h(iArr, "PasscodeCompactView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setTitle(obtainStyledAttributes.getString(C17787l.f49985J9));
        setForgotPasscodeText(obtainStyledAttributes.getString(C17787l.f49955H9));
        this.f40022i = obtainStyledAttributes.getBoolean(C17787l.f50000K9, true);
        C13434c a = C13434c.f40025e.mo36442a(obtainStyledAttributes.getInt(C17787l.f49970I9, 0));
        setInputFormat(a != null ? a : cVar);
        obtainStyledAttributes.recycle();
        c.f27369f.setFilters((InputFilter[]) new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(4)});
        c.f27370g.setOnClickListener(new C9864a(this));
        EditText editText = c.f27369f;
        C41536l.m120488h(editText, "binding.hiddenInput");
        editText.addTextChangedListener(new C13438f(this));
        c.f27368e.setOnClickListener(new C9865b(this));
    }
}

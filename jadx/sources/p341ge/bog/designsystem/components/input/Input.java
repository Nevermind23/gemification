package p341ge.bog.designsystem.components.input;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.RelativeLayout;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.ArrayList;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p045d.C5769a;
import p341ge.bog.designsystem.components.checkbox.CheckboxView;
import p341ge.bog.designsystem.components.common.Image;
import p352ak.C10005r3;
import p352ak.C10012s3;
import p352ak.C10019t3;
import p533ni.C16942c;
import p533ni.C16945f;
import p547oi.C17201b;
import p561pi.C17365a;
import p589ri.C17617a;
import p601sg.C17787l;
import p603si.C17799b;
import p603si.C17811d;

/* renamed from: ge.bog.designsystem.components.input.Input */
public final class Input extends RelativeLayout implements C17811d {

    /* renamed from: d */
    private C16945f f39654d;

    /* renamed from: e */
    private C17799b f39655e;

    /* renamed from: f */
    private boolean f39656f;

    /* renamed from: g */
    private String f39657g;

    /* renamed from: h */
    private CharSequence f39658h;

    /* renamed from: i */
    private CharSequence f39659i;

    /* renamed from: j */
    private C17617a f39660j;

    /* renamed from: k */
    private boolean f39661k;

    /* renamed from: l */
    private String f39662l;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public Input(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: f */
    public static /* synthetic */ void m50261f(Input input, C17799b bVar, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        input.mo35923e(bVar, z, z2, z3);
    }

    /* renamed from: g */
    private final boolean m50262g(C17799b bVar, String str) {
        boolean g = bVar.mo45386g(str);
        if (!g) {
            this.f39654d.mo44140X(bVar.mo45383b());
            mo35920c();
        } else if (this.f39656f) {
            this.f39654d.mo44140X(this.f39658h);
            mo35921d();
        } else {
            this.f39654d.mo44140X(this.f39658h);
            mo35919b();
        }
        return g;
    }

    /* renamed from: a */
    public boolean mo35918a() {
        boolean z;
        if (this.f39654d.mo44179w() == C16942c.NEUTRAL || this.f39654d.mo44179w() == C16942c.POSITIVE) {
            C17799b bVar = this.f39655e;
            if (bVar != null) {
                z = m50262g(bVar, getRawText());
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final void mo35919b() {
        this.f39654d.mo44147e();
        this.f39654d.mo44140X(this.f39658h);
    }

    /* renamed from: c */
    public final void mo35920c() {
        this.f39654d.mo44146d0();
    }

    /* renamed from: d */
    public final void mo35921d() {
        this.f39654d.mo44154h0();
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C41536l.m120488h(drawableState, "states");
        this.f39654d.mo44120D(C41333m.m119793r(drawableState, 16842910), C41333m.m119793r(drawableState, 16843518));
    }

    /* renamed from: e */
    public final void mo35923e(C17799b bVar, boolean z, boolean z2, boolean z3) {
        boolean z4;
        Input input;
        this.f39655e = bVar;
        this.f39656f = z3;
        this.f39654d.mo44174r0(z);
        this.f39654d.mo44172q0(z2);
        C16945f fVar = this.f39654d;
        if (bVar != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            input = this;
        } else {
            input = null;
        }
        fVar.mo44170p0(input);
    }

    public final boolean getAnimate() {
        return this.f39661k;
    }

    public final CheckboxView.C13222b getCheckBoxListener() {
        return this.f39654d.mo44153h();
    }

    public final boolean getCheckBoxVisible() {
        return this.f39654d.mo44155i();
    }

    public final View getEndComponentView() {
        return this.f39654d.mo44165n();
    }

    public final Drawable getEndIconImageBig() {
        return this.f39654d.mo44167o();
    }

    public final Drawable getEndIconImageSmall() {
        return this.f39654d.mo44169p();
    }

    public final boolean getHasInputButton() {
        return this.f39654d.mo44173r();
    }

    public final CharSequence getHintText() {
        return this.f39659i;
    }

    public final CharSequence getInfoText() {
        return this.f39658h;
    }

    public final boolean getInputButtonEnabled() {
        return this.f39654d.mo44177u();
    }

    public final CharSequence getInputButtonText() {
        return this.f39654d.mo44178v();
    }

    public final String getInputText() {
        return getTextInput().getText().toString();
    }

    public final C17617a getMask() {
        return this.f39660j;
    }

    public final String getPhonePrefixText() {
        return this.f39654d.mo44180x();
    }

    public final String getRawText() {
        return this.f39654d.mo44181y();
    }

    public final Image getStartIconImage() {
        return this.f39654d.mo44182z();
    }

    public final Integer getStartIconTintColor() {
        return this.f39654d.mo44117A();
    }

    public final EditText getTextInput() {
        return this.f39654d.mo44118B();
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C41536l.m120489i(motionEvent, "ev");
        if ((this.f39654d instanceof C16945f.C16959e) || super.onInterceptTouchEvent(motionEvent)) {
            return true;
        }
        return false;
    }

    public final void setAnimate(boolean z) {
        this.f39661k = z;
        this.f39654d.mo44124H(z);
    }

    public final void setCheckBoxListener(CheckboxView.C13222b bVar) {
        this.f39654d.mo44125I(bVar);
    }

    public final void setCheckBoxVisible(boolean z) {
        this.f39654d.mo44126J(z);
    }

    public final void setChecked(boolean z) {
        this.f39654d.mo44127K(z);
    }

    public final void setEndComponentClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        this.f39654d.mo44130N(onClickListener);
    }

    public final void setEndComponentView(View view) {
        this.f39654d.mo44131O(view);
    }

    public final void setEndIconImageBig(Drawable drawable) {
        this.f39654d.mo44132P(drawable);
    }

    public final void setEndIconImageSmall(Drawable drawable) {
        this.f39654d.mo44133Q(drawable);
    }

    public final void setEndIconImageSmallClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        this.f39654d.mo44134R(onClickListener);
    }

    public final void setFilters(C17201b[] bVarArr) {
        C41536l.m120489i(bVarArr, "filters");
        EditText textInput = getTextInput();
        ArrayList arrayList = new ArrayList(bVarArr.length);
        for (C17201b b : bVarArr) {
            arrayList.add(b.mo44614b());
        }
        Object[] array = arrayList.toArray(new InputFilter[0]);
        C41536l.m120487g(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        textInput.setFilters((InputFilter[]) array);
        this.f39654d.mo44135S(C41333m.m119788O(bVarArr));
    }

    public final void setFormatter(C17365a aVar) {
        C41536l.m120489i(aVar, "formatter");
        this.f39654d.mo44136T(aVar);
    }

    public final void setHasInputButton(boolean z) {
        this.f39654d.mo44137U(z);
    }

    public final void setHintText(CharSequence charSequence) {
        this.f39659i = charSequence;
        this.f39654d.mo44138V(charSequence);
    }

    public final void setInfoText(CharSequence charSequence) {
        this.f39658h = charSequence;
        this.f39654d.mo44140X(charSequence);
    }

    public final void setInputButtonClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "listener");
        this.f39654d.mo44141Y(onClickListener);
    }

    public final void setInputButtonEnabled(boolean z) {
        this.f39654d.mo44142Z(z);
    }

    public final void setInputButtonText(CharSequence charSequence) {
        this.f39654d.mo44143a0(charSequence);
    }

    public final void setInputText(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f39657g = str;
        this.f39654d.mo44164m0(str);
    }

    public final void setMask(C17617a aVar) {
        this.f39660j = aVar;
        this.f39654d.mo44145c0(aVar);
        setInputText(getInputText());
    }

    public final void setOnInputFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        C41536l.m120489i(onFocusChangeListener, "listener");
        this.f39654d.mo44148e0(onFocusChangeListener);
    }

    public final void setPhoneNumberPrefixClickListener(View.OnClickListener onClickListener) {
        C41536l.m120489i(onClickListener, "clickListener");
        this.f39654d.mo44150f0(onClickListener);
    }

    public final void setPhonePrefixText(String str) {
        this.f39662l = str;
        this.f39654d.mo44152g0(str);
    }

    public final void setStartIconDrawableTintAttr(Integer num) {
        this.f39654d.mo44156i0(num);
    }

    public final void setStartIconImage(Image image) {
        this.f39654d.mo44158j0(image);
    }

    public final void setStartIconTintColor(Integer num) {
        this.f39654d.mo44160k0(num);
    }

    public final void setSuffix(String str) {
        C41536l.m120489i(str, "suffix");
        this.f39654d.mo44162l0(str);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Input(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Input(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16945f fVar;
        C41536l.m120489i(context, "context");
        this.f39657g = "";
        this.f39661k = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C17787l.f50572v6, 0, 0);
        try {
            LayoutInflater from = LayoutInflater.from(context);
            int i2 = obtainStyledAttributes.getInt(C17787l.f49937G6, 0);
            if (i2 == 0) {
                C10012s3 c = C10012s3.m36723c(from, this);
                C41536l.m120488h(c, "inflate(\n               …                        )");
                fVar = new C16945f.C16955d(c);
            } else if (i2 == 1) {
                C10019t3 c2 = C10019t3.m36749c(from, this);
                C41536l.m120488h(c2, "inflate(\n               …                        )");
                fVar = new C16945f.C16963f(c2);
            } else if (i2 == 2) {
                C10012s3 c3 = C10012s3.m36723c(from, this);
                C41536l.m120488h(c3, "inflate(\n               …                        )");
                fVar = new C16945f.C16959e(c3);
            } else if (i2 == 3) {
                C10012s3 c4 = C10012s3.m36723c(from, this);
                C41536l.m120488h(c4, "inflate(\n               …                        )");
                fVar = new C16945f.C16948c(c4);
            } else if (i2 == 4) {
                C10005r3 c5 = C10005r3.m36697c(from, this);
                C41536l.m120488h(c5, "inflate(\n               …                        )");
                fVar = new C16945f.C16947b(c5);
            } else {
                throw new IllegalStateException("Unknown Input type");
            }
            this.f39654d = fVar;
            setInfoText(obtainStyledAttributes.getText(C17787l.f49907E6));
            if (i2 == 3) {
                setPhonePrefixText(obtainStyledAttributes.getString(C17787l.f49952H6));
            }
            this.f39654d.mo44138V(obtainStyledAttributes.getText(C17787l.f49892D6));
            int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50602x6, 0);
            int resourceId2 = obtainStyledAttributes.getResourceId(C17787l.f50617y6, 0);
            int resourceId3 = obtainStyledAttributes.getResourceId(C17787l.f49847A6, 0);
            int resourceId4 = obtainStyledAttributes.getResourceId(C17787l.f49967I6, 0);
            if (resourceId != 0) {
                this.f39654d.mo44131O(from.inflate(resourceId, (ViewGroup) null, false));
            }
            if (resourceId2 != 0) {
                this.f39654d.mo44132P(C5769a.m23210b(context, resourceId2));
            }
            if (resourceId3 != 0) {
                this.f39654d.mo44133Q(C5769a.m23210b(context, resourceId3));
            }
            if (resourceId4 != 0) {
                this.f39654d.mo44158j0(new Image.Resource(resourceId4, (Boolean) null, 2, (DefaultConstructorMarker) null));
            }
            this.f39654d.mo44139W(obtainStyledAttributes.getColor(C17787l.f50632z6, 0), obtainStyledAttributes.getColor(C17787l.f49862B6, 0), obtainStyledAttributes.getColor(C17787l.f49982J6, 0));
            this.f39654d.mo44168o0(obtainStyledAttributes.getInt(C17787l.f50587w6, 1));
            this.f39654d.mo44137U(obtainStyledAttributes.getBoolean(C17787l.f49877C6, false));
            String string = obtainStyledAttributes.getString(C17787l.f49922F6);
            if (string != null) {
                this.f39654d.mo44143a0(string);
            }
            int resourceId5 = obtainStyledAttributes.getResourceId(C17787l.f49997K6, 0);
            if (resourceId5 != 0) {
                this.f39654d.mo44166n0(resourceId5);
            }
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public final void setHintText(String str) {
        C41536l.m120489i(str, "text");
        this.f39654d.mo44138V(str);
    }
}

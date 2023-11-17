package p341ge.bog.designsystem.components.progressbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.content.C0767a;
import com.github.mikephil.charting.utils.Utils;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p292w.C8720a;
import p422fj.C12918a;
import p422fj.C12920b;
import p601sg.C17780e;
import p601sg.C17787l;
import p642vh.C18368l;

/* renamed from: ge.bog.designsystem.components.progressbar.ProgressBarView */
public final class ProgressBarView extends View {

    /* renamed from: k */
    public static final C13500a f40262k = new C13500a((DefaultConstructorMarker) null);

    /* renamed from: d */
    private Paint f40263d;

    /* renamed from: e */
    private final float f40264e;

    /* renamed from: f */
    private float f40265f;

    /* renamed from: g */
    private C12920b f40266g;

    /* renamed from: h */
    private C12920b f40267h;

    /* renamed from: i */
    private C12920b f40268i;

    /* renamed from: j */
    private C12918a f40269j;

    /* renamed from: ge.bog.designsystem.components.progressbar.ProgressBarView$a */
    public static final class C13500a {
        private C13500a() {
        }

        public /* synthetic */ C13500a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public ProgressBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    private final void set_progress(float f) {
        this.f40265f = f;
        requestLayout();
    }

    public final float getProgress() {
        return this.f40265f;
    }

    public final C12918a getProgressBarThicknessType() {
        return this.f40269j;
    }

    public final C12920b getProgressBarTypeFull() {
        return this.f40266g;
    }

    public final C12920b getProgressBarTypeNotFull() {
        return this.f40267h;
    }

    public final C12920b getType() {
        return this.f40268i;
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        int i;
        super.onDraw(canvas);
        float f = this.f40265f / 100.0f;
        if (f > Utils.FLOAT_EPSILON) {
            i = getHeight();
        } else {
            i = 0;
        }
        int b = C8720a.m32478b((int) (((float) getWidth()) * f), i, getWidth());
        if (canvas != null) {
            float f2 = this.f40264e;
            canvas.drawRoundRect(Utils.FLOAT_EPSILON, Utils.FLOAT_EPSILON, (float) b, (float) getHeight(), f2, f2, this.f40263d);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setMeasuredDimension(i, getResources().getDimensionPixelSize(this.f40269j.mo33671e()));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof ProgressBarSavedState) {
            ProgressBarSavedState progressBarSavedState = (ProgressBarSavedState) parcelable;
            super.onRestoreInstanceState(progressBarSavedState.mo36658d());
            this.f40263d.setColor(progressBarSavedState.mo36656a());
            set_progress(progressBarSavedState.mo36657b());
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        return new ProgressBarSavedState(super.onSaveInstanceState(), this.f40263d.getColor(), this.f40265f);
    }

    public final void setProgress(float f) {
        boolean z;
        C12920b bVar;
        float a = C8720a.m32477a(f, Utils.FLOAT_EPSILON, 100.0f);
        if (a == 100.0f) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            bVar = this.f40266g;
        } else {
            bVar = this.f40267h;
        }
        setType(bVar);
        set_progress(a);
    }

    public final void setProgressBarThicknessType(C12918a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40269j = aVar;
        requestLayout();
    }

    public final void setProgressBarTypeFull(C12920b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40266g = bVar;
        if (this.f40265f >= 100.0f) {
            setType(bVar);
        }
    }

    public final void setProgressBarTypeNotFull(C12920b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40267h = bVar;
        if (this.f40265f < 100.0f) {
            setType(bVar);
        }
    }

    public final void setType(C12920b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40268i = bVar;
        this.f40263d.setColor(C0767a.m2893c(getContext(), bVar.mo33674e()));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ProgressBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProgressBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        this.f40263d = new Paint();
        this.f40264e = (float) C18368l.m62762k(6);
        C12920b bVar = C12920b.NEGATIVE;
        this.f40266g = bVar;
        this.f40267h = C12920b.POSITIVE;
        this.f40268i = bVar;
        this.f40269j = C12918a.THIN;
        setBackgroundResource(C17780e.shape_progressbar_background);
        this.f40263d.setStyle(Paint.Style.FILL);
        int[] iArr = C17787l.f50321fa;
        C41536l.m120488h(iArr, "ProgressBarView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50385ja, -1);
        int i3 = obtainStyledAttributes.getInt(C17787l.f50369ia, 1);
        int i4 = obtainStyledAttributes.getInt(C17787l.f50337ga, 2);
        int i5 = obtainStyledAttributes.getInt(C17787l.f50353ha, 1);
        C12920b.C12921a aVar = C12920b.f38149f;
        C12920b a = aVar.mo33675a(i4);
        if (a != null) {
            setProgressBarTypeFull(a);
        }
        C12920b a2 = aVar.mo33675a(i5);
        if (a2 != null) {
            setProgressBarTypeNotFull(a2);
        }
        C12918a a3 = C12918a.f38142f.mo33672a(i3);
        if (a3 != null) {
            setProgressBarThicknessType(a3);
        }
        C12920b a4 = aVar.mo33675a(i2);
        setType(a4 != null ? a4 : bVar);
        obtainStyledAttributes.recycle();
    }
}

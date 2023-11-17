package p341ge.bog.designsystem.components.statusbadge;

import af1.C40303i;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p341ge.bog.designsystem.components.statusbadge.StatusBadgeType;
import p352ak.C9913f5;
import p506lj.C16578a;
import p506lj.C16580b;
import p601sg.C17778c;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18365j0;
import p642vh.C18368l;
import p642vh.C18382u;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeView */
public final class StatusBadgeView extends LayerView {

    /* renamed from: k */
    public static final C13520a f40357k = new C13520a((DefaultConstructorMarker) null);

    /* renamed from: l */
    static final /* synthetic */ C40303i[] f40358l;

    /* renamed from: d */
    private final C9913f5 f40359d;

    /* renamed from: e */
    private final C18365j0 f40360e;

    /* renamed from: f */
    private final C18365j0 f40361f;

    /* renamed from: g */
    private final C18365j0 f40362g;

    /* renamed from: h */
    private StatusBadgeType f40363h;

    /* renamed from: i */
    private C16578a f40364i;

    /* renamed from: j */
    private C16580b f40365j;

    /* renamed from: ge.bog.designsystem.components.statusbadge.StatusBadgeView$a */
    public static final class C13520a {
        private C13520a() {
        }

        public /* synthetic */ C13520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final StatusBadgeType mo36794a(TypedArray typedArray, int i, int i2, int i3, int i4, int i5, int i6) {
            Image.Drawable drawable;
            Color color;
            Color color2;
            Color color3;
            Color color4;
            TypedArray typedArray2 = typedArray;
            int i7 = i6;
            C41536l.m120489i(typedArray, "typedArray");
            Drawable drawable2 = typedArray.getDrawable(i);
            Integer num = null;
            if (drawable2 != null) {
                drawable = new Image.Drawable(drawable2, (Boolean) null, 2, (DefaultConstructorMarker) null);
                int i8 = i2;
            } else {
                int i9 = i2;
                drawable = null;
            }
            ColorStateList colorStateList = typedArray.getColorStateList(i2);
            if (colorStateList != null) {
                color = new Color.StateList(colorStateList);
            } else {
                color = StatusBadgeType.Success.f40356l.mo36735f();
            }
            int i12 = i3;
            ColorStateList colorStateList2 = typedArray.getColorStateList(i3);
            if (colorStateList2 != null) {
                color2 = new Color.StateList(colorStateList2);
            } else {
                color2 = StatusBadgeType.Success.f40356l.mo36732b();
            }
            int i13 = i4;
            ColorStateList colorStateList3 = typedArray.getColorStateList(i4);
            if (colorStateList3 != null) {
                color3 = new Color.StateList(colorStateList3);
            } else {
                color3 = StatusBadgeType.Success.f40356l.mo36736g();
            }
            int i14 = i5;
            ColorStateList colorStateList4 = typedArray.getColorStateList(i5);
            if (colorStateList4 != null) {
                color4 = new Color.StateList(colorStateList4);
            } else {
                color4 = StatusBadgeType.Success.f40356l.mo36733d();
            }
            if (typedArray.hasValue(i7)) {
                num = Integer.valueOf(typedArray.getInteger(i7, 0));
            }
            if (num != null) {
                return new StatusBadgeType.Number(num.intValue(), color, color2, color3, color4);
            }
            return new StatusBadgeType.Custom(drawable, color, color2, color3, color4);
        }
    }

    static {
        Class<StatusBadgeView> cls = StatusBadgeView.class;
        f40358l = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "isStatusBadgeProgressbarVisible", "isStatusBadgeProgressbarVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isStatusBadgeVisible", "isStatusBadgeVisible()Z", 0)), C41520a0.m120439e(new C41539o(cls, "isNumberBadgeVisible", "isNumberBadgeVisible()Z", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusBadgeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50714a(StatusBadgeType statusBadgeType) {
        Color color;
        Color color2;
        boolean z;
        setSymbolSizes(this.f40365j);
        C16578a aVar = this.f40364i;
        C16578a aVar2 = C16578a.TRANSPARENT;
        if (aVar == aVar2) {
            color = statusBadgeType.mo36732b();
        } else {
            color = statusBadgeType.mo36733d();
        }
        Context context = getContext();
        C41536l.m120488h(context, "context");
        setBackgroundColor(color.mo35260a(context));
        if (this.f40364i == aVar2) {
            color2 = statusBadgeType.mo36735f();
        } else {
            color2 = statusBadgeType.mo36736g();
        }
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        ColorStateList b = color2.mo35261b(context2);
        boolean z2 = statusBadgeType instanceof StatusBadgeType.Number;
        if (z2 || (statusBadgeType instanceof StatusBadgeType.Loading)) {
            z = false;
        } else {
            z = true;
        }
        setStatusBadgeVisible(z);
        setStatusBadgeProgressbarVisible(statusBadgeType instanceof StatusBadgeType.Loading);
        setNumberBadgeVisible(z2);
        if (z2) {
            this.f40359d.f27000g.setTextColor(b);
            this.f40359d.f27000g.setText(m50715b(((StatusBadgeType.Number) statusBadgeType).mo36766h().intValue()));
        } else if (C41536l.m120484d(statusBadgeType, StatusBadgeType.Loading.f40349l)) {
            Drawable indeterminateDrawable = this.f40359d.f27001h.getIndeterminateDrawable();
            if (indeterminateDrawable != null) {
                indeterminateDrawable.setTintList(b);
            }
        } else {
            AppCompatImageView appCompatImageView = this.f40359d.f26998e;
            C41536l.m120488h(appCompatImageView, "binding.statusBadge");
            C18368l.m62746A(appCompatImageView, statusBadgeType.mo36734e(), (C43075l) null, 2, (Object) null);
            this.f40359d.f26998e.setImageTintList(b);
        }
    }

    /* renamed from: b */
    private final String m50715b(int i) {
        if (i > 99) {
            return "99+";
        }
        return String.valueOf(i);
    }

    private final void setNumberBadgeVisible(boolean z) {
        this.f40362g.mo46151c(this, f40358l[2], z);
    }

    private final void setStatusBadgeProgressbarVisible(boolean z) {
        this.f40360e.mo46151c(this, f40358l[0], z);
    }

    private final void setStatusBadgeVisible(boolean z) {
        this.f40361f.mo46151c(this, f40358l[1], z);
    }

    private final void setSymbolSizes(C16580b bVar) {
        C18382u f = bVar.mo43731f();
        ProgressBar progressBar = this.f40359d.f27001h;
        C41536l.m120488h(progressBar, "binding.statusBadgeProgressbar");
        ViewGroup.LayoutParams layoutParams = progressBar.getLayoutParams();
        if (layoutParams != null) {
            ConstraintLayout.C0620b bVar2 = (ConstraintLayout.C0620b) layoutParams;
            Context context = getContext();
            C41536l.m120488h(context, "context");
            bVar2.width = f.mo46173a(context);
            Context context2 = getContext();
            C41536l.m120488h(context2, "context");
            bVar2.height = f.mo46173a(context2);
            progressBar.setLayoutParams(bVar2);
            AppCompatImageView appCompatImageView = this.f40359d.f26998e;
            C41536l.m120488h(appCompatImageView, "binding.statusBadge");
            ViewGroup.LayoutParams layoutParams2 = appCompatImageView.getLayoutParams();
            if (layoutParams2 != null) {
                ConstraintLayout.C0620b bVar3 = (ConstraintLayout.C0620b) layoutParams2;
                Context context3 = getContext();
                C41536l.m120488h(context3, "context");
                bVar3.width = f.mo46173a(context3);
                Context context4 = getContext();
                C41536l.m120488h(context4, "context");
                bVar3.height = f.mo46173a(context4);
                appCompatImageView.setLayoutParams(bVar3);
                C1314o.m4575q(this.f40359d.f27000g, bVar.mo43730e());
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
    }

    public final C16578a getFillType() {
        return this.f40364i;
    }

    public final C16580b getSize() {
        return this.f40365j;
    }

    public final StatusBadgeType getType() {
        return this.f40363h;
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        C18382u c = this.f40365j.mo43729c();
        Context context = getContext();
        C41536l.m120488h(context, "context");
        int a = c.mo46173a(context);
        C18382u c2 = this.f40365j.mo43729c();
        Context context2 = getContext();
        C41536l.m120488h(context2, "context");
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(a, 1073741824), View.MeasureSpec.makeMeasureSpec(c2.mo46173a(context2), 1073741824));
    }

    public final void setFillType(C16578a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f40364i = aVar;
        m50714a(this.f40363h);
    }

    public final void setSize(C16580b bVar) {
        C41536l.m120489i(bVar, C11755a.C11756a.f34100b);
        this.f40365j = bVar;
        m50714a(this.f40363h);
    }

    public final void setType(StatusBadgeType statusBadgeType) {
        C41536l.m120489i(statusBadgeType, C11755a.C11756a.f34100b);
        m50714a(statusBadgeType);
        this.f40363h = statusBadgeType;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusBadgeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusBadgeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        StatusBadgeType statusBadgeType;
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9913f5 c = C9913f5.m36363c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40359d = c;
        ProgressBar progressBar = c.f27001h;
        C41536l.m120488h(progressBar, "binding.statusBadgeProgressbar");
        this.f40360e = new C18365j0(progressBar, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatImageView appCompatImageView = c.f26998e;
        C41536l.m120488h(appCompatImageView, "binding.statusBadge");
        this.f40361f = new C18365j0(appCompatImageView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView = c.f27000g;
        C41536l.m120488h(appCompatTextView, "binding.statusBadgeNumber");
        this.f40362g = new C18365j0(appCompatTextView, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        this.f40363h = StatusBadgeType.Success.f40356l;
        this.f40364i = C16578a.TRANSPARENT;
        this.f40365j = C16580b.MEDIUM;
        setLayerStyle(C17786k.LayerRadiusCircleShadow0);
        setBackgroundColor(C0767a.m2893c(context2, C17778c.f49638w));
        int[] iArr = C17787l.f50514rb;
        C41536l.m120488h(iArr, "StatusBadgeView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f49852Ab, 1);
        StatusBadgeType[] a = StatusBadgeType.f40334k.mo36786a();
        int length = a.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                statusBadgeType = null;
                break;
            }
            statusBadgeType = a[i3];
            if (statusBadgeType.mo36731a() == i2) {
                break;
            }
            i3++;
        }
        setFillType(C16578a.f46751e.mo43727a(obtainStyledAttributes.getInt(C17787l.f50530sb, 0)));
        setType(statusBadgeType == null ? f40357k.mo36794a(obtainStyledAttributes, C17787l.f50546tb, C17787l.f50592wb, C17787l.f50562ub, C17787l.f50607xb, C17787l.f50577vb, C17787l.f50622yb) : statusBadgeType);
        setSize(C16580b.f46756h.mo43732a(obtainStyledAttributes.getInt(C17787l.f50637zb, -1)));
        obtainStyledAttributes.recycle();
    }
}

package p341ge.bog.designsystem.components.inlinefeedback;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.common.Image;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C10033v3;
import p352ak.C9920g4;
import p352ak.C9966m2;
import p352ak.C9991p3;
import p519mi.C16686a;
import p519mi.C16687b;
import p601sg.C17786k;
import p601sg.C17787l;

/* renamed from: ge.bog.designsystem.components.inlinefeedback.InlineFeedback */
public final class InlineFeedback extends LayerView {

    /* renamed from: d */
    private C16687b f39621d;

    /* renamed from: e */
    private CharSequence f39622e;

    /* renamed from: f */
    private boolean f39623f;

    /* renamed from: g */
    private C16686a f39624g;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public InlineFeedback(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    public final CharSequence getCaptionText() {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        return bVar.mo43816c();
    }

    public final boolean getCloseButtonVisibility() {
        return this.f39623f;
    }

    public final Image getFeedbackImage() {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        return bVar.mo43817d();
    }

    public final C16686a getInlineFeedbackState() {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        return bVar.mo43818e();
    }

    public final CharSequence getInteractiveButtonText() {
        return this.f39622e;
    }

    public final CharSequence getTitleText() {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        return bVar.mo43819f();
    }

    public final void setCaptionText(CharSequence charSequence) {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        bVar.mo43820g(charSequence);
    }

    public final void setCloseButtonVisibility(boolean z) {
        this.f39623f = z;
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        bVar.mo43821h(z);
    }

    public final void setFeedbackImage(Image image) {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        bVar.mo43822i(image);
    }

    public final void setInlineFeedbackState(C16686a aVar) {
        C41536l.m120489i(aVar, C11755a.C11756a.f34100b);
        this.f39624g = aVar;
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        bVar.mo43814a(aVar);
    }

    public final void setInteractiveButtonText(CharSequence charSequence) {
        this.f39622e = charSequence;
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        bVar.mo43824k(charSequence);
    }

    public final void setOnInteractiveButtonClickListener(View.OnClickListener onClickListener) {
        C16687b bVar = this.f39621d;
        C16687b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        if (bVar instanceof C16687b.C16699c) {
            C16687b bVar3 = this.f39621d;
            if (bVar3 == null) {
                C41536l.m120506z("inlineFeedbackType");
            } else {
                bVar2 = bVar3;
            }
            bVar2.mo43823j(onClickListener);
        }
    }

    public final void setOnInteractiveCloseButtonClickListener(View.OnClickListener onClickListener) {
        C16687b bVar = this.f39621d;
        C16687b bVar2 = null;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        if (bVar instanceof C16687b.C16699c) {
            C16687b bVar3 = this.f39621d;
            if (bVar3 == null) {
                C41536l.m120506z("inlineFeedbackType");
            } else {
                bVar2 = bVar3;
            }
            bVar2.mo43825l(onClickListener);
        }
    }

    public final void setTitleText(CharSequence charSequence) {
        C16687b bVar = this.f39621d;
        if (bVar == null) {
            C41536l.m120506z("inlineFeedbackType");
            bVar = null;
        }
        bVar.mo43827n(charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InlineFeedback(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineFeedback(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C16687b bVar;
        C41536l.m120489i(context, "context");
        this.f39623f = true;
        this.f39624g = C16686a.POSITIVE;
        setLayerStyle(C17786k.LayerRadius8Shadow0);
        int[] iArr = C17787l.f50397k6;
        C41536l.m120488h(iArr, "InlineFeedback");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f50429m6, 0);
        for (C16686a aVar : C16686a.values()) {
            if (aVar.mo43813f() == i2) {
                int i3 = obtainStyledAttributes.getInt(C17787l.f50461o6, 0);
                if (i3 == 0) {
                    C9991p3 c = C9991p3.m36645c(LayoutInflater.from(context), this);
                    C41536l.m120488h(c, "inflate(\n               …                        )");
                    bVar = new C16687b.C16703d(aVar, c);
                } else if (i3 == 1) {
                    C9991p3 c2 = C9991p3.m36645c(LayoutInflater.from(context), this);
                    C41536l.m120488h(c2, "inflate(\n               …                        )");
                    bVar = new C16687b.C16688a(aVar, c2);
                } else if (i3 == 2) {
                    C9966m2 c3 = C9966m2.m36555c(LayoutInflater.from(context), this);
                    C41536l.m120488h(c3, "inflate(\n               …                        )");
                    bVar = new C16687b.C16693b(aVar, c3);
                } else if (i3 == 3) {
                    C9920g4 c4 = C9920g4.m36389c(LayoutInflater.from(context), this);
                    C41536l.m120488h(c4, "inflate(\n               …                        )");
                    bVar = new C16687b.C16709e(aVar, c4);
                } else if (i3 == 4) {
                    C10033v3 c5 = C10033v3.m36801c(LayoutInflater.from(context), this);
                    C41536l.m120488h(c5, "inflate(\n               …                        )");
                    bVar = new C16687b.C16699c(aVar, c5);
                } else {
                    throw new IllegalStateException("Unknown feedback type");
                }
                this.f39621d = bVar;
                int i4 = C17787l.f50445n6;
                if (obtainStyledAttributes.getText(i4) != null) {
                    setTitleText(obtainStyledAttributes.getText(i4));
                }
                int i5 = C17787l.f50413l6;
                if (obtainStyledAttributes.getText(i5) != null) {
                    setCaptionText(obtainStyledAttributes.getText(i5));
                }
                obtainStyledAttributes.recycle();
                return;
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }
}

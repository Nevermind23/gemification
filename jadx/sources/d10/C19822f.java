package d10;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import b10.C19308a;
import kotlin.jvm.internal.C41536l;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import ue1.C43075l;

/* renamed from: d10.f */
public abstract class C19822f extends FrameLayout implements C19308a {

    /* renamed from: d */
    private C43075l f54200d;

    /* renamed from: e */
    private String f54201e = "";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19822f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
    }

    public final C43075l getOnValueChanged() {
        return this.f54200d;
    }

    public abstract int getSelectedCount();

    public abstract /* synthetic */ FilterValue getValue();

    public final void setOnValueChanged(C43075l lVar) {
        this.f54200d = lVar;
    }

    public void setTitle(String str) {
        this.f54201e = str;
    }

    public abstract /* synthetic */ void setValue(FilterValue filterValue);
}

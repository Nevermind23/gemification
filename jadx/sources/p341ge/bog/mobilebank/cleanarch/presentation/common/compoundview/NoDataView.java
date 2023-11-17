package p341ge.bog.mobilebank.cleanarch.presentation.common.compoundview;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogButton;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogImageView;
import p341ge.bog.mobilebank.p975ui.views.widgets.BogTextView;
import p366bk.C10322k;
import p366bk.C10324m;
import p366bk.C10330s;
import ue1.C43064a;
import z00.C30127c;

/* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView */
public final class NoDataView extends FrameLayout {

    /* renamed from: d */
    private C43064a f57435d;

    /* renamed from: e */
    private final C41217g f57436e;

    /* renamed from: f */
    private final C41217g f57437f;

    /* renamed from: g */
    private final C41217g f57438g;

    /* renamed from: h */
    private int f57439h;

    /* renamed from: i */
    private String f57440i;

    /* renamed from: j */
    private String f57441j;

    /* renamed from: k */
    private int f57442k;

    /* renamed from: l */
    private boolean f57443l;

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView$a */
    static final class C21492a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NoDataView f57444d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21492a(NoDataView noDataView) {
            super(0);
            this.f57444d = noDataView;
        }

        /* renamed from: b */
        public final BogImageView invoke() {
            return (BogImageView) this.f57444d.findViewById(C10322k.iconIV);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView$b */
    static final class C21493b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NoDataView f57445d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21493b(NoDataView noDataView) {
            super(0);
            this.f57445d = noDataView;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f57445d.findViewById(C10322k.messageTV);
        }
    }

    /* renamed from: ge.bog.mobilebank.cleanarch.presentation.common.compoundview.NoDataView$c */
    static final class C21494c extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ NoDataView f57446d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C21494c(NoDataView noDataView) {
            super(0);
            this.f57446d = noDataView;
        }

        /* renamed from: b */
        public final BogButton invoke() {
            return (BogButton) this.f57446d.findViewById(C10322k.refreshBtn);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NoDataView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m69459b(NoDataView noDataView, View view) {
        C41536l.m120489i(noDataView, "this$0");
        C43064a aVar = noDataView.f57435d;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* renamed from: c */
    private final void m69460c(AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C10330s.f29034F5);
        C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.NoDataView)");
        setIcon(obtainStyledAttributes.getResourceId(C10330s.f29064I5, 0));
        String string = obtainStyledAttributes.getString(C10330s.f29074J5);
        String str = "";
        if (string == null) {
            string = str;
        }
        setMessage(string);
        String string2 = obtainStyledAttributes.getString(C10330s.f29054H5);
        if (string2 != null) {
            str = string2;
        }
        setButtonText(str);
        setButtonIcon(obtainStyledAttributes.getResourceId(C10330s.f29044G5, 0));
        setShowButton(obtainStyledAttributes.getBoolean(C10330s.f29084K5, false));
        obtainStyledAttributes.recycle();
    }

    private final BogImageView getIconIV() {
        Object value = this.f57436e.getValue();
        C41536l.m120488h(value, "<get-iconIV>(...)");
        return (BogImageView) value;
    }

    private final BogTextView getMessageTV() {
        Object value = this.f57437f.getValue();
        C41536l.m120488h(value, "<get-messageTV>(...)");
        return (BogTextView) value;
    }

    private final BogButton getRefreshBtn() {
        Object value = this.f57438g.getValue();
        C41536l.m120488h(value, "<get-refreshBtn>(...)");
        return (BogButton) value;
    }

    /* renamed from: d */
    public final void mo53658d(C43064a aVar) {
        this.f57435d = aVar;
    }

    public final int getButtonIcon() {
        return this.f57442k;
    }

    public final String getButtonText() {
        return this.f57441j;
    }

    public final int getIcon() {
        return this.f57439h;
    }

    public final String getMessage() {
        return this.f57440i;
    }

    public final boolean getShowButton() {
        return this.f57443l;
    }

    public final void setButtonIcon(int i) {
        this.f57442k = i;
        getRefreshBtn().setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final void setButtonText(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f57441j = str;
        getRefreshBtn().setText(str);
    }

    public final void setIcon(int i) {
        this.f57439h = i;
        getIconIV().setImageResource(i);
    }

    public final void setMessage(String str) {
        C41536l.m120489i(str, C11755a.C11756a.f34100b);
        this.f57440i = str;
        getMessageTV().setText(str);
    }

    public final void setShowButton(boolean z) {
        int i;
        this.f57443l = z;
        BogButton refreshBtn = getRefreshBtn();
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        refreshBtn.setVisibility(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NoDataView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        this.f57436e = C41219i.m119470b(new C21492a(this));
        this.f57437f = C41219i.m119470b(new C21493b(this));
        this.f57438g = C41219i.m119470b(new C21494c(this));
        this.f57440i = "";
        this.f57441j = "";
        View.inflate(context, C10324m.no_data_layout, this);
        setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        if (attributeSet != null) {
            m69460c(attributeSet);
        }
        getRefreshBtn().setOnClickListener(new C30127c(this));
    }
}

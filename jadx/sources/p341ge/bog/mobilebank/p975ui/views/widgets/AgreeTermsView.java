package p341ge.bog.mobilebank.p975ui.views.widgets;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p366bk.C10322k;
import p366bk.C10324m;
import r90.C27950a;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.mobilebank.ui.views.widgets.AgreeTermsView */
public final class AgreeTermsView extends FrameLayout {
    private final C41217g checkbox$delegate;
    private final C41217g termsBtn$delegate;
    private String urlKey;

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AgreeTermsView$a */
    static final class C35710a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AgreeTermsView f86332d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35710a(AgreeTermsView agreeTermsView) {
            super(0);
            this.f86332d = agreeTermsView;
        }

        /* renamed from: b */
        public final CustomCheckBox invoke() {
            return (CustomCheckBox) this.f86332d.findViewById(C10322k.f28735G7);
        }
    }

    /* renamed from: ge.bog.mobilebank.ui.views.widgets.AgreeTermsView$b */
    static final class C35711b extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ AgreeTermsView f86333d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C35711b(AgreeTermsView agreeTermsView) {
            super(0);
            this.f86333d = agreeTermsView;
        }

        /* renamed from: b */
        public final BogTextView invoke() {
            return (BogTextView) this.f86333d.findViewById(C10322k.termsBtn);
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AgreeTermsView(Context context) {
        this(context, (AttributeSet) null);
        C41536l.m120489i(context, "context");
    }

    private final CustomCheckBox getCheckbox() {
        Object value = this.checkbox$delegate.getValue();
        C41536l.m120488h(value, "<get-checkbox>(...)");
        return (CustomCheckBox) value;
    }

    private final BogTextView getTermsBtn() {
        Object value = this.termsBtn$delegate.getValue();
        C41536l.m120488h(value, "<get-termsBtn>(...)");
        return (BogTextView) value;
    }

    private final void init() {
        getTermsBtn().setOnClickListener(new C35809h(this));
    }

    /* access modifiers changed from: private */
    public static final void init$lambda$0(AgreeTermsView agreeTermsView, View view) {
        C41536l.m120489i(agreeTermsView, "this$0");
        agreeTermsView.openWebsite(C27950a.m86287d(agreeTermsView.urlKey, false, 2, (Object) null));
    }

    private final void openWebsite(String str) {
        getContext().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
    }

    /* access modifiers changed from: private */
    public static final void setOnCheckedChangeListener$lambda$1(C43075l lVar, CompoundButton compoundButton, boolean z) {
        C41536l.m120489i(lVar, "$callback");
        lVar.invoke(Boolean.valueOf(z));
    }

    public final boolean isChecked() {
        return getCheckbox().isChecked();
    }

    public final void setOnCheckedChangeListener(C43075l lVar) {
        C41536l.m120489i(lVar, "callback");
        getCheckbox().setOnCheckedChangeListener(new C35810i(lVar));
    }

    public final void setUrlKey(String str) {
        C41536l.m120489i(str, "urlKey");
        this.urlKey = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AgreeTermsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41536l.m120489i(context, "context");
        this.urlKey = "link.terms.bank.service.terms";
        this.termsBtn$delegate = C41219i.m119470b(new C35711b(this));
        this.checkbox$delegate = C41219i.m119470b(new C35710a(this));
        View.inflate(context, C10324m.layout_agree_terms, this);
        init();
    }
}

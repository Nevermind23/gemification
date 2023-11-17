package c60;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import b10.C19308a;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import he1.C41217g;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import p341ge.bog.mobilebank.cleanarch.presentation.common.filter.model.FilterValue;
import p341ge.bog.mobilebank.p975ui.views.widgets.CustomCheckBox;
import p366bk.C10322k;
import p366bk.C10324m;
import ue1.C43064a;

/* renamed from: c60.b */
public final class C19494b extends FrameLayout implements C19308a {

    /* renamed from: d */
    private final C41217g f53786d = C41219i.m119470b(new C19495a(this));

    /* renamed from: c60.b$a */
    static final class C19495a extends C41537m implements C43064a {

        /* renamed from: d */
        final /* synthetic */ C19494b f53787d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C19495a(C19494b bVar) {
            super(0);
            this.f53787d = bVar;
        }

        /* renamed from: b */
        public final CustomCheckBox invoke() {
            return (CustomCheckBox) this.f53787d.findViewById(C10322k.f28735G7);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C19494b(Context context) {
        super(context);
        C41536l.m120489i(context, "context");
        View.inflate(context, C10324m.sms_to_push_number_layout, this);
        setOnClickListener(new C19493a(this));
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m65069b(C19494b bVar, View view) {
        C41536l.m120489i(bVar, "this$0");
        bVar.getCheckBoxView().toggle();
    }

    private final CustomCheckBox getCheckBoxView() {
        Object value = this.f53786d.getValue();
        C41536l.m120488h(value, "<get-checkBoxView>(...)");
        return (CustomCheckBox) value;
    }

    public FilterValue getValue() {
        return new FilterValue.Checkable(getCheckBoxView().isChecked());
    }

    public final void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        C41536l.m120489i(onCheckedChangeListener, "listener");
        getCheckBoxView().setOnCheckedChangeListener(onCheckedChangeListener);
    }

    public void setTitle(String str) {
        getCheckBoxView().setText(str);
    }

    public void setValue(FilterValue.Checkable checkable) {
        C41536l.m120489i(checkable, C11755a.C11756a.f34100b);
        getCheckBoxView().setChecked(checkable.mo53815a());
    }
}

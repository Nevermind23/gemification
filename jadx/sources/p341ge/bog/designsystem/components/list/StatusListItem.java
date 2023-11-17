package p341ge.bog.designsystem.components.list;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.core.content.C0767a;
import androidx.core.widget.C1314o;
import com.salesforce.marketingcloud.storage.p385db.C11755a;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p352ak.C10001r;
import p601sg.C17787l;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.list.StatusListItem */
public final class StatusListItem extends LinearLayout {

    /* renamed from: g */
    static final /* synthetic */ C40303i[] f39710g = {C41520a0.m120439e(new C41539o(StatusListItem.class, "text", "getText()Ljava/lang/CharSequence;", 0))};

    /* renamed from: d */
    private final C10001r f39711d;

    /* renamed from: e */
    private final C18355e0 f39712e;

    /* renamed from: f */
    private C13368e f39713f;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StatusListItem(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: a */
    private final void m50284a(C13368e eVar) {
        C1314o.m4575q(this.f39711d.f27440f, eVar.mo36113f());
        this.f39711d.f27439e.setImageResource(eVar.mo36112e());
        this.f39711d.f27439e.setColorFilter(C0767a.m2893c(getContext(), eVar.mo36111c()));
    }

    public final CharSequence getText() {
        return this.f39712e.getValue(this, f39710g[0]);
    }

    public final C13368e getType() {
        return this.f39713f;
    }

    public final void setText(CharSequence charSequence) {
        this.f39712e.setValue(this, f39710g[0], charSequence);
    }

    public final void setType(C13368e eVar) {
        C41536l.m120489i(eVar, C11755a.C11756a.f34100b);
        m50284a(eVar);
        this.f39713f = eVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StatusListItem(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StatusListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C13368e eVar;
        C41536l.m120489i(context, "context");
        C10001r c = C10001r.m36682c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f39711d = c;
        AppCompatTextView appCompatTextView = c.f27440f;
        C41536l.m120488h(appCompatTextView, "binding.statusListItemText");
        this.f39712e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        this.f39713f = C13368e.INFORMATION;
        setOrientation(0);
        int[] iArr = C17787l.f49867Bb;
        C41536l.m120488h(iArr, "StatusListItem");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        int i2 = obtainStyledAttributes.getInt(C17787l.f49897Db, 1);
        C13368e[] values = C13368e.values();
        int length = values.length;
        int i3 = 0;
        while (true) {
            if (i3 >= length) {
                eVar = null;
                break;
            }
            eVar = values[i3];
            if (eVar.mo36110b() == i2) {
                break;
            }
            i3++;
        }
        if (eVar != null) {
            setType(eVar);
        }
        setText(obtainStyledAttributes.getString(C17787l.f49882Cb));
        obtainStyledAttributes.recycle();
    }
}

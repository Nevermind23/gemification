package p341ge.bog.designsystem.components.savedusercard;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import com.bumptech.glide.C2379b;
import com.bumptech.glide.C2394j;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9873a5;
import p450hj.C15522a;
import p601sg.C17787l;
import p642vh.C18355e0;
import ue1.C43064a;

/* renamed from: ge.bog.designsystem.components.savedusercard.SavedUserCardView */
public final class SavedUserCardView extends LayerView {

    /* renamed from: h */
    static final /* synthetic */ C40303i[] f40274h;

    /* renamed from: d */
    private final C9873a5 f40275d;

    /* renamed from: e */
    private final C18355e0 f40276e;

    /* renamed from: f */
    private final C18355e0 f40277f;

    /* renamed from: g */
    private final Button f40278g;

    /* renamed from: ge.bog.designsystem.components.savedusercard.SavedUserCardView$a */
    public interface C13502a {
    }

    static {
        Class<SavedUserCardView> cls = SavedUserCardView.class;
        f40274h = new C40303i[]{C41520a0.m120439e(new C41539o(cls, "title", "getTitle()Ljava/lang/CharSequence;", 0)), C41520a0.m120439e(new C41539o(cls, "userName", "getUserName()Ljava/lang/CharSequence;", 0))};
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SavedUserCardView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public static final void m50639b(SavedUserCardView savedUserCardView, View view) {
        C41536l.m120489i(savedUserCardView, "this$0");
        savedUserCardView.getClass();
    }

    public final CharSequence getButtonText() {
        return this.f40278g.getButtonText();
    }

    public final CharSequence getTitle() {
        return this.f40276e.getValue(this, f40274h[0]);
    }

    public final CharSequence getUserName() {
        return this.f40277f.getValue(this, f40274h[1]);
    }

    public final void setButtonText(CharSequence charSequence) {
        this.f40278g.setButtonText(charSequence);
    }

    public final void setOnChangeButtonClickListener(C13502a aVar) {
    }

    public final void setTitle(CharSequence charSequence) {
        this.f40276e.setValue(this, f40274h[0], charSequence);
    }

    public final void setUserName(CharSequence charSequence) {
        this.f40277f.setValue(this, f40274h[1], charSequence);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavedUserCardView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SavedUserCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Context context2 = context;
        C41536l.m120489i(context2, "context");
        C9873a5 c = C9873a5.m36214c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40275d = c;
        AppCompatTextView appCompatTextView = c.f26775g;
        C41536l.m120488h(appCompatTextView, "binding.savedUserTitle");
        this.f40276e = new C18355e0(appCompatTextView, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        AppCompatTextView appCompatTextView2 = c.f26774f;
        C41536l.m120488h(appCompatTextView2, "binding.savedUserName");
        this.f40277f = new C18355e0(appCompatTextView2, false, (C43064a) null, 6, (DefaultConstructorMarker) null);
        Button button = c.f26776h;
        C41536l.m120488h(button, "binding.userChangeBtn");
        this.f40278g = button;
        c.f26776h.setOnClickListener(new C15522a(this));
        int[] iArr = C17787l.f50497qa;
        C41536l.m120488h(iArr, "SavedUserCardView");
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        c.f26775g.setText(obtainStyledAttributes.getString(C17787l.f50545ta));
        c.f26774f.setText(obtainStyledAttributes.getString(C17787l.f50561ua));
        c.f26776h.setButtonText(obtainStyledAttributes.getString(C17787l.f50513ra));
        int resourceId = obtainStyledAttributes.getResourceId(C17787l.f50529sa, 0);
        if (resourceId != 0) {
            ((C2394j) C2379b.m9210t(context).mo7755w(Integer.valueOf(resourceId)).mo7222d()).mo7718L0(c.f26773e);
        }
        obtainStyledAttributes.recycle();
    }
}

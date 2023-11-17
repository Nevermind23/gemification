package p341ge.bog.designsystem.components.search;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p341ge.bog.designsystem.components.buttons.Button;
import p341ge.bog.designsystem.components.input.ClearFocusEditText;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9888c4;
import p464ij.C15657a;
import p464ij.C15658b;
import p601sg.C17777b;
import p601sg.C17786k;
import p601sg.C17787l;
import p642vh.C18365j0;
import p642vh.C18368l;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.search.NavigationSearchView */
public final class NavigationSearchView extends LayerView {

    /* renamed from: i */
    static final /* synthetic */ C40303i[] f40279i = {C41520a0.m120439e(new C41539o(NavigationSearchView.class, "navigationEnabled", "getNavigationEnabled()Z", 0))};

    /* renamed from: d */
    private final C9888c4 f40280d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C13504b f40281e;

    /* renamed from: f */
    private boolean f40282f;

    /* renamed from: g */
    private String f40283g;

    /* renamed from: h */
    private final C18365j0 f40284h;

    /* renamed from: ge.bog.designsystem.components.search.NavigationSearchView$a */
    public interface C13503a {
    }

    /* renamed from: ge.bog.designsystem.components.search.NavigationSearchView$b */
    public interface C13504b {
        /* renamed from: a */
        void mo36700a(String str);
    }

    /* renamed from: ge.bog.designsystem.components.search.NavigationSearchView$c */
    public static final class C13505c implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C9888c4 f40285d;

        /* renamed from: e */
        final /* synthetic */ NavigationSearchView f40286e;

        public C13505c(C9888c4 c4Var, NavigationSearchView navigationSearchView) {
            this.f40285d = c4Var;
            this.f40286e = navigationSearchView;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            AppCompatImageView appCompatImageView = this.f40285d.f26859g;
            int i = 0;
            if (editable == null || C40439w.m117118v(editable)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            appCompatImageView.setVisibility(i);
            C13504b c = this.f40286e.f40281e;
            if (c != null) {
                c.mo36700a(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavigationSearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static final void m50643d(NavigationSearchView navigationSearchView, View view, boolean z) {
        C41536l.m120489i(navigationSearchView, "this$0");
        navigationSearchView.getClass();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final void m50644e(C9888c4 c4Var, View view) {
        C41536l.m120489i(c4Var, "$this_apply");
        c4Var.f26861i.setText((CharSequence) null);
    }

    /* renamed from: f */
    public final void mo36690f() {
        this.f40280d.f26861i.requestFocus();
        ClearFocusEditText clearFocusEditText = this.f40280d.f26861i;
        C41536l.m120488h(clearFocusEditText, "binding.searchInputText");
        C18368l.m62749D(clearFocusEditText);
    }

    public final boolean getHasFocus() {
        return this.f40282f;
    }

    public final String getHint() {
        return this.f40280d.f26861i.getHint().toString();
    }

    public final boolean getNavigationEnabled() {
        return this.f40284h.getValue(this, f40279i[0]).booleanValue();
    }

    public final void setHint(String str) {
        this.f40280d.f26861i.setHint(str);
        this.f40283g = str;
    }

    public final void setInputText(CharSequence charSequence) {
        ClearFocusEditText clearFocusEditText = this.f40280d.f26861i;
        C41536l.m120488h(clearFocusEditText, "binding.searchInputText");
        C18368l.m62747B(clearFocusEditText, charSequence);
    }

    public final void setNavigationEnabled(boolean z) {
        this.f40284h.mo46151c(this, f40279i[0], z);
    }

    public final void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        this.f40280d.f26860h.setOnClickListener(onClickListener);
    }

    public final void setOnFocusChangeListener(C13503a aVar) {
    }

    public final void setOnTextChangeListener(C13504b bVar) {
        this.f40281e = bVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavigationSearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavigationSearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C41536l.m120489i(context, "context");
        C9888c4 c = C9888c4.m36269c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40280d = c;
        this.f40282f = c.f26861i.hasFocus();
        this.f40283g = "";
        Button button = c.f26860h;
        C41536l.m120488h(button, "binding.navigationButton");
        this.f40284h = new C18365j0(button, 0, (C43075l) null, 6, (DefaultConstructorMarker) null);
        setLayerStyle(C17786k.f49831n);
        setBackgroundColor(C18368l.m62755d(context, C17777b.f49596k));
        int[] iArr = C17787l.f50559u8;
        C41536l.m120488h(iArr, "NavigationSearchView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        C41536l.m120488h(obtainStyledAttributes, "obtainStyledAttributes(set, attrs, defStyleAttr, defStyleRes)");
        setNavigationEnabled(obtainStyledAttributes.getBoolean(C17787l.f50589w8, true));
        setHint(obtainStyledAttributes.getString(C17787l.f50574v8));
        obtainStyledAttributes.recycle();
        ClearFocusEditText clearFocusEditText = c.f26861i;
        C41536l.m120488h(clearFocusEditText, "searchInputText");
        clearFocusEditText.addTextChangedListener(new C13505c(c, this));
        c.f26861i.setOnFocusChangeListener(new C15657a(this));
        c.f26859g.setOnClickListener(new C15658b(c));
    }
}

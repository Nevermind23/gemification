package p341ge.bog.designsystem.components.search;

import af1.C40303i;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import he1.C41217g;
import kotlin.jvm.internal.C41520a0;
import kotlin.jvm.internal.C41536l;
import kotlin.jvm.internal.C41537m;
import kotlin.jvm.internal.C41539o;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p060e1.C5893c;
import p060e1.C5936i0;
import p060e1.C5958l0;
import p341ge.bog.designsystem.components.common.Color;
import p341ge.bog.designsystem.components.input.BogEditText;
import p341ge.bog.designsystem.components.layersandshadows.LayerView;
import p352ak.C9881b5;
import p464ij.C15659c;
import p464ij.C15660d;
import p464ij.C15661e;
import p464ij.C15662f;
import p601sg.C17777b;
import p601sg.C17779d;
import p601sg.C17787l;
import p642vh.C18368l;
import p642vh.C18379r;
import ue1.C43064a;
import ue1.C43075l;

/* renamed from: ge.bog.designsystem.components.search.SearchView */
public final class SearchView extends LinearLayout {

    /* renamed from: m */
    public static final C13506a f40287m = new C13506a((DefaultConstructorMarker) null);

    /* renamed from: n */
    static final /* synthetic */ C40303i[] f40288n = {C41520a0.m120439e(new C41539o(SearchView.class, "searchIconTint", "getSearchIconTint()Lge/bog/designsystem/components/common/Color;", 0))};

    /* renamed from: d */
    private final C9881b5 f40289d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public C43075l f40290e;

    /* renamed from: f */
    private C43075l f40291f;

    /* renamed from: g */
    private C43064a f40292g;

    /* renamed from: h */
    private C43064a f40293h;

    /* renamed from: i */
    private boolean f40294i;

    /* renamed from: j */
    private String f40295j;

    /* renamed from: k */
    private final C18379r f40296k;

    /* renamed from: l */
    private final C41217g f40297l;

    /* renamed from: ge.bog.designsystem.components.search.SearchView$a */
    public static final class C13506a {
        private C13506a() {
        }

        public /* synthetic */ C13506a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: ge.bog.designsystem.components.search.SearchView$b */
    public static final class C13507b implements TextWatcher {

        /* renamed from: d */
        final /* synthetic */ C9881b5 f40298d;

        /* renamed from: e */
        final /* synthetic */ SearchView f40299e;

        public C13507b(C9881b5 b5Var, SearchView searchView) {
            this.f40298d = b5Var;
            this.f40299e = searchView;
        }

        public void afterTextChanged(Editable editable) {
            boolean z;
            FrameLayout frameLayout = this.f40298d.f26817f;
            int i = 0;
            if (editable == null || C40439w.m117118v(editable)) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i = 8;
            }
            frameLayout.setVisibility(i);
            C43075l e = this.f40299e.f40290e;
            if (e != null) {
                e.invoke(String.valueOf(editable));
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: ge.bog.designsystem.components.search.SearchView$c */
    static final class C13508c extends C41537m implements C43064a {

        /* renamed from: d */
        public static final C13508c f40300d = new C13508c();

        C13508c() {
            super(0);
        }

        /* renamed from: b */
        public final C5893c invoke() {
            C5893c cVar = new C5893c();
            cVar.mo19350p0(150);
            cVar.mo19355t0(new AccelerateDecelerateInterpolator());
            return cVar;
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (DefaultConstructorMarker) null);
        C41536l.m120489i(context, "context");
    }

    /* renamed from: f */
    private final void m50652f(Context context, View view) {
        Object systemService = context.getSystemService("input_method");
        C41536l.m120487g(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public static final void m50653g(SearchView searchView, C9881b5 b5Var, View view, boolean z) {
        int i;
        Color.Attribute attribute;
        C41536l.m120489i(searchView, "this$0");
        C41536l.m120489i(b5Var, "$this_apply");
        C43075l lVar = searchView.f40291f;
        if (lVar != null) {
            lVar.invoke(Boolean.valueOf(z));
        }
        C5958l0.m23911b(searchView, searchView.getTransition());
        searchView.setActivated(z);
        AppCompatTextView appCompatTextView = b5Var.f26816e;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        appCompatTextView.setVisibility(i);
        if (z) {
            attribute = new Color.Attribute(C17777b.f49601r);
        } else {
            attribute = new Color.Attribute(C17777b.f49599p);
        }
        searchView.setSearchIconTint(attribute);
    }

    private final Color getSearchIconTint() {
        return this.f40296k.getValue(this, f40288n[0]);
    }

    private final C5936i0 getTransition() {
        return (C5936i0) this.f40297l.getValue();
    }

    /* access modifiers changed from: private */
    /* renamed from: h */
    public static final boolean m50654h(C9881b5 b5Var, SearchView searchView, Context context, TextView textView, int i, KeyEvent keyEvent) {
        C41536l.m120489i(b5Var, "$this_apply");
        C41536l.m120489i(searchView, "this$0");
        C41536l.m120489i(context, "$context");
        if (i != 3) {
            return false;
        }
        b5Var.f26821j.clearFocus();
        BogEditText bogEditText = b5Var.f26821j;
        C41536l.m120488h(bogEditText, "searchInputText");
        searchView.m50652f(context, bogEditText);
        C43064a aVar = searchView.f40293h;
        if (aVar == null) {
            return false;
        }
        aVar.invoke();
        return false;
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public static final void m50655i(SearchView searchView, C9881b5 b5Var, Context context, View view) {
        C41536l.m120489i(searchView, "this$0");
        C41536l.m120489i(b5Var, "$this_apply");
        C41536l.m120489i(context, "$context");
        C5958l0.m23911b(searchView, searchView.getTransition());
        b5Var.f26821j.clearFocus();
        b5Var.f26821j.setText((CharSequence) null);
        BogEditText bogEditText = b5Var.f26821j;
        C41536l.m120488h(bogEditText, "searchInputText");
        searchView.m50652f(context, bogEditText);
        C43064a aVar = searchView.f40292g;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public static final void m50656j(C9881b5 b5Var, View view) {
        C41536l.m120489i(b5Var, "$this_apply");
        b5Var.f26821j.setText((CharSequence) null);
    }

    private final void setSearchIconTint(Color color) {
        this.f40296k.setValue(this, f40288n[0], color);
    }

    public final boolean getHasFocus() {
        return this.f40294i;
    }

    public final String getHint() {
        return this.f40289d.f26821j.getHint().toString();
    }

    public final void setCancelButtonListener(C43064a aVar) {
        C41536l.m120489i(aVar, "onCancelClick");
        this.f40292g = aVar;
    }

    public final void setHint(String str) {
        this.f40289d.f26821j.setHint(str);
        this.f40295j = str;
    }

    public final void setInputText(CharSequence charSequence) {
        BogEditText bogEditText = this.f40289d.f26821j;
        C41536l.m120488h(bogEditText, "binding.searchInputText");
        C18368l.m62747B(bogEditText, charSequence);
    }

    public final void setOnFocusChangeListener(C43075l lVar) {
        C41536l.m120489i(lVar, "onFocusChange");
        this.f40291f = lVar;
    }

    public final void setOnTextChangeListener(C43075l lVar) {
        C41536l.m120489i(lVar, "onTextChange");
        this.f40290e = lVar;
    }

    public final void setSearchActionClickListener(C43064a aVar) {
        C41536l.m120489i(aVar, "onSearchActionClick");
        this.f40293h = aVar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        float f;
        C41536l.m120489i(context, "context");
        C9881b5 c = C9881b5.m36243c(LayoutInflater.from(context), this);
        C41536l.m120488h(c, "inflate(LayoutInflater.from(context), this)");
        this.f40289d = c;
        this.f40294i = c.f26821j.hasFocus();
        this.f40295j = "";
        AppCompatImageView appCompatImageView = c.f26820i;
        C41536l.m120488h(appCompatImageView, "binding.iconSearch");
        this.f40296k = new C18379r(appCompatImageView);
        this.f40297l = C41219i.m119470b(C13508c.f40300d);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C17787l.f50621ya);
            C41536l.m120488h(obtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.SearchView)");
            setHint(obtainStyledAttributes.getString(C17787l.f49851Aa));
            int i2 = obtainStyledAttributes.getInt(C17787l.f50636za, 0);
            LayerView layerView = c.f26822k;
            if (i2 == 1) {
                f = context.getResources().getDimension(C17779d.search_view_height_thick);
            } else {
                f = context.getResources().getDimension(C17779d.search_view_height_thin);
            }
            layerView.setLayoutParams(new LinearLayout.LayoutParams(0, (int) f, 1.0f));
            obtainStyledAttributes.recycle();
        }
        BogEditText bogEditText = c.f26821j;
        C41536l.m120488h(bogEditText, "searchInputText");
        bogEditText.addTextChangedListener(new C13507b(c, this));
        c.f26821j.setOnFocusChangeListener(new C15659c(this, c));
        c.f26821j.setOnEditorActionListener(new C15660d(c, this, context));
        c.f26816e.setOnClickListener(new C15661e(this, c, context));
        c.f26817f.setOnClickListener(new C15662f(c));
    }
}

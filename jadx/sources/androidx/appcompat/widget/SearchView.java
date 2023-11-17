package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.C0266c;
import androidx.core.view.ViewCompat;
import androidx.customview.view.AbsSavedState;
import com.salesforce.marketingcloud.C11398b;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import p030c.C2210a;
import p030c.C2213d;
import p030c.C2215f;
import p030c.C2216g;
import p030c.C2217h;
import p030c.C2219j;
import p317y.C8983a;

public class SearchView extends LinearLayoutCompat implements C0266c {

    /* renamed from: q0 */
    static final C0377o f1871q0 = (Build.VERSION.SDK_INT < 29 ? new C0377o() : null);

    /* renamed from: A */
    private final View f1872A;

    /* renamed from: B */
    private C0378p f1873B;

    /* renamed from: C */
    private Rect f1874C;

    /* renamed from: D */
    private Rect f1875D;

    /* renamed from: E */
    private int[] f1876E;

    /* renamed from: F */
    private int[] f1877F;

    /* renamed from: G */
    private final ImageView f1878G;

    /* renamed from: H */
    private final Drawable f1879H;

    /* renamed from: I */
    private final int f1880I;

    /* renamed from: J */
    private final int f1881J;

    /* renamed from: K */
    private final Intent f1882K;

    /* renamed from: L */
    private final Intent f1883L;

    /* renamed from: M */
    private final CharSequence f1884M;

    /* renamed from: N */
    View.OnFocusChangeListener f1885N;

    /* renamed from: O */
    private View.OnClickListener f1886O;

    /* renamed from: P */
    private boolean f1887P;

    /* renamed from: Q */
    private boolean f1888Q;

    /* renamed from: R */
    C8983a f1889R;

    /* renamed from: S */
    private boolean f1890S;

    /* renamed from: T */
    private CharSequence f1891T;

    /* renamed from: U */
    private boolean f1892U;

    /* renamed from: V */
    private boolean f1893V;

    /* renamed from: W */
    private int f1894W;

    /* renamed from: a0 */
    private boolean f1895a0;

    /* renamed from: b0 */
    private CharSequence f1896b0;

    /* renamed from: c0 */
    private CharSequence f1897c0;

    /* renamed from: d0 */
    private boolean f1898d0;

    /* renamed from: e0 */
    private int f1899e0;

    /* renamed from: f0 */
    SearchableInfo f1900f0;

    /* renamed from: g0 */
    private Bundle f1901g0;

    /* renamed from: h0 */
    private final Runnable f1902h0;

    /* renamed from: i0 */
    private Runnable f1903i0;

    /* renamed from: j0 */
    private final WeakHashMap f1904j0;

    /* renamed from: k0 */
    private final View.OnClickListener f1905k0;

    /* renamed from: l0 */
    View.OnKeyListener f1906l0;

    /* renamed from: m0 */
    private final TextView.OnEditorActionListener f1907m0;

    /* renamed from: n0 */
    private final AdapterView.OnItemClickListener f1908n0;

    /* renamed from: o0 */
    private final AdapterView.OnItemSelectedListener f1909o0;

    /* renamed from: p0 */
    private TextWatcher f1910p0;

    /* renamed from: s */
    final SearchAutoComplete f1911s;

    /* renamed from: t */
    private final View f1912t;

    /* renamed from: u */
    private final View f1913u;

    /* renamed from: v */
    private final View f1914v;

    /* renamed from: w */
    final ImageView f1915w;

    /* renamed from: x */
    final ImageView f1916x;

    /* renamed from: y */
    final ImageView f1917y;

    /* renamed from: z */
    final ImageView f1918z;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0361a();

        /* renamed from: f */
        boolean f1919f;

        /* renamed from: androidx.appcompat.widget.SearchView$SavedState$a */
        class C0361a implements Parcelable.ClassLoaderCreator {
            C0361a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }

            /* renamed from: b */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            /* renamed from: c */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.f1919f + "}";
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeValue(Boolean.valueOf(this.f1919f));
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f1919f = ((Boolean) parcel.readValue((ClassLoader) null)).booleanValue();
        }
    }

    public static class SearchAutoComplete extends C0410c {

        /* renamed from: h */
        private int f1920h;

        /* renamed from: i */
        private SearchView f1921i;

        /* renamed from: j */
        private boolean f1922j;

        /* renamed from: k */
        final Runnable f1923k;

        /* renamed from: androidx.appcompat.widget.SearchView$SearchAutoComplete$a */
        class C0362a implements Runnable {
            C0362a() {
            }

            public void run() {
                SearchAutoComplete.this.mo1696d();
            }
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            this(context, attributeSet, C2210a.f6457m);
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return C11398b.f33139r;
            }
            if (i >= 600) {
                return 192;
            }
            if (i < 640 || i2 < 480) {
                return 160;
            }
            return 192;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1694b() {
            if (Build.VERSION.SDK_INT >= 29) {
                C0373k.m1505b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            SearchView.f1871q0.mo1724c(this);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public boolean mo1695c() {
            return TextUtils.getTrimmedLength(getText()) == 0;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: d */
        public void mo1696d() {
            if (this.f1922j) {
                ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
                this.f1922j = false;
            }
        }

        public boolean enoughToFilter() {
            return this.f1920h <= 0 || super.enoughToFilter();
        }

        public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f1922j) {
                removeCallbacks(this.f1923k);
                post(this.f1923k);
            }
            return onCreateInputConnection;
        }

        /* access modifiers changed from: protected */
        public void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, (float) getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        /* access modifiers changed from: protected */
        public void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            this.f1921i.mo1652Z();
        }

        public boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f1921i.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        public void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f1921i.hasFocus() && getVisibility() == 0) {
                this.f1922j = true;
                if (SearchView.m1467M(getContext())) {
                    mo1694b();
                }
            }
        }

        public void performCompletion() {
        }

        /* access modifiers changed from: protected */
        public void replaceText(CharSequence charSequence) {
        }

        /* access modifiers changed from: package-private */
        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (!z) {
                this.f1922j = false;
                removeCallbacks(this.f1923k);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f1922j = false;
                removeCallbacks(this.f1923k);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f1922j = true;
            }
        }

        /* access modifiers changed from: package-private */
        public void setSearchView(SearchView searchView) {
            this.f1921i = searchView;
        }

        public void setThreshold(int i) {
            super.setThreshold(i);
            this.f1920h = i;
        }

        public SearchAutoComplete(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.f1923k = new C0362a();
            this.f1920h = getThreshold();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$a */
    class C0363a implements TextWatcher {
        C0363a() {
        }

        public void afterTextChanged(Editable editable) {
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            SearchView.this.mo1651Y(charSequence);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$b */
    class C0364b implements Runnable {
        C0364b() {
        }

        public void run() {
            SearchView.this.mo1656f0();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$c */
    class C0365c implements Runnable {
        C0365c() {
        }

        public void run() {
            C8983a aVar = SearchView.this.f1889R;
            if (aVar instanceof C0466m1) {
                aVar.mo2208a((Cursor) null);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$d */
    class C0366d implements View.OnFocusChangeListener {
        C0366d() {
        }

        public void onFocusChange(View view, boolean z) {
            SearchView searchView = SearchView.this;
            View.OnFocusChangeListener onFocusChangeListener = searchView.f1885N;
            if (onFocusChangeListener != null) {
                onFocusChangeListener.onFocusChange(searchView, z);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$e */
    class C0367e implements View.OnLayoutChangeListener {
        C0367e() {
        }

        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            SearchView.this.mo1640B();
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$f */
    class C0368f implements View.OnClickListener {
        C0368f() {
        }

        public void onClick(View view) {
            SearchView searchView = SearchView.this;
            if (view == searchView.f1915w) {
                searchView.mo1648V();
            } else if (view == searchView.f1917y) {
                searchView.mo1644R();
            } else if (view == searchView.f1916x) {
                searchView.mo1649W();
            } else if (view == searchView.f1918z) {
                searchView.mo1653a0();
            } else if (view == searchView.f1911s) {
                searchView.mo1641H();
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$g */
    class C0369g implements View.OnKeyListener {
        C0369g() {
        }

        public boolean onKey(View view, int i, KeyEvent keyEvent) {
            SearchView searchView = SearchView.this;
            if (searchView.f1900f0 == null) {
                return false;
            }
            if (searchView.f1911s.isPopupShowing() && SearchView.this.f1911s.getListSelection() != -1) {
                return SearchView.this.mo1650X(view, i, keyEvent);
            }
            if (SearchView.this.f1911s.mo1695c() || !keyEvent.hasNoModifiers() || keyEvent.getAction() != 1 || i != 66) {
                return false;
            }
            view.cancelLongPress();
            SearchView searchView2 = SearchView.this;
            searchView2.mo1643P(0, (String) null, searchView2.f1911s.getText().toString());
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$h */
    class C0370h implements TextView.OnEditorActionListener {
        C0370h() {
        }

        public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            SearchView.this.mo1649W();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$i */
    class C0371i implements AdapterView.OnItemClickListener {
        C0371i() {
        }

        public void onItemClick(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.mo1645S(i, 0, (String) null);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$j */
    class C0372j implements AdapterView.OnItemSelectedListener {
        C0372j() {
        }

        public void onItemSelected(AdapterView adapterView, View view, int i, long j) {
            SearchView.this.mo1646T(i);
        }

        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$k */
    static class C0373k {
        /* renamed from: a */
        static void m1504a(AutoCompleteTextView autoCompleteTextView) {
            autoCompleteTextView.refreshAutoCompleteResults();
        }

        /* renamed from: b */
        static void m1505b(SearchAutoComplete searchAutoComplete, int i) {
            searchAutoComplete.setInputMethodMode(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$l */
    public interface C0374l {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$m */
    public interface C0375m {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$n */
    public interface C0376n {
    }

    /* renamed from: androidx.appcompat.widget.SearchView$o */
    private static class C0377o {

        /* renamed from: a */
        private Method f1935a = null;

        /* renamed from: b */
        private Method f1936b = null;

        /* renamed from: c */
        private Method f1937c = null;

        C0377o() {
            Class<AutoCompleteTextView> cls = AutoCompleteTextView.class;
            m1506d();
            try {
                Method declaredMethod = cls.getDeclaredMethod("doBeforeTextChanged", new Class[0]);
                this.f1935a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = cls.getDeclaredMethod("doAfterTextChanged", new Class[0]);
                this.f1936b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = cls.getMethod("ensureImeVisible", new Class[]{Boolean.TYPE});
                this.f1937c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
        }

        /* renamed from: d */
        private static void m1506d() {
            if (Build.VERSION.SDK_INT >= 29) {
                throw new UnsupportedClassVersionError("This function can only be used for API Level < 29.");
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: a */
        public void mo1722a(AutoCompleteTextView autoCompleteTextView) {
            m1506d();
            Method method = this.f1936b;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: b */
        public void mo1723b(AutoCompleteTextView autoCompleteTextView) {
            m1506d();
            Method method = this.f1935a;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[0]);
                } catch (Exception unused) {
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: c */
        public void mo1724c(AutoCompleteTextView autoCompleteTextView) {
            m1506d();
            Method method = this.f1937c;
            if (method != null) {
                try {
                    method.invoke(autoCompleteTextView, new Object[]{Boolean.TRUE});
                } catch (Exception unused) {
                }
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.SearchView$p */
    private static class C0378p extends TouchDelegate {

        /* renamed from: a */
        private final View f1938a;

        /* renamed from: b */
        private final Rect f1939b = new Rect();

        /* renamed from: c */
        private final Rect f1940c = new Rect();

        /* renamed from: d */
        private final Rect f1941d = new Rect();

        /* renamed from: e */
        private final int f1942e;

        /* renamed from: f */
        private boolean f1943f;

        public C0378p(Rect rect, Rect rect2, View view) {
            super(rect, view);
            this.f1942e = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
            mo1725a(rect, rect2);
            this.f1938a = view;
        }

        /* renamed from: a */
        public void mo1725a(Rect rect, Rect rect2) {
            this.f1939b.set(rect);
            this.f1941d.set(rect);
            Rect rect3 = this.f1941d;
            int i = this.f1942e;
            rect3.inset(-i, -i);
            this.f1940c.set(rect2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:18:0x0043  */
        /* JADX WARNING: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTouchEvent(android.view.MotionEvent r9) {
            /*
                r8 = this;
                float r0 = r9.getX()
                int r0 = (int) r0
                float r1 = r9.getY()
                int r1 = (int) r1
                int r2 = r9.getAction()
                r3 = 2
                r4 = 0
                r5 = 1
                if (r2 == 0) goto L_0x0033
                if (r2 == r5) goto L_0x0020
                if (r2 == r3) goto L_0x0020
                r6 = 3
                if (r2 == r6) goto L_0x001b
                goto L_0x003f
            L_0x001b:
                boolean r2 = r8.f1943f
                r8.f1943f = r4
                goto L_0x002f
            L_0x0020:
                boolean r2 = r8.f1943f
                if (r2 == 0) goto L_0x002f
                android.graphics.Rect r6 = r8.f1941d
                boolean r6 = r6.contains(r0, r1)
                if (r6 != 0) goto L_0x002f
                r5 = r2
                r2 = r4
                goto L_0x0041
            L_0x002f:
                r7 = r5
                r5 = r2
                r2 = r7
                goto L_0x0041
            L_0x0033:
                android.graphics.Rect r2 = r8.f1939b
                boolean r2 = r2.contains(r0, r1)
                if (r2 == 0) goto L_0x003f
                r8.f1943f = r5
                r2 = r5
                goto L_0x0041
            L_0x003f:
                r2 = r5
                r5 = r4
            L_0x0041:
                if (r5 == 0) goto L_0x0074
                if (r2 == 0) goto L_0x0061
                android.graphics.Rect r2 = r8.f1940c
                boolean r2 = r2.contains(r0, r1)
                if (r2 != 0) goto L_0x0061
                android.view.View r0 = r8.f1938a
                int r0 = r0.getWidth()
                int r0 = r0 / r3
                float r0 = (float) r0
                android.view.View r1 = r8.f1938a
                int r1 = r1.getHeight()
                int r1 = r1 / r3
                float r1 = (float) r1
                r9.setLocation(r0, r1)
                goto L_0x006e
            L_0x0061:
                android.graphics.Rect r2 = r8.f1940c
                int r3 = r2.left
                int r0 = r0 - r3
                float r0 = (float) r0
                int r2 = r2.top
                int r1 = r1 - r2
                float r1 = (float) r1
                r9.setLocation(r0, r1)
            L_0x006e:
                android.view.View r0 = r8.f1938a
                boolean r4 = r0.dispatchTouchEvent(r9)
            L_0x0074:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.C0378p.onTouchEvent(android.view.MotionEvent):boolean");
        }
    }

    public SearchView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: C */
    private Intent m1459C(String str, Uri uri, String str2, String str3, int i, String str4) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.f1897c0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.f1901g0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        if (i != 0) {
            intent.putExtra("action_key", i);
            intent.putExtra("action_msg", str4);
        }
        intent.setComponent(this.f1900f0.getSearchActivity());
        return intent;
    }

    /* renamed from: D */
    private Intent m1460D(Cursor cursor, int i, String str) {
        int i2;
        Uri uri;
        String o;
        try {
            String o2 = C0466m1.m1866o(cursor, "suggest_intent_action");
            if (o2 == null) {
                o2 = this.f1900f0.getSuggestIntentAction();
            }
            if (o2 == null) {
                o2 = "android.intent.action.SEARCH";
            }
            String str2 = o2;
            String o3 = C0466m1.m1866o(cursor, "suggest_intent_data");
            if (o3 == null) {
                o3 = this.f1900f0.getSuggestIntentData();
            }
            if (!(o3 == null || (o = C0466m1.m1866o(cursor, "suggest_intent_data_id")) == null)) {
                o3 = o3 + C11110u2.f31950c + Uri.encode(o);
            }
            if (o3 == null) {
                uri = null;
            } else {
                uri = Uri.parse(o3);
            }
            return m1459C(str2, uri, C0466m1.m1866o(cursor, "suggest_intent_extra_data"), C0466m1.m1866o(cursor, "suggest_intent_query"), i, str);
        } catch (RuntimeException e) {
            try {
                i2 = cursor.getPosition();
            } catch (RuntimeException unused) {
                i2 = -1;
            }
            Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            return null;
        }
    }

    /* renamed from: E */
    private Intent m1461E(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.f1901g0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    /* renamed from: F */
    private Intent m1462F(Intent intent, SearchableInfo searchableInfo) {
        String str;
        Intent intent2 = new Intent(intent);
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        if (searchActivity == null) {
            str = null;
        } else {
            str = searchActivity.flattenToShortString();
        }
        intent2.putExtra("calling_package", str);
        return intent2;
    }

    /* renamed from: G */
    private void m1463G() {
        this.f1911s.dismissDropDown();
    }

    /* renamed from: I */
    private void m1464I(View view, Rect rect) {
        view.getLocationInWindow(this.f1876E);
        getLocationInWindow(this.f1877F);
        int[] iArr = this.f1876E;
        int i = iArr[1];
        int[] iArr2 = this.f1877F;
        int i2 = i - iArr2[1];
        int i3 = iArr[0] - iArr2[0];
        rect.set(i3, i2, view.getWidth() + i3, view.getHeight() + i2);
    }

    /* renamed from: J */
    private CharSequence m1465J(CharSequence charSequence) {
        if (!this.f1887P || this.f1879H == null) {
            return charSequence;
        }
        int textSize = (int) (((double) this.f1911s.getTextSize()) * 1.25d);
        this.f1879H.setBounds(0, 0, textSize, textSize);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
        spannableStringBuilder.setSpan(new ImageSpan(this.f1879H), 1, 2, 33);
        spannableStringBuilder.append(charSequence);
        return spannableStringBuilder;
    }

    /* renamed from: K */
    private boolean m1466K() {
        Intent intent;
        SearchableInfo searchableInfo = this.f1900f0;
        if (searchableInfo == null || !searchableInfo.getVoiceSearchEnabled()) {
            return false;
        }
        if (this.f1900f0.getVoiceSearchLaunchWebSearch()) {
            intent = this.f1882K;
        } else if (this.f1900f0.getVoiceSearchLaunchRecognizer()) {
            intent = this.f1883L;
        } else {
            intent = null;
        }
        if (intent == null || getContext().getPackageManager().resolveActivity(intent, 65536) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: M */
    static boolean m1467M(Context context) {
        return context.getResources().getConfiguration().orientation == 2;
    }

    /* renamed from: N */
    private boolean m1468N() {
        return (this.f1890S || this.f1895a0) && !mo1642L();
    }

    /* renamed from: O */
    private void m1469O(Intent intent) {
        if (intent != null) {
            try {
                getContext().startActivity(intent);
            } catch (RuntimeException e) {
                Log.e("SearchView", "Failed launch activity: " + intent, e);
            }
        }
    }

    /* renamed from: Q */
    private boolean m1470Q(int i, int i2, String str) {
        Cursor d = this.f1889R.mo24391d();
        if (d == null || !d.moveToPosition(i)) {
            return false;
        }
        m1469O(m1460D(d, i2, str));
        return true;
    }

    /* renamed from: b0 */
    private void m1471b0() {
        post(this.f1902h0);
    }

    /* renamed from: c0 */
    private void m1472c0(int i) {
        Editable text = this.f1911s.getText();
        Cursor d = this.f1889R.mo24391d();
        if (d != null) {
            if (d.moveToPosition(i)) {
                CharSequence b = this.f1889R.mo2209b(d);
                if (b != null) {
                    setQuery(b);
                } else {
                    setQuery(text);
                }
            } else {
                setQuery(text);
            }
        }
    }

    /* renamed from: e0 */
    private void m1473e0() {
        int[] iArr;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.f1911s.getText());
        int i = 0;
        if (!z2 && (!this.f1887P || this.f1898d0)) {
            z = false;
        }
        ImageView imageView = this.f1917y;
        if (!z) {
            i = 8;
        }
        imageView.setVisibility(i);
        Drawable drawable = this.f1917y.getDrawable();
        if (drawable != null) {
            if (z2) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    /* renamed from: g0 */
    private void m1474g0() {
        CharSequence queryHint = getQueryHint();
        SearchAutoComplete searchAutoComplete = this.f1911s;
        if (queryHint == null) {
            queryHint = "";
        }
        searchAutoComplete.setHint(m1465J(queryHint));
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(C2213d.f6484e);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(C2213d.f6485f);
    }

    /* renamed from: h0 */
    private void m1475h0() {
        this.f1911s.setThreshold(this.f1900f0.getSuggestThreshold());
        this.f1911s.setImeOptions(this.f1900f0.getImeOptions());
        int inputType = this.f1900f0.getInputType();
        int i = 1;
        if ((inputType & 15) == 1) {
            inputType &= -65537;
            if (this.f1900f0.getSuggestAuthority() != null) {
                inputType = inputType | 65536 | 524288;
            }
        }
        this.f1911s.setInputType(inputType);
        C8983a aVar = this.f1889R;
        if (aVar != null) {
            aVar.mo2208a((Cursor) null);
        }
        if (this.f1900f0.getSuggestAuthority() != null) {
            C0466m1 m1Var = new C0466m1(getContext(), this, this.f1900f0, this.f1904j0);
            this.f1889R = m1Var;
            this.f1911s.setAdapter(m1Var);
            C0466m1 m1Var2 = (C0466m1) this.f1889R;
            if (this.f1892U) {
                i = 2;
            }
            m1Var2.mo2221x(i);
        }
    }

    /* renamed from: i0 */
    private void m1476i0() {
        int i;
        if (!m1468N() || !(this.f1916x.getVisibility() == 0 || this.f1918z.getVisibility() == 0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f1914v.setVisibility(i);
    }

    /* renamed from: j0 */
    private void m1477j0(boolean z) {
        int i;
        if (!this.f1890S || !m1468N() || !hasFocus() || (!z && this.f1895a0)) {
            i = 8;
        } else {
            i = 0;
        }
        this.f1916x.setVisibility(i);
    }

    /* renamed from: k0 */
    private void m1478k0(boolean z) {
        int i;
        int i2;
        this.f1888Q = z;
        int i3 = 0;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean z2 = !TextUtils.isEmpty(this.f1911s.getText());
        this.f1915w.setVisibility(i);
        m1477j0(z2);
        View view = this.f1912t;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        view.setVisibility(i2);
        if (this.f1878G.getDrawable() == null || this.f1887P) {
            i3 = 8;
        }
        this.f1878G.setVisibility(i3);
        m1473e0();
        m1479l0(!z2);
        m1476i0();
    }

    /* renamed from: l0 */
    private void m1479l0(boolean z) {
        int i = 8;
        if (this.f1895a0 && !mo1642L() && z) {
            this.f1916x.setVisibility(8);
            i = 0;
        }
        this.f1918z.setVisibility(i);
    }

    private void setQuery(CharSequence charSequence) {
        int i;
        this.f1911s.setText(charSequence);
        SearchAutoComplete searchAutoComplete = this.f1911s;
        if (TextUtils.isEmpty(charSequence)) {
            i = 0;
        } else {
            i = charSequence.length();
        }
        searchAutoComplete.setSelection(i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public void mo1640B() {
        int i;
        int i2;
        if (this.f1872A.getWidth() > 1) {
            Resources resources = getContext().getResources();
            int paddingLeft = this.f1913u.getPaddingLeft();
            Rect rect = new Rect();
            boolean b = C0417d2.m1689b(this);
            if (this.f1887P) {
                i = resources.getDimensionPixelSize(C2213d.f6482c) + resources.getDimensionPixelSize(C2213d.f6483d);
            } else {
                i = 0;
            }
            this.f1911s.getDropDownBackground().getPadding(rect);
            if (b) {
                i2 = -rect.left;
            } else {
                i2 = paddingLeft - (rect.left + i);
            }
            this.f1911s.setDropDownHorizontalOffset(i2);
            this.f1911s.setDropDownWidth((((this.f1872A.getWidth() + rect.left) + rect.right) + i) - paddingLeft);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: H */
    public void mo1641H() {
        if (Build.VERSION.SDK_INT >= 29) {
            C0373k.m1504a(this.f1911s);
            return;
        }
        C0377o oVar = f1871q0;
        oVar.mo1723b(this.f1911s);
        oVar.mo1722a(this.f1911s);
    }

    /* renamed from: L */
    public boolean mo1642L() {
        return this.f1888Q;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: P */
    public void mo1643P(int i, String str, String str2) {
        getContext().startActivity(m1459C("android.intent.action.SEARCH", (Uri) null, (String) null, str2, i, str));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: R */
    public void mo1644R() {
        if (!TextUtils.isEmpty(this.f1911s.getText())) {
            this.f1911s.setText("");
            this.f1911s.requestFocus();
            this.f1911s.setImeVisibility(true);
        } else if (this.f1887P) {
            clearFocus();
            m1478k0(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: S */
    public boolean mo1645S(int i, int i2, String str) {
        m1470Q(i, 0, (String) null);
        this.f1911s.setImeVisibility(false);
        m1463G();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: T */
    public boolean mo1646T(int i) {
        m1472c0(i);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: U */
    public void mo1647U(CharSequence charSequence) {
        setQuery(charSequence);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: V */
    public void mo1648V() {
        m1478k0(false);
        this.f1911s.requestFocus();
        this.f1911s.setImeVisibility(true);
        View.OnClickListener onClickListener = this.f1886O;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo1649W() {
        Editable text = this.f1911s.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.f1900f0 != null) {
                mo1643P(0, (String) null, text.toString());
            }
            this.f1911s.setImeVisibility(false);
            m1463G();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo1650X(View view, int i, KeyEvent keyEvent) {
        int i2;
        if (this.f1900f0 != null && this.f1889R != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
            if (i == 66 || i == 84 || i == 61) {
                return mo1645S(this.f1911s.getListSelection(), 0, (String) null);
            }
            if (i == 21 || i == 22) {
                if (i == 21) {
                    i2 = 0;
                } else {
                    i2 = this.f1911s.length();
                }
                this.f1911s.setSelection(i2);
                this.f1911s.setListSelection(0);
                this.f1911s.clearListSelection();
                this.f1911s.mo1694b();
                return true;
            } else if (i == 19) {
                this.f1911s.getListSelection();
                return false;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Y */
    public void mo1651Y(CharSequence charSequence) {
        Editable text = this.f1911s.getText();
        this.f1897c0 = text;
        boolean z = !TextUtils.isEmpty(text);
        m1477j0(z);
        m1479l0(!z);
        m1473e0();
        m1476i0();
        this.f1896b0 = charSequence.toString();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: Z */
    public void mo1652Z() {
        m1478k0(mo1642L());
        m1471b0();
        if (this.f1911s.hasFocus()) {
            mo1641H();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a0 */
    public void mo1653a0() {
        SearchableInfo searchableInfo = this.f1900f0;
        if (searchableInfo != null) {
            try {
                if (searchableInfo.getVoiceSearchLaunchWebSearch()) {
                    getContext().startActivity(m1462F(this.f1882K, searchableInfo));
                } else if (searchableInfo.getVoiceSearchLaunchRecognizer()) {
                    getContext().startActivity(m1461E(this.f1883L, searchableInfo));
                }
            } catch (ActivityNotFoundException unused) {
                Log.w("SearchView", "Could not find voice search activity");
            }
        }
    }

    /* renamed from: b */
    public void mo741b() {
        if (!this.f1898d0) {
            this.f1898d0 = true;
            int imeOptions = this.f1911s.getImeOptions();
            this.f1899e0 = imeOptions;
            this.f1911s.setImeOptions(imeOptions | 33554432);
            this.f1911s.setText("");
            setIconified(false);
        }
    }

    public void clearFocus() {
        this.f1893V = true;
        super.clearFocus();
        this.f1911s.clearFocus();
        this.f1911s.setImeVisibility(false);
        this.f1893V = false;
    }

    /* renamed from: d0 */
    public void mo1655d0(CharSequence charSequence, boolean z) {
        this.f1911s.setText(charSequence);
        if (charSequence != null) {
            SearchAutoComplete searchAutoComplete = this.f1911s;
            searchAutoComplete.setSelection(searchAutoComplete.length());
            this.f1897c0 = charSequence;
        }
        if (z && !TextUtils.isEmpty(charSequence)) {
            mo1649W();
        }
    }

    /* renamed from: f */
    public void mo742f() {
        mo1655d0("", false);
        clearFocus();
        m1478k0(true);
        this.f1911s.setImeOptions(this.f1899e0);
        this.f1898d0 = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f0 */
    public void mo1656f0() {
        int[] iArr;
        if (this.f1911s.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f1913u.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.f1914v.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public int getImeOptions() {
        return this.f1911s.getImeOptions();
    }

    public int getInputType() {
        return this.f1911s.getInputType();
    }

    public int getMaxWidth() {
        return this.f1894W;
    }

    public CharSequence getQuery() {
        return this.f1911s.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.f1891T;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.f1900f0;
        if (searchableInfo == null || searchableInfo.getHintId() == 0) {
            return this.f1884M;
        }
        return getContext().getText(this.f1900f0.getHintId());
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionCommitIconResId() {
        return this.f1881J;
    }

    /* access modifiers changed from: package-private */
    public int getSuggestionRowLayout() {
        return this.f1880I;
    }

    public C8983a getSuggestionsAdapter() {
        return this.f1889R;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        removeCallbacks(this.f1902h0);
        post(this.f1903i0);
        super.onDetachedFromWindow();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            m1464I(this.f1911s, this.f1874C);
            Rect rect = this.f1875D;
            Rect rect2 = this.f1874C;
            rect.set(rect2.left, 0, rect2.right, i4 - i2);
            C0378p pVar = this.f1873B;
            if (pVar == null) {
                C0378p pVar2 = new C0378p(this.f1875D, this.f1874C, this.f1911s);
                this.f1873B = pVar2;
                setTouchDelegate(pVar2);
                return;
            }
            pVar.mo1725a(this.f1875D, this.f1874C);
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        if (mo1642L()) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == Integer.MIN_VALUE) {
            int i4 = this.f1894W;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        } else if (mode == 0) {
            size = this.f1894W;
            if (size <= 0) {
                size = getPreferredWidth();
            }
        } else if (mode == 1073741824 && (i3 = this.f1894W) > 0) {
            size = Math.min(i3, size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(getPreferredHeight(), size2);
        } else if (mode2 == 0) {
            size2 = getPreferredHeight();
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.mo3880a());
        m1478k0(savedState.f1919f);
        requestLayout();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f1919f = mo1642L();
        return savedState;
    }

    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        m1471b0();
    }

    public boolean requestFocus(int i, Rect rect) {
        if (this.f1893V || !isFocusable()) {
            return false;
        }
        if (mo1642L()) {
            return super.requestFocus(i, rect);
        }
        boolean requestFocus = this.f1911s.requestFocus(i, rect);
        if (requestFocus) {
            m1478k0(false);
        }
        return requestFocus;
    }

    public void setAppSearchData(Bundle bundle) {
        this.f1901g0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            mo1644R();
        } else {
            mo1648V();
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.f1887P != z) {
            this.f1887P = z;
            m1478k0(z);
            m1474g0();
        }
    }

    public void setImeOptions(int i) {
        this.f1911s.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.f1911s.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.f1894W = i;
        requestLayout();
    }

    public void setOnCloseListener(C0374l lVar) {
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.f1885N = onFocusChangeListener;
    }

    public void setOnQueryTextListener(C0375m mVar) {
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f1886O = onClickListener;
    }

    public void setOnSuggestionListener(C0376n nVar) {
    }

    public void setQueryHint(CharSequence charSequence) {
        this.f1891T = charSequence;
        m1474g0();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.f1892U = z;
        C8983a aVar = this.f1889R;
        if (aVar instanceof C0466m1) {
            C0466m1 m1Var = (C0466m1) aVar;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            m1Var.mo2221x(i);
        }
    }

    public void setSearchableInfo(SearchableInfo searchableInfo) {
        this.f1900f0 = searchableInfo;
        if (searchableInfo != null) {
            m1475h0();
            m1474g0();
        }
        boolean K = m1466K();
        this.f1895a0 = K;
        if (K) {
            this.f1911s.setPrivateImeOptions("nm");
        }
        m1478k0(mo1642L());
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.f1890S = z;
        m1478k0(mo1642L());
    }

    public void setSuggestionsAdapter(C8983a aVar) {
        this.f1889R = aVar;
        this.f1911s.setAdapter(aVar);
    }

    public SearchView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6438I);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1874C = new Rect();
        this.f1875D = new Rect();
        this.f1876E = new int[2];
        this.f1877F = new int[2];
        this.f1902h0 = new C0364b();
        this.f1903i0 = new C0365c();
        this.f1904j0 = new WeakHashMap();
        C0368f fVar = new C0368f();
        this.f1905k0 = fVar;
        this.f1906l0 = new C0369g();
        C0370h hVar = new C0370h();
        this.f1907m0 = hVar;
        C0371i iVar = new C0371i();
        this.f1908n0 = iVar;
        C0372j jVar = new C0372j();
        this.f1909o0 = jVar;
        this.f1910p0 = new C0363a();
        int[] iArr = C2219j.f6818n2;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        C0483r1 v = C0483r1.m1946v(context, attributeSet2, iArr, i2, 0);
        ViewCompat.m3615p0(this, context, iArr, attributeSet2, v.mo2331r(), i2, 0);
        LayoutInflater.from(context).inflate(v.mo2327n(C2219j.f6868x2, C2216g.f6597r), this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(C2215f.f6541D);
        this.f1911s = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f1912t = findViewById(C2215f.f6579z);
        View findViewById = findViewById(C2215f.f6540C);
        this.f1913u = findViewById;
        View findViewById2 = findViewById(C2215f.f6547J);
        this.f1914v = findViewById2;
        ImageView imageView = (ImageView) findViewById(C2215f.f6577x);
        this.f1915w = imageView;
        ImageView imageView2 = (ImageView) findViewById(C2215f.f6538A);
        this.f1916x = imageView2;
        ImageView imageView3 = (ImageView) findViewById(C2215f.f6578y);
        this.f1917y = imageView3;
        ImageView imageView4 = (ImageView) findViewById(C2215f.f6542E);
        this.f1918z = imageView4;
        ImageView imageView5 = (ImageView) findViewById(C2215f.f6539B);
        this.f1878G = imageView5;
        ViewCompat.m3627v0(findViewById, v.mo2320g(C2219j.f6873y2));
        ViewCompat.m3627v0(findViewById2, v.mo2320g(C2219j.f6633C2));
        int i3 = C2219j.f6628B2;
        imageView.setImageDrawable(v.mo2320g(i3));
        imageView2.setImageDrawable(v.mo2320g(C2219j.f6858v2));
        imageView3.setImageDrawable(v.mo2320g(C2219j.f6843s2));
        imageView4.setImageDrawable(v.mo2320g(C2219j.f6643E2));
        imageView5.setImageDrawable(v.mo2320g(i3));
        this.f1879H = v.mo2320g(C2219j.f6623A2);
        C0512x1.m2056a(imageView, getResources().getString(C2217h.f6613n));
        this.f1880I = v.mo2327n(C2219j.f6638D2, C2216g.f6596q);
        this.f1881J = v.mo2327n(C2219j.f6848t2, 0);
        imageView.setOnClickListener(fVar);
        imageView3.setOnClickListener(fVar);
        imageView2.setOnClickListener(fVar);
        imageView4.setOnClickListener(fVar);
        searchAutoComplete.setOnClickListener(fVar);
        searchAutoComplete.addTextChangedListener(this.f1910p0);
        searchAutoComplete.setOnEditorActionListener(hVar);
        searchAutoComplete.setOnItemClickListener(iVar);
        searchAutoComplete.setOnItemSelectedListener(jVar);
        searchAutoComplete.setOnKeyListener(this.f1906l0);
        searchAutoComplete.setOnFocusChangeListener(new C0366d());
        setIconifiedByDefault(v.mo2314a(C2219j.f6863w2, true));
        int f = v.mo2319f(C2219j.f6828p2, -1);
        if (f != -1) {
            setMaxWidth(f);
        }
        this.f1884M = v.mo2329p(C2219j.f6853u2);
        this.f1891T = v.mo2329p(C2219j.f6878z2);
        int k = v.mo2324k(C2219j.f6838r2, -1);
        if (k != -1) {
            setImeOptions(k);
        }
        int k2 = v.mo2324k(C2219j.f6833q2, -1);
        if (k2 != -1) {
            setInputType(k2);
        }
        setFocusable(v.mo2314a(C2219j.f6823o2, true));
        v.mo2333w();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.f1882K = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.f1883L = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f1872A = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new C0367e());
        }
        m1478k0(this.f1887P);
        m1474g0();
    }
}

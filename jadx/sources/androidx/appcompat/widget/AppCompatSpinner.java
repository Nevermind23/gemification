package androidx.appcompat.widget;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.app.C0214c;
import androidx.appcompat.view.menu.C0318p;
import androidx.core.util.C1002c;
import androidx.core.view.ViewCompat;
import p030c.C2210a;
import p045d.C5769a;

public class AppCompatSpinner extends Spinner {

    /* renamed from: l */
    private static final int[] f1812l = {16843505};

    /* renamed from: d */
    private final C0414d f1813d;

    /* renamed from: e */
    private final Context f1814e;

    /* renamed from: f */
    private C0515y0 f1815f;

    /* renamed from: g */
    private SpinnerAdapter f1816g;

    /* renamed from: h */
    private final boolean f1817h;

    /* renamed from: i */
    private C0355i f1818i;

    /* renamed from: j */
    int f1819j;

    /* renamed from: k */
    final Rect f1820k;

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C0343a();

        /* renamed from: d */
        boolean f1821d;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$SavedState$a */
        class C0343a implements Parcelable.Creator {
            C0343a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f1821d ? (byte) 1 : 0);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f1821d = parcel.readByte() != 0;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$a */
    class C0344a extends C0515y0 {

        /* renamed from: m */
        final /* synthetic */ C0351h f1822m;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        C0344a(View view, C0351h hVar) {
            super(view);
            this.f1822m = hVar;
        }

        /* renamed from: b */
        public C0318p mo823b() {
            return this.f1822m;
        }

        /* renamed from: c */
        public boolean mo824c() {
            if (AppCompatSpinner.this.getInternalPopup().mo1492b()) {
                return true;
            }
            AppCompatSpinner.this.mo1457b();
            return true;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$b */
    class C0345b implements ViewTreeObserver.OnGlobalLayoutListener {
        C0345b() {
        }

        public void onGlobalLayout() {
            if (!AppCompatSpinner.this.getInternalPopup().mo1492b()) {
                AppCompatSpinner.this.mo1457b();
            }
            ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
            if (viewTreeObserver != null) {
                C0346c.m1372a(viewTreeObserver, this);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$c */
    private static final class C0346c {
        /* renamed from: a */
        static void m1372a(ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$d */
    private static final class C0347d {
        /* renamed from: a */
        static int m1373a(View view) {
            return view.getTextAlignment();
        }

        /* renamed from: b */
        static int m1374b(View view) {
            return view.getTextDirection();
        }

        /* renamed from: c */
        static void m1375c(View view, int i) {
            view.setTextAlignment(i);
        }

        /* renamed from: d */
        static void m1376d(View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$e */
    private static final class C0348e {
        /* renamed from: a */
        static void m1377a(ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (!C1002c.m3509a(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                themedSpinnerAdapter.setDropDownViewTheme(theme);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$f */
    class C0349f implements C0355i, DialogInterface.OnClickListener {

        /* renamed from: d */
        C0214c f1825d;

        /* renamed from: e */
        private ListAdapter f1826e;

        /* renamed from: f */
        private CharSequence f1827f;

        C0349f() {
        }

        /* renamed from: b */
        public boolean mo1492b() {
            C0214c cVar = this.f1825d;
            if (cVar != null) {
                return cVar.isShowing();
            }
            return false;
        }

        /* renamed from: c */
        public Drawable mo1493c() {
            return null;
        }

        public void dismiss() {
            C0214c cVar = this.f1825d;
            if (cVar != null) {
                cVar.dismiss();
                this.f1825d = null;
            }
        }

        /* renamed from: e */
        public int mo1495e() {
            return 0;
        }

        /* renamed from: f */
        public void mo1496f(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: g */
        public CharSequence mo1497g() {
            return this.f1827f;
        }

        /* renamed from: h */
        public void mo1498h(CharSequence charSequence) {
            this.f1827f = charSequence;
        }

        /* renamed from: i */
        public void mo1499i(int i) {
            Log.e("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: j */
        public void mo1500j(int i) {
            Log.e("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        /* renamed from: k */
        public void mo1501k(int i, int i2) {
            if (this.f1826e != null) {
                C0214c.C0215a aVar = new C0214c.C0215a(AppCompatSpinner.this.getPopupContext());
                CharSequence charSequence = this.f1827f;
                if (charSequence != null) {
                    aVar.setTitle(charSequence);
                }
                C0214c create = aVar.setSingleChoiceItems(this.f1826e, AppCompatSpinner.this.getSelectedItemPosition(), (DialogInterface.OnClickListener) this).create();
                this.f1825d = create;
                ListView j = create.mo575j();
                C0347d.m1376d(j, i);
                C0347d.m1375c(j, i2);
                this.f1825d.show();
            }
        }

        /* renamed from: l */
        public int mo1502l() {
            return 0;
        }

        /* renamed from: m */
        public void mo1503m(ListAdapter listAdapter) {
            this.f1826e = listAdapter;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            AppCompatSpinner.this.setSelection(i);
            if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                AppCompatSpinner.this.performItemClick((View) null, i, this.f1826e.getItemId(i));
            }
            dismiss();
        }

        /* renamed from: p */
        public void mo1505p(Drawable drawable) {
            Log.e("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$g */
    private static class C0350g implements ListAdapter, SpinnerAdapter {

        /* renamed from: d */
        private SpinnerAdapter f1829d;

        /* renamed from: e */
        private ListAdapter f1830e;

        public C0350g(SpinnerAdapter spinnerAdapter, Resources.Theme theme) {
            this.f1829d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                this.f1830e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                C0348e.m1377a((ThemedSpinnerAdapter) spinnerAdapter, theme);
            }
        }

        public boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.f1830e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        public int getCount() {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        public Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        public long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            if (spinnerAdapter == null) {
                return -1;
            }
            return spinnerAdapter.getItemId(i);
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        public int getViewTypeCount() {
            return 1;
        }

        public boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        public boolean isEmpty() {
            return getCount() == 0;
        }

        public boolean isEnabled(int i) {
            ListAdapter listAdapter = this.f1830e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        public void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        public void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.f1829d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h */
    class C0351h extends C0520z0 implements C0355i {

        /* renamed from: M */
        private CharSequence f1831M;

        /* renamed from: N */
        ListAdapter f1832N;

        /* renamed from: O */
        private final Rect f1833O = new Rect();

        /* renamed from: P */
        private int f1834P;

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$a */
        class C0352a implements AdapterView.OnItemClickListener {

            /* renamed from: d */
            final /* synthetic */ AppCompatSpinner f1836d;

            C0352a(AppCompatSpinner appCompatSpinner) {
                this.f1836d = appCompatSpinner;
            }

            public void onItemClick(AdapterView adapterView, View view, int i, long j) {
                AppCompatSpinner.this.setSelection(i);
                if (AppCompatSpinner.this.getOnItemClickListener() != null) {
                    C0351h hVar = C0351h.this;
                    AppCompatSpinner.this.performItemClick(view, i, hVar.f1832N.getItemId(i));
                }
                C0351h.this.dismiss();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$b */
        class C0353b implements ViewTreeObserver.OnGlobalLayoutListener {
            C0353b() {
            }

            public void onGlobalLayout() {
                C0351h hVar = C0351h.this;
                if (!hVar.mo1521V(AppCompatSpinner.this)) {
                    C0351h.this.dismiss();
                    return;
                }
                C0351h.this.mo1519T();
                C0351h.super.mo923d();
            }
        }

        /* renamed from: androidx.appcompat.widget.AppCompatSpinner$h$c */
        class C0354c implements PopupWindow.OnDismissListener {

            /* renamed from: d */
            final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener f1839d;

            C0354c(ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
                this.f1839d = onGlobalLayoutListener;
            }

            public void onDismiss() {
                ViewTreeObserver viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.f1839d);
                }
            }
        }

        public C0351h(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            mo2372D(AppCompatSpinner.this);
            mo2378J(true);
            mo2383P(0);
            mo2380L(new C0352a(AppCompatSpinner.this));
        }

        /* access modifiers changed from: package-private */
        /* renamed from: T */
        public void mo1519T() {
            int i;
            int i2;
            Drawable c = mo2386c();
            if (c != null) {
                c.getPadding(AppCompatSpinner.this.f1820k);
                if (C0417d2.m1689b(AppCompatSpinner.this)) {
                    i = AppCompatSpinner.this.f1820k.right;
                } else {
                    i = -AppCompatSpinner.this.f1820k.left;
                }
            } else {
                Rect rect = AppCompatSpinner.this.f1820k;
                rect.right = 0;
                rect.left = 0;
                i = 0;
            }
            int paddingLeft = AppCompatSpinner.this.getPaddingLeft();
            int paddingRight = AppCompatSpinner.this.getPaddingRight();
            int width = AppCompatSpinner.this.getWidth();
            AppCompatSpinner appCompatSpinner = AppCompatSpinner.this;
            int i3 = appCompatSpinner.f1819j;
            if (i3 == -2) {
                int a = appCompatSpinner.mo1456a((SpinnerAdapter) this.f1832N, mo2386c());
                int i4 = AppCompatSpinner.this.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect2 = AppCompatSpinner.this.f1820k;
                int i5 = (i4 - rect2.left) - rect2.right;
                if (a > i5) {
                    a = i5;
                }
                mo2374F(Math.max(a, (width - paddingLeft) - paddingRight));
            } else if (i3 == -1) {
                mo2374F((width - paddingLeft) - paddingRight);
            } else {
                mo2374F(i3);
            }
            if (C0417d2.m1689b(AppCompatSpinner.this)) {
                i2 = i + (((width - paddingRight) - mo2398z()) - mo1520U());
            } else {
                i2 = i + paddingLeft + mo1520U();
            }
            mo2388f(i2);
        }

        /* renamed from: U */
        public int mo1520U() {
            return this.f1834P;
        }

        /* access modifiers changed from: package-private */
        /* renamed from: V */
        public boolean mo1521V(View view) {
            return ViewCompat.m3578U(view) && view.getGlobalVisibleRect(this.f1833O);
        }

        /* renamed from: g */
        public CharSequence mo1497g() {
            return this.f1831M;
        }

        /* renamed from: h */
        public void mo1498h(CharSequence charSequence) {
            this.f1831M = charSequence;
        }

        /* renamed from: j */
        public void mo1500j(int i) {
            this.f1834P = i;
        }

        /* renamed from: k */
        public void mo1501k(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            boolean b = mo922b();
            mo1519T();
            mo2377I(2);
            super.mo923d();
            ListView o = mo929o();
            o.setChoiceMode(1);
            C0347d.m1376d(o, i);
            C0347d.m1375c(o, i2);
            mo2384Q(AppCompatSpinner.this.getSelectedItemPosition());
            if (!b && (viewTreeObserver = AppCompatSpinner.this.getViewTreeObserver()) != null) {
                C0353b bVar = new C0353b();
                viewTreeObserver.addOnGlobalLayoutListener(bVar);
                mo2379K(new C0354c(bVar));
            }
        }

        /* renamed from: m */
        public void mo1503m(ListAdapter listAdapter) {
            super.mo1503m(listAdapter);
            this.f1832N = listAdapter;
        }
    }

    /* renamed from: androidx.appcompat.widget.AppCompatSpinner$i */
    interface C0355i {
        /* renamed from: b */
        boolean mo1492b();

        /* renamed from: c */
        Drawable mo1493c();

        void dismiss();

        /* renamed from: e */
        int mo1495e();

        /* renamed from: f */
        void mo1496f(int i);

        /* renamed from: g */
        CharSequence mo1497g();

        /* renamed from: h */
        void mo1498h(CharSequence charSequence);

        /* renamed from: i */
        void mo1499i(int i);

        /* renamed from: j */
        void mo1500j(int i);

        /* renamed from: k */
        void mo1501k(int i, int i2);

        /* renamed from: l */
        int mo1502l();

        /* renamed from: m */
        void mo1503m(ListAdapter listAdapter);

        /* renamed from: p */
        void mo1505p(Drawable drawable);
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C2210a.f6440K);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public int mo1456a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int max2 = Math.max(0, max - (15 - (min - max))); max2 < min; max2++) {
            int itemViewType = spinnerAdapter.getItemViewType(max2);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(max2, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        drawable.getPadding(this.f1820k);
        Rect rect = this.f1820k;
        return i2 + rect.left + rect.right;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public void mo1457b() {
        this.f1818i.mo1501k(C0347d.m1374b(this), C0347d.m1373a(this));
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            dVar.mo2019b();
        }
    }

    public int getDropDownHorizontalOffset() {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            return iVar.mo1495e();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            return iVar.mo1502l();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.f1818i != null) {
            return this.f1819j;
        }
        return super.getDropDownWidth();
    }

    /* access modifiers changed from: package-private */
    public final C0355i getInternalPopup() {
        return this.f1818i;
    }

    public Drawable getPopupBackground() {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            return iVar.mo1493c();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.f1814e;
    }

    public CharSequence getPrompt() {
        C0355i iVar = this.f1818i;
        return iVar != null ? iVar.mo1497g() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            return dVar.mo2020c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            return dVar.mo2021d();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C0355i iVar = this.f1818i;
        if (iVar != null && iVar.mo1492b()) {
            this.f1818i.dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.f1818i != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), mo1456a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        if (savedState.f1821d && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new C0345b());
        }
    }

    public Parcelable onSaveInstanceState() {
        boolean z;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        C0355i iVar = this.f1818i;
        if (iVar == null || !iVar.mo1492b()) {
            z = false;
        } else {
            z = true;
        }
        savedState.f1821d = z;
        return savedState;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        C0515y0 y0Var = this.f1815f;
        if (y0Var == null || !y0Var.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    public boolean performClick() {
        C0355i iVar = this.f1818i;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.mo1492b()) {
            return true;
        }
        mo1457b();
        return true;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            dVar.mo2023f(drawable);
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            dVar.mo2024g(i);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            iVar.mo1500j(i);
            this.f1818i.mo1496f(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            iVar.mo1499i(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.f1818i != null) {
            this.f1819j = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            iVar.mo1505p(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C5769a.m23210b(getPopupContext(), i));
    }

    public void setPrompt(CharSequence charSequence) {
        C0355i iVar = this.f1818i;
        if (iVar != null) {
            iVar.mo1498h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            dVar.mo2026i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0414d dVar = this.f1813d;
        if (dVar != null) {
            dVar.mo2027j(mode);
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, -1);
    }

    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.f1817h) {
            this.f1816g = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        if (this.f1818i != null) {
            Context context = this.f1814e;
            if (context == null) {
                context = getContext();
            }
            this.f1818i.mo1503m(new C0350g(spinnerAdapter, context.getTheme()));
        }
    }

    public AppCompatSpinner(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, attributeSet, i, i2, (Resources.Theme) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r11 != null) goto L_0x004f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0067  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AppCompatSpinner(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10, android.content.res.Resources.Theme r11) {
        /*
            r6 = this;
            r6.<init>(r7, r8, r9)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r6.f1820k = r0
            android.content.Context r0 = r6.getContext()
            androidx.appcompat.widget.C0470n1.m1922a(r6, r0)
            int[] r0 = p030c.C2219j.f6648F2
            r1 = 0
            androidx.appcompat.widget.r1 r0 = androidx.appcompat.widget.C0483r1.m1946v(r7, r8, r0, r9, r1)
            androidx.appcompat.widget.d r2 = new androidx.appcompat.widget.d
            r2.<init>(r6)
            r6.f1813d = r2
            if (r11 == 0) goto L_0x0029
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (android.content.res.Resources.Theme) r11)
            r6.f1814e = r2
            goto L_0x003b
        L_0x0029:
            int r11 = p030c.C2219j.f6673K2
            int r11 = r0.mo2327n(r11, r1)
            if (r11 == 0) goto L_0x0039
            androidx.appcompat.view.d r2 = new androidx.appcompat.view.d
            r2.<init>((android.content.Context) r7, (int) r11)
            r6.f1814e = r2
            goto L_0x003b
        L_0x0039:
            r6.f1814e = r7
        L_0x003b:
            r11 = -1
            r2 = 0
            if (r10 != r11) goto L_0x006b
            int[] r11 = f1812l     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            android.content.res.TypedArray r11 = r7.obtainStyledAttributes(r8, r11, r9, r1)     // Catch:{ Exception -> 0x0057, all -> 0x0055 }
            boolean r3 = r11.hasValue(r1)     // Catch:{ Exception -> 0x0053 }
            if (r3 == 0) goto L_0x004f
            int r10 = r11.getInt(r1, r1)     // Catch:{ Exception -> 0x0053 }
        L_0x004f:
            r11.recycle()
            goto L_0x006b
        L_0x0053:
            r3 = move-exception
            goto L_0x0059
        L_0x0055:
            r7 = move-exception
            goto L_0x0065
        L_0x0057:
            r3 = move-exception
            r11 = r2
        L_0x0059:
            java.lang.String r4 = "AppCompatSpinner"
            java.lang.String r5 = "Could not read android:spinnerMode"
            android.util.Log.i(r4, r5, r3)     // Catch:{ all -> 0x0063 }
            if (r11 == 0) goto L_0x006b
            goto L_0x004f
        L_0x0063:
            r7 = move-exception
            r2 = r11
        L_0x0065:
            if (r2 == 0) goto L_0x006a
            r2.recycle()
        L_0x006a:
            throw r7
        L_0x006b:
            r11 = 1
            if (r10 == 0) goto L_0x00a8
            if (r10 == r11) goto L_0x0071
            goto L_0x00b8
        L_0x0071:
            androidx.appcompat.widget.AppCompatSpinner$h r10 = new androidx.appcompat.widget.AppCompatSpinner$h
            android.content.Context r3 = r6.f1814e
            r10.<init>(r3, r8, r9)
            android.content.Context r3 = r6.f1814e
            int[] r4 = p030c.C2219j.f6648F2
            androidx.appcompat.widget.r1 r1 = androidx.appcompat.widget.C0483r1.m1946v(r3, r8, r4, r9, r1)
            int r3 = p030c.C2219j.f6668J2
            r4 = -2
            int r3 = r1.mo2326m(r3, r4)
            r6.f1819j = r3
            int r3 = p030c.C2219j.f6658H2
            android.graphics.drawable.Drawable r3 = r1.mo2320g(r3)
            r10.mo2391p(r3)
            int r3 = p030c.C2219j.f6663I2
            java.lang.String r3 = r0.mo2328o(r3)
            r10.mo1498h(r3)
            r1.mo2333w()
            r6.f1818i = r10
            androidx.appcompat.widget.AppCompatSpinner$a r1 = new androidx.appcompat.widget.AppCompatSpinner$a
            r1.<init>(r6, r10)
            r6.f1815f = r1
            goto L_0x00b8
        L_0x00a8:
            androidx.appcompat.widget.AppCompatSpinner$f r10 = new androidx.appcompat.widget.AppCompatSpinner$f
            r10.<init>()
            r6.f1818i = r10
            int r1 = p030c.C2219j.f6663I2
            java.lang.String r1 = r0.mo2328o(r1)
            r10.mo1498h(r1)
        L_0x00b8:
            int r10 = p030c.C2219j.f6653G2
            java.lang.CharSequence[] r10 = r0.mo2330q(r10)
            if (r10 == 0) goto L_0x00d0
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r3 = 17367048(0x1090008, float:2.5162948E-38)
            r1.<init>(r7, r3, r10)
            int r7 = p030c.C2216g.f6599t
            r1.setDropDownViewResource(r7)
            r6.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00d0:
            r0.mo2333w()
            r6.f1817h = r11
            android.widget.SpinnerAdapter r7 = r6.f1816g
            if (r7 == 0) goto L_0x00de
            r6.setAdapter((android.widget.SpinnerAdapter) r7)
            r6.f1816g = r2
        L_0x00de:
            androidx.appcompat.widget.d r7 = r6.f1813d
            r7.mo2022e(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.AppCompatSpinner.<init>(android.content.Context, android.util.AttributeSet, int, int, android.content.res.Resources$Theme):void");
    }
}

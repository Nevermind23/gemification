package androidx.appcompat.widget;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.C0767a;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import p030c.C2210a;
import p030c.C2215f;
import p317y.C8988c;
import p341ge.bog.mobilebank.shared2.network.BankApiResponse;

/* renamed from: androidx.appcompat.widget.m1 */
class C0466m1 extends C8988c implements View.OnClickListener {

    /* renamed from: A */
    private int f2152A = -1;

    /* renamed from: B */
    private int f2153B = -1;

    /* renamed from: o */
    private final SearchView f2154o;

    /* renamed from: p */
    private final SearchableInfo f2155p;

    /* renamed from: q */
    private final Context f2156q;

    /* renamed from: r */
    private final WeakHashMap f2157r;

    /* renamed from: s */
    private final int f2158s;

    /* renamed from: t */
    private boolean f2159t = false;

    /* renamed from: u */
    private int f2160u = 1;

    /* renamed from: v */
    private ColorStateList f2161v;

    /* renamed from: w */
    private int f2162w = -1;

    /* renamed from: x */
    private int f2163x = -1;

    /* renamed from: y */
    private int f2164y = -1;

    /* renamed from: z */
    private int f2165z = -1;

    /* renamed from: androidx.appcompat.widget.m1$a */
    private static final class C0467a {

        /* renamed from: a */
        public final TextView f2166a;

        /* renamed from: b */
        public final TextView f2167b;

        /* renamed from: c */
        public final ImageView f2168c;

        /* renamed from: d */
        public final ImageView f2169d;

        /* renamed from: e */
        public final ImageView f2170e;

        public C0467a(View view) {
            this.f2166a = (TextView) view.findViewById(16908308);
            this.f2167b = (TextView) view.findViewById(16908309);
            this.f2168c = (ImageView) view.findViewById(16908295);
            this.f2169d = (ImageView) view.findViewById(16908296);
            this.f2170e = (ImageView) view.findViewById(C2215f.f6570q);
        }
    }

    public C0466m1(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        super(context, searchView.getSuggestionRowLayout(), (Cursor) null, true);
        this.f2154o = searchView;
        this.f2155p = searchableInfo;
        this.f2158s = searchView.getSuggestionCommitIconResId();
        this.f2156q = context;
        this.f2157r = weakHashMap;
    }

    /* renamed from: A */
    private void m1860A(String str, Drawable drawable) {
        if (drawable != null) {
            this.f2157r.put(str, drawable.getConstantState());
        }
    }

    /* renamed from: B */
    private void m1861B(Cursor cursor) {
        Bundle bundle;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    /* renamed from: k */
    private Drawable m1862k(String str) {
        Drawable.ConstantState constantState = (Drawable.ConstantState) this.f2157r.get(str);
        if (constantState == null) {
            return null;
        }
        return constantState.newDrawable();
    }

    /* renamed from: l */
    private CharSequence m1863l(CharSequence charSequence) {
        if (this.f2161v == null) {
            TypedValue typedValue = new TypedValue();
            this.f2156q.getTheme().resolveAttribute(C2210a.f6442M, typedValue, true);
            this.f2161v = this.f2156q.getResources().getColorStateList(typedValue.resourceId);
        }
        SpannableString spannableString = new SpannableString(charSequence);
        spannableString.setSpan(new TextAppearanceSpan((String) null, 0, 0, this.f2161v, (ColorStateList) null), 0, charSequence.length(), 33);
        return spannableString;
    }

    /* renamed from: m */
    private Drawable m1864m(ComponentName componentName) {
        PackageManager packageManager = this.f2156q.getPackageManager();
        try {
            ActivityInfo activityInfo = packageManager.getActivityInfo(componentName, 128);
            int iconResource = activityInfo.getIconResource();
            if (iconResource == 0) {
                return null;
            }
            Drawable drawable = packageManager.getDrawable(componentName.getPackageName(), iconResource, activityInfo.applicationInfo);
            if (drawable != null) {
                return drawable;
            }
            Log.w("SuggestionsAdapter", "Invalid icon resource " + iconResource + " for " + componentName.flattenToShortString());
            return null;
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("SuggestionsAdapter", e.toString());
            return null;
        }
    }

    /* renamed from: n */
    private Drawable m1865n(ComponentName componentName) {
        String flattenToShortString = componentName.flattenToShortString();
        Drawable.ConstantState constantState = null;
        if (this.f2157r.containsKey(flattenToShortString)) {
            Drawable.ConstantState constantState2 = (Drawable.ConstantState) this.f2157r.get(flattenToShortString);
            if (constantState2 == null) {
                return null;
            }
            return constantState2.newDrawable(this.f2156q.getResources());
        }
        Drawable m = m1864m(componentName);
        if (m != null) {
            constantState = m.getConstantState();
        }
        this.f2157r.put(flattenToShortString, constantState);
        return m;
    }

    /* renamed from: o */
    public static String m1866o(Cursor cursor, String str) {
        return m1872w(cursor, cursor.getColumnIndex(str));
    }

    /* renamed from: p */
    private Drawable m1867p() {
        Drawable n = m1865n(this.f2155p.getSearchActivity());
        if (n != null) {
            return n;
        }
        return this.f2156q.getPackageManager().getDefaultActivityIcon();
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:7|8|9) */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002c, code lost:
        throw new java.io.FileNotFoundException("Resource does not exist: " + r7);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0016 */
    /* renamed from: q */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.graphics.drawable.Drawable m1868q(android.net.Uri r7) {
        /*
            r6 = this;
            java.lang.String r0 = "Error closing icon stream for "
            java.lang.String r1 = "SuggestionsAdapter"
            r2 = 0
            java.lang.String r3 = r7.getScheme()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "android.resource"
            boolean r3 = r4.equals(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x002d
            android.graphics.drawable.Drawable r7 = r6.mo2219r(r7)     // Catch:{ NotFoundException -> 0x0016 }
            return r7
        L_0x0016:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Resource does not exist: "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x002d:
            android.content.Context r3 = r6.f2156q     // Catch:{ FileNotFoundException -> 0x0085 }
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.io.InputStream r3 = r3.openInputStream(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            if (r3 == 0) goto L_0x006e
            android.graphics.drawable.Drawable r4 = android.graphics.drawable.Drawable.createFromStream(r3, r2)     // Catch:{ all -> 0x0055 }
            r3.close()     // Catch:{ IOException -> 0x0041 }
            goto L_0x0054
        L_0x0041:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0054:
            return r4
        L_0x0055:
            r4 = move-exception
            r3.close()     // Catch:{ IOException -> 0x005a }
            goto L_0x006d
        L_0x005a:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r0)     // Catch:{ FileNotFoundException -> 0x0085 }
            r5.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r0 = r5.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            android.util.Log.e(r1, r0, r3)     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006d:
            throw r4     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x006e:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.<init>()     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r4 = "Failed to open "
            r3.append(r4)     // Catch:{ FileNotFoundException -> 0x0085 }
            r3.append(r7)     // Catch:{ FileNotFoundException -> 0x0085 }
            java.lang.String r3 = r3.toString()     // Catch:{ FileNotFoundException -> 0x0085 }
            r0.<init>(r3)     // Catch:{ FileNotFoundException -> 0x0085 }
            throw r0     // Catch:{ FileNotFoundException -> 0x0085 }
        L_0x0085:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Icon not found: "
            r3.append(r4)
            r3.append(r7)
            java.lang.String r7 = ", "
            r3.append(r7)
            java.lang.String r7 = r0.getMessage()
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            android.util.Log.w(r1, r7)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.C0466m1.m1868q(android.net.Uri):android.graphics.drawable.Drawable");
    }

    /* renamed from: s */
    private Drawable m1869s(String str) {
        if (str == null || str.isEmpty() || BankApiResponse.SUCCESSFUL_RESPONSE_CODE.equals(str)) {
            return null;
        }
        try {
            int parseInt = Integer.parseInt(str);
            String str2 = "android.resource://" + this.f2156q.getPackageName() + C11110u2.f31950c + parseInt;
            Drawable k = m1862k(str2);
            if (k != null) {
                return k;
            }
            Drawable e = C0767a.m2895e(this.f2156q, parseInt);
            m1860A(str2, e);
            return e;
        } catch (NumberFormatException unused) {
            Drawable k2 = m1862k(str);
            if (k2 != null) {
                return k2;
            }
            Drawable q = m1868q(Uri.parse(str));
            m1860A(str, q);
            return q;
        } catch (Resources.NotFoundException unused2) {
            Log.w("SuggestionsAdapter", "Icon resource not found: " + str);
            return null;
        }
    }

    /* renamed from: t */
    private Drawable m1870t(Cursor cursor) {
        int i = this.f2165z;
        if (i == -1) {
            return null;
        }
        Drawable s = m1869s(cursor.getString(i));
        if (s != null) {
            return s;
        }
        return m1867p();
    }

    /* renamed from: u */
    private Drawable m1871u(Cursor cursor) {
        int i = this.f2152A;
        if (i == -1) {
            return null;
        }
        return m1869s(cursor.getString(i));
    }

    /* renamed from: w */
    private static String m1872w(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* renamed from: y */
    private void m1873y(ImageView imageView, Drawable drawable, int i) {
        imageView.setImageDrawable(drawable);
        if (drawable == null) {
            imageView.setVisibility(i);
            return;
        }
        imageView.setVisibility(0);
        drawable.setVisible(false, false);
        drawable.setVisible(true, false);
    }

    /* renamed from: z */
    private void m1874z(TextView textView, CharSequence charSequence) {
        textView.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            textView.setVisibility(8);
        } else {
            textView.setVisibility(0);
        }
    }

    /* renamed from: a */
    public void mo2208a(Cursor cursor) {
        if (this.f2159t) {
            Log.w("SuggestionsAdapter", "Tried to change cursor after adapter was closed.");
            if (cursor != null) {
                cursor.close();
                return;
            }
            return;
        }
        try {
            super.mo2208a(cursor);
            if (cursor != null) {
                this.f2162w = cursor.getColumnIndex("suggest_text_1");
                this.f2163x = cursor.getColumnIndex("suggest_text_2");
                this.f2164y = cursor.getColumnIndex("suggest_text_2_url");
                this.f2165z = cursor.getColumnIndex("suggest_icon_1");
                this.f2152A = cursor.getColumnIndex("suggest_icon_2");
                this.f2153B = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    /* renamed from: b */
    public CharSequence mo2209b(Cursor cursor) {
        String o;
        String o2;
        if (cursor == null) {
            return null;
        }
        String o3 = m1866o(cursor, "suggest_intent_query");
        if (o3 != null) {
            return o3;
        }
        if (this.f2155p.shouldRewriteQueryFromData() && (o2 = m1866o(cursor, "suggest_intent_data")) != null) {
            return o2;
        }
        if (!this.f2155p.shouldRewriteQueryFromText() || (o = m1866o(cursor, "suggest_text_1")) == null) {
            return null;
        }
        return o;
    }

    /* renamed from: c */
    public Cursor mo2210c(CharSequence charSequence) {
        String str;
        if (charSequence == null) {
            str = "";
        } else {
            str = charSequence.toString();
        }
        if (this.f2154o.getVisibility() == 0 && this.f2154o.getWindowVisibility() == 0) {
            try {
                Cursor v = mo2220v(this.f2155p, str, 50);
                if (v != null) {
                    v.getCount();
                    return v;
                }
            } catch (RuntimeException e) {
                Log.w("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        }
        return null;
    }

    /* renamed from: e */
    public void mo2211e(View view, Context context, Cursor cursor) {
        int i;
        CharSequence charSequence;
        C0467a aVar = (C0467a) view.getTag();
        int i2 = this.f2153B;
        if (i2 != -1) {
            i = cursor.getInt(i2);
        } else {
            i = 0;
        }
        if (aVar.f2166a != null) {
            m1874z(aVar.f2166a, m1872w(cursor, this.f2162w));
        }
        if (aVar.f2167b != null) {
            String w = m1872w(cursor, this.f2164y);
            if (w != null) {
                charSequence = m1863l(w);
            } else {
                charSequence = m1872w(cursor, this.f2163x);
            }
            if (TextUtils.isEmpty(charSequence)) {
                TextView textView = aVar.f2166a;
                if (textView != null) {
                    textView.setSingleLine(false);
                    aVar.f2166a.setMaxLines(2);
                }
            } else {
                TextView textView2 = aVar.f2166a;
                if (textView2 != null) {
                    textView2.setSingleLine(true);
                    aVar.f2166a.setMaxLines(1);
                }
            }
            m1874z(aVar.f2167b, charSequence);
        }
        ImageView imageView = aVar.f2168c;
        if (imageView != null) {
            m1873y(imageView, m1870t(cursor), 4);
        }
        ImageView imageView2 = aVar.f2169d;
        if (imageView2 != null) {
            m1873y(imageView2, m1871u(cursor), 8);
        }
        int i3 = this.f2160u;
        if (i3 == 2 || (i3 == 1 && (i & 1) != 0)) {
            aVar.f2170e.setVisibility(0);
            aVar.f2170e.setTag(aVar.f2166a.getText());
            aVar.f2170e.setOnClickListener(this);
            return;
        }
        aVar.f2170e.setVisibility(8);
    }

    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View g = mo24393g(this.f2156q, mo24391d(), viewGroup);
            if (g != null) {
                ((C0467a) g.getTag()).f2166a.setText(e.toString());
            }
            return g;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View h = mo2214h(this.f2156q, mo24391d(), viewGroup);
            if (h != null) {
                ((C0467a) h.getTag()).f2166a.setText(e.toString());
            }
            return h;
        }
    }

    /* renamed from: h */
    public View mo2214h(Context context, Cursor cursor, ViewGroup viewGroup) {
        View h = super.mo2214h(context, cursor, viewGroup);
        h.setTag(new C0467a(h));
        ((ImageView) h.findViewById(C2215f.f6570q)).setImageResource(this.f2158s);
        return h;
    }

    public boolean hasStableIds() {
        return false;
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        m1861B(mo24391d());
    }

    public void notifyDataSetInvalidated() {
        super.notifyDataSetInvalidated();
        m1861B(mo24391d());
    }

    public void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f2154o.mo1647U((CharSequence) tag);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: r */
    public Drawable mo2219r(Uri uri) {
        int i;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f2156q.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            i = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException("Single path segment is not a resource ID: " + uri);
                        }
                    } else if (size == 2) {
                        i = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException("More than two path segments: " + uri);
                    }
                    if (i != 0) {
                        return resourcesForApplication.getDrawable(i);
                    }
                    throw new FileNotFoundException("No resource found for: " + uri);
                }
                throw new FileNotFoundException("No path: " + uri);
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException("No package found for authority: " + uri);
            }
        } else {
            throw new FileNotFoundException("No authority: " + uri);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public Cursor mo2220v(SearchableInfo searchableInfo, String str, int i) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        if (i > 0) {
            fragment.appendQueryParameter("limit", String.valueOf(i));
        }
        return this.f2156q.getContentResolver().query(fragment.build(), (String[]) null, suggestSelection, strArr2, (String) null);
    }

    /* renamed from: x */
    public void mo2221x(int i) {
        this.f2160u = i;
    }
}

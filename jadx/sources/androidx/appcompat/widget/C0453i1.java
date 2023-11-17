package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.core.content.res.C0808h;
import java.io.InputStream;
import p071f.C6127a;

/* renamed from: androidx.appcompat.widget.i1 */
abstract class C0453i1 extends Resources {

    /* renamed from: a */
    private final Resources f2135a;

    public C0453i1(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f2135a = resources;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Drawable mo2147a(int i) {
        return super.getDrawable(i);
    }

    public XmlResourceParser getAnimation(int i) {
        return this.f2135a.getAnimation(i);
    }

    public boolean getBoolean(int i) {
        return this.f2135a.getBoolean(i);
    }

    public int getColor(int i) {
        return this.f2135a.getColor(i);
    }

    public ColorStateList getColorStateList(int i) {
        return this.f2135a.getColorStateList(i);
    }

    public Configuration getConfiguration() {
        return this.f2135a.getConfiguration();
    }

    public float getDimension(int i) {
        return this.f2135a.getDimension(i);
    }

    public int getDimensionPixelOffset(int i) {
        return this.f2135a.getDimensionPixelOffset(i);
    }

    public int getDimensionPixelSize(int i) {
        return this.f2135a.getDimensionPixelSize(i);
    }

    public DisplayMetrics getDisplayMetrics() {
        return this.f2135a.getDisplayMetrics();
    }

    public Drawable getDrawable(int i, Resources.Theme theme) {
        return C0808h.m3031f(this.f2135a, i, theme);
    }

    public Drawable getDrawableForDensity(int i, int i2) {
        return C0808h.m3032g(this.f2135a, i, i2, (Resources.Theme) null);
    }

    public float getFraction(int i, int i2, int i3) {
        return this.f2135a.getFraction(i, i2, i3);
    }

    public int getIdentifier(String str, String str2, String str3) {
        return this.f2135a.getIdentifier(str, str2, str3);
    }

    public int[] getIntArray(int i) {
        return this.f2135a.getIntArray(i);
    }

    public int getInteger(int i) {
        return this.f2135a.getInteger(i);
    }

    public XmlResourceParser getLayout(int i) {
        return this.f2135a.getLayout(i);
    }

    public Movie getMovie(int i) {
        return this.f2135a.getMovie(i);
    }

    public String getQuantityString(int i, int i2, Object... objArr) {
        return this.f2135a.getQuantityString(i, i2, objArr);
    }

    public CharSequence getQuantityText(int i, int i2) {
        return this.f2135a.getQuantityText(i, i2);
    }

    public String getResourceEntryName(int i) {
        return this.f2135a.getResourceEntryName(i);
    }

    public String getResourceName(int i) {
        return this.f2135a.getResourceName(i);
    }

    public String getResourcePackageName(int i) {
        return this.f2135a.getResourcePackageName(i);
    }

    public String getResourceTypeName(int i) {
        return this.f2135a.getResourceTypeName(i);
    }

    public String getString(int i) {
        return this.f2135a.getString(i);
    }

    public String[] getStringArray(int i) {
        return this.f2135a.getStringArray(i);
    }

    public CharSequence getText(int i) {
        return this.f2135a.getText(i);
    }

    public CharSequence[] getTextArray(int i) {
        return this.f2135a.getTextArray(i);
    }

    public void getValue(int i, TypedValue typedValue, boolean z) {
        this.f2135a.getValue(i, typedValue, z);
    }

    public void getValueForDensity(int i, int i2, TypedValue typedValue, boolean z) {
        C6127a.m24503a(this.f2135a, i, i2, typedValue, z);
    }

    public XmlResourceParser getXml(int i) {
        return this.f2135a.getXml(i);
    }

    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f2135a.obtainAttributes(attributeSet, iArr);
    }

    public TypedArray obtainTypedArray(int i) {
        return this.f2135a.obtainTypedArray(i);
    }

    public InputStream openRawResource(int i) {
        return this.f2135a.openRawResource(i);
    }

    public AssetFileDescriptor openRawResourceFd(int i) {
        return this.f2135a.openRawResourceFd(i);
    }

    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) {
        this.f2135a.parseBundleExtra(str, attributeSet, bundle);
    }

    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) {
        this.f2135a.parseBundleExtras(xmlResourceParser, bundle);
    }

    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f2135a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    public Drawable getDrawableForDensity(int i, int i2, Resources.Theme theme) {
        return C0808h.m3032g(this.f2135a, i, i2, theme);
    }

    public String getQuantityString(int i, int i2) {
        return this.f2135a.getQuantityString(i, i2);
    }

    public String getString(int i, Object... objArr) {
        return this.f2135a.getString(i, objArr);
    }

    public CharSequence getText(int i, CharSequence charSequence) {
        return this.f2135a.getText(i, charSequence);
    }

    public void getValue(String str, TypedValue typedValue, boolean z) {
        this.f2135a.getValue(str, typedValue, z);
    }

    public InputStream openRawResource(int i, TypedValue typedValue) {
        return this.f2135a.openRawResource(i, typedValue);
    }
}

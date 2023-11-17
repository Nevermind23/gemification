package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.ArrayMap;
import androidx.core.content.res.C0820l;
import androidx.core.graphics.drawable.C0836a;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

public class AnimatedVectorDrawableCompat extends C1879e implements Animatable {

    /* renamed from: e */
    private C1872c f5632e;

    /* renamed from: f */
    private Context f5633f;

    /* renamed from: g */
    private ArgbEvaluator f5634g;

    /* renamed from: h */
    C1873d f5635h;

    /* renamed from: i */
    private Animator.AnimatorListener f5636i;

    /* renamed from: j */
    ArrayList f5637j;

    /* renamed from: k */
    final Drawable.Callback f5638k;

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$a */
    class C1870a implements Drawable.Callback {
        C1870a() {
        }

        public void invalidateDrawable(Drawable drawable) {
            AnimatedVectorDrawableCompat.this.invalidateSelf();
        }

        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
        }

        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$b */
    class C1871b extends AnimatorListenerAdapter {
        C1871b() {
        }

        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f5637j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat$AnimationCallback) arrayList.get(i)).onAnimationEnd(AnimatedVectorDrawableCompat.this);
            }
        }

        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(AnimatedVectorDrawableCompat.this.f5637j);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((Animatable2Compat$AnimationCallback) arrayList.get(i)).onAnimationStart(AnimatedVectorDrawableCompat.this);
            }
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$c */
    private static class C1872c extends Drawable.ConstantState {

        /* renamed from: a */
        int f5641a;

        /* renamed from: b */
        C1880f f5642b;

        /* renamed from: c */
        AnimatorSet f5643c;

        /* renamed from: d */
        ArrayList f5644d;

        /* renamed from: e */
        ArrayMap f5645e;

        public C1872c(Context context, C1872c cVar, Drawable.Callback callback, Resources resources) {
            if (cVar != null) {
                this.f5641a = cVar.f5641a;
                C1880f fVar = cVar.f5642b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f5642b = (C1880f) constantState.newDrawable(resources);
                    } else {
                        this.f5642b = (C1880f) constantState.newDrawable();
                    }
                    C1880f fVar2 = (C1880f) this.f5642b.mutate();
                    this.f5642b = fVar2;
                    fVar2.setCallback(callback);
                    this.f5642b.setBounds(cVar.f5642b.getBounds());
                    this.f5642b.mo6337h(false);
                }
                ArrayList arrayList = cVar.f5644d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5644d = new ArrayList(size);
                    this.f5645e = new ArrayMap(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = (Animator) cVar.f5644d.get(i);
                        Animator clone = animator.clone();
                        String str = (String) cVar.f5645e.get(animator);
                        clone.setTarget(this.f5642b.mo6328d(str));
                        this.f5644d.add(clone);
                        this.f5645e.put(clone, str);
                    }
                    mo6315a();
                }
            }
        }

        /* renamed from: a */
        public void mo6315a() {
            if (this.f5643c == null) {
                this.f5643c = new AnimatorSet();
            }
            this.f5643c.playTogether(this.f5644d);
        }

        public int getChangingConfigurations() {
            return this.f5641a;
        }

        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    AnimatedVectorDrawableCompat() {
        this((Context) null, (C1872c) null, (Resources) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056 A[Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat m7299b(android.content.Context r6, int r7) {
        /*
            java.lang.String r0 = "parser error"
            java.lang.String r1 = "AnimatedVDCompat"
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 24
            if (r2 < r3) goto L_0x0030
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r0 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat
            r0.<init>(r6)
            android.content.res.Resources r1 = r6.getResources()
            android.content.res.Resources$Theme r6 = r6.getTheme()
            android.graphics.drawable.Drawable r6 = androidx.core.content.res.C0808h.m3031f(r1, r7, r6)
            r0.f5661d = r6
            android.graphics.drawable.Drawable$Callback r7 = r0.f5638k
            r6.setCallback(r7)
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$d r6 = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$d
            android.graphics.drawable.Drawable r7 = r0.f5661d
            android.graphics.drawable.Drawable$ConstantState r7 = r7.getConstantState()
            r6.<init>(r7)
            r0.f5635h = r6
            return r0
        L_0x0030:
            android.content.res.Resources r2 = r6.getResources()
            android.content.res.XmlResourceParser r7 = r2.getXml(r7)     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r7)     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
        L_0x003c:
            int r3 = r7.next()     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            r4 = 2
            if (r3 == r4) goto L_0x0047
            r5 = 1
            if (r3 == r5) goto L_0x0047
            goto L_0x003c
        L_0x0047:
            if (r3 != r4) goto L_0x0056
            android.content.res.Resources r3 = r6.getResources()     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            android.content.res.Resources$Theme r4 = r6.getTheme()     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat r6 = m7300c(r6, r3, r7, r2, r4)     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            return r6
        L_0x0056:
            org.xmlpull.v1.XmlPullParserException r6 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            java.lang.String r7 = "No start tag found"
            r6.<init>(r7)     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
            throw r6     // Catch:{ XmlPullParserException -> 0x0063, IOException -> 0x005e }
        L_0x005e:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
            goto L_0x0067
        L_0x0063:
            r6 = move-exception
            android.util.Log.e(r1, r0, r6)
        L_0x0067:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.m7299b(android.content.Context, int):androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat");
    }

    /* renamed from: c */
    public static AnimatedVectorDrawableCompat m7300c(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    /* renamed from: e */
    private static void m7301e(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        animatedVectorDrawable.registerAnimationCallback(animatable2Compat$AnimationCallback.getPlatformCallback());
    }

    /* renamed from: f */
    private void m7302f() {
        Animator.AnimatorListener animatorListener = this.f5636i;
        if (animatorListener != null) {
            this.f5632e.f5643c.removeListener(animatorListener);
            this.f5636i = null;
        }
    }

    /* renamed from: g */
    private void m7303g(String str, Animator animator) {
        animator.setTarget(this.f5632e.f5642b.mo6328d(str));
        C1872c cVar = this.f5632e;
        if (cVar.f5644d == null) {
            cVar.f5644d = new ArrayList();
            this.f5632e.f5645e = new ArrayMap();
        }
        this.f5632e.f5644d.add(animator);
        this.f5632e.f5645e.put(animator, str);
    }

    /* renamed from: i */
    private static boolean m7304i(AnimatedVectorDrawable animatedVectorDrawable, Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        return animatedVectorDrawable.unregisterAnimationCallback(animatable2Compat$AnimationCallback.getPlatformCallback());
    }

    /* renamed from: a */
    public void mo6265a() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
            return;
        }
        m7302f();
        ArrayList arrayList = this.f5637j;
        if (arrayList != null) {
            arrayList.clear();
        }
    }

    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3139a(drawable, theme);
        }
    }

    public boolean canApplyTheme() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3140b(drawable);
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    /* renamed from: d */
    public void mo6269d(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            m7301e((AnimatedVectorDrawable) drawable, animatable2Compat$AnimationCallback);
        } else if (animatable2Compat$AnimationCallback != null) {
            if (this.f5637j == null) {
                this.f5637j = new ArrayList();
            }
            if (!this.f5637j.contains(animatable2Compat$AnimationCallback)) {
                this.f5637j.add(animatable2Compat$AnimationCallback);
                if (this.f5636i == null) {
                    this.f5636i = new C1871b();
                }
                this.f5632e.f5643c.addListener(this.f5636i);
            }
        }
    }

    public void draw(Canvas canvas) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5632e.f5642b.draw(canvas);
        if (this.f5632e.f5643c.isStarted()) {
            invalidateSelf();
        }
    }

    public int getAlpha() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3142d(drawable);
        }
        return this.f5632e.f5642b.getAlpha();
    }

    public int getChangingConfigurations() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5632e.f5641a;
    }

    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3143e(drawable);
        }
        return this.f5632e.f5642b.getColorFilter();
    }

    public Drawable.ConstantState getConstantState() {
        if (this.f5661d == null || Build.VERSION.SDK_INT < 24) {
            return null;
        }
        return new C1873d(this.f5661d.getConstantState());
    }

    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    public int getIntrinsicHeight() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5632e.f5642b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5632e.f5642b.getIntrinsicWidth();
    }

    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    public int getOpacity() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f5632e.f5642b.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    /* renamed from: h */
    public boolean mo6284h(Animatable2Compat$AnimationCallback animatable2Compat$AnimationCallback) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            m7304i((AnimatedVectorDrawable) drawable, animatable2Compat$AnimationCallback);
        }
        ArrayList arrayList = this.f5637j;
        if (arrayList == null || animatable2Compat$AnimationCallback == null) {
            return false;
        }
        boolean remove = arrayList.remove(animatable2Compat$AnimationCallback);
        if (this.f5637j.size() == 0) {
            m7302f();
        }
        return remove;
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3145g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray s = C0820l.m3076s(resources, theme, attributeSet, C1874a.f5651e);
                    int resourceId = s.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1880f b = C1880f.m7332b(resources, resourceId, theme);
                        b.mo6337h(false);
                        b.setCallback(this.f5638k);
                        C1880f fVar = this.f5632e.f5642b;
                        if (fVar != null) {
                            fVar.setCallback((Drawable.Callback) null);
                        }
                        this.f5632e.f5642b = b;
                    }
                    s.recycle();
                } else if ("target".equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1874a.f5652f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5633f;
                        if (context != null) {
                            m7303g(string, C1876c.m7318i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f5632e.mo6315a();
    }

    public boolean isAutoMirrored() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return C0836a.m3146h(drawable);
        }
        return this.f5632e.f5642b.isAutoMirrored();
    }

    public boolean isRunning() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5632e.f5643c.isRunning();
    }

    public boolean isStateful() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5632e.f5642b.isStateful();
    }

    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    public Drawable mutate() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5632e.f5642b.setBounds(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5632e.f5642b.setLevel(i);
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5632e.f5642b.setState(iArr);
    }

    public void setAlpha(int i) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5632e.f5642b.setAlpha(i);
        }
    }

    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3148j(drawable, z);
        } else {
            this.f5632e.f5642b.setAutoMirrored(z);
        }
    }

    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    public void setTint(int i) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3152n(drawable, i);
        } else {
            this.f5632e.f5642b.setTint(i);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3153o(drawable, colorStateList);
        } else {
            this.f5632e.f5642b.setTintList(colorStateList);
        }
    }

    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            C0836a.m3154p(drawable, mode);
        } else {
            this.f5632e.f5642b.setTintMode(mode);
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5632e.f5642b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public void start() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (!this.f5632e.f5643c.isStarted()) {
            this.f5632e.f5643c.start();
            invalidateSelf();
        }
    }

    public void stop() {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5632e.f5643c.end();
        }
    }

    private AnimatedVectorDrawableCompat(Context context) {
        this(context, (C1872c) null, (Resources) null);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5661d;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5632e.f5642b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat$d */
    private static class C1873d extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5646a;

        public C1873d(Drawable.ConstantState constantState) {
            this.f5646a = constantState;
        }

        public boolean canApplyTheme() {
            return this.f5646a.canApplyTheme();
        }

        public int getChangingConfigurations() {
            return this.f5646a.getChangingConfigurations();
        }

        public Drawable newDrawable() {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f5646a.newDrawable();
            animatedVectorDrawableCompat.f5661d = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f5638k);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f5646a.newDrawable(resources);
            animatedVectorDrawableCompat.f5661d = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f5638k);
            return animatedVectorDrawableCompat;
        }

        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new AnimatedVectorDrawableCompat();
            Drawable newDrawable = this.f5646a.newDrawable(resources, theme);
            animatedVectorDrawableCompat.f5661d = newDrawable;
            newDrawable.setCallback(animatedVectorDrawableCompat.f5638k);
            return animatedVectorDrawableCompat;
        }
    }

    private AnimatedVectorDrawableCompat(Context context, C1872c cVar, Resources resources) {
        this.f5634g = null;
        this.f5636i = null;
        this.f5637j = null;
        C1870a aVar = new C1870a();
        this.f5638k = aVar;
        this.f5633f = context;
        if (cVar != null) {
            this.f5632e = cVar;
        } else {
            this.f5632e = new C1872c(context, cVar, aVar, resources);
        }
    }

    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}

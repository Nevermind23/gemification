package com.airbnb.lottie;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p013v4.media.session.C0125b;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.github.mikephil.charting.utils.Utils;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p045d.C5769a;
import p048d2.C5804f;
import p048d2.C5808j;
import p061e2.C6015c;
import p294w1.C8738e;

public class LottieAnimationView extends AppCompatImageView {

    /* renamed from: r */
    private static final String f7149r = "LottieAnimationView";
    /* access modifiers changed from: private */

    /* renamed from: s */
    public static final C2322f0 f7150s = new C2321f();

    /* renamed from: d */
    private final C2322f0 f7151d = new C2319e(this);

    /* renamed from: e */
    private final C2322f0 f7152e = new C2305a();
    /* access modifiers changed from: private */

    /* renamed from: f */
    public C2322f0 f7153f;
    /* access modifiers changed from: private */

    /* renamed from: g */
    public int f7154g = 0;

    /* renamed from: h */
    private final C2315d0 f7155h = new C2315d0();

    /* renamed from: i */
    private String f7156i;

    /* renamed from: j */
    private int f7157j;

    /* renamed from: k */
    private boolean f7158k = false;

    /* renamed from: l */
    private boolean f7159l = false;

    /* renamed from: m */
    private boolean f7160m = true;

    /* renamed from: n */
    private final Set f7161n = new HashSet();

    /* renamed from: o */
    private final Set f7162o = new HashSet();

    /* renamed from: p */
    private C2332k0 f7163p;

    /* renamed from: q */
    private C2325h f7164q;

    private static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new C2304a();

        /* renamed from: d */
        String f7165d;

        /* renamed from: e */
        int f7166e;

        /* renamed from: f */
        float f7167f;

        /* renamed from: g */
        boolean f7168g;

        /* renamed from: h */
        String f7169h;

        /* renamed from: i */
        int f7170i;

        /* renamed from: j */
        int f7171j;

        /* renamed from: com.airbnb.lottie.LottieAnimationView$SavedState$a */
        class C2304a implements Parcelable.Creator {
            C2304a() {
            }

            /* renamed from: a */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (C2305a) null);
            }

            /* renamed from: b */
            public SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        /* synthetic */ SavedState(Parcel parcel, C2305a aVar) {
            this(parcel);
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f7165d);
            parcel.writeFloat(this.f7167f);
            parcel.writeInt(this.f7168g ? 1 : 0);
            parcel.writeString(this.f7169h);
            parcel.writeInt(this.f7170i);
            parcel.writeInt(this.f7171j);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.f7165d = parcel.readString();
            this.f7167f = parcel.readFloat();
            this.f7168g = parcel.readInt() != 1 ? false : true;
            this.f7169h = parcel.readString();
            this.f7170i = parcel.readInt();
            this.f7171j = parcel.readInt();
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$a */
    class C2305a implements C2322f0 {
        C2305a() {
        }

        /* renamed from: b */
        public void mo7447a(Throwable th) {
            C2322f0 f0Var;
            if (LottieAnimationView.this.f7154g != 0) {
                LottieAnimationView lottieAnimationView = LottieAnimationView.this;
                lottieAnimationView.setImageResource(lottieAnimationView.f7154g);
            }
            if (LottieAnimationView.this.f7153f == null) {
                f0Var = LottieAnimationView.f7150s;
            } else {
                f0Var = LottieAnimationView.this.f7153f;
            }
            f0Var.mo7447a(th);
        }
    }

    /* renamed from: com.airbnb.lottie.LottieAnimationView$b */
    private enum C2306b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    public LottieAnimationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m8861q(attributeSet, C2338m0.lottieAnimationViewStyle);
    }

    /* renamed from: C */
    private void m8849C() {
        boolean r = mo7400r();
        setImageDrawable((Drawable) null);
        setImageDrawable(this.f7155h);
        if (r) {
            this.f7155h.mo7525v0();
        }
    }

    /* renamed from: D */
    private void m8850D(float f, boolean z) {
        if (z) {
            this.f7161n.add(C2306b.SET_PROGRESS);
        }
        this.f7155h.mo7483S0(f);
    }

    /* renamed from: l */
    private void m8857l() {
        C2332k0 k0Var = this.f7163p;
        if (k0Var != null) {
            k0Var.mo7576j(this.f7151d);
            this.f7163p.mo7575i(this.f7152e);
        }
    }

    /* renamed from: m */
    private void m8858m() {
        this.f7164q = null;
        this.f7155h.mo7522u();
    }

    /* renamed from: o */
    private C2332k0 m8859o(String str) {
        if (isInEditMode()) {
            return new C2332k0(new C2323g(this, str), true);
        }
        if (this.f7160m) {
            return C2344p.m9074j(getContext(), str);
        }
        return C2344p.m9075k(getContext(), str, (String) null);
    }

    /* renamed from: p */
    private C2332k0 m8860p(int i) {
        if (isInEditMode()) {
            return new C2332k0(new C2314d(this, i), true);
        }
        if (this.f7160m) {
            return C2344p.m9083s(getContext(), i);
        }
        return C2344p.m9084t(getContext(), i, (String) null);
    }

    /* renamed from: q */
    private void m8861q(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2340n0.f7337C, i, 0);
        this.f7160m = obtainStyledAttributes.getBoolean(C2340n0.f7339E, true);
        int i2 = C2340n0.f7350P;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C2340n0.f7345K;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C2340n0.f7355U;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (!hasValue || !hasValue2) {
            if (hasValue) {
                int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else if (hasValue2) {
                String string2 = obtainStyledAttributes.getString(i3);
                if (string2 != null) {
                    setAnimation(string2);
                }
            } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
                setAnimationFromUrl(string);
            }
            setFallbackResource(obtainStyledAttributes.getResourceId(C2340n0.f7344J, 0));
            if (obtainStyledAttributes.getBoolean(C2340n0.f7338D, false)) {
                this.f7159l = true;
            }
            if (obtainStyledAttributes.getBoolean(C2340n0.f7348N, false)) {
                this.f7155h.mo7487U0(-1);
            }
            int i5 = C2340n0.f7353S;
            if (obtainStyledAttributes.hasValue(i5)) {
                setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
            }
            int i6 = C2340n0.f7352R;
            if (obtainStyledAttributes.hasValue(i6)) {
                setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
            }
            int i7 = C2340n0.f7354T;
            if (obtainStyledAttributes.hasValue(i7)) {
                setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
            }
            int i8 = C2340n0.f7340F;
            if (obtainStyledAttributes.hasValue(i8)) {
                setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
            }
            int i9 = C2340n0.f7342H;
            if (obtainStyledAttributes.hasValue(i9)) {
                setDefaultFontFileExtension(obtainStyledAttributes.getString(i9));
            }
            setImageAssetsFolder(obtainStyledAttributes.getString(C2340n0.f7347M));
            int i12 = C2340n0.f7349O;
            m8850D(obtainStyledAttributes.getFloat(i12, Utils.FLOAT_EPSILON), obtainStyledAttributes.hasValue(i12));
            mo7396n(obtainStyledAttributes.getBoolean(C2340n0.f7343I, false));
            int i13 = C2340n0.f7341G;
            if (obtainStyledAttributes.hasValue(i13)) {
                mo7394j(new C8738e("**"), C2326h0.f7277K, new C6015c(new C2345p0(C5769a.m23209a(getContext(), obtainStyledAttributes.getResourceId(i13, -1)).getDefaultColor())));
            }
            int i14 = C2340n0.f7351Q;
            if (obtainStyledAttributes.hasValue(i14)) {
                C2342o0 o0Var = C2342o0.AUTOMATIC;
                int i15 = obtainStyledAttributes.getInt(i14, o0Var.ordinal());
                if (i15 >= C2342o0.values().length) {
                    i15 = o0Var.ordinal();
                }
                setRenderMode(C2342o0.values()[i15]);
            }
            setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C2340n0.f7346L, false));
            int i16 = C2340n0.f7356V;
            if (obtainStyledAttributes.hasValue(i16)) {
                setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(i16, false));
            }
            obtainStyledAttributes.recycle();
            C2315d0 d0Var = this.f7155h;
            if (C5808j.m23378f(getContext()) != Utils.FLOAT_EPSILON) {
                z = true;
            }
            d0Var.mo7494Y0(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public /* synthetic */ C2328i0 m8862s(String str) {
        if (this.f7160m) {
            return C2344p.m9076l(getContext(), str);
        }
        return C2344p.m9077m(getContext(), str, (String) null);
    }

    private void setCompositionTask(C2332k0 k0Var) {
        this.f7161n.add(C2306b.SET_ANIMATION);
        m8858m();
        m8857l();
        this.f7163p = k0Var.mo7574d(this.f7151d).mo7573c(this.f7152e);
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public /* synthetic */ C2328i0 m8863t(int i) {
        if (this.f7160m) {
            return C2344p.m9085u(getContext(), i);
        }
        return C2344p.m9086v(getContext(), i, (String) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: u */
    public static /* synthetic */ void m8864u(Throwable th) {
        if (C5808j.m23383k(th)) {
            C5804f.m23335d("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    /* renamed from: A */
    public void mo7375A(String str, String str2) {
        mo7441z(new ByteArrayInputStream(str.getBytes()), str2);
    }

    /* renamed from: B */
    public void mo7376B(String str, String str2) {
        setCompositionTask(C2344p.m9088x(getContext(), str, str2));
    }

    public boolean getClipToCompositionBounds() {
        return this.f7155h.mo7459F();
    }

    public C2325h getComposition() {
        return this.f7164q;
    }

    public long getDuration() {
        C2325h hVar = this.f7164q;
        if (hVar != null) {
            return (long) hVar.mo7545d();
        }
        return 0;
    }

    public int getFrame() {
        return this.f7155h.mo7465J();
    }

    public String getImageAssetsFolder() {
        return this.f7155h.mo7468L();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f7155h.mo7472N();
    }

    public float getMaxFrame() {
        return this.f7155h.mo7474O();
    }

    public float getMinFrame() {
        return this.f7155h.mo7476P();
    }

    public C2335l0 getPerformanceTracker() {
        return this.f7155h.mo7478Q();
    }

    public float getProgress() {
        return this.f7155h.mo7480R();
    }

    public C2342o0 getRenderMode() {
        return this.f7155h.mo7482S();
    }

    public int getRepeatCount() {
        return this.f7155h.mo7484T();
    }

    public int getRepeatMode() {
        return this.f7155h.mo7486U();
    }

    public float getSpeed() {
        return this.f7155h.mo7488V();
    }

    /* renamed from: i */
    public void mo7391i(Animator.AnimatorListener animatorListener) {
        this.f7155h.mo7509p(animatorListener);
    }

    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C2315d0) && ((C2315d0) drawable).mo7482S() == C2342o0.SOFTWARE) {
            this.f7155h.invalidateSelf();
        }
    }

    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C2315d0 d0Var = this.f7155h;
        if (drawable2 == d0Var) {
            super.invalidateDrawable(d0Var);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public void mo7394j(C8738e eVar, Object obj, C6015c cVar) {
        this.f7155h.mo7511q(eVar, obj, cVar);
    }

    /* renamed from: k */
    public void mo7395k() {
        this.f7161n.add(C2306b.PLAY_OPTION);
        this.f7155h.mo7521t();
    }

    /* renamed from: n */
    public void mo7396n(boolean z) {
        this.f7155h.mo7528z(z);
    }

    /* access modifiers changed from: protected */
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f7159l) {
            this.f7155h.mo7512q0();
        }
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f7156i = savedState.f7165d;
        Set set = this.f7161n;
        C2306b bVar = C2306b.SET_ANIMATION;
        if (!set.contains(bVar) && !TextUtils.isEmpty(this.f7156i)) {
            setAnimation(this.f7156i);
        }
        this.f7157j = savedState.f7166e;
        if (!this.f7161n.contains(bVar) && (i = this.f7157j) != 0) {
            setAnimation(i);
        }
        if (!this.f7161n.contains(C2306b.SET_PROGRESS)) {
            m8850D(savedState.f7167f, false);
        }
        if (!this.f7161n.contains(C2306b.PLAY_OPTION) && savedState.f7168g) {
            mo7438w();
        }
        if (!this.f7161n.contains(C2306b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(savedState.f7169h);
        }
        if (!this.f7161n.contains(C2306b.SET_REPEAT_MODE)) {
            setRepeatMode(savedState.f7170i);
        }
        if (!this.f7161n.contains(C2306b.SET_REPEAT_COUNT)) {
            setRepeatCount(savedState.f7171j);
        }
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f7165d = this.f7156i;
        savedState.f7166e = this.f7157j;
        savedState.f7167f = this.f7155h.mo7480R();
        savedState.f7168g = this.f7155h.mo7497a0();
        savedState.f7169h = this.f7155h.mo7468L();
        savedState.f7170i = this.f7155h.mo7486U();
        savedState.f7171j = this.f7155h.mo7484T();
        return savedState;
    }

    /* renamed from: r */
    public boolean mo7400r() {
        return this.f7155h.mo7495Z();
    }

    public void setAnimation(int i) {
        this.f7157j = i;
        this.f7156i = null;
        setCompositionTask(m8860p(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        mo7375A(str, (String) null);
    }

    public void setAnimationFromUrl(String str) {
        C2332k0 k0Var;
        if (this.f7160m) {
            k0Var = C2344p.m9087w(getContext(), str);
        } else {
            k0Var = C2344p.m9088x(getContext(), str, (String) null);
        }
        setCompositionTask(k0Var);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f7155h.mo7526x0(z);
    }

    public void setCacheComposition(boolean z) {
        this.f7160m = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f7155h.mo7527y0(z);
    }

    public void setComposition(C2325h hVar) {
        if (C2311c.f7186a) {
            String str = f7149r;
            Log.v(str, "Set Composition \n" + hVar);
        }
        this.f7155h.setCallback(this);
        this.f7164q = hVar;
        this.f7158k = true;
        boolean z0 = this.f7155h.mo7529z0(hVar);
        this.f7158k = false;
        if (getDrawable() != this.f7155h || z0) {
            if (!z0) {
                m8849C();
            }
            onVisibilityChanged(this, getVisibility());
            requestLayout();
            Iterator it = this.f7162o.iterator();
            if (it.hasNext()) {
                C0125b.m366a(it.next());
                throw null;
            }
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f7155h.mo7452A0(str);
    }

    public void setFailureListener(C2322f0 f0Var) {
        this.f7153f = f0Var;
    }

    public void setFallbackResource(int i) {
        this.f7154g = i;
    }

    public void setFontAssetDelegate(C2307a aVar) {
        this.f7155h.mo7454B0(aVar);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f7155h.mo7455C0(map);
    }

    public void setFrame(int i) {
        this.f7155h.mo7456D0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f7155h.mo7458E0(z);
    }

    public void setImageAssetDelegate(C2309b bVar) {
        this.f7155h.mo7460F0(bVar);
    }

    public void setImageAssetsFolder(String str) {
        this.f7155h.mo7462G0(str);
    }

    public void setImageBitmap(Bitmap bitmap) {
        m8857l();
        super.setImageBitmap(bitmap);
    }

    public void setImageDrawable(Drawable drawable) {
        m8857l();
        super.setImageDrawable(drawable);
    }

    public void setImageResource(int i) {
        m8857l();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f7155h.mo7463H0(z);
    }

    public void setMaxFrame(int i) {
        this.f7155h.mo7464I0(i);
    }

    public void setMaxProgress(float f) {
        this.f7155h.mo7467K0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f7155h.mo7471M0(str);
    }

    public void setMinFrame(int i) {
        this.f7155h.mo7473N0(i);
    }

    public void setMinProgress(float f) {
        this.f7155h.mo7477P0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f7155h.mo7479Q0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f7155h.mo7481R0(z);
    }

    public void setProgress(float f) {
        m8850D(f, true);
    }

    public void setRenderMode(C2342o0 o0Var) {
        this.f7155h.mo7485T0(o0Var);
    }

    public void setRepeatCount(int i) {
        this.f7161n.add(C2306b.SET_REPEAT_COUNT);
        this.f7155h.mo7487U0(i);
    }

    public void setRepeatMode(int i) {
        this.f7161n.add(C2306b.SET_REPEAT_MODE);
        this.f7155h.mo7489V0(i);
    }

    public void setSafeMode(boolean z) {
        this.f7155h.mo7491W0(z);
    }

    public void setSpeed(float f) {
        this.f7155h.mo7493X0(f);
    }

    public void setTextDelegate(C2347q0 q0Var) {
        this.f7155h.mo7496Z0(q0Var);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f7155h.mo7498a1(z);
    }

    public void unscheduleDrawable(Drawable drawable) {
        C2315d0 d0Var;
        if (!this.f7158k && drawable == (d0Var = this.f7155h) && d0Var.mo7495Z()) {
            mo7437v();
        } else if (!this.f7158k && (drawable instanceof C2315d0)) {
            C2315d0 d0Var2 = (C2315d0) drawable;
            if (d0Var2.mo7495Z()) {
                d0Var2.mo7510p0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: v */
    public void mo7437v() {
        this.f7159l = false;
        this.f7155h.mo7510p0();
    }

    /* renamed from: w */
    public void mo7438w() {
        this.f7161n.add(C2306b.PLAY_OPTION);
        this.f7155h.mo7512q0();
    }

    /* renamed from: x */
    public void mo7439x() {
        this.f7155h.mo7513r0();
    }

    /* renamed from: y */
    public void mo7440y(Animator.AnimatorListener animatorListener) {
        this.f7155h.mo7514s0(animatorListener);
    }

    /* renamed from: z */
    public void mo7441z(InputStream inputStream, String str) {
        setCompositionTask(C2344p.m9078n(inputStream, str));
    }

    public void setMaxFrame(String str) {
        this.f7155h.mo7466J0(str);
    }

    public void setMinFrame(String str) {
        this.f7155h.mo7475O0(str);
    }

    public void setAnimation(String str) {
        this.f7156i = str;
        this.f7157j = 0;
        setCompositionTask(m8859o(str));
    }
}
